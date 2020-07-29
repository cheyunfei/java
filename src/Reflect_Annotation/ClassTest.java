package Reflect_Annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
*@author:cloud<br>
*@date:2019��5��24������12:21:05<br>
*@class:reflect.ClassTest.java<br><br>
*/

/**
 * @author �Ʒ�<br><br>
 *��1��Java���䣺java.lang.reflect�����ṩ�˶Ըù��ܵ�֧�֣������ڳ����з����Ѿ�װ��
 *��JVM�е�Java�����������ʵ�ַ��ʡ������޸�����Java��������Ϣ�Ĺ��ܡ�<br><br>
 
 *��2��Class�ࣺ���е�Java����̳���Object�࣬��Object���ض�����getClass()�������÷�������һ��
 *Class���󣬿���ͨ���ö����ȡԭ�����������Ϣ������Ϊ��ȡClass����ķ�ʽ<br>
 *��2.1��obj.getClass()������ֵClass��<br>
 *��2.2��MyClass.class������ֵClass��<br>
 *��2.3��Class.forName(String classCompleteName)������ֵClass��classCompleteName������������ȫ·�������硰Reflect_Annotation.ClassTest������<br><br>
 
 *��3��MyClass my=new MyClass()   Class class=my.getClass()����ͨ��class��ȡmy�������ϸ��Ϣ<br>
 *��3.1��class.getPackage()������Package���󣬻��MyClass��Ĵ��·�������·�������������
 *�����Ļ���<br>
 *��3.2��class.getName()������String���󣬻�ø�������ƣ��������������Ҫ��õ�����������
 *  ʹ��class.getSimpleName()<br>
 *��3.3��class.getSuperclass()������Class���󣬻�ø���̳е��࣬��ֱ�Ӹ���<br>
 *��3.4��class.getInterface()������Class[]������󣬻�ø���ʵ�����нӿ�<br>
 
 *��3.5��class.getConstrutors()������Constructor[]���췽���������飬��ø���������Ȩ��Ϊpublic��
 *  ���췽������ʹû����ʽ�Ķ��幹�캯�����÷���Ҳ�᷵��һ��Ĭ�ϵ��޲ι��캯�������÷�����������ϵ�У�
 *  ���˴˻�ȡpublic�Ĺ��췽�������л�ȡָ�����������б�public�Ĺ��췽������ȡ�������͵�
 *  ���췽������ȡָ�����������б�����Ȩ�޵Ĺ��췽����<br>
 *��3.5.1�����ڷ���class.getConstructor(Class&lt;?&gt;...parameterTypes)��ȡָ�������б�Ĺ��췽��������
 *parameterType�����ֱ�ʾ����(1)(new Class[]{String.class,int.class})  (2)(String.class,int.class)��
 *���й��췽�������б����Ͷ����е�˳����������ͬ�����򽫱�����<br>
 
 *��3.6��class.getMethods()������Method[]�����������飬��ø���������Ȩ��Ϊpublic�ĺ�������������
 *�캯��������main���������÷�����������ϵ�У����˴˻�ȡpublic�ĺ��������л�ȡָ�����������б�
 *��������public�ĺ�������ȡ�������͵ĺ�������ȡָ�����������б����������������͵Ĺ��췽����<br>
 *��3.6.1��ע�⵱���û�ȡpublic�ĳ�Ա�����ķ���ʱ����ͬʱ�������к�����ȡ�������û�ȡ���г�Ա�����ķ���ʱ��ֻ�Ὣ
 *�����ж���ķ�������������������ȡ��<br>
 *��3.6.2�����ڷ���class.getMethods(Class&lt;?&gt;...parameterTypes)��ȡָ�������б�ĺ���������parameterType
 *�����ֱ�ʾ����(1)(new Class[]{String.class,int.class})  (2)(String.class,int.class)�����к��������б�
 *����Ͷ����е�˳����������ͬ�����򽫱�����<br>

 *��3.7��class.getFields():����Field[]��Ա�����������飬��ø���������Ȩ��Ϊpublic�ĳ�Ա���������÷���
 *��������ϵ�У����˴˻�ȡpublic�ĳ�Ա���������л�ȡָ�������������Ա��������ȡ���г�Ա��������ȡ
 *ָ�����������������͵ĳ�Ա������<br>
 *��3.7.1��ע�⵱���û�ȡpublic�ĳ�Ա�����ķ���ʱ����ͬʱ�������г�Ա������ȡ�������û�ȡ���г�Ա�����ķ���ʱ��ֻ�Ὣ
 *�����ж���ĳ�Ա������ȡ��<br>
 
 *��3.8��class.getClasses()������Class[]���飬��ȡȨ��Ϊpublic���ڲ��ࡣ���÷�����������ϵ�У�����
 *�˻�ȡpublic���ڲ��࣬���л�ȡ�������͵��ڲ��ࡿ<br>
 *��3.9��class.getDeclaringClass()������Class���󣬵���������������������һ����ĳ�Ա�������ø÷�����
 *�����ڲ��࣬�÷�����������ڲ������������ⲿ�������λ�ã�����������಻����һ����ĳ�Ա���������һ����
 *���顢ԭʼ���͡�void���ú���������null����<br><br>
 */
public class ClassTest{
	static int a=3;
	static public int b=3;
	AnnotationTest anno=new AnnotationTest();
	public ClassTest(){};
	public ClassTest(String s){System.out.println("ʹ�ô���public String���캯����");}
	@SuppressWarnings("unused")
	private ClassTest(int p){}{System.out.println("ʹ�ô���private int���캯����");}
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
		  	//System.out.println("��ʵ�ֵĽӿڣ���");
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
