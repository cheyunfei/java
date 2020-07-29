package ProgramLogic;
/**（1）当if后没有语句序列时，“if(boolean);”，“if(boolean){}”都是可以的<br><br>
 * （2）三种if条件句：if(boolean)...else...；if(boolean)...else if(boolean)...else if(boolean)...else，
 *                  其中多个 else if 并列中匹配到第一个else if 后，之后的 else if 就不再管了<br><br>
 * （3）三元运算符：简化if...else...条件句，以下两种方式等效，注意三元运算符仅仅用作赋值运算，三元
 * 运算符的结果必是一个值，而不能是其他的输出语句之类的处理流程<br>
 * if(a&gt;0) b=a ; else b=-a;<br>
 * b=a&gt;0?a:-a;<br>
 */
 
public class IfAndElse{ // 创建类
	public static void main(String args[]) { // 主方法
		int x = 45; // 声明int型变量x，并赋给初值
		int y = 12; // 声明int型变量y，并赋给初值
		if (x > y) 
		{ // 判断x是否大于y
			System.out.println("变量x大于变量y"); // 如果条件成立，输出的信息
		}
		if (x < y) { // 判断x是否小于y
			System.out.println("变量x小于变量y"); // 如果条件成立，输出的信息
		}
	}
}

