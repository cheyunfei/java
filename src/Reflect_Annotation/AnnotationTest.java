package Reflect_Annotation;
/**
*@author:cloud<br>
*@date:2019年5月24日下午5:31:49<br>
*@class:reflect.AnnotationTest.java<br><br>
*/

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 *（1）Annotation功能：可用于类、构造函数、成员变量、方法、参数等的声明中。该功能并不影响程序的运行，但是会对
 *编译器等辅助工具产生影响。<br><br>
 *（2）Annotation类型：需以@interface修饰，隐含意思是继承了java.lang.annotation.Annotation接口<br>
 *<pre>
 *    /**
 *     * Annotation类型名为myAnnotation
 *     * 其中包含三个成员，分别名为value、type、para，类型分别为String、Class、int，只有value、type有默认值
 *     * 枚举量ElementType{ANNOTATION_TYPE,FIELD,METHOD,TYPE,CONSTRUCTOR,PARAMETER,LOCAL_VARIABLE,PACKAGE}
 *     * 此处@Target标识该annotation可以用于注释Annotation；成员变量、枚举常量
 *     * 枚举量RetentionPolicy{SOURCE,CLASS,RUNTIME}，SOURCE--&gt;CLASS--&gt;RUNTIME，RUNTIME为最长有效范围
 *     * 此处@Re tention标识该annotation直至运行时仍有效，即运行时加载该Annotation到JVM中
 *     <i>*</i>/ 
 *       <b>@Target</b>({ElementType.ANNOTATION_TYPE,ElementType.FIELD})
 *       <b>@Retention</b>({RetentionPolicy.RUNTIME})
 *       public <b>@interface</b> myAnnotation{
 *           String value() default "default value";
 *           Class type() default void.class;
 *           int para();
 *       }
 *</pre>
 *（2.1）Annotation类型中可用的成员类型有String、Class、primitive[原始]、enumerated[枚举]、annotation，以及这些类型的数组<br>
 *（2.2）Annotation类型中的成员可以有默认值，如上value默认值为“default value”。<br>
 *（2.3）枚举类ElementType中的枚举常量用来设置@Target。<br>
 *（2.33）ANNOTATION_TYPE：Annotation；FIELD：成员变量、枚举常量；TYPE：类、接口、枚举、Annotation；CONSTRUCTOR：构造方法<br>
 *METHOD：方法；PARAMETER：参数；LOCAL_VARIABLE：局部变量；PACKAGE：包<br>
 *（2.333）@Target用来设置该Annotation类型适用的java元素种类。如未设置@Target，表示适用于所有元素，即默认为所有元素。<br>
 *（2.4）枚举类RetentionPolicy中的枚举常量用来设置@Retention。默认CLASS。<br>
 *（2.44）SOURCE：不编译Annotation到类文件中，有效范围最小；CLASS：编译Annotation到类文件中，但是运行时不加载到JVM中；RUNTIME：编译并且运行时加载到JVM中，范围最大。<br>
 *（2.444）@Retention用来设置该Annotation类型的有效范围。<br>
 *（2.5）Annotation有两种赋值方式：一、只有一个成员，使用"value"；二、当有多个成员时，使用 "name1=value1,name2=value2"<br><br>
 *
 *（3）使用Annotation中的信息：<br>
 *（3.0）必须设置该Annotation的Retention为RetentionPolicy.RUNTIME，然后在程序运行时通过反射获取其信息<br>
 *（3.1）通过反射获取：Constructor、Field、Method，这三者均继承了AccessibleObject，并继承了三个方法，用以获取
 *注释在其上的Annotation<br>
 *（3.2）obj.isAnnotationPresent(Class&lt;? extends Annotation&gt; annotationClass)：返回值boolean，该元素是否添加了指定类型的Annotation<br>
 *（3.3）obj.getAnnotation(Class&lt;Tgt; annotationClass)：返回值为Annotation对象，返回指定类型的Annotation<br>
 *（3.4）obj.getAnnotations()：返回值为Annotation[]对象数组<br>
 *（3.5）obj.getParameterAnnotations()【仅Method、Constructor】：获得为所有参数添加的Annotation，将以Annotation
 *类型的二维数组返回，{Annotation列表1,Annotation列表2...}；与声明顺序相同；未添加Annotation的参数也会添加一个
 *空列表到数组中。<br>
 *（3.6）Annotation对象：当通过之前的方法获取到Annotation对象后，通过其内的定义的方法，就可以访问其内的参数值。<br>
 */

public class AnnotationTest { 
	@myAnnotation(str="thanks",para=2)
	public void function(){}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO 自动生成的方法存根
		AnnotationTest m=new AnnotationTest();
		@SuppressWarnings("rawtypes")
		Class cl=m.getClass();
		Method method=cl.getMethod("function", null);
		Annotation[] annos=method.getAnnotations();
		Annotation[][] anPara=method.getParameterAnnotations();
	    myAnnotation anno=method.getAnnotation(myAnnotation.class);
		String value=anno.str();
		System.out.println(value);
	}

}
