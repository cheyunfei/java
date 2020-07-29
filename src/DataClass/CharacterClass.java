package DataClass;
/**（1）Character 类的构造方法： Character mychar=new Character( char c )<br><br>
 * （2）Character 类常用方法：Character mychar=new Character( char c )<br>
 * （2.1）char c=mychar.charValue()<br>
 * （2.2）int i=mychar1.compareTo( Character other )，【比较两个 Character 对象是否相等，值为 mychar-other 的差值】<br>
 * （2.3）boolean b=obj.equals( Object obj2 )，【这里调用此函数的对象必须是包装类的对象，而不能是基本数据类型，
 *                                  比如不能是 char 或 int ，可以是 Character 或 Integer】<br>
 * （2.4）Character c=Character.toLowerCase( Character c / char c )，【注意 tolowerCase 不能由 char 直接调用】<br>
 * （2.5）Character c=Character.toUpperCase( Character c / char c )，【注意 toUpperCase 不能由 char 直接调用】<br>
 * （2.6）String s=mychar.toString()，【注意 toString 不能由 char 直接调用，char 只是类Character 中封装的基本类型属性】<br>
 * （2.7）boolean b=Character.isUpperCase( Character c / char c )<br>
 * （2.8）boolean b=Character.isLowerCase( Character c / char c )<br><br>
 * （3）Character类的常量：byte b=Character.CONNECTOR_PUNCTUATION【返回 byte 类型值，表示Unicode规范中
 *                                   的常规类别“Pc”,值为23】<br>
 *                                   byte b=Character.UNASSIGNED【返回 byte 类型值，表示Unicode规范中
 *                                   的常规类别“Cn”,值为0】<br>
 *                                   byte b=Character.UNASSIGNED【返回 byte 类型值，表示Unicode规范中
 *                                   的常规类别“Cn”,值为3】<br><br>
 *（4）字符数据 char 类型在内存中占两个字节<br><br>
 *（5）String 类：通过观察源码可以发现，String类其实维护的是一个字符数组，即字符串String中的每个字符都占两个字节<br><br>
 *（6）Unicode：通常用两个字节表示一个字符，原有的英文编码也从单字节变成双字节【也就是把高字节用0填充，低字节保持原本的ASCII码
 *    】。这样可以把所有语言都统一到一套编码里。<br><br>
 *（7）UTF【Unicode Transformation Format】:如果unicode字符由2个字节表示，则编码成UTF-8很可能需要3个字节；而如果unicode
 *   字符由4个字节表示，则编码成utf-8很可能需要6个字节。更详细的说明自己查阅。<br><br>
 *注意：Character类常量很多，有待了解；一旦 Character 类被创建，它包含的数值就不能改变了*/
public class CharacterClass {
	public static void main(String args[]) {
		Character char1 = new Character('h');
		Character char2 = new Character('H');
		
		Integer s=new Integer("22");
		Integer s2=new Integer("22");
		System.out.println(s.equals(s));
		
	   char c=char1.charValue();System.out.println(c);
		boolean b = char1.equals(char2);
		System.out.println(char1+"和"+char2+"是否相等："+b);
		Character char3 = Character.toLowerCase(char1);
		Character char4 = Character.toLowerCase(char2);
		boolean bb = char3.equals(char4);
		String cc="dd";
		byte k=Character.TITLECASE_LETTER;     System.out.println(k);
		cc=cc.toUpperCase();System.out.println(cc);
		System.out.println(char3+"和"+char4+"是否相等："+bb);
	}
}