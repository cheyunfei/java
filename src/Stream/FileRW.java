package Stream;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
/**
*@author:cloud<br>
*@date:2019��5��7������2:13:57<br>
*@class:Stream.FileRW.java<br><br>
*/

/**
 * @author �Ʒ�<br><br>
*��1�����ں������ļ���ռ�������ֽڣ����ʹ���ֽ�������ȡ���ÿ��ܻ�����������󣬴�ʱ����
*   Reader��Writer����Ӣ�����ļ���ռ��һ���ֽڡ�<br>
*��2�����췽����FileReader r=new FileReader(File file)<br>
*��2.1��r.write(String s)����һ���ַ���д���ļ��У����ļ���ͬStringһ��������ռ�����ֽڣ�Ӣ��ռһ���ֽ�<br>
*��2.2��r.close()���ر�����������<br><br>
*
*��3�����췽����FileWriter w=new FileWriter(File file)<br>
*��3.1��w.read(Byte[] byte)�����ļ����ݶ���һ���ֽ�������<br>
*��3.2��w.close()���ر����������<br><br>
*��4��ע��FileTest�й���������ռ��File������ע���������
 */
public class FileRW {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		boolean success=false;
		FileWriter w=null;
		try{
			File f=new File("./src/Stream/a.txt");
			if(!f.exists()) f.createNewFile();
			else System.out.println("�ļ�����");
			System.out.println("ԭ�ļ����ȣ�"+f.length());
			w=new FileWriter(f);
			
			String s="д���ļ����ַ���sss";
			System.out.println("�ַ���s�ֽ�����"+s.getBytes().length);
			w.write(s);
			w.close();
			System.out.println("���ļ����ȣ�"+f.length());
		    success=true;
		}catch(IOException e){
			if(w==null)success=false;
			System.out.println("IO error:"+e.getMessage());
		}
		if(success==false)System.out.println("�ļ��򿪴���");
		else System.out.println("�ļ��򿪳ɹ�");
	}

}
