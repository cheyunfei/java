package Calculate;/*声明该类所在的包*/
/**
 * （1）定义long型值，须在后面加 L 或 l ，表示为长整数<br>
 * （2）定义float型值，需在后面加 F 或 f ，表示单精度浮点数。双精度浮点数double不需要<br>
 * （3）Java 中当两数只差小于 e(-6) 即 0.000001时，自动认为两数相等，无需其他比较语句<br>
 * （4）数字类型向上转化可直接进行，向下转化需加强制转换机制，如 short i=(short) 140；
 *          byte--&gt;short--&gt;int(char)--&gt;long--&gt;float--&gt;double<br>
 * （5）转义字符：\012，八进制；\ u0123，十六进制；\'，单引号字符；\\，反斜杠字符；
 *       \t，制表符；\r，回车；\n，换行；\b，退格；\f，换页；<br>
 *       （5.1）注意：十六进制中的 \ u0123，\ u 后必须加四个数字<br><br>
 * （6）标识符：字母、_、$ 开头，后加数字、字母、_、$<br>
 * （7）常量：”final 数据类型 常量名“<br>
 * （8）成员变量（全局变量）前加static成为静态变量，可以跨类使用“类名.静态变量”<br>
 * （9）运算符优先级：增减量--&gt;算数--&gt;比较--&gt;逻辑--&gt;赋值，相同优先级从左至右计算<br>
 * 有待验证：实测中也仅能保证两数之差在四舍五入后仍小于0.00000016即 e(-7)时两数被认为相等，不知道是不是和计算机的
 * 位数和精度有关，有待验证<br>
*/
public class NumberType {
	static String s1="你好";
	static String $ee_2_df_2="sd";
/*程序开始执行的位置*/
	public static void main(String[] args) {
		String s2="Java";
		long s3=3333333333333333333l;
		double s4=322.22d;
		float s5=332.33f;
		boolean s6=false;
		double s7=4.35*100;
		char s8='s';
		char s9=23;
		System.out.println("sdfsdf");
		System.out.println(Math.round(s7));
		System.out.println($ee_2_df_2);
		System.out.println("\u0052");
		// TODO 自动生成的方法存根

	}

}
