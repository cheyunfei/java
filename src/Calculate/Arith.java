package Calculate;
/**
 * （1）运算过程中不同类型的数据会自动向上转换，统一到高级的数据类型<br>
 * （2）对于整形数值，'/'为取整，'%'为取余；对于浮点型数值，'/'直接按除法规则计算，如 7f/2f=3.5f；
 *        7f%3.5f=0.0f；7/2=3；7%2=1<br>
 * （3）自增自减运算符只能用于整形或浮点型变量，a+=b，相当于a=a+b；a++，先使用a，再使a自加<br>
 * （4）如 byte/char ，即字节除以字符型变量，结果为整形int
 */
public class Arith { // 创建类
	public static void main(String[] args) { // 主方法
		float number1 = 45.56f; // 声明float型变量并赋值
		int number2 = 152; // 声明int型变量并赋值
		float s=7.2f % 3.5f;
		System.out.println("和为：" + (number1 + number2)); // 将变量相加之和输出
		System.out.println("差为：" + (number2-number1));//将变量相减之差输出
		System.out.println("积为：" + number1 * number2); // 将变量相乘的积输出
		System.out.println("商为：" + number1 / number2); // 将变量相除的商输出
		System.out.println(s);
	}
}

