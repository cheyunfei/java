package DataClass;
/**（1）java.lang 包中 Number 的子类：Integer 类、Long 类、Short 类【分别将基本类型 int、long、short 封装成
 *             一个类】<br><br>
 *  （2）Integer 构造：”Integer num=new Integer (int number)“或“Integer num=new Integer (5)”【通过
 *                          引用 int 型变量获取 Integer 对象】；“Integer num=new Integer (String s)”【通过引用数值型
 *                          的 String 变量获取 Integer 对象】<br>
 *       注意：Integer 初始化赋值后，如果“num=3”，即直接把数值赋给 Integer 仍能成功，不会报错，但不要这样做
 *                      不清楚后果<br><br>
 *（3）Integer类的方法：注意这里都是 Integer 类级别的方法，使用类对象调用，而不能使用 int 基本类型对象
 *                                调用，int 只是 Integer类内的一个封装属性，“Integer num=new Integer (String s)”<br>
 *    （3.1）”num.byteValue()“：返回 byte<br>
 *    （3.2）“num.compareTo( Integer num2 )”：返回 int，【比较两个 Integer 对象的大小，相等返回0，
 *                  “num&lt;num2”返回 -1，“num&gt;num2”返回 1】<br>
 *    （3.3）“num.equals( Object  IntegerObj )”：返回Boolean，【比较两个对象内容是否一致】<br>
 *    （3.4）“num.intValue()”：返回 int，【以 int 型返回 Integer 对象】<br>
 *    （3.5）“num.shortValue()”：返回 short，【以 short 型返回 Integer 对象】<br><br>
 *    
 *    （3.61）“num.toString()”：返回 String，保留负号‘-’，【以十进制数字型 String 返回 Integer 对象】<br>
 *    （3.62）“Integer.toString( int i )“：返回 String，保留负号‘-’，【以十进制数字型 String 返回 Integer 对象】<br>
 *    （3.63）“Integer.toString( int i , int radix )“：返回 String，保留负号‘-’，i【将要转换的十进制
 *                      数】，radix【进制，‘8’就代表八进制】，将十进制数 i 按任一进制 radix 转换成String<br>
 *    （3.64）“Integer.toUnsignedString( int i , int radix)”：返回String，将十进制数 i 转换成32位(4字节)
 *                      补码形式，即如果 i 为负数，按机器值负号参与进制的转换，i【将要转换的十进制数】，radix【进
 *                      制，‘8’就代表八进制，如果没有 radix 这个参数，默认为十进制】<br><br>
 *     
 *    （3.7）“Integer.toBinaryString( int i )”：返回 String，【以二进制 String 返回 Integer 对象】<br>
 *    （3.8）“Integer.toHexString( int i )”：返回 String，【以十六进制 String 返回 Integer 对象】<br>
 *    （3.9）“Integer.toOctalString( int i )”：返回 String，【以八进制 String 返回 Integer 对象】<br>
 *    （3.10）“Integer.valueOf( String str )”：返回 Integer，【将数字型字符串转换为 Integer 型对象】<br>
 *    （3.11）“Integer.parseInt( String str , int radix)”：返回 int ，str【将要转换的十进制
 *                      型字符串 str 】，radix【进制，‘8’就代表八进制，如果没有 radix 这个参数，默认为十进
 *                      制】，同样有对应于此函数的把无符号数字字符串代表的数转换成对应进制数的函数parseUnsignedInt( String , int )<br>
 *（4）Integer类常量：Integer.MAX_VALUE 【 int 最大值 2^31-1】；Integer.MIN_VALUE 【 int 最小值 -2^31】；
 *                                 Integer.SIZE 【 int 表示为二进制补码形式所占的位数，值为32】；Integer.TYPE【Integer
 *                                 封装的基本类型 int 的 Class 实例】<br>
 * */
public class IntegerClass { // 创建类Summation
	public static void main(String args[]) { // 主方法
		int px=Integer.parseUnsignedInt("23");
		System.out.println(px);
		String str[] = { "89", "12", "10", "18", "35" }; // 定义String数组
		int sum = 0; // 定义int型变量sum
		for (int i = 0; i < str.length; i++) { // 循环遍历数组
		   int myint=Integer.parseInt(str[i]);//将数组中的每个元素都转换为int型
			sum = sum + myint; // 将数组中的各元素相加
		}
		System.out.println("数组中的各元素之和是：" + sum); // 将计算后结果输出
		Integer a=new Integer("33");
	    Integer b=Integer.valueOf("34");
	   
	    int x=a+b;
	    System.out.println(x);
	    
	    a=Integer.valueOf("23");
	    a=32;
	    int c=Integer.parseInt("32");
	    short d=a.shortValue();
	    int e=a.intValue();
	    boolean f=a.equals(b);
	    int g=a.compareTo(b);
	    byte h=a.byteValue();
	    String w=a.toString();//这里被调用的对象必须是Integer类的对象，例如此句a的位置不能是c
	    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+w);
	    
	    
	    String conver=Integer.toString(-8, 2);
	    System.out.println(conver);
	    String conver2=Integer.toUnsignedString(128,2);
	    System.out.println(conver2);
	    System.out.println(Integer.MAX_VALUE+"  "+Integer.MIN_VALUE+"  "+Integer.SIZE+"  "+Integer.TYPE);
	}
}
