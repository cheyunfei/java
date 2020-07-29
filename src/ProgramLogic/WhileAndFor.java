package ProgramLogic;
/**（1）注意”do...while(表达式);“最后有一个分号‘;’<br>
 * （2）for循环体执行过程：初始化表达式，条件表达式判定，语句块，修正变量，条件表达式判定.....；注意初始化
 *            后先条件判定，不能直接在语句块中执行<br>
 * （3）for循环语句的无限循环格式：“for(;;){}”<br>
 * （4）foreach语句：for的简化版本，用来方便遍历数组，“for(变量x : 遍历对象) { 对x执行的操作 }”*/
public class WhileAndFor { // 创建类
	public static void main(String args[]) { // 主方法
		int a = 100; // 声明int型变量a并赋初值100
		while (a == 60) // 指定进入循环体条件
		{
			System.out.println("ok1"); // while语句循环体
			a--;
		}
		
		int b = 100; // 声明int型变量b并赋初值100
		do {
			System.out.println("ok2"); // do…while语句循环体
			b--;
		} while (b == 60); // 指定循环结束条件
		
		
		int sum = 0; // 声明变量，用于保存各数相加后的结果
		for (int i = 2; i <= 100; i += 2) {
			sum = sum + i; // 指定循环条件及循环体
		}
		System.out.println("2到100之间的所有偶数之和为：" + sum); 
		
		int arr[] = { 7, 10, 1 }; 
		for (int x : arr) {//foreach语句，int x引用的变量，arr指定要循环遍历的数组，最后将x输出
			System.out.println(x);
		}
	}
}