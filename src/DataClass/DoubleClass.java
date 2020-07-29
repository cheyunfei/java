package DataClass;
/**（1）Double类的构造方法：Double d=new Double( String str ) 或  Double d=new Double( double value )<br><br>
 * （2）Double类的方法：Double d=new Double( double value )<br>
 * （2.1）byte t=d.byteValue()<br>
 * （2.2）int i=d.compareTo( Double d2 )，【比较两个Double对象，值为 d-d2 的差值】<br>
 * （2.3）boolean b=obj.equals( Object obj2 )，【这里调用此函数的对象必须是包装类的对象，而不能是基本数据类型，
 *                                  比如不能是 char 或 int 或 double ，可以是 Character 或 Integer 或 Double】<br>
 *  （2.4）int i=d.intValue()，【以 int 形式返回 Double 的值】<br>
 *  （2.5）boolean b=d.isNaN()，【判断此 double 值是否是非数字值，如果是非数字值，返回 true，
 *                             Java 中的常量 Float.NaN 的浮点数可能表达为 01111111110000000000000000000000，其
 *                             中尾数域的第一位为 1，其余均为 0】<br>
 * （2.6）String s=d.toString()<br>
 * （2.6）String s=Double.toString( double val )<br>
 * （2.7）Double d=Double.valueOf( String str )<br>
 * （2.8）double d2=d.doubleValue()<br>
 * （2.9）long l=d.longValue()<br><br>
 * （3）Double类常量：<br>
 * （3.1）int i=Double.MAX_EXPONENT【表示有限 double 变量可能具有的最大指数 1023】<br>
 * （3.2）int i=Double.MIN_EXPONENT【表示有限 double 变量可能具有的最小指数 -1022】<br>
 * （3.3）Double.NEGATIVE_INFINITY【返回 -Infinity ，表示 double 负无穷常量】<br>
 * （3.4）Double.POSITIVE_INFINITY【返回 Infinity ，表示 double 正无穷常量】<br><br>
 * （4）如果数据绝对值大于 0.01 并且小于 10000000，Java 将以常规小数表示；否则使用科学计数法*/
public class DoubleClass {
	public static void main(String[] args){
		Double a=new Double(2.4);
		String str=a.toString();
		String str2=Double.toString(3.01);
		Double b=new Double("2.1e3333");
		boolean bb=b.isNaN();
		byte bt=a.byteValue();
		Double d=Double.valueOf("2.33333");
		
		System.out.println(d);
		System.out.println(a.compareTo(b));
		System.out.println(Double.MAX_EXPONENT+" "+Double.MIN_EXPONENT
				+" "+Double.NEGATIVE_INFINITY+" "+Double.POSITIVE_INFINITY);
	}

}
