package Stream;
/**
*@author:cloud<br>
*@date:2019��5��12������10:36:04<br>
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
 * @author �Ʒ�<br><br>
 *��1����������/�������DataInputStream��DataOutputStream�ࣩ����Ӧ�ó�����������޹صķ�ʽ�ӵײ��������ж�ȡ������Java
 *�������͡�Ҳ����˵������ȡһ������ʱ�������ٹ��������ֵӦ���������ֽڡ�<br><br>
 *��2��DataInputStream di=new DataInputStream(InputStream in)��in��������������<br>
 *��2.1��di.readUTF()��DataInputStream��ֻ�ṩ��������������ַ�����������ض������ȡ�ļ�������ֻ��UTF������д���ֽ���
 *     ʱ�Żḽ���ֽڳ��ȣ����Կ���ʶ���ֽ�������λ�á�����ֵString����ע����������ֻ����utf�����ʱ��ʹ��utf��ȡ����������
 *     ����������ʾ������������������ʽ����÷���ֱ�ӷ���nullֵ�������޷�ʶ��<br>
 *��2.2��di.read()����ȡһ���ֽڣ������ֽڰ�ԭʼ�ڴ�����д��intֵ����Ͱ�λ������λ��0�������������ֵʼ������������ֵint<br>
 *��2.3��di.read(byte[] b)����ȡһ���ֽڣ������ֽڰ�ԭʼ�ڴ���������һ��byte�ֽ��У����ԭ�ֽ���λ��1�����byte������
 *     ֵ�����ʱ���Ǹ�ֵ��<br><br>
 *��3��DataOutputStream do=new DataOutputStream(OutputStream out)��out�������������<br>
 *��3.1��do.writeBytes(String s)�����ַ�����ÿ���ַ��ĵ��ֽ�����д��Ŀ���豸��<br>
 *��3.2��do.writeChars(String s)�����ַ�������ÿһ���ַ��������ֽڶ�д�뵽�豸��<br>
 *��3.3��do.writeUTF(String s)�����Ƚ��ַ�����UTF���룬��ʵ�ǽ��ַ�����������ֽ�����ֵ�������ֽ�д��Ŀ���豸��Ȼ��
 *    ����д��utf�������ַ�����<br>
 *��3.4��do.write(byte[] b,int off,int len)����ָ���ֽ������д�ĳ���±꿪ʼ��ָ�����ȵ��ֽ������е�����д��Ŀ�������<br>
 *��3.5��do.write(int b)������������ b ת���ɲ�����ʽ��Ȼ���뽫�Ͱ�λ��������ֽڡ���ԭʼ������Ķ���������д��Ŀ���С�<br>
 *��3.6��do.writeBoolean(boolean b)��������ֵ��һ���ֽ�д��Ŀ�ֵ꣬Ϊ1��0<br><br>
 */
public class DataIOStream {


	public static void main(String[] args){
		// TODO �Զ����ɵķ������
		DataOutputStream dos=null;
		DataInputStream dis=null;
		try {
			OutputStream terminal=new PrintStream(System.out);
			File file=new File("./src/Stream/b.txt");
			if(!file.exists())file.createNewFile();
			FileOutputStream fo=new FileOutputStream(file);
			dos=new DataOutputStream(fo);
			System.out.println("���ն�����ַ�����");
			/*Using the five ways below write data to file*/
			//dos.writeBytes("sdfs");
			System.out.println("bytes.length(writeBytes) : "+file.length());
			//dos.writeChars("sdfs");
			System.out.println("bytes.length(writeChars) : "+file.length());
			//dos.writeUTF("sdfs��");
			System.out.println("bytes.length(writeUTF)   : "+file.length());
			byte[] s=new byte[]{0,0,0};
			//dos.write(s);
			dos.write(-127);
			System.out.println("bytes.length(byteValue=0): "+file.length());
			dos.close();
			
			/*read file as the encoding way of UTF*/
			FileInputStream fi=new FileInputStream(file);
			dis=new DataInputStream(fi);
			System.out.print("��ȡutf�����ļ���");
			try{
				System.out.println(dis.readUTF());
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
			dis.close();
			
			/*read file as the encoding way of byte*/
			FileInputStream fi2=new FileInputStream(file);
			dis=new DataInputStream(fi2);
			System.out.print("��ȡ�ֽڱ����ļ���");
			System.out.println(dis.readByte());
			dis.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			System.out.println(e.getMessage());
		}
		
		File file2=new File("./src/Stream/b.txt");
		try {
			FileReader fi=new FileReader(file2);
			BufferedReader bi=new BufferedReader(fi);
			String fileContent=bi.readLine();
			System.out.println("�ļ������ַ�����"+fileContent.length()+"  "+"�ļ����ݣ�"+fileContent);
			System.out.println("�ֽ����飺"+fileContent.getBytes().length);
			byte[] unknow=Arrays.copyOfRange(fileContent.getBytes(), 12,fileContent.getBytes().length);
			for(int i=0;i<unknow.length;i++){
				System.out.println(unknow[i]+"  �ַ���    "+(char)unknow[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
