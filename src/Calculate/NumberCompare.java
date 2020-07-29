package Calculate;
/**
 * Java 中当两数只差小于 e(-6) 即 0.000001时，自动认为两数相等，无需其他比较语句<br><br>
 * 有待验证：实测中也仅能保证两数之差在四舍五入后仍小于0.00000016即 e(-7)时两数被认为相等，不知道是不是和计算机的
 * 位数和精度有关，有待验证<br>
 * */
public class NumberCompare { // 创建类
	public static void main(String[] args) {
		float number1 = 4.001f; // 声明int型变量number1
		float number2 = 4.0010001663f; // 声明int型变量number2
		System.out.println("number1>number2的返回值为：" +(number1 > number2));
		/* 依次将变量number1与变量number2的比较结果输出 */
		System.out.println("number1<number2的返回值为："+(number1 < number2));
		System.out.println("number1==number2返回值为："+(number1== number2));
		System.out.println("number1!=number2返回值为："+(number1 != number2));
		System.out.println("number1>= number2返回值为："+(number1 >= number2));
		System.out.println("number1<=number2返回值为："+(number1 <= number2));
	}
}

