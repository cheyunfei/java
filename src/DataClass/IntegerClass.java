package DataClass;
/**��1��java.lang ���� Number �����ࣺInteger �ࡢLong �ࡢShort �ࡾ�ֱ𽫻������� int��long��short ��װ��
 *             һ���ࡿ<br><br>
 *  ��2��Integer ���죺��Integer num=new Integer (int number)����Integer num=new Integer (5)����ͨ��
 *                          ���� int �ͱ�����ȡ Integer ���󡿣���Integer num=new Integer (String s)����ͨ��������ֵ��
 *                          �� String ������ȡ Integer ����<br>
 *       ע�⣺Integer ��ʼ����ֵ�������num=3������ֱ�Ӱ���ֵ���� Integer ���ܳɹ������ᱨ������Ҫ������
 *                      ��������<br><br>
 *��3��Integer��ķ�����ע�����ﶼ�� Integer �༶��ķ�����ʹ���������ã�������ʹ�� int �������Ͷ���
 *                                ���ã�int ֻ�� Integer���ڵ�һ����װ���ԣ���Integer num=new Integer (String s)��<br>
 *    ��3.1����num.byteValue()�������� byte<br>
 *    ��3.2����num.compareTo( Integer num2 )�������� int�����Ƚ����� Integer ����Ĵ�С����ȷ���0��
 *                  ��num&lt;num2������ -1����num&gt;num2������ 1��<br>
 *    ��3.3����num.equals( Object  IntegerObj )��������Boolean�����Ƚ��������������Ƿ�һ�¡�<br>
 *    ��3.4����num.intValue()�������� int������ int �ͷ��� Integer ����<br>
 *    ��3.5����num.shortValue()�������� short������ short �ͷ��� Integer ����<br><br>
 *    
 *    ��3.61����num.toString()�������� String���������š�-��������ʮ���������� String ���� Integer ����<br>
 *    ��3.62����Integer.toString( int i )�������� String���������š�-��������ʮ���������� String ���� Integer ����<br>
 *    ��3.63����Integer.toString( int i , int radix )�������� String���������š�-����i����Ҫת����ʮ����
 *                      ������radix�����ƣ���8���ʹ���˽��ơ�����ʮ������ i ����һ���� radix ת����String<br>
 *    ��3.64����Integer.toUnsignedString( int i , int radix)��������String����ʮ������ i ת����32λ(4�ֽ�)
 *                      ������ʽ������� i Ϊ������������ֵ���Ų�����Ƶ�ת����i����Ҫת����ʮ����������radix����
 *                      �ƣ���8���ʹ���˽��ƣ����û�� radix ���������Ĭ��Ϊʮ���ơ�<br><br>
 *     
 *    ��3.7����Integer.toBinaryString( int i )�������� String�����Զ����� String ���� Integer ����<br>
 *    ��3.8����Integer.toHexString( int i )�������� String������ʮ������ String ���� Integer ����<br>
 *    ��3.9����Integer.toOctalString( int i )�������� String�����԰˽��� String ���� Integer ����<br>
 *    ��3.10����Integer.valueOf( String str )�������� Integer�������������ַ���ת��Ϊ Integer �Ͷ���<br>
 *    ��3.11����Integer.parseInt( String str , int radix)�������� int ��str����Ҫת����ʮ����
 *                      ���ַ��� str ����radix�����ƣ���8���ʹ���˽��ƣ����û�� radix ���������Ĭ��Ϊʮ��
 *                      �ơ���ͬ���ж�Ӧ�ڴ˺����İ��޷��������ַ����������ת���ɶ�Ӧ�������ĺ���parseUnsignedInt( String , int )<br>
 *��4��Integer�ೣ����Integer.MAX_VALUE �� int ���ֵ 2^31-1����Integer.MIN_VALUE �� int ��Сֵ -2^31����
 *                                 Integer.SIZE �� int ��ʾΪ�����Ʋ�����ʽ��ռ��λ����ֵΪ32����Integer.TYPE��Integer
 *                                 ��װ�Ļ������� int �� Class ʵ����<br>
 * */
public class IntegerClass { // ������Summation
	public static void main(String args[]) { // ������
		int px=Integer.parseUnsignedInt("23");
		System.out.println(px);
		String str[] = { "89", "12", "10", "18", "35" }; // ����String����
		int sum = 0; // ����int�ͱ���sum
		for (int i = 0; i < str.length; i++) { // ѭ����������
		   int myint=Integer.parseInt(str[i]);//�������е�ÿ��Ԫ�ض�ת��Ϊint��
			sum = sum + myint; // �������еĸ�Ԫ�����
		}
		System.out.println("�����еĸ�Ԫ��֮���ǣ�" + sum); // ������������
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
	    String w=a.toString();//���ﱻ���õĶ��������Integer��Ķ�������˾�a��λ�ò�����c
	    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+w);
	    
	    
	    String conver=Integer.toString(-8, 2);
	    System.out.println(conver);
	    String conver2=Integer.toUnsignedString(128,2);
	    System.out.println(conver2);
	    System.out.println(Integer.MAX_VALUE+"  "+Integer.MIN_VALUE+"  "+Integer.SIZE+"  "+Integer.TYPE);
	}
}
