package NumberFormat;
import java.math.BigInteger;
import java.math.BigDecimal;
/**��1��Java���ṩ�˴����ֵĲ����࣬java.math.BigInteger����Դ������Ĵ�����java.math.BigDecimal��
 *             ��Դ󸡵����Ĵ���<br><br>
 *  ��2��BigInteger �ࣺInteger �� int �İ�װ�࣬�������λ 2^31-1���� BigInteger ֧�����⾫�ȵ�����<br>
 *  (2.1)BigInteger �๹�캯�� ��BigInteger bi=new BigInteger( String val )<br>
 *  (2.2)BigInteger ��ķ�����public BigInteger add( BigInteger bi )��subtract��multiply��divide��remainder��
 *               ��ȡ�������<br>
 *               public BigInteger[] divideAndRemainder( BigInteger bi )�������������鷵���̺�������
 *               ��һ��ֵΪ�̣��ڶ���ֵΪ������<br>
 *               public BigInteger pow( int p )��bi^p����ԭ���� p�η���<br>
 *               public BigInteger negate(  )��ȡ�෴����<br>
 *               public BigInteger shiftLeft( int n )��nΪ������������ nλ��nΪ������������ nλ��<br>
 *               public BigInteger shiftRight( int n )��nΪ������������ nλ��nΪ������������ nλ��<br>
 *               public BigInteger and( BigInteger bi )���������������������<br>
 *               public BigInteger or( BigInteger bi )�����������<br>
 *               public int compareTo( BigInteger bi )���Ƚϡ�<br>
 *               public boolean equals( Object x )������ֻ�е����� x Ϊ BigInteger �Ķ��󣬲�����������ֵ��ͬʱ�÷�������ֵ
 *                          �Ż��� true ��<br>
 *               public BigInteger min( BigInteger bi )�����ؽ�С������<br>
 *               public BigInteger max( BigInteger bi )�����ؽϴ������<br>
 *  ע�⣺BigIntegerʵ���������ڴ���ռ���ֽ�������������Ҫ���䣬BigInteger����ʵ�ʱ�����Ƕ�Ӧ���ݵĵ�ֵַ����4���ֽ�<br><br>
 *  ��3��BigDecimal �ࣺBigDecimal ��֧���κξ��ȵĶ�����<br>
 *  <p>(3.1)BigDecimal ��Ĺ��캯����public BigDecimal( double val / String val )<br>
 *         ע�⣺�������ֹ��췽������������ double ��ʱ�����Զ��� double �����λ�����Ʋ�ΪBigDecimal λ������3.01��
 *                     ���� 3.0099999999999997868371792719699442386627197265625 ���ʧ�桿���������� String 
 *                     ��ʱ��BigDecimal �ᱣ��ԭ��������ʧ�棬���Ծ����ڳ�ʼ������ʱ,����ʹ�� Double.toString( double val ) ��
 *                     double ת���� String<br>
 *  <p>(3.2)BigDecimal ��ķ�����<br>
 *                 public BigDecimal add( BigDecimal bd )��subtract��multiply<br>
 *                 public BigDecimal divide( BigDecimal divisor , int scale , int roundingMode )��
 *                                             divisor ������scale С�����λ����roundingMode ����ģʽ��<br>
 *  ע�⣺�󸡵�������ģʽ roundingMode��BigDecimal.ROUND_UP��BigDecimal.ROUND_DOWN��BigDecimal.
 *                                         ROUND_CEILING��BigDecimal.ROUND_FLOOR��BigDecimal.ROUND_HALF_DOWN
 *                                         ��BigDecimal.ROUND_HALF_UP��BigDecimal.ROUND_HALF_EVEN<br>*/
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
