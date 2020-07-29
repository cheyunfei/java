package String;
/**（1）获取字符串长度：str.length();<br>
 * （2）获取参数字符串s在指定字符串中首次出现的位置：str.indexOf(s)，检索失败返回 -1；如果 s=""，即s是
         空字符串，则返回0<br>
 （3）获取参数字符串s在指定字符串中最后一次出现的位置：str.lastIndexOf(s)，检索失败返回 -1；
            如果 s=""，即s是空字符串，则返回字符串长度 str.length()<br>
（4）获取指定位置字符：str.charAt(int index)，返回char，index还可以是整数值对应的字符，如str.charAt('#')<br>
*/
public class GetStringInfor { 							//创建类
	public static void main(String args[]) { 		//主方法
		String str = "We arrre students"; 			//定义字符串str
		//将空格在str中的索引位置赋值给变量size
		int size = str.lastIndexOf("");
		//将变量size输出
		System.out.println("空字符串在str中最有一次出现的索引位置是：" + size);
		//将字符串str的长度输出
		System.out.println("字符串str的长度是：" + str.length());
		int s1=str.indexOf("rr");
		int s2=str.lastIndexOf("rr");
		int s3=str.length();
		char c=str.charAt(4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(c);
	}
}