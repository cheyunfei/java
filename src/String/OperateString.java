package String;
/**��1����ȡ���ַ�����str.substring( int beginIndex , int endIndex)������String��beginIndex����ʼ��ȡ�ַ�����λ�á���
 * endIndex����ֹ��ȡ�ַ�����λ�ã���Ϊ5�������ַ�����ȡ��4�ͽ�����������endIndex����û��<br>
��2��ȥ���ȵ���β���ո�str.trim()��ȥ���ַ����ײ���β���ո񣬴����ַ����м�Ŀո�ȥ����<br>
��3���ַ��滻��str.replace( char oldChar , char newChar)������String���������ַ��滻�ַ���������ԭ�����ַ���<br>
��4���ַ����滻��str.replace( String oldStr , String newStr)������String���������ַ����滻�ַ���������ԭ���ľ��ַ�����
             ������һ�����滻��������滻���³��ֵľ��ַ���������᡿<br>
��5�����������ҵ��滻λ�ã��������ַ������Ҳ����滻λ�ã��򷵻�ԭ�ַ���<br>
��6���ж��ַ����Ƿ���ָ��ǰ׺��ʼ��str.startsWith( String pre )������boolean��pre��ָ����ǰ׺��<br>
��7���ж��ַ����Ƿ���ָ����׺������str.endsWith( String suf )������boolean��suf��ָ���ĺ�׺��<br>
��8���ж��ַ����Ƿ���ȣ�str1.equals( String str2)�������ִ�Сд����str1.equalsIgnoreCase( String str2)��
                                            �������ִ�Сд��������boolean<br>
��9��ע�⣺��==�����ַ����Ƚ��е������ǱȽ��ַ��������Ƿ���ͬ�����ַ�����ַ�Ƿ���ͬ��������ͬ�Ķ���
                     ��str1==str2�����ʼ��Ϊfalse�����������String s1 = new String("abc")  String s2=s1 ��
                      �ַ����������ã���ʱ�ٱȽϡ�s1==s2�������Ϊtrue��ͬ��ֱ���ַ����Ƚ�"adc"=="adc"Ҳ
                      ���ַ����������ã����true<br>
��10���ֵ���Ƚ��ַ�����str1.compareTo( String str2 )������int��Ϊ��һ����ͬ�ַ���Unicode���б���Ĳ�ֵ����
                                        ����Unicode����str1��str2֮ǰ�����ظ�������Unicode����str1��str2֮�󣻷�������
                                        ���ַ�����ȣ�����0��<br>
��11���ַ�����Сдת����str.toLowerCase()����ת��ΪСд����str.toUpperCase()����ת��Ϊ��д��������String<br>*/
public class OperateString{ // ������
	public static void main(String args[]) { // ������
		String str = "hello word"; // ������ַ���
		String substr = str.substring(0, 3); // ���ַ������н�ȡ
		System.out.println(substr); // �����ȡ����ַ���
		String substr2=str.substring(2);
		System.out.println(substr2);
		
		String str1= "  Java  class   "; // �����ַ���str
		String str2=str1.trim();
		System.out.println(str2+" "+str2.length());
		
		String str3 = "addressdd";
		String str4=str3.replace("d", "jk");
		String str5=str3.replace('d','s');
		
		String num1 = "22045612"; 
		boolean b1= num1.startsWith("22"); 
		boolean b2 = num1.endsWith("78"); 
		
		String s1 = new String("abc");
		String s2=s1;
		String s3 = new String("cBC"); 
		boolean b3= s1.equals(s2);
	    boolean b4=s1.equalsIgnoreCase(s3); 
	    boolean b5=(s1==s3);
	    boolean b6=("as"=="as");
	    
	    int x=s1.compareTo(s3);System.out.println(x);
	    
	    String x2= s3.toLowerCase(); 
		String x3= s3.toUpperCase();
		
		String g=new String("abbcde");
		String g2=new String("ca");
		String g3=g.replace("ab",g2);
		System.out.println(g3);
		
	}
}