package Stream;
/**
*@author:cloud<br>
*@date:2019年5月12日下午10:36:04<br>
*@class:Stream.DataIOStream.java<br><br>
*/

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;


/**
 * @author 云飞<br><br>
 *（1）数据输入/输出流（DataInputStream和DataOutputStream类）允许应用程序以与机器无关的方式从底层输入流中读取基本的Java
 *数据类型。也就是说，当读取一个数据时，不必再关心这个数值应当是那种字节。<br><br>
 *（2）DataInputStream di=new DataInputStream(InputStream in)，in【数据输入流】<br>
 *（2.1）di.readUTF()：DataInputStream类只提供了这个方法返回字符串。如果按特定编码读取文件，由于只有UTF编码在写入字节流
 *     时才会附加字节长度，所以可以识别字节流结束位置。返回值String。【注：当数据流只是用utf编码的时候，使用utf读取数据流可以
 *     可以正常显示，如果夹杂其他编码格式，则该方法直接返回null值，表明无法识别】<br>
 *（2.2）di.read()：读取一个字节，将该字节按原始内存数据写入int值的最低八位，其余位填0，所以这个返回值始终是正，返回值int<br>
 *（2.3）di.read(byte[] b)：读取一个字节，将该字节按原始内存数据填入一个byte字节中，如果原字节首位是1，则该byte按整形
 *     值输出的时候是负值。<br><br>
 *（3）DataOutputStream do=new DataOutputStream(OutputStream out)，out【数据输出流】<br>
 *（3.1）do.writeBytes(String s)：将字符串中每个字符的低字节内容写入目标设备中<br>
 *（3.2）do.writeChars(String s)：将字符串中中每一个字符的两个字节都写入到设备中<br>
 *（3.3）do.writeUTF(String s)：首先将字符串用UTF编码，其实是将字符数组编码后的字节数的值用两个字节写入目标设备；然后
 *    继续写入utf编码后的字符串。<br>
 *（3.4）do.write(byte[] b,int off,int len)：将指定字节数组中从某个下标开始的指定长度的字节数组中的内容写入目标对象中<br>
 *（3.5）do.write(int b)：将整数参数 b 转换成补码形式，然后补码将低八位【即最低字节】以原始无意义的二进制数据写入目标中。<br>
 *（3.6）do.writeBoolean(boolean b)：将布尔值按一个字节写入目标，值为1或0<br><br>
 */
public class DataIOStream {


	public static void main(String[] args){
		// TODO 自动生成的方法存根
		DataOutputStream dos=null;
		DataInputStream dis=null;
		try {
			OutputStream terminal=new PrintStream(System.out);
			File file=new File("./src/Stream/b.txt");
			if(!file.exists())file.createNewFile();
			FileOutputStream fo=new FileOutputStream(file);
			dos=new DataOutputStream(fo);
			System.out.println("向终端输出字符串：");
			/*Using the five ways below write data to file*/
			//dos.writeBytes("sdfs");
			System.out.println("bytes.length(writeBytes) : "+file.length());
			//dos.writeChars("sdfs");
			System.out.println("bytes.length(writeChars) : "+file.length());
			//dos.writeUTF("sdfs我");
			System.out.println("bytes.length(writeUTF)   : "+file.length());
			byte[] s=new byte[]{0,0,0};
			//dos.write(s);
			dos.write(-127);
			System.out.println("bytes.length(byteValue=0): "+file.length());
			dos.close();
			
			/*read file as the encoding way of UTF*/
			FileInputStream fi=new FileInputStream(file);
			dis=new DataInputStream(fi);
			System.out.print("读取utf编码文件：");
			try{
				System.out.println(dis.readUTF());
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
			dis.close();
			
			/*read file as the encoding way of byte*/
			FileInputStream fi2=new FileInputStream(file);
			dis=new DataInputStream(fi2);
			System.out.print("读取字节编码文件：");
			System.out.println(dis.readByte());
			dis.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}
		
		File file2=new File("./src/Stream/b.txt");
		try {
			FileReader fi=new FileReader(file2);
			BufferedReader bi=new BufferedReader(fi);
			String fileContent=bi.readLine();
			System.out.println("文件长度字符数："+fileContent.length()+"  "+"文件内容："+fileContent);
			System.out.println("字节数组："+fileContent.getBytes().length);
			byte[] unknow=Arrays.copyOfRange(fileContent.getBytes(), 12,fileContent.getBytes().length);
			for(int i=0;i<unknow.length;i++){
				System.out.println(unknow[i]+"  字符化    "+(char)unknow[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
