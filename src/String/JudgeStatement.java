package String;
/**<p>��1��������ʽ��boolean b=str1.matches( Stirng str2)��str1��ԭ�ַ�������str2��ģʽ����
 *                     ͨ�������ж�����У��������ĳһ�ַ��������Ƿ�����ĳһ����ʽ<br>
 * <p>��2��ģʽ�ַ�����д����"."�������κ��ַ���<br>
 *                                "\\."�������ַ�'.'��<br>
 *                                "[456]"������4��5��6�����е���һ�ַ���<br>
 *                                 "[^456]"�������4��5��6���������һ�ַ���<br>
 *                                 "[a-r]"������a~r�е���һ��ĸ��<br>
 *                                  "[a-zA-Z]"��������һӢ����ĸ��<br>
 *                                  "[a-e[g-z]]"������a~e����g~z�е���һ��ĸ�������㡿<br>
 *                                  "[a-o&amp;&amp;[def]]"������d��e��f�������㡿<br>
 *                                  "[a-d&amp;&amp;[^bc]]"������a��d�������㡿<br>
 *                                  "A?"��A����0��1�Ρ�<br>
 *                                  "A*"��A����0���Ρ�<br>
 *                                  "A+"��A����1���Ρ�<br>
 *                                  "A{n}"��A���ó���n�Ρ�<br>
 *                                  "A{n,}"��A���ٳ���n�Ρ�<br>
 *                                  "A{n,m}"��A����n~m�Ρ�<br>
 * <p>��3��ģʽ�ַ�����д�����ȫ��Java�����ŵ���ͨ��P101-P102*/
public class JudgeStatement {
	public static void main(String[] args) {
		 // ����Ҫƥ��E_mail��ַ��������ʽ
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,4}";
		String str1 = "aaa@ "; // ����Ҫ������֤���ַ���
		String str2 = "aaaaa";
		String str3 = "1111@111ffyu.dfg.com";
		String str4="ew_e@____32.___.___.___.____";
		String regex2="\\w+@\\s";
		String regex3="1[235]\\d{9}";
		String str5="13894011940";
		if(str5.matches(regex3))  System.out.println("yes");else System.out.println("no");
		if (str1.matches(regex2)) { // �ж��ַ��������Ƿ���������ʽƥ��
			System.out.println(str1 + "��һ���Ϸ���E-mail��ַ��ʽ");
		}
		if (str3.matches(regex)) {
			System.out.println(str3 + "��һ���Ϸ���E-mail��ַ��ʽ");
		}
		if (str4.matches(regex)) {
			System.out.println(str4 + "��һ���Ϸ���E-mail��ַ��ʽ");
		}
	}
}
