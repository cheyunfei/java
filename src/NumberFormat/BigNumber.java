package NumberFormat;
import java.math.BigInteger;
import java.math.BigDecimal;
/**（1）Java中提供了大数字的操作类，java.math.BigInteger【针对大整数的处理】，java.math.BigDecimal【
 *             针对大浮点数的处理】<br><br>
 *  （2）BigInteger 类：Integer 是 int 的包装类，最大整数位 2^31-1，而 BigInteger 支持任意精度的整数<br>
 *  (2.1)BigInteger 类构造函数 ：BigInteger bi=new BigInteger( String val )<br>
 *  (2.2)BigInteger 类的方法：public BigInteger add( BigInteger bi )、subtract、multiply、divide、remainder【
 *               做取余操作】<br>
 *               public BigInteger[] divideAndRemainder( BigInteger bi )【做除法以数组返回商和余数，
 *               第一个值为商，第二个值为余数】<br>
 *               public BigInteger pow( int p )【bi^p，即原数的 p次方】<br>
 *               public BigInteger negate(  )【取相反数】<br>
 *               public BigInteger shiftLeft( int n )【n为正数，则左移 n位；n为负数，则右移 n位】<br>
 *               public BigInteger shiftRight( int n )【n为正数，则右移 n位；n为负数，则左移 n位】<br>
 *               public BigInteger and( BigInteger bi )【两个大整数做与操作】<br>
 *               public BigInteger or( BigInteger bi )【做或操作】<br>
 *               public int compareTo( BigInteger bi )【比较】<br>
 *               public boolean equals( Object x )【这里只有当对象 x 为 BigInteger 的对象，并且两个对象值相同时该方法返回值
 *                          才会是 true 】<br>
 *               public BigInteger min( BigInteger bi )【返回较小的数】<br>
 *               public BigInteger max( BigInteger bi )【返回较大的数】<br>
 *  注意：BigInteger实际数据在内存中占的字节数不定，按需要分配，BigInteger对象实际保存的是对应数据的地址值，即4个字节<br><br>
 *  （3）BigDecimal 类：BigDecimal 类支持任何精度的定点数<br>
 *  <p>(3.1)BigDecimal 类的构造函数：public BigDecimal( double val / String val )<br>
 *         注意：对于两种构造方法，当参数是 double 型时，会自动将 double 不足的位数近似补为BigDecimal 位数【如3.01，
 *                     会变成 3.0099999999999997868371792719699442386627197265625 造成失真】；当参数是 String 
 *                     型时，BigDecimal 会保持原数，不会失真，所以尽量在初始化对象时,参数使用 Double.toString( double val ) 将
 *                     double 转换成 String<br>
 *  <p>(3.2)BigDecimal 类的方法：<br>
 *                 public BigDecimal add( BigDecimal bd )、subtract、multiply<br>
 *                 public BigDecimal divide( BigDecimal divisor , int scale , int roundingMode )【
 *                                             divisor 除数，scale 小数点后位数，roundingMode 近似模式】<br>
 *  注意：大浮点数近似模式 roundingMode：BigDecimal.ROUND_UP；BigDecimal.ROUND_DOWN；BigDecimal.
 *                                         ROUND_CEILING；BigDecimal.ROUND_FLOOR；BigDecimal.ROUND_HALF_DOWN
 *                                         ；BigDecimal.ROUND_HALF_UP；BigDecimal.ROUND_HALF_EVEN<br>*/
public class BigNumber {
	public static void main(String[] args){
		BigInteger bi=new BigInteger("33");
		System.out.println(bi.equals(new Integer("33")));
		System.out.println("BigInteger's bitLenght is : "+bi.bitLength());
		
		BigDecimal bd=new BigDecimal(Double.toString(-7.5));
		BigDecimal bd2=new BigDecimal("8.9");
		System.out.println(bd.add(bd2));
		System.out.println(bd+" "+bd2);
		System.out.println(bd.divide(bd2,6,BigDecimal.ROUND_HALF_UP));
		
	} 

}
