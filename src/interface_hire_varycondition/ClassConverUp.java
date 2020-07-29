package interface_hire_varycondition;

/**<p>（1）父类是较抽象的类，子类是较具体的类
<p>（2）向上转型：子类对象可以看作是一个父类对象，Father obj=new Son()，当此对象作为父类方法中参数时，
                          可以实现多个不同的子类继承同一个父类方法，而父类方法中按子类类型分别处理，从而避免每个子类
                          都重写此方法造成的代码复杂，以实现多态【如 public void Method( Father obj )，调
                          用 Method( new Son )，然后在方法 Method 中使用 obj.getClass().getName().equals("包名.子类名") 来
                          判断是哪个子类，然后按不同子类使用不同的处理过程】<br>
        （2.1）向上转型后注意事项：向上转型后不能调用上级类不存在，下级类存在的方法；虽然此时是父类对象，调用的
                         却是子类中覆盖父类后的新方法

<p>（3）向下转型：这样容易出现问题，如果父类对象不是子类对象的实例【Father fatherObj=new Father()】，向下转
                            型出现 ClassCastException 错误，只有父类对象是子类对象的实例【Father fatherObj=new Son()】，
                            然后显式的使用强制转换方式，即 Son obj=(Son)fatherObj，向下转型才能成功，因此为了判断这两种情况
                            引入 instanceof
   
<p>（4）instanceof：“obj instanceof Class”，返回 boolean 值<br>
  （4.1）只能用于判断父类和子类之间的关系，不能判断无关类间的关系，【Father、Son、Any三个类，“public Son extends Father”
                             “fatherObj instanceof Son”或“sonObj instanceof Father”语句合法，但是“fatherObj instanceof Any”语句本身就
                             是错误的】<br>
  （4.2）在向下转型之前，用于判断父类对象是否是子类对象的实例【Father obj=new Son()，此
                             时“obj instanceof Son”返回 true，“obj instanceof Father”返回true】，虽然 Son 是 Father 的子类【 Father obj=new Father()，
                             此时“obj instanceof Son”返回 false，“obj instanceof Father”返回true】<br>
   （4.3）可以使用 instanceof 判断某类是否实现了某个接口，也可以判断一个实例对象是否属于一个类，只要是向下(向上)转型相关联
              的对象和类“obj instanceof Class”返回值都是 true 【向上转型后父类对象是子类对象的实例，向下转型后子类
              对象是父类对象的实例】<br>*/

public class ClassConverUp { // 四边形类
	public void olt(){
		System.out.println("父类中的方法");
	}
	public void olt2(){
		System.out.println("父类中存在，子类中不存在的方法");
	}
	
	public static  void draw(ClassConverUp q) { // 四边形类中的方法
		if(q.getClass().getName().equals("interface_hire_varycondition.Son")){
			System.out.println("处理类 Son 的对象");
		}
		if(q.getClass().getName().equals("interface_hire_varycondition.Son1")){
			System.out.println("处理类 Son1 的对象");
		}
	}
	
	public static void main(String args[]) {
		Son p1 = new Son(); // 实例化平行四边形类对象引用
		Son1 p2=new Son1();
		draw(p1);
		draw(p2); // 调用父类方法
		//向上转型
		ClassConverUp q = new Son();
		q.olt();
		q.olt2();
		//然后向下转型
		Son p=(Son)q;
		System.out.println((p instanceof ClassConverUp)+"  hjgj");
//		ClassConver q2=new ClassConver();
//		Son r=(Son) q2;
	
		
		ClassConverUp t1=new ClassConverUp();//父类对象不是子类对象的实例
		System.out.println("t1是否是ClassConver的对象实例："+(t1 instanceof ClassConverUp));
		ClassConverUp t2=new Son();//父类对象是子类对象的实例
		System.out.println(t2 instanceof ClassConverUp);
	    System.out.println("Anything没有继承ClassConver，所以"+"  t1 instanceof Anything  "+"这条语句错误。");
	}

}
class Anything{}
class Son extends ClassConverUp {
	public void olt(){
		System.out.println("子类中的方法");
	}
}
class Son1 extends ClassConverUp{}




