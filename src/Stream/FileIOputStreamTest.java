package Stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
/**
*@author:cloud<br>
*@date:2019��5��7������12:53:22<br>
*@class:Stream.FileStreamTest.java<br><br>
*/

/**
 * @author �Ʒ�<br><br>
*��1��FileInputStream��FileOutputStream�����඼���������������ļ�<br>
*��2��FileInputStream extends InputStream�� FileOutputStream extends OutputStream<br>
*��3��ע��FileOutputStream�������ļ���д���ʱ�򣬸��ļ����������ڱ���������ռ�õ��ļ�<br><br>
*��4�����캯����<br>
*��4.1��FileInputStream in=new FileInputStream(String name)��name��ʹ�ø������ļ�������FileInputStream����<br>
*��4.1.1��in.read(byte[] s)�������ļ���������Ϣд���ֽ�������<br>
*��4.1.2��in.close()���ر�������<br><br>
*��4.2��FileOutputStream out=new FileOutputStream(File file,boolean append)��file��ʹ��һ��File���󴴽�FileOutputStream���󡿣�
*   append��true������ӵķ�ʽд���ļ���false���Ը��ǵķ�ʽд���ļ���<br>
*��4.2.1��out.wirte(byte[] s)�����ֽ������е�����д���ļ���<br>
*��4.2.2��out.close()���ر����������<br><br>
*��5��ע��FileTest�й���������ռ��File������ע���������
 */
public class FileIOputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO �Զ����ɵķ������
		File f=new File("./src/Stream/a.txt");
		try {
			if(!f.exists()) f.createNewFile();
			else System.out.println("�ļ�a.txt�Ѵ��ڣ���");
			System.out.println(f.length());
			FileOutputStream s=new FileOutputStream(f,false);
			
			byte[] buy="�����ķ���".getBytes();
			s.write(buy);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
