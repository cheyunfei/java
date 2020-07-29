package Calculate;
/**（1）逻辑运算符&amp;&amp;、&amp;、|| 从左向右结合，！从右向左结合<br>
 *（2）&amp;&amp;：短路运算符，第一个表达式false，则不去计算第二个表达式<br>
 *（3）&amp;：非短路运算符，不管如何两个表达式均要计算<br>
 *（4）&amp;：按位与，如2&amp;3，对应位都为1，结果位才为1<br>
 *（5）|：按位或，如2|3，对应位都为0，结果位才为0<br>
 *（6）~：按位取反，如~7<br>
 *（7）^：按位异或，如 10^8，两数对应位相同，结果位为0<br>
 *（8）移位操作：'a&lt;&lt;3'，数a左移3位，右边补0；'a&gt;&gt;3'，数a右移3位，a为正左补0，a为负左补1；
 *                        'a&gt;&gt;&gt;3'，数a无符号右移3位，左始终补0<br>
 *（9）移位操作适合的数据类型：byte,short,char,int,long<br>                        
*/
public class LogicAndBit { // 创建类
	public static void main(String[] args) {
		int a = 2; 
		int b = 5; 
		boolean result = ((a > b) && (a != b));//必要时&&两边只计算一边false就停止
		int results=-2>>>32;//即使&左边false，依然会计算&右边的表达式
		boolean result2 = ((a > b) || (a != b));
		System.out.println(result); 
		System.out.println(results);
		System.out.println(result2); 
	}
}

