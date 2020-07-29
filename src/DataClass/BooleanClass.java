package DataClass;
/**��1��Boolean ���װ�������� boolean<br>
 * ��2��Boolean ���죺��Boolean b1 = new Boolean(boolean value)������ͨ������ boolean �ͱ�����ȡ
 *                          Boolean ���󡿣�Boolean b2 = new Boolean(String str)����ͨ������ boolean ���ַ���
 *                          ��ȡ Boolean �������� str ���Դ�Сд���ڡ�true��ʱ��Boolean�����ֵΪ true �������κ�
 *                          ��ʽ���ַ����硰ok������ Boolean �����ֵΪ false ��<br><br>
 *  ��3��Boolean ��ķ�����Boolean b = new Boolean( boolean value )<br>
 *            ��3.1����b.booleanValue()��:���� boolean �������� Boolean �����Ӧ�� boolean ֵ��<br>
 *            ��3.2����b.equals( Object obj )��:����boolean��obj ��������Boolean����Ҳ�����ǻ���
 *                        ���� boolean �ı��������Ƚ�����Boolean����ֵ�Ƿ����<br>
 *             ��3.3����Boolean.parseBoolean( String str)�������� boolean�����ַ�������Ϊ��Ӧ�� boolean ֵ
 *                   ������͹��� Boolean �����ʱһ�� ��str ���Դ�Сд���ڡ�true��ʱ��Boolean�����ֵΪ true ��
 *                   �����κ���ʽ���ַ����硰ok������ Boolean �����ֵΪ false<br>
 *              ��3.4��String str=b.toString()<br>
 *              ��3.5��Boolean boo=Boolean.valueOf( String str)<br>
 * ��4��Boolean ��ĳ����� Boolean.TRUE��Boolean.FALSE��Boolean.TYPE*/
public class BooleanClass { // ������GetBoolean
	public static void main(String args[]) { // ������
		Boolean b1 = new Boolean(true); // ����Boolean����
		Boolean b2 = new Boolean("tRue"); // ����Boolean����
		boolean a=b1.equals(b2);
		boolean b=Boolean.parseBoolean("tRue");
		String c=b1.toString();
		Boolean d=Boolean.valueOf("ww");
		System.out.println(a+" "+b+" "+c+" "+d);
		System.out.println("b1��" + b1.booleanValue());
		System.out.println("b2��" + b2.booleanValue());
		Class<Boolean> b3=Boolean.TYPE;//? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?
		System.out.println(Boolean.TRUE+" "+Boolean.FALSE+" "+Boolean.TYPE+" "+b3);
	}
}

