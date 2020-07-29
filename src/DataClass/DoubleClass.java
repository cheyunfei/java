package DataClass;
/**��1��Double��Ĺ��췽����Double d=new Double( String str ) ��  Double d=new Double( double value )<br><br>
 * ��2��Double��ķ�����Double d=new Double( double value )<br>
 * ��2.1��byte t=d.byteValue()<br>
 * ��2.2��int i=d.compareTo( Double d2 )�����Ƚ�����Double����ֵΪ d-d2 �Ĳ�ֵ��<br>
 * ��2.3��boolean b=obj.equals( Object obj2 )����������ô˺����Ķ�������ǰ�װ��Ķ��󣬶������ǻ����������ͣ�
 *                                  ���粻���� char �� int �� double �������� Character �� Integer �� Double��<br>
 *  ��2.4��int i=d.intValue()������ int ��ʽ���� Double ��ֵ��<br>
 *  ��2.5��boolean b=d.isNaN()�����жϴ� double ֵ�Ƿ��Ƿ�����ֵ������Ƿ�����ֵ������ true��
 *                             Java �еĳ��� Float.NaN �ĸ��������ܱ��Ϊ 01111111110000000000000000000000����
 *                             ��β����ĵ�һλΪ 1�������Ϊ 0��<br>
 * ��2.6��String s=d.toString()<br>
 * ��2.6��String s=Double.toString( double val )<br>
 * ��2.7��Double d=Double.valueOf( String str )<br>
 * ��2.8��double d2=d.doubleValue()<br>
 * ��2.9��long l=d.longValue()<br><br>
 * ��3��Double�ೣ����<br>
 * ��3.1��int i=Double.MAX_EXPONENT����ʾ���� double �������ܾ��е����ָ�� 1023��<br>
 * ��3.2��int i=Double.MIN_EXPONENT����ʾ���� double �������ܾ��е���Сָ�� -1022��<br>
 * ��3.3��Double.NEGATIVE_INFINITY������ -Infinity ����ʾ double ���������<br>
 * ��3.4��Double.POSITIVE_INFINITY������ Infinity ����ʾ double ���������<br><br>
 * ��4��������ݾ���ֵ���� 0.01 ����С�� 10000000��Java ���Գ���С����ʾ������ʹ�ÿ�ѧ������*/
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
