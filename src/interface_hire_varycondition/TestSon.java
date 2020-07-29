package interface_hire_varycondition;

class TestSon extends TestFather { // 继承父类
	public TestSon() { // 构造方法
		//super(); // 调用父类无参构造方法,其实这个有没有都无所谓，子类初始化时，父类无参构造方法自动调用
		//super(2);//调用父类的有参构造方法
		System.out.println("子类的构造方法");
		super.doSomething(); // 调用父类成员方法
	}
	
	public void doSomethingnew() { // 新增方法
		System.out.println("子类的新成员方法");
	}
	
	
	protected void doSomething() { // 重写父类方法
		System.out.println("子类重写父类的成员方法");
	}
	
	
	protected TestSon doIt() { // 重写父类方法，方法返回值类型为Test2类型
		return new TestSon();
	}
	
	public String toString(){
		return "在子类中输出 '一个对象' 自动调用重新定义toString方法:"+getClass().getName();
	}
	
	protected Object returnObject(){
		String s="son return a Object";
		return s;
	}
	
	protected TestFather returnFather(){
		TestFather s=new TestFather();
		return s;
	}
	
	public static void main(String[] args){
		System.out.println(new TestSon());
		System.out.println();
		TestSon s=new TestSon();
		s.doSomething();
		System.out.println(s.returnObject());
		System.out.println("表达一："+s.getClass().getName()+"  表达二："+s.getClass());
	}
}
