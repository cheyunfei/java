package Stream;
/**
*@author:cloud<br>
*@date:2019��5��9������7:48:54<br>
*@class:Stream.BufferedIOStream.java<br><br>*
*/


/**
* @author �Ʒ�<br><br>
*��1�����棺������I/O��һ�������Ż���������ΪI/O���������ڴ滺���������˻��棬�Ϳ���������ִ��skip()��mark()��reset()<br><br>
*��2��BufferedInputStream�ࣺ��������InputStream����д��������İ�װ�Դﵽ���ܵ��Ż���<br>
*��2.1��BufferedInputStream bin=new BufferedInputStream(InputStream in)��in��InputStream�༰��������󡿣�bin����InputStream
*   �༰���������Ĵ����������Ż�����~size~��java1.8��Ĭ�ϴ���8192���ֽڵĻ���������8KB��<br>
*��2.2��BufferedInputStream bin=new BufferedInputStream(InputStream in,int size)��in��InputStream�༰��������󡿣�bin����InputStream
*   �༰���������Ĵ����������Ż�����size��ָ������size���ֽڵĻ�������<br><br>
*��3��BufferedOutputStream�ࣺ��������OutputStream����д��������İ�װ�Դﵽ���ܵ��Ż���<br>
*��3.1��BufferedOutputStream bout=new BufferedOutputStream(OutputStream out)��out��OutputStream�༰��������󡿣�bout����OutputStream
*   �༰���������Ĵ����������Ż�����~size~��java1.8��Ĭ�ϴ���8192���ֽڵĻ���������8KB��<br>
*��3.2��BufferedOutputStream bout=new BufferedOutputStream(OutputStream out,int size)��out��OutputStream�༰��������󡿣�bout����OutputStream
*   �༰���������Ĵ����������Ż�����size��ָ������size���ֽڵĻ�������<br>
*��3.3��bout.flush()��һ��BufferedOutputStream��ֻ���ڽ�����������֮���������д����Զ����������ڵ�����д���ļ����������
*   �÷��������ڼ�ʹ������û�б�������ʱ��Ҳ�Ὣ�������е�����ǿ��д���������<br><br>
*/
public class BufferedIOStream {
	public static void main(String[] args){
		
	}
}
