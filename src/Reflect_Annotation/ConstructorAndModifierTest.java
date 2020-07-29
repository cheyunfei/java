package Reflect_Annotation;
/**
*@author:cloud<br>
*@date:2019��5��26������11:03:50<br>
*@class:reflect.ConstructorTest.java<br><br>
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @author �Ʒ�<br><br>
 *��1��Constructor�ࣺ�����޹��췽����ͨ�������ȡclass.getConstructor()���ο�ClassTest���е�ע�⡿<br>
 *��1.1��con.newInstance(Object...args)������һ��ԭ����ʵ����ͨ��ָ�����������б���һ������Ķ������δ���ò������ʾ����Ĭ��
 *�޲ι��췽����<br>
 *��1.2��con.setAccessible(boolean flag)������ù��캯����Ȩ��Ϊprivate��Ĭ�ϲ�����ͨ����������newInstance
 *�����������������ִ�и÷�����������Ϊtrue����ôprivate�Ĺ��캯���Ϳ���ʹ��newInstance��������<br>
 *��1.3��con.getModifiers()����øù��췽�������õ����η�����public���������������ͨ���鿴Դ����Է���
 *Modifier�ཫһ��int��ÿ��λbite����һ�����η��������һλΪ1��public��0����public���÷���Ҳ�����ڳ�Ա��������
 *��Ա�����ϡ�<br>
 *
 *��2��Modifier�ࣺ����ֻ��һ���޲ι��� ����������ͨ��������Constructor��Field��Method��Class����Ȼ��
 * ������Щ���е�getModifier()����������ȡ���η���������ֵ������ͨ��һ������ֵ��λʾ�����б���ʾһ����
 * �η��б�0��ʾ�޸����η���1��ʾ�и����η����� 0x00000001��ʾpublic��0x00000002��ʾprivate<br>
 *��2.0��int mod=constructor.getModifier();
 *��2.1��Modifier.isPublic(mod)������boolean���鿴�Ƿ�public���Σ���Ϊtrue����Ϊflase����������
 *isProtected(mod)��isPrivate(mod)��isStatic(mod)��isFinal(mod)��<br>
 *��2.2��Modifier.toString(mod)������String����mod������������б����ַ�����ʽ���<br><br>
 *
 */
public class ConstructorAndModifierTest {
	static public final int a=2;
	public ConstructorAndModifierTest(){System.out.println("�޲ι��췽����");}
	public ConstructorAndModifierTest(String s,int i){
		System.out.println("�����б�String ��int ��"+s+" ��"+i);
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
		System.out.println("�ó�Ա����a�������б�Ϊ��"+embellish);
	}

}
