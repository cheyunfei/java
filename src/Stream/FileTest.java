package Stream;
import java.io.*;
/**
 * @author �Ʒ�<br><br>
 *��1��File����java.io����Ψһ��������ļ�����Ķ���File�ඨ����һЩ��ƽ̨�޹صķ����������ļ���
 *  ����ͨ������File���еķ�����ʵ�ִ�����ɾ�����������ļ��Ȳ�����<br><br>
 *��2��File��Ҫ������ȡ�ļ���һЩ��Ϣ���ļ�����Ŀ¼���ļ��ĳ��ȡ��ļ���дȨ�޵ȡ�<br><br>
 *��3��File���캯����<br>
 *��3.1��File file=new File(String filepath)��filepath��·�����ƣ������ļ�����File file=new File("d:/a.txt")����filepath�ĸ�ʽ
 *   ������"./src/Stream/"��"./src/Stream/"��".\\src\\Stream"��".\\src\\Stream\\"����ʹ��file.getPath()
 *   ����ļ����·��ʱ�������".\src\Stream"��<br>
 *��3.2��File file=new File(String parent,String child)��parent����·���ַ�����d:\doc������child����·���ַ�����letter.txt����<br>
 *��3.3��File file=new File(File f,String child)��f����·������File file=new File(...)������child����·���ַ�����letter.txt����<br><br>
 *��4��File������<br>
 *��4.1��file.exists()���ж��ļ��Ƿ����<br>
 *��4.2��file.createNewFile()�����������ڵ��ļ�������ļ��Ѿ����ڣ����ظ�������Ч�������Ḳ��ԭ�ļ�<br>
 *��4.3��file.delete()��ɾ���ļ�<br>
 *��4.4��file.getName()����ȡ�ļ�����<br>
 *��4.5��file.canRead()���ж��ļ��Ƿ�Ϊ�ɶ�<br>
 *��4.6��file.canWrite()���ж��ļ��Ƿ�ɱ�д��<br>
 *��4.7��file.length()����ȡ�ļ��ĳ��ȣ����ֽ�Ϊ��λ<br>
 *��4.8��file.getAbsolutePath()����ȡ�ļ��ľ���·��<br>
 *��4.9��file.getParent()����ȡ�ļ��ĸ�·��<br>
 *��4.10��file.isFile()���ж��Ƿ���һ���������ļ����������ļ��л��߲����ڵ��ļ�<br>
 *��4.11��file.isDirectory()���ж��ļ��Ƿ�Ϊһ��Ŀ¼<br>
 *��4.12��file.isHidden()���ж��ļ��Ƿ�Ϊ�����ļ�<br>
 *��4.13��file.lastModified()����ȡ�ļ�������޸�ʱ�䣬����ֵ��long��<br>
 *��4.14��file.toURI()����ȡ�ļ���URI��ʶ����Ҳ��URL·��<br>
 *��5�����⣺��������ʹ��new File().length()��ȡ�ļ����ȵ�ʱ���ļ��е�ȷ�����ݣ�����ȴ��ʾ���Ϊ0����<br>
 *��5.1������������������飬ԭ��ΪFile�ഴ����ɺ������File�����file�����������������������FileReader��FileWriter��
 *   FileInputStream��FileOutputStream....��new FileReader(new File("a.txt"))������ô��Ϊfile����ָ����ļ���ռ�ã�
 *   ��ʱ����file.length()�᷵��ֵ0����ʾFile����ռ�á�<br>
 *��5.2��Դ�룺ͨ����Դ��ķ������Կ������ڷ���length()�л���һϵ�в������ж��ļ���״̬�����״̬���ر�ʾinvalid����Ч��Ĭ�Ϸ���ֵ0L��
 *  ��ʾFile������������ã���Ӧ��Ҳ��һ���ļ���������<br><br>
 *��5.2�������Ҫ��ȡ�ļ�����ֻ�������ط������ܶ�File�������������Ҳ�������������<br>
 *    1.File������������ռ��֮ǰ����length()��<br>
 *    2.��������Reader��Writer�رա�inOrout.close()��֮�󣬼������������File�����ռ��֮�����<br><br>
 *��6�������ļ�·�������⣺<br>
 *��6.1���ļ�URI·����ʽ��<br>
 *    [  Linux ]file:/home/cloud/a.txt<br>
 *    [ window ]file:/c:/user/a.txt<br><br>
 *��6.2���ļ�·����<br>
 * ���·�������·����ʾ����ڹ��������Ļ������˴��������Ļ���ΪcontextPath="item/"<br><br>
 */
public class FileTest {
	public static void main(String[] args){
		File file=new File("./src/Stream/a.txt");
		System.out.println(file.exists());
		System.out.println(file.toURI());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(file.isFile());
		System.out.println(file.getAbsolutePath());
	}
}
