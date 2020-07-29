package interface_hire_varycondition;

interface drawTest { // 定义接口
	 public abstract void draw(); // 定义方法
}

// 定义平行四边形类，该类继承了四边形类，并实现了drawTest接口
class ParallelogramgleUseInterface extends AbstractAndInterface implements drawTest {
	public void draw() { // 由于该类实现了接口，所以需要覆盖draw()方法
		System.out.println("平行四边形.draw()");
	}
	
	public void doAnyThing() { }
}

class SquareUseInterface extends AbstractAndInterface implements drawTest {
	public void draw() {
		System.out.println("正方形.draw()");
	}
	
	public void doAnyThing() { }
}

abstract class AnyThingUseInterface extends AbstractAndInterface {

	public abstract void doAnyThing();
}


/**
 *<p>（1）抽象类：public abstract class 类名{ }，抽象类不可以实例化对象
 *<p>（2）抽象方法：“abstract void 方法名( );”，抽象方法没有方法体，且必须出现在抽象类中；
 *                       抽象类被继承后，抽象类中的抽象方法必须被子类显式的实现，保持返回值、方法名、参
 *                       数不变创建出非抽象方法或抽象方法（即子类仍是抽象类），而抽象类中的非抽象方法
 *                       可以不用显式的重写就可以被继承
 *<p>（3）接口：接口是抽象类的延伸【 interface 接口名{ } 】，纯粹的抽象类，不像抽象类中可以同时存在抽象和非抽象方法，
 *                      接口中的方法都没有方法体， abstract 修饰与否都可以，一般省略【 “返回值 方法名();”，“void add();” 】
 * <p>（4）继承接口：接口可以多重继承【 “implement inter1 , inter2 , inter3” 】，并且必须显式实现接口中的所有方法，因为接口中的方法都是抽象的
 * <p>注意：<br>
 * （1.1）被 public 修饰的接口必须在与自己同名的文件中<br>
 * （1.2）接口中定义的方法默认是（也只能是） public <br>
 * （1.3）接口中定义的任何字段都是 “static final”的<br>
 * （1.4）可以把一个类向上转型为该类实现的接口，调用的就是该类中已经实现的接口中的方法<br>
 *
 */
public abstract class AbstractAndInterface { // 定义四边形类
	public abstract void doAnyThing();
	public void add(){
		System.out.println("抽象类中的非抽象方法");
	}
	
	public static void main(String[] args) {
		ParallelogramgleUseInterface p=new ParallelogramgleUseInterface();
		System.out.println(p instanceof ParallelogramgleUseInterface);
		System.out.println(p instanceof drawTest);
		
		SquareUseInterface s=new SquareUseInterface();
		s.add();
		drawTest[] d = { // 接口也可以进行向上转型操作
		new SquareUseInterface(), new ParallelogramgleUseInterface() };
		for (int i = 0; i < d.length; i++) {
			d[i].draw(); // 调用draw()方法
		}
	}
}
