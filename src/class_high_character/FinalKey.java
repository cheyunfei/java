package class_high_character;
import java.util.Random;
import static java.lang.System.out;

class Test {
	int i = 0;
}
class Test2{
	private void t() { }
	final void t1() { }
}


/**<p>（1）final修饰的常量：必须在声明的同时对其赋值，并且常量不可以再被赋值改变<br>
 *           （1.1）final修饰的全局常量在声明的同时可以不对其赋值，称为空白 final，但是在类的构造方法中必须对其赋值<br>
 *           （1.2）final 还可以修饰方法的参数
 * <p>（2）final修饰的对象引用：只能恒定指向一个对象，无法改变指向另一个对象，但是对象内的成员变量可以被更改，
 *                 特殊【如数组，其属于对象，final 修饰的数组不可以再被赋值指向另一个数组，但是数组内的每位数值都可以
 *                 被更改】
 * <p>（3）final修饰的常量 a 只能保证在某一个对象中不变，如果要保证 a 在多个对象中都不变，需用“static final”修饰
 *               ，以便在内存中为 a 开辟一块固定不变的区域
 *<p>（4）final修饰的方法：可以被继承但不能被重写，防止子类对父类方法的覆盖重写；父类方法被设置为 private，子类
 *                 将无法继承覆盖该方法，可以认为其隐式的的指定为 final 类型，即“private final”<br>
 *          （4.1）方法的覆盖是建立在继承的基础上的，final 修饰的方法可以被继承不能被覆盖，所以子类不能出现同名的方法，
 *                   因为那样的话会造成调用混乱；但是”private“或者“private final”修饰的方法不能被继承，所以子类出现与
 *                   父类同名的成员方法属于新的和父类毫无关系的成员方法
 *<p>（5）final 修饰的类：该类不能被继承；类中所有方法都是 final 类型，即不能被继承不能被修改；类中的成员变量无限制                  
 **/

public final class FinalKey extends Test2{
	static Random rand=new Random();
	private int a1 = rand.nextInt(10);
	private static final int a2 = rand.nextInt(10);
	
	static int x=3;
	final int a = 3;
	final int aa;
	public FinalKey(){
		aa=3;
	}
	public void t() {}
	//public void t1() {}
	
	private final Test test = new Test(); // 声明一个final引用
	private Test test2 = new Test();
	final int[] b={1,2,3,4,5};
	
	void doit(final int c) {
		System.out.println("被 final 修饰的方法参数："+c);
	}
	
	public static void main(String args[]) {
		FinalKey f=new FinalKey();
		FinalKey f2=new FinalKey();
		out.println("对final和static修饰的变量却别进行测试："+f.a1+" "+f2.a1+" "+f.a2+" "+f2.a2);
	
		f.b[2]=9;
		FinalKey.x++;
		out.println(FinalKey.x);
		out.println(f.b[2]);
		
		f.test2=new Test();
		f.test2.i=9;
		System.out.println(f.test2.getClass().getName()+" "+f.test2.i);
	}
}