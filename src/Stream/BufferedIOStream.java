package Stream;
/**
*@author:cloud<br>
*@date:2019年5月9日上午7:48:54<br>
*@class:Stream.BufferedIOStream.java<br><br>*
*/


/**
* @author 云飞<br><br>
*（1）缓存：缓存是I/O的一种性能优化。缓存流为I/O流增加了内存缓存区。有了缓存，就可以在流上执行skip()、mark()、reset()<br><br>
*（2）BufferedInputStream类：【对所有InputStream类进行带缓存区的包装以达到性能的优化】<br>
*（2.1）BufferedInputStream bin=new BufferedInputStream(InputStream in)，in【InputStream类及其子类对象】，bin【对InputStream
*   类及其子类对象的带缓存区的优化】，~size~【java1.8中默认创建8192个字节的缓存流，即8KB】<br>
*（2.2）BufferedInputStream bin=new BufferedInputStream(InputStream in,int size)，in【InputStream类及其子类对象】，bin【对InputStream
*   类及其子类对象的带缓存区的优化】，size【指定创建size个字节的缓存流】<br><br>
*（3）BufferedOutputStream类：【对所有OutputStream类进行带缓存区的包装以达到性能的优化】<br>
*（3.1）BufferedOutputStream bout=new BufferedOutputStream(OutputStream out)，out【OutputStream类及其子类对象】，bout【对OutputStream
*   类及其子类对象的带缓存区的优化】，~size~【java1.8中默认创建8192个字节的缓存流，即8KB】<br>
*（3.2）BufferedOutputStream bout=new BufferedOutputStream(OutputStream out,int size)，out【OutputStream类及其子类对象】，bout【对OutputStream
*   类及其子类对象的带缓存区的优化】，size【指定创建size个字节的缓存流】<br>
*（3.3）bout.flush()：一般BufferedOutputStream类只有在将缓存流填满之后，如果继续写入才自动将缓存流内的内容写入文件等输出对象；
*   该方法则是在即使缓存流没有被填满的时候，也会将缓存流中的内容强制写入输出对象<br><br>
*/
public class BufferedIOStream {
	public static void main(String[] args){
		
	}
}
