package Stream;
/**
*@author:cloud<br>
*@date:2019��5��9������2:33:50<br>
*@class:Stream.BufferedRW.java<br><br>
*/

/**
 * @author �Ʒ�<br><br>
*��1��BufferedReader��BufferedWriter�ֱ�̳���Reader��Writer��������������ͬ�������ڲ�������ƣ���������Ϊ��λ��������/���<br><br>
*��2��BufferedReader�ࣺ<br>
*��2.1��BufferedReader br=new BufferedReader(Reader in)��in��Reader�༰��������󡿣�br����Reader�༰��
*   �������Ĵ����������Ż�����~size~��java1.8��Ĭ�ϴ���8192���ַ�char�Ļ���������Ϊһ���ַ�ռ2���ֽڣ���16KB��<br>
*��2.2��BufferedReader br=new BufferedReader(Reader in,int size)��in��Reader�༰��������󡿣�br����Reader�༰��
*   �������Ĵ����������Ż�����size��ָ������size���ַ�char�Ļ�������һ���ַ�ռ2���ֽڡ�<br>
*��2.3��br.read()����ȡ�����ַ�������ֵint���ַ���int��ֵ��0~65535��<br>
*��2.4��br.readLine()����ȡһ���ı��У�����ֵ String<br><br>
*��2��BufferedWriter�ࣺ������write()���������ݲ�û�����̱�д����������������Ƚ��뻺������֮�󵱻�����д�����д�뻺������<br>
*��2.1��BufferedWriter bw=new BufferedWriter(Writer out)��out��Writer�༰��������󡿣�bw����Writer�༰��
*   �������Ĵ����������Ż�����~size~��java1.8��Ĭ�ϴ���8192���ַ�char�Ļ���������Ϊһ���ַ�ռ2���ֽڣ���16KB��<br>
*��2.2��BufferedWriter bw=new BufferedWriter(Writer out,int size)��out��Writer�༰��������󡿣�bw����Writer�༰��
*   �������Ĵ����������Ż�����size��ָ������size���ַ�char�Ļ�������һ���ַ�ռ2���ֽڡ�<br>
*��2.3��bw.write(String s,int off,int len)��д���ַ���s��ĳһ���֣�s����Ҫд����ַ������󡿣�off����ʼд���λ�ã����ַ����±꡿��len��д���ַ�����<br>
*��2.4��bw.flush()��ˢ�¸����Ļ��棬ǿ�ƽ����е���Ч����д���������<br>
*��2.5��bw.newLine()��д��һ���зָ�����ȡ����ϵͳ����<br>
 */
public class BufferedRW {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
