package interface_hire_varycondition;
/**<p>（1）多态：子类对象可以看作是一个父类对象，Father obj=new Son()，当此对象作为父类方法中参数时，
                            可以实现多个不同的子类继承同一个父类方法，而父类方法中按子类类型分别处理，从而避免每个子类
                            都重写此方法造成的代码复杂，以实现多态【如 public void Method( Father obj )，Method( new Son )】
     <p>注意：参考 ClassConverUp类 中编写的关于多态的程序，这里的程序完全体现不出多态的优点*/
public class VaryCondition {
	// 实例化保存四边形对象的数组对象
	private VaryCondition[] qtest = new VaryCondition[6];
	private int nextIndex = 0;
	
	public void draw(VaryCondition q) { // 定义draw()方法，参数为四边形对象
		if (nextIndex < qtest.length) {
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	
	public static void main(String[] args) {
		// 实例化两个四边形对象，用于调用draw()方法
		VaryCondition q = new VaryCondition();
		q.draw(new Square()); // 以正方形对象为参数调用draw()方法
		// 以平行四边形对象为参数调用draw()方法
		q.draw(new Parallelogramgle());
		q.draw(new Parallelogramgle());
	}
}

class Square extends VaryCondition { // 定义一个正方形类，继承四边形类
	public Square() {
		System.out.println("正方形");
	}
}

// 定义一个平行四边形类，继承四边形类
class Parallelogramgle extends VaryCondition {
	public Parallelogramgle() {
		System.out.println("平行四边形");
	}
}

