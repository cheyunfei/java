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
*@date:2019��5��19������8:48:49<br>
*@class:Stream.ZipIOStream.java<br><br>
*/


/**
 * @author �Ʒ�<br><br>
 * ��1��ʹ��ZipOutputStream��ZipInputStream����ʵ���ļ���ѹ��/��ѹ����<br>
 * ��2�����Ҫ��ZIPѹ���ļ��ڶ�ȡĳ���ļ���Ҫ���ҵ����ļ���Ӧ�ġ�Ŀ¼����㡱����λ�ã����ܶ�ȡ����ļ���<br>
 * ��3�����Ҫ���ļ�д�뵽ZIP�ļ��ڣ�������д����ļ��ġ�Ŀ¼����㡱entry��Ȼ������λ������entry
 *    ָ���λ�ã�Ȼ��Ҫд����ļ�����д���á�Ŀ¼����㡱��ָ���λ�á�<br><br>
 * 
 * ��4��ZipEntry�ࣺZipEntry ze=new ZipEntry(String path)��Ŀ¼����㡿��path��Ŀ¼�����·����ͨ������ʵ�飬
 *    ����path��ÿ����dictionary/���ṹ����һ�Σ���һ���ļ�������һ���ļ��ָ�����/������ϱ�ʾһ����Ϊ��dictionary��
 *    ���ļ��У����統��һ����/�����ͻᷢ��ѹ�����г���һ������Ϊ�ա������ļ��С�<br>
 * ��4.1��ze.getName()����á�Ŀ¼����㡱��Ӧ���ļ�·���������ļ����������ļ���·������Ȼ����ļ�·��ֻ����ѹ��
 * �ļ��ڲ���·�� ���硰stream/a.txt��<br>
 * ��4.2��ze.isDictionary()���жϸá�Ŀ¼����㡱�Ƿ���һ���ļ���<br>
 * ��4.2��ze����������ʾһ��ZIPѹ���ļ��Ľ���㣬��������������ļ�Ҳ�������ļ��У�ȡ����ѹ���ļ��Ĺ����м������Щ
 *  ��Ŀ¼����㡱��ע��ѹ���������Ƿ񴴽��ļ��С�Ŀ¼����㡱������ѹ��û��Ӱ�죬�ļ������ɿ����ڴ����ļ���Ŀ¼����㡱
 *  ʱ�Զ�������<br>
 * ��4.3����ѹ�����п��Եõ��ġ�Ŀ¼����㡱����Щ��ȡ����ѹ��ʱ��������Щ��Ŀ¼����㡱�����Բ��������ļ��ж�����
 * ��Ŀ¼����㡱<br>
 * ��4.4��ZipOutputStream��ZipInputStream֧����ѹ����δѹ���Ľ���㡣<br><br>
 * 
 * ��5��ZipOutputStream�ࣺZipOutputStream zos=new ZipOutputStream(OutputStream out)<br>
 * ��5.1��zos.write(byte[] b,int off,int len)��������д��outָ���ѹ�����С�<br>
 * ��5.2��zos.putNextEntry(ZipEntry e)����ʼдһ���µ�Ŀ¼�����ZipEntry���������ڵ�λ��������entryָ���λ�ã�
 *    Ȼ�����ͨ��zos.write(byte[] b,int off,int len)����������д��outѹ�����С�<br>
 * ��5.3��zos.setComment(String comment)�����ô�zip�ļ���ע�����֡�<br>
 * ��5.4��zos.finish()����ɲ��ر�zip������������ر�����ϵ�OutputStream��<br><br>
 * 
 * <b>ѹ�����̣�</b><br>
 * ��5.7��ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(zipFileName))��zipFileName����ʾ
 * ����ѹ���ļ�������·���������������·�����߾���·�������·����ʾ����ڹ��������Ļ������˴��������Ļ���
 * ΪcontextPath="item/"��<br>
 * ��5.8��zos.putNextEntry(new ZipEntry(path))��path������Ŀ¼����㣬���path��ʾ����ѹ���ļ��ڲ����ļ�·����ͬ
 * ϵͳ�ļ�·���޹أ��硰stream/a.txt����<br>
 * ��5.9��FileInputStream fis=new FileInputStream(File inputFile)��inputFile����ȡ����ѹ����ԭʼ���ļ�inputFile��<br>
 * ��5.10��zos.write(fis.read())������ȡԭʼ���ļ������ݲ�д��Ŀ��ѹ���ļ��С�<br><br>
 * 
 * ��6��ZipInputStream�ࣺZipInputStream zis=new ZipInputStream(InputStream in)<br>
 * ��6.1��zis.read(byte[] b,int off,int len)������ֵint����ȡĿ������b����ƫ����offΪ��ʼλ��
 *   ������Ϊlen�ֽ����ݡ�<br>
 * ��6.2��zis.available()������ֵint���ж��Ƿ���굱ǰ������㡱entry�е����ݣ����귵��0��δ���귵��1��<br>
 * ��6.3��zis.closeEntry()������ֵvoid���رյ�ǰZIP��Ŀ����λ���Զ�ȡ��һ����Ŀ��<br>
 * ��6.4��zis.skip(long n)������ֵlong��������ǰZIP��Ŀ��ָ�����ֽ�����<br>
 * ��6.5��zis.getNextEntry()������ֵZipEntry����ȡ��һ��ZipEntry���������ڵ�λ��������entry��ָ������ݵĿ�ͷ��<br>
 * ��6.6��zis.createZipEntry(String name)������ֵZipEntry����ָ����name�����½�һ��ZipEntry����<br><br>
 * 
 * <b>��ѹ���̣�</b>ZipInputStream��ȡ��Ŀ¼����㡱��ZipFile������Ŀ¼����㡱��ȡ��Ӧ�ļ�������������<br>
 * ��6.7��ZipInputStream zis=new ZipInputStream(new FileInputStream(zipFileName))��zipFileName������ѹ�ļ�·����<br>
 * ��6.8��ZipEntry entry=zis.getNextEntry()����ȡ��һ����Ŀ¼����㡱<br>
 * ��6.9��File subFile=new File(output+entry.getName())��output����ѹĿ��·������entry.getName()����ȡ��
 * ѹ�ļ�·�����������ļ������硰stream/a.txt�����������Ŀ�ľ����½�һ���ļ�����<br>
 * ��6.10��if(!subFile.exists()) subFile.getParentFile().mkdirs()���½���ѹ����ļ��������丸�ļ���<br>
 * ��6.11��OutputStream out=new FileOutputStream(subFile)�������ļ������������׼������ѹ�������д��Ŀ���ļ���<br>
 * ��6.12��ZipFile zipFile=new ZipFile(zipFileName)������һ����ѹ�ļ�����<br>
 * ��6.13��InputStream in=zipFile.getInputStream(entry)���ӡ�Ŀ¼����㡱��ȡ����ѹ�ļ�������������<br>
 * ��6.14��out.write(in.read())����ȡ����ѹ�ļ����ݣ�Ȼ��д��Ŀ���ļ���<br><br>
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
			System.out.println("��ѹ���ļ�"+zipFileName+"δ�ҵ���");
		}catch(IOException e){
			System.out.println("�ر�ѹ����ʱ��������");
		}
	}
	
	private void zipfile(ZipOutputStream zos,File inputFile,String path){
		try{
			if(inputFile.isDirectory()){
				File[] files=inputFile.listFiles();
				/*���if������������ͨ����ѹ���ļ��ڲ�����һ��������ļ��У��������ֻ����������һ���ļ��У���ô
				 * ��*/
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
				System.out.println("���ļ�"+inputFile.getName()+"�е�������ѹ����ɣ�");
				fis.close();
			}
		}catch(ZipException e){
			System.out.println("ѹ���ļ�"+inputFile.getName()+"ʱ��������");
		}catch (FileNotFoundException e) {
			System.out.println("��ѹ���ļ�"+inputFile.getName()+"δ�ҵ���");
		}catch(IOException e){
			System.out.println("��ȡ��ѹ���ļ�"+inputFile.getName()+"��������");
		}
	}
	
	/*ZipInputStream��ȡ��Ŀ¼����㡱��ZipFile������Ŀ¼����㡱��ȡ��Ӧ�ļ�������������*/
	@SuppressWarnings("unused")
	private void unzip(String zipFileName,String output){
		try{
			File file=new File(zipFileName);
			ZipFile zipFile=new ZipFile(file);
			ZipInputStream zis=new ZipInputStream(new FileInputStream(file));
			ZipEntry entry=null;
		
			int entryNum=zipFile.size();
			int nth=1;
			System.out.println("��ʼ��ѹ��");
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
				/*�رյ�ǰĿ¼�����*/
			    zis.closeEntry();
			    Float percent=((float)(nth++)/entryNum)*100;
			    if(nth==entryNum) percent=100f;
			    System.out.println("�ѽ�ѹ�ļ���"+entry.getName()+" ���ȣ�"+percent.intValue()+"%");
			}
			zis.close();
			zipFile.close();
		}catch(FileNotFoundException e){
			System.out.println("����ѹ���ļ�δ���֣�");
		}catch(IOException e){
			System.out.println("��ȡ����ѹ���ļ�����");
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
