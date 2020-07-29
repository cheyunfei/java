package DataClass;
/**（1）Byte 类封装基本类型 byte<br>
 * 
 * （2）Byte 类对象构造方法：Byte b=new Byte( byte  value )   或  Byte b=new Byte( String str )<br><br>
 * 
 * （3）Byte常用方法：Byte b=new Byte( byte  value )<br>
 *（3.1）byte bt=b.byteValue()<br>
 *（3.2）int com=b.compareTo( Byte b2)，返回值为 b 和 b2 的差值，即【b-b2】<br> 
 *（3.3）double db=b.doubleValue()<br>
 *（3.4）int ib=b.intValue()<br>
 *（3.5）byte b2=Byte.parseByte( String s )，这里 s 必须是数字型字符串，将字符串转换成相应的 byte 型数据<br>
 *（3.6）String sb=b.toString()<br>
 *（3.7）Byte b3=Byte.valueOf( String str )，将指定字符串对应的数字转换成 Byte 对象<br>
 *（3.8）boolean boo=b.equals( Object obj )，比较两个对象对应的数字是否相同，【obj可能是Byte类，也可能是所有数字
 *                          类的父类 Number 类】<br><br>
 *
 *（4）Byte 类常量：Byte.MAX_VALUE【 byte 类型最大值，2^7-1=127】<br>
 *Byte.MIN_VALUE【 byte 类型最小值，-2^7=128】<br>
 *Byte.SIZE【 byte 二进制补码位数】<br>
 *Byte.TYPE【表示基本类型 byte 的 Class 的实例】 */
public class ByteClass {
	public static void main(String[] args){
		byte a=23;
		Byte b=new Byte(a);
		Byte p=new Byte("15");     
		System.out.println(b.compareTo(p));
	    
		double c=b.doubleValue();
		int f=b.intValue();
		byte d=Byte.parseByte("23");
		String e=b.toString();
		Byte g=Byte.valueOf("23");
		boolean t=b.equals("23");System.out.println(t);
		System.out.println(g);
		System.out.println(Byte.MAX_VALUE+" "+Byte.MIN_VALUE+" "+Byte.SIZE+" "+Byte.TYPE);
	}

}
