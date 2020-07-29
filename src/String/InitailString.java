package String;
/**字符串定义方法有：<br>
（1）对象定义，String s=new String("sdfasdf");<br><br>
（2）直接字符串赋值，String s3="1+2";<br><br>
（3）使用字符数组对象定义，char a[ ]={'a','v',' ','c'}；String s=new String(a,int head,int length) ；a表示字符数组
      对象，head开始截取字符数组的下标，length截取字符数目，其中head、length可以省略<br><br>
（4）使用 byte[] 字节数组对象定义，byte a[]；String s=new String(a,int head,int length)；a表示字节数组
      对象，head开始截取字节数组的下标，length截取字节数目，其中head、length可以省略。由于在字节数组中ASCII码占一个字节，汉子
      占两个字节，而此构造方法可以清晰的辨别哪些是ASCII码，哪些是汉子，但如果使用的 head和length 造成汉子被分割无法完整读取就会
      造成汉子乱码，但是ASCII码可以正常输出<br>
（4.1）使用系统输入的时候  System.in.read(byte a[])，是将终端输入的字符转换成字节，其中ASCII码字符在字节数组中占一个字节，汉子
  在字节数组中占两个字节。当直接用 System.out.print(a[i]) 时，是直接把字节数组中的 byte 型数据输出，即是一个数字，当然ASCII码
  字符是一个数字，汉子是两个数字；用System.out.write(a[i]) 时，是将字节数组中的每个 byte 型数据转换成字符，然后输出，由于是一个一个
  转换，所以ASCII码可以正常转换，但是汉子就不能了。<br>
  （4.2）使用终端输入的时候 System.in.read(byte a[])，回车也会产生回车和换行两个字符，并且如果 byte[] 容量足够的话，这两个字符
  也会放入字节数组中。<br><br>
 （5）输出时非字符串常量与字符串连接，非字符串按字符串输出时调用了 toString()
 */
public class InitailString { // 创建类
	public static void main(String args[]) { // 主方法
		String s1 = new String("hello"); // 声明String对象s1
		String s2 = new String("word"); // 声明String对象s2
		String s = s1 + " " + s2; // 将对象s1和s2连接后的结果赋值给s
		String s3="1+2";
		String s5=new String("sdfasdf");
		char a[ ]={'a','v',' ','c'};
		String s4=new String(a,1,3);
		System.out.println(s4);
		System.out.println("ddggg\n"+'g'); // 将s输出
		String s6="我是天";
		byte[] b=s6.getBytes();
		System.out.println(b.length);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		System.out.println(new String(b,0,b.length));
	}
}