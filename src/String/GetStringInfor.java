package String;
/**��1����ȡ�ַ������ȣ�str.length();<br>
 * ��2����ȡ�����ַ���s��ָ���ַ������״γ��ֵ�λ�ã�str.indexOf(s)������ʧ�ܷ��� -1����� s=""����s��
         ���ַ������򷵻�0<br>
 ��3����ȡ�����ַ���s��ָ���ַ��������һ�γ��ֵ�λ�ã�str.lastIndexOf(s)������ʧ�ܷ��� -1��
            ��� s=""����s�ǿ��ַ������򷵻��ַ������� str.length()<br>
��4����ȡָ��λ���ַ���str.charAt(int index)������char��index������������ֵ��Ӧ���ַ�����str.charAt('#')<br>
*/
public class GetStringInfor { 							//������
	public static void main(String args[]) { 		//������
		String str = "We arrre students"; 			//�����ַ���str
		//���ո���str�е�����λ�ø�ֵ������size
		int size = str.lastIndexOf("");
		//������size���
		System.out.println("���ַ�����str������һ�γ��ֵ�����λ���ǣ�" + size);
		//���ַ���str�ĳ������
		System.out.println("�ַ���str�ĳ����ǣ�" + str.length());
		int s1=str.indexOf("rr");
		int s2=str.lastIndexOf("rr");
		int s3=str.length();
		char c=str.charAt(4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(c);
	}
}