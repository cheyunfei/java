package interface_hire_varycondition;

class V { // 自定义类V
	//重写Object类中的equals方法，equals默认使用“==”，即比较对象的引用是否相同
	public boolean equals(Object a){
		if(a.getClass().getName().compareTo(getClass().getName())==0)
		return true;
	else{
		System.out.println(getClass().getName());
		return false;
	}
	}
}

class V2{}

/**<p>（1）java.lang.Object 类是所有类的父类，其主要包含 clone()、finalize()、equals()、toString() 可以被覆盖，
 *                getClass()、notify()、notifyAll()、wait() 被定义为 final，不可以被覆盖
 *   <p>（2）getClass()：返回 Class 型值，对象执行时的 Class 实例【 getClass().toString() 输出 “class 包名.类名”】
 *   <p>（3）getClass().getName()：返回 String 型值，返回对象执行时的类名【输出 “包名.类名”】
 *   <p>（4）toString()：将一个对象返回为字符串形式，可以被覆盖，当输出一个对象时自动调用重写的 toString()
 *   <p>（5）在 String 中“==”用于比较引用地址是否相同，“equals”用于比较内容；在类对象中“==”“equals”
 *                 作用相同比较引用地址*/
public class ObjectAndFormula {
	public static void main(String[] args) {
		String s1 = "123"; // 实例化两个对象，内容相同
		String s2 = "123";
		System.out.println(s1.equals(s2)); // 使用equals()方法调用
		V v1= new V(); // 实例化两个V类对象
		V v2=new V();
		V2 v = new V2();
		V2 vv = new V2();
		ObjectAndFormula ss=new ObjectAndFormula();
		System.out.println(v.getClass().getName());
		System.out.println(v1.equals(v)); // 使用equals()方法比较v1与v2对象
	}
}

