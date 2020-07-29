package String;
/**（1）获取子字符串：str.substring( int beginIndex , int endIndex)，返回String，beginIndex【开始截取字符串的位置】，
 * endIndex【终止截取字符串的位置，若为5，则子字符串截取到4就结束】，其中endIndex可以没有<br>
（2）去除先导和尾部空格：str.trim()【去除字符串首部和尾部空格，处于字符串中间的空格不去除】<br>
（3）字符替换：str.replace( char oldChar , char newChar)，返回String，【用新字符替换字符串中所有原来的字符】<br>
（4）字符串替换：str.replace( String oldStr , String newStr)，返回String，【用新字符串替换字符串中所有原来的旧字符串，
             这里是一次性替换，如出现替换导致出现的旧字符串不予理会】<br>
（5）以上两个找到替换位置，返回新字符串；找不到替换位置，则返回原字符串<br>
（6）判断字符串是否以指定前缀开始：str.startsWith( String pre )，返回boolean，pre【指定的前缀】<br>
（7）判断字符串是否以指定后缀结束：str.endsWith( String suf )，返回boolean，suf【指定的后缀】<br>
（8）判断字符串是否相等：str1.equals( String str2)，【区分大小写】；str1.equalsIgnoreCase( String str2)，
                                            【不区分大小写】，返回boolean<br>
（9）注意：“==”在字符串比较中的意义是比较字符串对象是否相同，即字符串地址是否相同，两个不同的对象
                     “str1==str2”结果始终为false；但是如果有String s1 = new String("abc")  String s2=s1 ，
                      字符串对象引用，此时再比较“s1==s2”结果就为true，同样直接字符串比较"adc"=="adc"也
                      是字符串对象引用，结果true<br>
（10）字典序比较字符串：str1.compareTo( String str2 )，返回int【为第一个不同字符在Unicode表中编码的差值】，
                                        【在Unicode表中str1在str2之前，返回负数；在Unicode表中str1在str2之后；返回正数
                                        ；字符串相等，返回0】<br>
（11）字符串大小写转换：str.toLowerCase()，【转换为小写】；str.toUpperCase()，【转换为大写】，返回String<br>*/
public class OperateString{ // 创建类
	public static void main(String args[]) { // 主方法
		String str = "hello word"; // 定义的字符串
		String substr = str.substring(0, 3); // 对字符串进行截取
		System.out.println(substr); // 输出截取后的字符串
		String substr2=str.substring(2);
		System.out.println(substr2);
		
		String str1= "  Java  class   "; // 定义字符串str
		String str2=str1.trim();
		System.out.println(str2+" "+str2.length());
		
		String str3 = "addressdd";
		String str4=str3.replace("d", "jk");
		String str5=str3.replace('d','s');
		
		String num1 = "22045612"; 
		boolean b1= num1.startsWith("22"); 
		boolean b2 = num1.endsWith("78"); 
		
		String s1 = new String("abc");
		String s2=s1;
		String s3 = new String("cBC"); 
		boolean b3= s1.equals(s2);
	    boolean b4=s1.equalsIgnoreCase(s3); 
	    boolean b5=(s1==s3);
	    boolean b6=("as"=="as");
	    
	    int x=s1.compareTo(s3);System.out.println(x);
	    
	    String x2= s3.toLowerCase(); 
		String x3= s3.toUpperCase();
		
		String g=new String("abbcde");
		String g2=new String("ca");
		String g3=g.replace("ab",g2);
		System.out.println(g3);
		
	}
}