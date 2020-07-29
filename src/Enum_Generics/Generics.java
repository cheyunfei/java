package Enum_Generics;

import java.util.ArrayList;
import java.util.List;

/**
* @author cloud<br>
* @version 2019��5��28������10:54:02<br><br>
* 
*<b>��0���ڷ���û�г���֮ǰ��JavaҲ�ṩ�˶�Object�����á����⻯������������Object���ý�������ת�ͻ�����ת�ͣ�����Щǿ��ת���Ĵ��󣬱����ʱ��
*���ᱻ��׽�����е�ʱ�������������ַ�������ȫ�������ڴ��ṩ�˷��ͻ��ơ�</b>
*
*<pre>
*  Object obj;
*  obj = new Boolean(true);    //����ת��
*  Boolean b = (Boolean)obj;   //����ת�ͣ�������ʱ�򲻰�ȫ��������� ClassCastException �쳣
*</pre>
*
*<b>��1�����ͣ�����������&lt;T&gt;��T����ĳ����δ����������</b>
*<pre>
*      /**
*       * Generics����������
*       * T��ĳ����δȷ������������ע����� T ���ǹ̶��ģ��������κα�ʶ�������� J 
*       * t.setT(new Boolean(true));   ����һ��Boolean�����ڼ䲻��Ҫ����ת��
*       * t.getT();                    ����һ��Boolean�����ڼ䲻��Ҫ����ת��
*       <i>*</i>/
*       public class Generics&lt;T&gt;{
*       	private T t;
*       	
*       	public void setT(T t){ this.t = t; }
*       
*       	public T getT(){ return t; }
*       	
*       	public static void main(String[] args) {
*       		Generics&lt;Boolean&gt; t = new Generics&lt;Boolean&gt;();
*       		t.setT(new Boolean(true));
*       		t.setT(true);
*       		Boolean b = t.getT();
*       	} 
*       }
*</pre>
*��1.1��ʹ�÷��ͽ�������� ClassCastException �쳣����Ϊ�ڱ������оͿ������ݶ��󴴽����̶���ľ��������������ж�֮�� setT �����Ƿ�ƥ�䡣<br>
*��1.2����������������ͣ� public class Test&lt;T1,T2&gt;; Test&lt;Boolean,Float&gt; t = new Test&lt;Boolean,Float&gt;();<br><br>
*��1.3�����巺���࣬���п��������������飺public class Test&lt;T&gt;; private T[] tArray;<br>
*��1.3.1������ private T[] tArray = new T[10]; ����ֱ�ӽ��������ʵ���Ǵ���ģ���Ϊ T �ľ�������û��ȷ��������ռ���ǲ���ȷ����Ҳ��û������
*�ռ䣬ʵ������<br><br>
*
*��1.4�����������������еķ����ࣺpublic class Test&lt;K,V&gt;; Map&lt;K,V&gt; t = new Test&lt;K,V&gt;();<br>
*��1.4.1����ʵJava�еļ��Ͽ�ܶ��Ѿ�ʵ���˷��ͻ���������ֱ��ʹ�� Map&lt;Boolean,Float&gt; t = new Test&lt;Boolean,Float&gt;();<br>
*��1.4.2�����õı����ͻ��ļ����ࣺArrayList&lt;E&gt;  HashMap&lt;K,V&gt;  HashSet&lt;E&gt;  Vector&lt;E&gt; <br><br>
*
*
*
*<b>��2�����͵ĸ߼��÷�</b><br>
*<b>��2.1�����Ʒ��Ϳ������ͣ�class ��������&lt;T extends anyClass&gt;</b><br>
*��2.1.1�����ƿ�����ʵ���������ͷ�Χ<br>
*��2.1.2��anyClass �����ӿ�<br>
*��2.1.3������ʹ�� extends ����ʱ��Ĭ�� Object ���µ��������඼����ʵ�������������<br><br>
*
*<b>��2.2��ʹ������ͨ�����</b><br>
*��2.2.1���ڴ���һ�����������ʱ��Generics&lt;? extends ArrayList&gt; a = new Generics&lt;AL2&gt;(); �������������ĳ��������࣬����ĳ���ӿڵ�ʵ�֡�
*���� �������� Father ������ࣻ�������� Father �ӿڵ�ʵ�֡����� Generics ͬ��Ҳ��������Ϊ public class Generics&lt;T extends List&gt;��ֻ����
*ǰ�����ߵĲ����ǣ�ǰ��ֻ��ʵ����������һ�����ƣ��������� ��ʱ�򣩣����߶�ʵ�����������������ƣ� ������ / �������� ��ʱ�򣩡�
*<pre>
*	public class Generics&lt;T&gt;{
*		class AL2 extends ArrayList{
*		public AL2() {
*			super();
*		}
*	  }
*	}
*</pre>
*��2.2.2���������Ʒ����ڷ��������У�public void S(A&lt;? extends Father&gt; a); �����������������ʵ��������ĳ��������࣬����ĳ���ӿڵ�ʵ�֡����� �������� Father ������ࣻ�������� Father �ӿڵ�ʵ��<br>
*��2.2.3����������������������������public void S(A&lt;? extends Father&gt; a); �����������������ʵ�������� Object ������<br>
*��2.2.4������ע��ʹ��ͨ��������ķ��Ͷ����������Ϣ��ֻ�ܶ�ȡ��ɾ����Ϣ<br>
*<pre>
*	List&lt;String&gt; ls = new List&lt;String&gt;();
*	ls.add("���Ԫ��");
*   
*	List&lt;?&gt; ls2 = ls;
*	ls2.get(0);
*	ls2.remove(0);
*	ls2.add("���Ԫ��2"); //�����Ǵ����
*</pre> 
*
*<b>��2.3�����������������ƣ�֮ǰ���۵Ķ��Ƿ����������ƣ����ͻ������������ƣ�A&lt;? super anyClass&gt; a = null;</b><br>
*��2.3.1��a ֻ�ܽ��� anyClass �ӿڣ����� anyClass �࣬���� anyClass ����<br> 
*��2.3.2��ע���������������Ҳ���������ڴ�������ʱ���ƣ���������������ʱ������<br><br>
*
*<b>��2.4��������ļ̳�</b><br>
*��2.4.1������̳з������ʵ�ַ��ͽӿڣ�������������ʱ���������ӿڵķ�������<br>
*<pre>
*		public class Class&lt;T1&gt;{}
*		public interface Inter&lt;T2&gt;{}
*		public class SubClass&lt;T1,T2,T3&gt; extends Class&lt;T1&gt; implements Inter&lt;T2&gt;{}
*</pre>
*
*��2.4.2������̳з������ʵ�ַ��ͽӿ�ʱ��û��ָ���������ͣ������������з����Զ���Ϊ Object �࣬�������Ƿ������ͣ�
*���½����� T1��T2��T3 ������ʱ��ͱ�Ȼ���������ת�͵����⣬����ȫ����������ԭ������Ҫת�͵ı����ˡ�<br>
*<pre>
*		/* ���� Generics �е� T1��T2 ������Ϊ Object ��
*		 * ��������䣺Object s2 = a; a �����Ѿ���Ϊ Object ��
*		 * ��������䣺T s = (T)a; a �Ѿ��Զ���Ϊ Object �࣬������Ҫ��ֵ�� T ���ͣ���Ҫ����һ��ǿ��ת���ſ���
*		 * �����淽����getT()�� ���� a ���򷽷��������ͱ��� Object
*		 * �����淽����get()����Ҫ���� T ���ͣ�����ǿ��ת��Ϊ T ����Ҳ����֮ǰһ����Ĭ�Ͼ��� T
*		 <i>*</i>/
*		class A&lt;T&gt;{ T a; }
*
*		public class Generics&lt;T,P&gt; extends A{
*			P b;
*			public void set(T a,P b) { this.a = a; this.b = b; }
*
*			public Object getT() { return a; }
*
*			public T get() {
*				Object s2 = a;				
*				T s = (T)a;
*				return s;
*			}
*		}
*</pre>
*/
public class Generics<T extends List> {
	
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	static class AL2 extends ArrayList{
		public AL2() {
			super();
		}
	}
	
	
	public static void main(String[] args) {
		Generics<ArrayList> tArray = new Generics<ArrayList>();
		tArray.setT(new ArrayList());
		ArrayList al = tArray.getT();
		
		Generics<? extends ArrayList> a = null;
		a = new Generics<AL2>();
		
		Generics<? super ArrayList> b = null;
		b = new Generics<List>();
		
		List<String> l1 = new ArrayList<String>();
		l1.add("���Ԫ��");
		List<?> l2 = l1;
		//l2.add("? �������Ԫ��");     //�����������? ���Ͳ�����ӣ�
		System.out.println(l2.get(0)); // ? ���Ͳ�ѯ�ɹ�
		l2.remove(0);
		
		try {
			String s = (String)l2.get(0);
			System.out.println("ɾ��ʧ��");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("ɾ���ɹ� : " + e); // ? ����ɾ���ɹ�
		}
	}
}

//class A<T>{
//	T a;
//}
//public class Generics<T,P> extends A{
//	P b;
//	public void set(T a,P b) {
//		this.a = a;
//		this.b = b;
//	}
//
//	public Object getT() {
//		return a;
//	}
//
//	public T get() {
//		Object s2 = a;
//		T s = (T)a;
//		return s;
//	}
//	
//	public static void main(String[] args) {
//		Generics<String,Float> k = new Generics<String,Float>();
//		k.set("fuck", 23.3f);
//		System.out.println(k.get());
//	}
//}
