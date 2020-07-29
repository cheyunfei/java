package Reflect_Annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
*@author:cloud<br>
*@date:2019年5月24日下午12:21:05<br>
*@class:reflect.ClassTest.java<br><br>
*/

/**
 * @author 云飞<br><br>
 *（1）Java反射：java.lang.reflect包中提供了对该功能的支持，可以在程序中访问已经装载
 *到JVM中的Java对象的描述，实现访问、检测和修改描述Java对象本身信息的功能。<br><br>
 
 *（2）Class类：所有的Java类均继承了Object类，在Object类重定义了getClass()方法，该方法返回一个
 *Class对象，可以通过该对象获取原对象的描述信息。以下为获取Class对象的方式<br>
 *（2.1）obj.getClass()：返回值Class。<br>
 *（2.2）MyClass.class：返回值Class。<br>
 *（2.3）Class.forName(String classCompleteName)：返回值Class，classCompleteName【包括包名的全路径名，如“Reflect_Annotation.ClassTest”】。<br><br>
 
 *（3）MyClass my=new MyClass()   Class class=my.getClass()：即通过class获取my对象的详细信息<br>
 *（3.1）class.getPackage()：返回Package对象，获得MyClass类的存放路径，这个路径依旧是相对于
 *上下文环境<br>
 *（3.2）class.getName()：返回String对象，获得该类的名称，包括包名；如果要获得单纯的类名，
 *  使用class.getSimpleName()<br>
 *（3.3）class.getSuperclass()：返回Class对象，获得该类继承的类，即直接父类<br>
 *（3.4）class.getInterface()：返回Class[]数组对象，获得该类实现所有接口<br>
 
 *（3.5）class.getConstrutors()：返回Constructor[]构造方法对象数组，获得该类中所有权限为public的
 *  构造方法，即使没有显式的定义构造函数，该方法也会返回一个默认的无参构造函数。【该方法还有其他系列，
 *  除了此获取public的构造方法，还有获取指定参数类型列表、public的构造方法，获取所有类型的
 *  构造方法，获取指定参数类型列表、任意权限的构造方法】<br>
 *（3.5.1）对于方法class.getConstructor(Class&lt;?&gt;...parameterTypes)获取指定参数列表的构造方法，其中
 *parameterType有两种表示方法(1)(new Class[]{String.class,int.class})  (2)(String.class,int.class)，
 *其中构造方法参数列表必须和定义中的顺序数量都相同，否则将报错！。<br>
 
 *（3.6）class.getMethods()：返回Method[]函数对象数组，获得该类中所有权限为public的函数，不包括构
 *造函数，包括main函数。【该方法还有其他系列，除了此获取public的函数，还有获取指定参数类型列表、
 *函数名、public的函数，获取所有类型的函数，获取指定参数类型列表、函数名、任意类型的构造方法】<br>
 *（3.6.1）注意当调用获取public的成员函数的方法时，会同时将超类中函数提取；当调用获取所有成员函数的方法时，只会将
 *本类中定义的方法（包括主方法）提取。<br>
 *（3.6.2）对于方法class.getMethods(Class&lt;?&gt;...parameterTypes)获取指定参数列表的函数，其中parameterType
 *有两种表示方法(1)(new Class[]{String.class,int.class})  (2)(String.class,int.class)，其中函数参数列表
 *必须和定义中的顺序数量都相同，否则将报错！。<br>

 *（3.7）class.getFields():返回Field[]成员变量对象数组，获得该类中所有权限为public的成员变量。【该方法
 *还有其他系列，除了此获取public的成员变量，还有获取指定变量名的类成员变量，获取所有成员变量，获取
 *指定变量名、任意类型的成员变量】<br>
 *（3.7.1）注意当调用获取public的成员变量的方法时，会同时将超类中成员变量提取；当调用获取所有成员变量的方法时，只会将
 *本类中定义的成员变量提取。<br>
 
 *（3.8）class.getClasses()：返回Class[]数组，获取权限为public的内部类。【该方法还有其他系列，除了
 *此获取public的内部类，还有获取所有类型的内部类】<br>
 *（3.9）class.getDeclaringClass()：返回Class对象，调用这个方法的类必须是另一个类的成员，即调用该方法的
 *类是内部类，该方法返回这个内部类在其所属外部类的声明位置，【但如果该类不是另一个类的成员，或该类是一个类
 *数组、原始类型、void，该函数均返回null】。<br><br>
 */
public class ClassTest{
	static int a=3;
	static public int b=3;
	AnnotationTest anno=new AnnotationTest();
	public ClassTest(){};
	public ClassTest(String s){System.out.println("使用带参public String构造函数！");}
	@SuppressWarnings("unused")
	private ClassTest(int p){}{System.out.println("使用带参private int构造函数！");}
	public void function1(int a,int b){}
	public void function2(String a,int b){}
	class inner1{
		ClassTest outDeclaredAtin=new ClassTest();
		String s="sssss";
		inner2 inclass=outDeclaredAtin.new inner2();
	}
	public class inner2{}
	@SuppressWarnings("unchecked")
	public static void main(String[] args)throws NoSuchMethodException{
		ClassTest my=new ClassTest();
		
		@SuppressWarnings(value={"rawtypes", "unused"})
		Class raw=my.getClass();
		
/*getPackage()*/
		  //System.out.println("getPackage():"+raw.getPackage().getName());
/*getName()*/
		  //System.out.println("getName():"+raw.getName());
/*getSimpleName()*/
		  //System.out.println("getSimpleName():"+raw.getSimpleName());
/*getSuperclass()*/
		  //System.out.println("getSuperclass():"+raw.getSuperclass());
/*getInterfaces()*/
		  //if(raw.getInterfaces().length==0){
		  	//System.out.println("无实现的接口！！");
		  //}else
			  //for(@SuppressWarnings("rawtypes") Class e:raw.getInterfaces()){
				  //System.out.println("raw.getInterfaces():"+e.getName());
			  //}
/*getConstructors()*/
		  //for(@SuppressWarnings("rawtypes") Constructor e:raw.getConstructors()){
			  //System.out.println("raw.getConstructors():"+e.getName());
		  //}
/*getConstructor(Class<?>...parameterType)*/
		  //Constructor con=raw.getConstructor(String.class);
		  //System.out.println("getConstructor(Class<?>...parameterType):"+con.toString()+"\n"
			//	  +"constructor.getParameters:"+(con.getParameterTypes())[0]);
/*getDeclaredConstructors()*/
		  //for(@SuppressWarnings("rawtypes") Constructor e:raw.getDeclaredConstructors()){
			//  System.out.println("raw.getDeclaredConstructors():"+e.toString());
		  //}
/*getDeclaredConstructor(Class<?>...parameterType)*/
		  //@SuppressWarnings("rawtypes")
		  //Constructor con=raw.getDeclaredConstructor(int.class);
		  //System.out.println("getDeclaredConstructor(Class<?>...parameterType):"+con.toString());
/*getMethods()*/
		  //for(Method e:raw.getMethods()){
			//  System.out.println("raw.getMethods():"+e.toString());
		  //}
/*getMethod(Class<?>...parameterTypes)*/
		  //System.out.println("getMethod(Class<?>...parameterTypes):"+raw.getMethod("function2", String.class,int.class));
		  //System.out.println("getMethod(Class<?>...parameterTypes):"+raw.getMethod("function2", new Class[]{String.class,int.class}));
/*getDeclaredMethods()*/
		  //for(Method e : raw.getDeclaredMethods()){
			  //System.out.println("raw.getDeclaredMethods():"+e);
		  //}
/*getFields()*/
		   //for(Field e:raw.getFields()){
			  //System.out.println("raw.getFields():"+e);
		   //}
/*getClasses()*/
		   //for(Class e:raw.getClasses()){
			  //System.out.println("raw.getClasses():"+e);
		   //} 
/*getDeclaringClass()*/
		   //inner1 in=my.new inner1();
		   //@SuppressWarnings("rawtypes")
		   //Class inclass=in.getClass();
		   //System.out.println("getDeclaredClass:"+inclass.getDeclaringClass());
	}
}
