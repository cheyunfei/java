package Stream;
/**
*@author:cloud<br>
*@date:2019年5月9日下午2:33:50<br>
*@class:Stream.BufferedRW.java<br><br>
*/

/**
 * @author 云飞<br><br>
*（1）BufferedReader与BufferedWriter分别继承自Reader与Writer，这两个缓存类同样带有内部缓存机制，可以以行为单位进行输入/输出<br><br>
*（2）BufferedReader类：<br>
*（2.1）BufferedReader br=new BufferedReader(Reader in)，in【Reader类及其子类对象】，br【对Reader类及其
*   子类对象的带缓存区的优化】，~size~【java1.8中默认创建8192个字符char的缓存流，因为一个字符占2个字节，即16KB】<br>
*（2.2）BufferedReader br=new BufferedReader(Reader in,int size)，in【Reader类及其子类对象】，br【对Reader类及其
*   子类对象的带缓存区的优化】，size【指定创建size个字符char的缓存流，一个字符占2个字节】<br>
*（2.3）br.read()：读取单个字符，返回值int【字符的int型值，0~65535】<br>
*（2.4）br.readLine()：读取一个文本行，返回值 String<br><br>
*（2）BufferedWriter类：【调用write()方法后，数据并没有立刻被写入输出流，而是首先进入缓冲区，之后当缓冲区写满后才写入缓冲区】<br>
*（2.1）BufferedWriter bw=new BufferedWriter(Writer out)，out【Writer类及其子类对象】，bw【对Writer类及其
*   子类对象的带缓存区的优化】，~size~【java1.8中默认创建8192个字符char的缓存流，因为一个字符占2个字节，即16KB】<br>
*（2.2）BufferedWriter bw=new BufferedWriter(Writer out,int size)，out【Writer类及其子类对象】，bw【对Writer类及其
*   子类对象的带缓存区的优化】，size【指定创建size个字符char的缓存流，一个字符占2个字节】<br>
*（2.3）bw.write(String s,int off,int len)：写入字符串s的某一部分，s【需要写入的字符串对象】，off【开始写入的位置，即字符串下标】，len【写入字符数】<br>
*（2.4）bw.flush()：刷新该流的缓存，强制将其中的有效内容写入输出对象<br>
*（2.5）bw.newLine()：写入一个行分隔符，取决于系统属性<br>
 */
public class BufferedRW {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
