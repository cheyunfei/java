package Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
/**
*@author:cloud<br>
*@date:2019年5月19日下午8:48:49<br>
*@class:Stream.ZipIOStream.java<br><br>
*/


/**
 * @author 云飞<br><br>
 * （1）使用ZipOutputStream和ZipInputStream类来实现文件的压缩/解压缩。<br>
 * （2）如果要从ZIP压缩文件内读取某个文件，要先找到该文件对应的“目录进入点”，即位置，才能读取这个文件。<br>
 * （3）如果要将文件写入到ZIP文件内，必须先写入该文件的“目录进入点”entry，然后将流内位置移向entry
 *    指向的位置，然后将要写入的文件内容写到该“目录进入点”所指向的位置。<br><br>
 * 
 * （4）ZipEntry类：ZipEntry ze=new ZipEntry(String path)【目录进入点】，path【目录进入点路径；通过不断实验，
 *    发现path中每当“dictionary/”结构出现一次，即一个文件夹名和一个文件分隔符“/”的组合表示一个名为“dictionary”
 *    的文件夹；例如当有一个“/”，就会发现压缩包中出现一个名字为空“”的文件夹】<br>
 * （4.1）ze.getName()：获得“目录进入点”对应的文件路径（包括文件名）或者文件夹路径，当然这个文件路径只包括压缩
 * 文件内部的路径 ，如“stream/a.txt”<br>
 * （4.2）ze.isDictionary()：判断该“目录进入点”是否是一个文件夹<br>
 * （4.2）ze对象用来表示一个ZIP压缩文件的进入点，这个进入点可以是文件也可以是文件夹，取决于压缩文件的过程中加入过哪些
 *  “目录进入点”，注意压缩过程中是否创建文件夹“目录进入点”对整个压缩没有影响，文件夹依旧可以在创建文件“目录进入点”
 *  时自动创建。<br>
 * （4.3）解压过程中可以得到的“目录进入点”是哪些，取决于压缩时加入了哪些“目录进入点”，所以不必所有文件夹都创建
 * “目录进入点”<br>
 * （4.4）ZipOutputStream和ZipInputStream支持已压缩及未压缩的进入点。<br><br>
 * 
 * （5）ZipOutputStream类：ZipOutputStream zos=new ZipOutputStream(OutputStream out)<br>
 * （5.1）zos.write(byte[] b,int off,int len)：将数据写入out指向的压缩流中。<br>
 * （5.2）zos.putNextEntry(ZipEntry e)：开始写一个新的目录进入点ZipEntry，并将流内的位置移至此entry指向的位置，
 *    然后可以通过zos.write(byte[] b,int off,int len)方法将内容写入out压缩流中。<br>
 * （5.3）zos.setComment(String comment)：设置此zip文件的注释文字。<br>
 * （5.4）zos.finish()：完成并关闭zip输入流，无需关闭它配合的OutputStream。<br><br>
 * 
 * <b>压缩过程：</b><br>
 * （5.7）ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(zipFileName))，zipFileName【表示
 * 最终压缩文件的完整路径名，可以是相对路径或者绝对路径，相对路径表示相对于工程上下文环境，此处的上下文环境
 * 为contextPath="item/"】<br>
 * （5.8）zos.putNextEntry(new ZipEntry(path))，path【设置目录进入点，这个path表示的是压缩文件内部的文件路径，同
 * 系统文件路径无关，如“stream/a.txt”】<br>
 * （5.9）FileInputStream fis=new FileInputStream(File inputFile)，inputFile【读取将被压缩的原始子文件inputFile】<br>
 * （5.10）zos.write(fis.read())，【读取原始子文件的内容并写入目标压缩文件中】<br><br>
 * 
 * （6）ZipInputStream类：ZipInputStream zis=new ZipInputStream(InputStream in)<br>
 * （6.1）zis.read(byte[] b,int off,int len)：返回值int，读取目标数组b内以偏移量off为起始位置
 *   ，长度为len字节数据。<br>
 * （6.2）zis.available()：返回值int，判断是否读完当前“进入点”entry中的数据，读完返回0，未读完返回1。<br>
 * （6.3）zis.closeEntry()：返回值void，关闭当前ZIP条目并定位流以读取下一个条目。<br>
 * （6.4）zis.skip(long n)：返回值long，跳过当前ZIP条目中指定的字节数。<br>
 * （6.5）zis.getNextEntry()：返回值ZipEntry，读取下一个ZipEntry，并将流内的位置移至该entry所指向的数据的开头。<br>
 * （6.6）zis.createZipEntry(String name)：返回值ZipEntry，以指定的name参数新建一个ZipEntry对象。<br><br>
 * 
 * <b>解压过程：</b>ZipInputStream获取“目录进入点”，ZipFile借助“目录进入点”获取相应文件的数据输入流<br>
 * （6.7）ZipInputStream zis=new ZipInputStream(new FileInputStream(zipFileName))，zipFileName【待解压文件路径】<br>
 * （6.8）ZipEntry entry=zis.getNextEntry()，获取下一个“目录进入点”<br>
 * （6.9）File subFile=new File(output+entry.getName())，output【解压目标路径】，entry.getName()【获取解
 * 压文件路径名，包括文件名，如“stream/a.txt”】，这里的目的就是新建一个文件对象<br>
 * （6.10）if(!subFile.exists()) subFile.getParentFile().mkdirs()，新建解压后的文件，包括其父文件夹<br>
 * （6.11）OutputStream out=new FileOutputStream(subFile)，创建文件数据输出流，准备将解压后的数据写入目标文件中<br>
 * （6.12）ZipFile zipFile=new ZipFile(zipFileName)，创建一个解压文件对象<br>
 * （6.13）InputStream in=zipFile.getInputStream(entry)，从“目录进入点”获取待解压文件的数据输入流<br>
 * （6.14）out.write(in.read())，读取待解压文件数据，然后写入目标文件中<br><br>
 */
public class ZipIOStream {
	
	@SuppressWarnings("unused")
	private void zip(String zipFileName,String input){
		try {
			File inputFile=new File(input);
			ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(zipFileName));
			zipfile(zos,inputFile,"stream");
			zos.close();
		} catch (FileNotFoundException e) {
			System.out.println("待压缩文件"+zipFileName+"未找到！");
		}catch(IOException e){
			System.out.println("关闭压缩流时发生错误！");
		}
	}
	
	private void zipfile(ZipOutputStream zos,File inputFile,String path){
		try{
			if(inputFile.isDirectory()){
				File[] files=inputFile.listFiles();
				/*这个if语句的作用在于通过在压缩文件内部创建一个最外层文件夹，但是如果只是用来创建一个文件夹，那么
				 * 在*/
				if(path.equals("stream"))
					zos.putNextEntry(new ZipEntry(path+"/"));
				for(int i=0;i<files.length;i++){
					zipfile(zos,files[i],path+"/"+files[i].getName());
				}
			}else{
				zos.putNextEntry(new ZipEntry(path));
				FileInputStream fis=new FileInputStream(inputFile);
				int b;
				while((b=fis.read())!=-1){
					zos.write(b);
				}
				System.out.println("子文件"+inputFile.getName()+"中的内容已压缩完成！");
				fis.close();
			}
		}catch(ZipException e){
			System.out.println("压缩文件"+inputFile.getName()+"时发生错误！");
		}catch (FileNotFoundException e) {
			System.out.println("待压缩文件"+inputFile.getName()+"未找到！");
		}catch(IOException e){
			System.out.println("读取待压缩文件"+inputFile.getName()+"发生错误！");
		}
	}
	
	/*ZipInputStream获取“目录进入点”，ZipFile借助“目录进入点”获取相应文件的数据输入流*/
	@SuppressWarnings("unused")
	private void unzip(String zipFileName,String output){
		try{
			File file=new File(zipFileName);
			ZipFile zipFile=new ZipFile(file);
			ZipInputStream zis=new ZipInputStream(new FileInputStream(file));
			ZipEntry entry=null;
		
			int entryNum=zipFile.size();
			int nth=1;
			System.out.println("开始解压！");
			while(((entry=zis.getNextEntry())!=null)&&!entry.isDirectory()){
				File subFile=new File(output+entry.getName());
				if(!subFile.exists()){
					subFile.getParentFile().mkdirs();
					OutputStream out=new FileOutputStream(subFile);
					InputStream in=zipFile.getInputStream(entry);
					int count=0;
					while((count=in.read())!=-1){
						out.write(count);
					}
					out.close();
					in.close();
				}
				/*关闭当前目录进入点*/
			    zis.closeEntry();
			    Float percent=((float)(nth++)/entryNum)*100;
			    if(nth==entryNum) percent=100f;
			    System.out.println("已解压文件："+entry.getName()+" 进度："+percent.intValue()+"%");
			}
			zis.close();
			zipFile.close();
		}catch(FileNotFoundException e){
			System.out.println("待解压缩文件未发现！");
		}catch(IOException e){
			System.out.println("读取待解压缩文件错误！");
		}
	}

	public static void main(String[] args) {
		ZipIOStream my=new ZipIOStream();
		/*zip(String zipFileName,String input)*/
		//my.zip("./src/Stream.zip","./src/Stream");
		/*unzip(String zipFileName,String output)*/
		my.unzip("./src/Stream.zip","Y:\\");
	}

}
