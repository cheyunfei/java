package package1.package2;
import java.util.Date;
import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.System.out;
import static java.lang.Math.max;

/**<p>（1）程序中使用相同类的冲突：java.util.Date date=new java.util.Date();<br>
 *                                                        java.sql.Date date2=new java.sql.Date(233);
 *<p>（2）在类中指定包名时需要将 package 表达式放在程序的第一行，包名将会成为类名中的一部分
 *<p>（3）同一包中的类不必存放在同一个位置，如 com.lzw.class1 和 com.lzw.class2 可以放在两个不同的地方，只要
 *                系统中的 CLASSPATH 分别指向这两个位置就可以了            
 *<p>（4）java中的包名使用小写字母
 *<p>（5）程序中当自定义的类名和 java库中的类名冲突时，导入自定义类的包名将自动使用自定义类，
 *                    此时再使用 java库中的类时必须用全名格式【java.lang.Math】
 *<p>（6）包的导入：import 包名.类名，其中 ” import 包名.*  “  表示该包中的所有类，但不包括子包中的类
 *<p>（7）静态成员的导入：”import static 静态成员“<br>
 *            （7.1）可以导入静态成员方法和静态成员变量，然后在程序中就可以直接使用这些静态成员，而不需要通过类引用，如
 *            【 import static java.lang.Math.max 后，直接使用max( int , int )，而不需要 Math.max( int , int )】   <br>
 *            （7.2）out 是 System 的静态成员变量，注意不是成员方法，out 属于 PrintStream 类型，out 通过
 *            引用 PrintStream 的方法 println 来输出一行，结果就是 System.out.println()                                                              */

public class Package {
	public static void main(String[] args){
		java.util.Date date=new java.util.Date();
		java.sql.Date date2=new java.sql.Date(233);
		java.lang.System.out.println("sfaf");
		System.out.println(E);
		out.println(max(1,2));
	}

}
