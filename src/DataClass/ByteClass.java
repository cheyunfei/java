package DataClass;
/**��1��Byte ���װ�������� byte<br>
 * 
 * ��2��Byte ������췽����Byte b=new Byte( byte  value )   ��  Byte b=new Byte( String str )<br><br>
 * 
 * ��3��Byte���÷�����Byte b=new Byte( byte  value )<br>
 *��3.1��byte bt=b.byteValue()<br>
 *��3.2��int com=b.compareTo( Byte b2)������ֵΪ b �� b2 �Ĳ�ֵ������b-b2��<br> 
 *��3.3��double db=b.doubleValue()<br>
 *��3.4��int ib=b.intValue()<br>
 *��3.5��byte b2=Byte.parseByte( String s )������ s �������������ַ��������ַ���ת������Ӧ�� byte ������<br>
 *��3.6��String sb=b.toString()<br>
 *��3.7��Byte b3=Byte.valueOf( String str )����ָ���ַ�����Ӧ������ת���� Byte ����<br>
 *��3.8��boolean boo=b.equals( Object obj )���Ƚ����������Ӧ�������Ƿ���ͬ����obj������Byte�࣬Ҳ��������������
 *                          ��ĸ��� Number �ࡿ<br><br>
 *
 *��4��Byte �ೣ����Byte.MAX_VALUE�� byte �������ֵ��2^7-1=127��<br>
 *Byte.MIN_VALUE�� byte ������Сֵ��-2^7=128��<br>
 *Byte.SIZE�� byte �����Ʋ���λ����<br>
 *Byte.TYPE����ʾ�������� byte �� Class ��ʵ���� */
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
