package Reflect_Annotation;
/**
*@author:cloud<br>
*@date:2019年5月26日上午11:03:50<br>
*@class:reflect.ConstructorTest.java<br><br>
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @author 云飞<br><br>
 *（1）Constructor类：本身无构造方法，通过反射获取class.getConstructor()【参考ClassTest类中的注解】<br>
 *（1.1）con.newInstance(Object...args)：返回一个原对象实例，通过指定参数对象列表创建一个该类的对象，如果未设置参数则表示采用默认
 *无参构造方法。<br>
 *（1.2）con.setAccessible(boolean flag)：如果该构造函数的权限为private，默认不允许通过反射利用newInstance
 *方法创建对象。如果先执行该方法，参数设为true，那么private的构造函数就可以使用newInstance创建对象。<br>
 *（1.3）con.getModifiers()：获得该构造方法所采用的修饰符（如public）所代表的整数，通过查看源码可以发现
 *Modifier类将一个int的每个位bite当做一个修饰符，比如第一位为1：public，0：无public。该方法也可用在成员变量或者
 *成员函数上。<br>
 *
 *（2）Modifier类：本身只有一个无参构造 方法，可以通过反射获得Constructor、Field、Method、Class对象，然后
 * 调用这些类中的getModifier()方法，来获取修饰符编码整数值。该类通过一个整数值的位示编码列表，表示一个修
 * 饰符列表。0表示无该修饰符，1表示有该修饰符，如 0x00000001表示public；0x00000002表示private<br>
 *（2.0）int mod=constructor.getModifier();
 *（2.1）Modifier.isPublic(mod)：返回boolean，查看是否被public修饰，是为true，否为flase。【类似有
 *isProtected(mod)，isPrivate(mod)，isStatic(mod)，isFinal(mod)】<br>
 *（2.2）Modifier.toString(mod)：返回String，将mod所代表的修饰列表以字符串形式输出<br><br>
 *
 */
public class ConstructorAndModifierTest {
	static public final int a=2;
	public ConstructorAndModifierTest(){System.out.println("无参构造方法！");}
	public ConstructorAndModifierTest(String s,int i){
		System.out.println("参数列表：String ，int ；"+s+" ，"+i);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) throws NoSuchMethodException, 
	InstantiationException, IllegalAccessException, IllegalArgumentException,
	InvocationTargetException, NoSuchFieldException, SecurityException {
		ConstructorAndModifierTest conT=new ConstructorAndModifierTest();
		@SuppressWarnings("rawtypes")
		Class cl=conT.getClass();
		
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Constructor con=cl.getConstructor(String.class,int.class);
		ConstructorAndModifierTest conT2=(ConstructorAndModifierTest)con.newInstance(new String("fuck you"),2);

		
		Field varible=cl.getDeclaredField("a");
		int mod=varible.getModifiers();
		String embellish=Modifier.toString(mod);
		System.out.println("该成员变量a的修饰列表为："+embellish);
	}

}
