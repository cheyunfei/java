package DataClass;
/**��1��Character ��Ĺ��췽���� Character mychar=new Character( char c )<br><br>
 * ��2��Character �ೣ�÷�����Character mychar=new Character( char c )<br>
 * ��2.1��char c=mychar.charValue()<br>
 * ��2.2��int i=mychar1.compareTo( Character other )�����Ƚ����� Character �����Ƿ���ȣ�ֵΪ mychar-other �Ĳ�ֵ��<br>
 * ��2.3��boolean b=obj.equals( Object obj2 )����������ô˺����Ķ�������ǰ�װ��Ķ��󣬶������ǻ����������ͣ�
 *                                  ���粻���� char �� int �������� Character �� Integer��<br>
 * ��2.4��Character c=Character.toLowerCase( Character c / char c )����ע�� tolowerCase ������ char ֱ�ӵ��á�<br>
 * ��2.5��Character c=Character.toUpperCase( Character c / char c )����ע�� toUpperCase ������ char ֱ�ӵ��á�<br>
 * ��2.6��String s=mychar.toString()����ע�� toString ������ char ֱ�ӵ��ã�char ֻ����Character �з�װ�Ļ����������ԡ�<br>
 * ��2.7��boolean b=Character.isUpperCase( Character c / char c )<br>
 * ��2.8��boolean b=Character.isLowerCase( Character c / char c )<br><br>
 * ��3��Character��ĳ�����byte b=Character.CONNECTOR_PUNCTUATION������ byte ����ֵ����ʾUnicode�淶��
 *                                   �ĳ������Pc��,ֵΪ23��<br>
 *                                   byte b=Character.UNASSIGNED������ byte ����ֵ����ʾUnicode�淶��
 *                                   �ĳ������Cn��,ֵΪ0��<br>
 *                                   byte b=Character.UNASSIGNED������ byte ����ֵ����ʾUnicode�淶��
 *                                   �ĳ������Cn��,ֵΪ3��<br><br>
 *��4���ַ����� char �������ڴ���ռ�����ֽ�<br><br>
 *��5��String �ࣺͨ���۲�Դ����Է��֣�String����ʵά������һ���ַ����飬���ַ���String�е�ÿ���ַ���ռ�����ֽ�<br><br>
 *��6��Unicode��ͨ���������ֽڱ�ʾһ���ַ���ԭ�е�Ӣ�ı���Ҳ�ӵ��ֽڱ��˫�ֽڡ�Ҳ���ǰѸ��ֽ���0��䣬���ֽڱ���ԭ����ASCII��
 *    �����������԰��������Զ�ͳһ��һ�ױ����<br><br>
 *��7��UTF��Unicode Transformation Format��:���unicode�ַ���2���ֽڱ�ʾ��������UTF-8�ܿ�����Ҫ3���ֽڣ������unicode
 *   �ַ���4���ֽڱ�ʾ��������utf-8�ܿ�����Ҫ6���ֽڡ�����ϸ��˵���Լ����ġ�<br><br>
 *ע�⣺Character�ೣ���ܶ࣬�д��˽⣻һ�� Character �౻����������������ֵ�Ͳ��ܸı���*/
public class CharacterClass {
	public static void main(String args[]) {
		Character char1 = new Character('h');
		Character char2 = new Character('H');
		
		Integer s=new Integer("22");
		Integer s2=new Integer("22");
		System.out.println(s.equals(s));
		
	   char c=char1.charValue();System.out.println(c);
		boolean b = char1.equals(char2);
		System.out.println(char1+"��"+char2+"�Ƿ���ȣ�"+b);
		Character char3 = Character.toLowerCase(char1);
		Character char4 = Character.toLowerCase(char2);
		boolean bb = char3.equals(char4);
		String cc="dd";
		byte k=Character.TITLECASE_LETTER;     System.out.println(k);
		cc=cc.toUpperCase();System.out.println(cc);
		System.out.println(char3+"��"+char4+"�Ƿ���ȣ�"+bb);
	}
}