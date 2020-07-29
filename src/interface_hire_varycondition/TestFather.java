package interface_hire_varycondition;
/**（1）一个类即使不定义任何构造方法，也会自动拥有一个缺省无参构造方法<br><br>
 * 
 * （2）子类构造方法：<br>
 * （2.1）如果父类只存在无参构造方法或没有任何构造方法（但是有缺省无参构造方法），实例化子类
 *                         对象时将首先自动调用父类的无参构造方法，或者可以用 super() 在子类构造方法的第一句调用父类的无参
 *                         构造方法<br>
 * （2.2）如果父类只存在有参构造方法，那么父类不会存在缺省的无参构造方法，子类不可能调用父类
 *                         的无参构造方法，只能在子类构造方法中的第一句显式调用父类有参构造方法，super(参数)<br>
 *  （2.3）如果子类没有构造方法或没有显式调用父类构造方法，在实例化子类对象时会默认调用父类的无参构造方法<br>
 *  （2.4）如果多次类继承，实例化子类对象时先从顶级父类开始调用构造方法<br>
 * （2.5）在子类构造方法中可以通过 “super.父类方法名”，来调用父类中的非 private 成员方法，private 只能由本类调用<br>
 * （2.6）在继承机制中，创建一个子类对象将包含一个父类子对象，同父类创建的对象一样，区别只是前者来自子类对象
 *                内部，后者来自外部<br><br>
 * 
 * （3）子类的成员方法：<br>
 * （3.1）覆盖（重写）：在子类中重写父类中的方法，保留父类方法的方法名和参数类型及个数，存储权限、返回值类型、方法体
 *                        都可以改变；仅当返回值为类类型时，重写的方法才可以修改返回值类型，
 *                        且必须是父类方法返回值的子类；要么就不修改，与父类返回值类型相同，即使父类方法返回的是父类
 *                        本身，子类方法重写时也可以返回父类。<br>
 *  （3.2）重构（覆盖的特殊情况）：在子类中重写父类中的方法，返回值类型、方法名、参数完全相同，只有方法体不同<br>
 *  （3.3）方法权限：在子类中重写父类中的方法，其存储权限不能低于父类方法的权限，如父类方法为 protected ，子类不
 *                 能是 private<br>                    
 *  （3.4）方法返回值：当父类方法的返回值是“类”时，子类覆盖的方法返回值只能是父类返回值的“子类”【如父类
 *                   返回值为 TestFather，子类返回值只能为 TextSon 】<br><br>
 *  （4）如果使用 finalize() 方法对对象进行清理，子类的 finalize() 方法的最后一个动作是调用父类的 finalize()，以确保
 *                  对象的所有部分都可以被终止<br><br>
 *     （5）类不能被多重继承，但是接口可以多重继承 */
public class TestFather {
	public TestFather() { // 构造方法
		System.out.println("父类的无参构造方法");
		System.out.println(getClass().getName());
	}
	
	public TestFather(int a){
		System.out.println("父类的有参构造方法");
	}
	
	protected void doSomething() { // 成员方法
		System.out.println("父类的成员方法");
	}
	
	protected TestFather doIt() { // 方法返回值类型为Test类型
		return new TestFather(2);
	}
	protected Object returnObject(){
		String s="father return a Object";
		return s;
	}
	
	protected TestFather returnFather(){
		TestFather s=new TestFather();
		return s;
	}
}
