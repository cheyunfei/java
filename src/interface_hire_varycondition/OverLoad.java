package interface_hire_varycondition;
/**<p>（1）重载：在同一个类中允许同时存在一个以上的同名方法，这些方法的参数类型、数目、顺序必须有所区别，
 *                         只有返回类型不同是错误的
 *   <p>（2）不定长参数方法（重载特殊形式）：“返回值 方法名（参数数据类型...参数名）”【int add( int...a )，
 *                     add( a1,a2,a3,a4 )】，只有与其他重载方法不适配时才会调用不定长方法。*/
public class OverLoad {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static int add(int a) {
		return 1;
	}
	
	public static int add(int a, double b) {
		return 1;
	}
	
	public static int add(double a, int b) {
		return 1;
	}
	
	public static int add(int... a) { // 定义不定长参数方法
		int s = 0;
		for (int i = 0; i < a.length; i++)
			// 根据参数个数做循环操作
			s += a[i]; // 将每个参数累加
		System.out.println("\n"+"正在调用不定长参数方法");
		return s; // 将计算结果返回
	}
	
	public static void main(String args[]) {
		System.out.println("调用add(int,int)方法：" + add(1, 2));
		System.out.println("调用add(double,double)方法：" + add(2.1, 3.3));
		System.out.println("调用add(int)方法：" + add(1));
		// 调用不定长参数方法
		System.out.println("调用不定长参数方法：" + add(1,2, 3,4, 5,6, 7, 8, 9));
		System.out.println("调用不定长参数方法：" + add(2,3,4));
	}
}
