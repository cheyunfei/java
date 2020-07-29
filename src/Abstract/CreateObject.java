package Abstract;
/**（1）对象的创建通过 new 这个关键字 ：语句“new 对象名”，此时 new 操作符创建对象，调用构造方法<br><br>
 * （2）注意同一个类中不同对象对成员变量的引用是独立的，对静态变量的引用是重叠的<br><br>
 * （3）对象的操作标识符其实只是一个对象的引用，其就是一个对象的内存地址<br><br>
 * （4）对象的比较：“obj1.equals(obj2)”，【比较的是对象内容是否相等】；“obj1==obj2”,【比较的
 *                       是对象的引用地址是否相同】<br><br>
 * （5）对象的销毁：可以被垃圾回收机制自动销毁的对象【由 new 创建，并且超出作用范围或“obj=null”的
 *                       对象可以被销毁】；对于非 new 创建的对象，通过在类中定义 finalize() 方法【Object类的方法】；
 *                       垃圾回收机制和 finalize 发生的时间不定，即Java虚拟机内存消耗殆尽之前不会执行垃圾回收
 *                       ，通过“System.gc()”强制启动垃圾回收器<br><br>*/
public class CreateObject {
	private static int i=0;
	public CreateObject() { // 构造方法
		System.out.println("创建对象"+i);
		i++;
	}
	
	public CreateObject pp(){
		return this;
	}
	
	public static void main(String args[]) { // 主方法
		CreateObject x= new CreateObject(); // 创建对象
		System.out.println( x.pp());
		new CreateObject();
		
		
		String c1 = new String("abc"); // 创建两个String型对象引用
		String c2 = new String("abc");
		String c3 = c1; // 将c1对象引用赋予c3
		//使用“==”运算符比较c1与c3
		System.out.println("c1==c3的运算结果为："+(c1==c3));
		// 使用“==”运算符比较c2与c3
		System.out.println("c2==c3的运算结果为：" + (c2 == c3));
		// 使用equals()方法比较c2与c3
		System.out.println("c2.equals(c3)的运算结果为：" + (c2.equals(c3)));
		//强制启动垃圾回收机制
		System.gc();
	}
}
