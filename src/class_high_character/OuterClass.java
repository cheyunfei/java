package class_high_character;

interface OutInterface{
	public void f();
}

/**内部类：在类中再定义的一个类称为内部类，分为成员内部类、局部内部类、匿名类<br><br>
 * <p>（一）成员内部类：class OuterClass{ class InnerClass{  } }
 * <p>（1）内部类可以随意直接使用外部类的成员变量和方法，即使这些变量和方法被 private 修饰也可以，但是
 *                  外部类不可以直接使用内部类的成员<br>
 *<p>（2）内部类实例化过程：<br>
 *          （2.1）内部类对象依赖于外部类对象，若不创建外部类对象，也就不会出现内部类对象，编译后内部类名为
 *          “外部类名$内部类名”，相应产生【 外部类名$内部类名.class】和【 外部类.class】两个字节码文件<br>
 *          （2.2）一般在外部类中或者外部类的非静态方法中实例化【InnerClass in=new InnerClass()】。内部类在外部类
 *          中实例化后的对象是外部类的成员变量之一，所以外部类对象创建过程此成员变量也会初始化<br>
 *          （2.3）在静态方法中实例化内部类对象：一、外部类方法的返回值是内部类对象 Outer.Inner in=out.doit()，二、
 *            直接创建内部类对象 Outer.Inner in=out.new Inner()<br>
 * <p>（3）内部类最基本的用途：多个内部类继承同一个接口，以不同的方式实现接口中的方法，就可以实现一个外部类多次实现
 *             接口中的方法；如果所有内部类被 private 修饰，则内部类实现的接口中的方法都是 private，再也不能通过外部类
 *             的内部类对象调用这些方法，仅可以通过将内部类向上转型为接口，然后通过接口对象调用这些方法，很好的隐藏了
 *             内部类中的方法的实现细节。这种技巧经常用在 Swing 编程中
 *  <p>（4）this：使用 this 关键字在同一个类中可以区分全局变量和局部变量，当出现内部类时，在内部类的方法中出现
 *                      x【内部类方法中的局部变量】，this.x【内部类的全局变量】，外部类名.this.x【外部类的非静态全局变量，
 *                      当然如果是静态变量这样也可以，但是静态变量更简单的写作 "外部类名.x"】
 *          
 *<p>（二）局部内部类：在类的方法中或任意的作用域中均可以定义
 *<p>（1）方法或作用域：外部类中的方法或变量不能访问该内部类，但是该内部类可以访问“当前作用域常量”和“外部类所有成员”<br>
 *           （1.1）只能访问常量的原因：因为局部内部类可以通过向上转型成某个外部类，然后经由外部类调用，这个过程中可能造成
 *           该局部内部类中某些成员的作用范围可能超出其定义的作用域，故此必须将局部内部类中使用的
 *           属于作用域的成员变量定义为常量，使其不能改变
 *<p>（2）生成文件：局部内部类编译后生成的文件格式为---“外部类名$1内部类名.class”；注意文件名中的‘1’为数字‘1’，猜测其代表单词local（局部）。
 *<p>（三）匿名内部类：new 类/接口/抽象类 { 匿名内部类结构代码 }【new A { private int i=0;};】，注意在最
 *                后加一个分号“；”<br>
 *  （1）匿名内部类没有名称， A 是某个类/接口/抽象类的名称，匿名内部类的作用就是创建一个实现了 A 的匿名类对象，并且可以
 *      在随后的结构代码中实现或者覆盖其中的方法<br>
 *（2）匿名内部类编辑后会产生“外部类名$序号.class”文件，序号是1~n，表示第几个匿名内部类
 *
 *<p>（四）静态内部类：在内部类前添加修饰符 static，可以定义静态变量<br>
 *（1）非静态内部类中不能声明静态变量，静态内部类不能使用外部类的非静态变量<br>
 *（2）不能从静态内部类的对象中访问外部类的非静态对象<br>
 *（3）有待证明：有将主方法写入静态内部类的用法，主要用于方便调试，正式编程代码不使用<br>
 *
 *<p>（五）内部类的继承：class OutClass extends ClassA.ClassB{ public OutClass( ClassA a ){ a.super(); } }<br>
 *（1）某个类继承内部类时，必须硬性给予这个类一个带参数的构造方法，并且该构造方法参数为需要继承内部类的
 *              外部类的引用，同时在构造方法中使用 a.super() 
 *
 *             */


public class OuterClass {
	innerClass in = new innerClass(); // 在外部类实例化内部类对象引用
	 static int a=1;
	
	public OuterClass(){
		System.out.println("外部类无参构造方法");
	}
	
	public void ouf() {
		innerClass inn = new innerClass();//在外部类的非静态方法中实例化内部类对象应用
		in.inf();                        // 在外部类方法中调用内部类方法
	}
	public void dd(int a){//这里设置a为2
		class innerPart{
			//int a=3;
			innerPart(){
				System.out.println("局部内部类构造方法");
			    iP();
			}
			void iP(){ 
				//System.out.println("局部内部类访问外部类常量"+this.a);
				System.out.println("局部内部类访问外部类常量"+OuterClass.a);
				System.out.println("局部内部类访问外部类常量"+a);
			}
		}
		innerPart iP=new innerPart();
	}
	
	public class innerClass {
		int y = 0;                   // 定义内部类成员变量
		//static int z=3;  //非静态内部类中无法创建静态成员
		innerClass() {              // 内部类构造方法
			System.out.println("内部类无参构造方法");
		}
		public void inf() {      // 内部类成员方法
			System.out.println("内部类可以访问它的外部类的成员："+(a));
			System.out.println("内部类中的方法");
		}
	}
	
	public innerClass doit() {              //外部类不可以直接访问内部类成员变量
		in.y = 4;
		return new innerClass(); // 返回内部类引用
	}
	
	class innerClass1 implements OutInterface{
		public void f(){System.out.println("内部类实现接口方法1");}
	}
	class innerClass2 implements OutInterface{
		public void f(){System.out.println("内部类实现接口方法2");}
	}
	public OutInterface doit1(){
		return new innerClass1();
	}
	public OutInterface doit2(){
		return new innerClass2();
	}
	

	
	public static void main(String args[]) {
		OuterClass out = new OuterClass();
		out.ouf();
		System.out.println();
		
		OutInterface oin1=out.new innerClass1();
		oin1.f();
		OutInterface oin2=out.doit2();
		oin2.f();
		System.out.println();
		
		OuterClass.innerClass inx = out.doit();
		OuterClass.innerClass in2 = out.new innerClass();
		System.out.println();
		
		out.dd(2);
	}
}