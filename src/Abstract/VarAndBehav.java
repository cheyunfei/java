package Abstract;
/**（1）《成员变量》：对象的属性，属于全局变量，可以不设初值，会有默认值，类对象创建的过程中，成员变量也初始化；
 *                                《局部变量》：必须设初值，否则错误<br>
 *（2）成员方法执行到 return 后结束<br>
 *（3） private：该成员变量和成员方法只能在本类中被使用，子类中不可见，其他包中的任何类不可见<br>
 *（4）protected：本类或者同包其他类和子类可见，其他包中的类或子类不可见<br>
 *（5）public：任何类或子类都可见<br>
 *（6）普通外部类的修饰符只可以是 public、抽象(Abstract)、终态，不能是 private、protected，但是类缺省的修饰符
 *           权限大小和 protected 相同，任何类的方法的修饰符可以是 private；类中方法的权限受限于类的权限<br>
 *     （6.1）非内部类的修饰符不能是 private、protected<br>
 *（7）this：this.变量，【本类中使用，代表本类对象的引用，用于引用对象的成员变量和成员方法】；也可以调用类的构造方法
 *                   【this（参数变量），但是只能在无参构造方法中的第一句调用有参构造方法】；也可以当做方法的
 *                   返回值，return this【这里表示返回值为类，注意不是类对象，暂不清楚用法】;static 静态方法中不能使
 *                   用 this 关键字<br>
 * （7.1）本类中调用的两种方法：this.变量；对象.变量，【当然也可以是 this.方法；对象.方法】<br><br>
 *（8）类的构造方法：public  ClassName（变量）{方法体}，在无构造方法的时候编译器自动创建一个不带参数的构造
 *                              方法；只定义了有参构造方法时，无法调用无参构造方法<br><br>
 * （9）static：static修饰的变量、常量、方法属于类所有，使用”类名.变量”调用这些成员；static修饰的语句块在类中首先
 *                    执行，然后才是类构造方法<br>
 *   （9.1）：使用 static 修饰的方法，即静态方法中不能使用 this 关键字，且不可以直接调用“非静态方法”和“全局非静态变量”，
 *                    “非静态方法”和“全局非静态变量（类级别的非静态变量）”可以通过对象调用的方式使用，类比同样是
 *                     静态方法的类内主方法<br><br>
 *（10）参数运行：类的主方法运行需要参数时，右击，选择运行方式，选择运行配置，在对应类的参数配置里设置参数<br>
 **/
public class VarAndBehav {
	private String name;
	public static void main(String[] args){
		VarAndBehav book=new VarAndBehav("dc");
		String x=book.getName();
		System.out.println(x);
		book.method2();
		System.out.println("返回值为类："+book.getVariable());
		VarAndBehav.dd();
	}
	static{
		System.out.println("首先执行static标记的程序块");
		}
	public VarAndBehav(String a){
		System.out.println("有参构造方法");
	}
	public String getName(){
		int id=0;
		setName("Java");
		return id+this.name;
	}
	private void setName(String name){
		this.name=name;
	}
	public VarAndBehav getVariable(){
		return this;
	}
	
	public static void dd(){
		VarAndBehav ss=new VarAndBehav("dc");
		System.out.println(ss.getName());
	}
	
	
	final static double PI=3.23;
	static int id;
	public static void method1(){}
	public void method2(){
		System.out.println(VarAndBehav.PI);
		System.out.println(VarAndBehav.id);
		VarAndBehav.method1();
	}

}
