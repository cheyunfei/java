package String;
/**<p>（1）正则表达式：boolean b=str1.matches( Stirng str2)，str1【原字符串】，str2【模式】，
 *                     通常用于判断语句中，用来检查某一字符串序列是否满足某一个格式<br>
 * <p>（2）模式字符串书写规则："."【代表任何字符】<br>
 *                                "\\."【代表字符'.'】<br>
 *                                "[456]"【代表4、5、6三个中的任一字符】<br>
 *                                 "[^456]"【代表除4、5、6三个外的任一字符】<br>
 *                                 "[a-r]"【代表a~r中的任一字母】<br>
 *                                  "[a-zA-Z]"【代表任一英文字母】<br>
 *                                  "[a-e[g-z]]"【代表a~e，或g~z中的任一字母，并运算】<br>
 *                                  "[a-o&amp;&amp;[def]]"【代表d、e、f，交运算】<br>
 *                                  "[a-d&amp;&amp;[^bc]]"【代表a、d，差运算】<br>
 *                                  "A?"【A出现0或1次】<br>
 *                                  "A*"【A出现0或多次】<br>
 *                                  "A+"【A出现1或多次】<br>
 *                                  "A{n}"【A正好出现n次】<br>
 *                                  "A{n,}"【A至少出现n次】<br>
 *                                  "A{n,m}"【A出现n~m次】<br>
 * <p>（3）模式字符串书写规则大全：Java从入门到精通，P101-P102*/
public class JudgeStatement {
	public static void main(String[] args) {
		 // 定义要匹配E_mail地址的正则表达式
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,4}";
		String str1 = "aaa@ "; // 定义要进行验证的字符串
		String str2 = "aaaaa";
		String str3 = "1111@111ffyu.dfg.com";
		String str4="ew_e@____32.___.___.___.____";
		String regex2="\\w+@\\s";
		String regex3="1[235]\\d{9}";
		String str5="13894011940";
		if(str5.matches(regex3))  System.out.println("yes");else System.out.println("no");
		if (str1.matches(regex2)) { // 判断字符串变量是否与正则表达式匹配
			System.out.println(str1 + "是一个合法的E-mail地址格式");
		}
		if (str3.matches(regex)) {
			System.out.println(str3 + "是一个合法的E-mail地址格式");
		}
		if (str4.matches(regex)) {
			System.out.println(str4 + "是一个合法的E-mail地址格式");
		}
	}
}
