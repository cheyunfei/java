package Reflect_Annotation;
/**
*@author:cloud<br>
*@date:2019��5��24������5:31:49<br>
*@class:reflect.AnnotationTest.java<br><br>
*/

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 *��1��Annotation���ܣ��������ࡢ���캯������Ա�����������������ȵ������С��ù��ܲ���Ӱ���������У����ǻ��
 *�������ȸ������߲���Ӱ�졣<br><br>
 *��2��Annotation���ͣ�����@interface���Σ�������˼�Ǽ̳���java.lang.annotation.Annotation�ӿ�<br>
 *<pre>
 *    /**
 *     * Annotation������ΪmyAnnotation
 *     * ���а���������Ա���ֱ���Ϊvalue��type��para�����ͷֱ�ΪString��Class��int��ֻ��value��type��Ĭ��ֵ
 *     * ö����ElementType{ANNOTATION_TYPE,FIELD,METHOD,TYPE,CONSTRUCTOR,PARAMETER,LOCAL_VARIABLE,PACKAGE}
 *     * �˴�@Target��ʶ��annotation��������ע��Annotation����Ա������ö�ٳ���
 *     * ö����RetentionPolicy{SOURCE,CLASS,RUNTIME}��SOURCE--&gt;CLASS--&gt;RUNTIME��RUNTIMEΪ���Ч��Χ
 *     * �˴�@Re tention��ʶ��annotationֱ������ʱ����Ч��������ʱ���ظ�Annotation��JVM��
 *     <i>*</i>/ 
 *       <b>@Target</b>({ElementType.ANNOTATION_TYPE,ElementType.FIELD})
 *       <b>@Retention</b>({RetentionPolicy.RUNTIME})
 *       public <b>@interface</b> myAnnotation{
 *           String value() default "default value";
 *           Class type() default void.class;
 *           int para();
 *       }
 *</pre>
 *��2.1��Annotation�����п��õĳ�Ա������String��Class��primitive[ԭʼ]��enumerated[ö��]��annotation���Լ���Щ���͵�����<br>
 *��2.2��Annotation�����еĳ�Ա������Ĭ��ֵ������valueĬ��ֵΪ��default value����<br>
 *��2.3��ö����ElementType�е�ö�ٳ�����������@Target��<br>
 *��2.33��ANNOTATION_TYPE��Annotation��FIELD����Ա������ö�ٳ�����TYPE���ࡢ�ӿڡ�ö�١�Annotation��CONSTRUCTOR�����췽��<br>
 *METHOD��������PARAMETER��������LOCAL_VARIABLE���ֲ�������PACKAGE����<br>
 *��2.333��@Target�������ø�Annotation�������õ�javaԪ�����ࡣ��δ����@Target����ʾ����������Ԫ�أ���Ĭ��Ϊ����Ԫ�ء�<br>
 *��2.4��ö����RetentionPolicy�е�ö�ٳ�����������@Retention��Ĭ��CLASS��<br>
 *��2.44��SOURCE��������Annotation�����ļ��У���Ч��Χ��С��CLASS������Annotation�����ļ��У���������ʱ�����ص�JVM�У�RUNTIME�����벢������ʱ���ص�JVM�У���Χ���<br>
 *��2.444��@Retention�������ø�Annotation���͵���Ч��Χ��<br>
 *��2.5��Annotation�����ָ�ֵ��ʽ��һ��ֻ��һ����Ա��ʹ��"value"���������ж����Աʱ��ʹ�� "name1=value1,name2=value2"<br><br>
 *
 *��3��ʹ��Annotation�е���Ϣ��<br>
 *��3.0���������ø�Annotation��RetentionΪRetentionPolicy.RUNTIME��Ȼ���ڳ�������ʱͨ�������ȡ����Ϣ<br>
 *��3.1��ͨ�������ȡ��Constructor��Field��Method�������߾��̳���AccessibleObject�����̳����������������Ի�ȡ
 *ע�������ϵ�Annotation<br>
 *��3.2��obj.isAnnotationPresent(Class&lt;? extends Annotation&gt; annotationClass)������ֵboolean����Ԫ���Ƿ������ָ�����͵�Annotation<br>
 *��3.3��obj.getAnnotation(Class&lt;Tgt; annotationClass)������ֵΪAnnotation���󣬷���ָ�����͵�Annotation<br>
 *��3.4��obj.getAnnotations()������ֵΪAnnotation[]��������<br>
 *��3.5��obj.getParameterAnnotations()����Method��Constructor�������Ϊ���в�����ӵ�Annotation������Annotation
 *���͵Ķ�ά���鷵�أ�{Annotation�б�1,Annotation�б�2...}��������˳����ͬ��δ���Annotation�Ĳ���Ҳ�����һ��
 *���б������С�<br>
 *��3.6��Annotation���󣺵�ͨ��֮ǰ�ķ�����ȡ��Annotation�����ͨ�����ڵĶ���ķ������Ϳ��Է������ڵĲ���ֵ��<br>
 */

public class AnnotationTest { 
	@myAnnotation(str="thanks",para=2)
	public void function(){}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO �Զ����ɵķ������
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
