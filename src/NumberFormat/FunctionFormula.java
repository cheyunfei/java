package NumberFormat;
/**（1）Math 类：java.lang.Math 类中提供了众多数学函数方法和常量，Math.函数名、Math.常量<br><br>
 * （2）Math 常量：Math.PI【π，3.14】；Math.E【e，2.71828】<br><br>
 * （3）三角函数：public static double sin( double a )、cos【余弦，参数是弧度】、tan【正切，参数是弧度】
 *                          、asin【反正弦，参数是 -1~1】、acos【反余弦，参数是 -1~1】、atan【反正切，参数是 -1~1】、
 *                          toRadians【角度转换为弧度，参数是角度】、toDegrees【弧度转换为角度，参数是弧度】，
 *                          注意弧度与角度之间的转换不精确<br><br>
 *  （4）指数函数：public static double exp( double a )【e^a】、log【In(a)，底数为e的对数】、log10【底数
 *                        为10的对数】、sqrt【a的平方根，a&gt;=0】、cbrt【a的立方根】、pow( double a , double b )【a^b】<br><br>
 * （5）取整函数：public static double ceil( double a )【&gt;=a的最小整数】、floor【&lt;=a的最大整数】、rint【返回与 a 最接近的
 *                           整数，如果两边同样接近取偶数】、public static int round( float a )【取四舍五入后的整数】、
 *                           public static long round( double a )【取四舍五入后的整数，并转换为长整型】<br><br>
 *  （6）取最大、最小、绝对值函数：public static TYPE Method( TYPE a , TYPE b )，TYPE【代表参数即返回值类型
 *                              可以是 int，long，float，double】，Method【代表函数种类，可以是 max（取最大值），
 *                              min（取最小值），abs（取绝对值）】*/
public class FunctionFormula {
	public static void main(String[] args) {
		// 取90度的正弦
		
		System.out.println(Math.PI+" "+Math.E);
		System.out.println("90度的正弦值：" + Math.sin(Math.PI / 2));
		// 取2的平方根与2商的反余弦
		System.out.println("2的平方根与2商的反余弦值："
				+ Math.acos(Math.sqrt(2) / 2));
		// 取120度的弧度值
		System.out.println("120度的弧度值：" + Math.toRadians(120.0));
		// 取π/2的角度
		System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI / 2));
		// 取e的2次方
		System.out.println("e的平方值：" + Math.exp(2)); 
		// 取2的2次方
		System.out.println("2的2次方值：" + Math.pow(2, 2)); 
		// 返回与参数最接近的整数
		System.out.println("使用rint()方法取整：" + Math.rint(2.7));
		// 返回与参数最接近的整数
		System.out.println("使用rint()方法取整：" + Math.rint(2.5));
		// 取四舍五入后的整数
		System.out.println("使用round()方法取整：" + Math.round(3.2f));
		// 取四舍五入后的整数，并将结果强制转换为长整型
		System.out.println("使用round()方法取整：" + Math.round(2.2));
		//取两个参数的最小值
		System.out.println("使用min()方法取最小值：" + Math.min(2.2,2.4));
	}
}
