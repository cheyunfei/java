package Enum_Generics;

import java.util.ArrayList;
import java.util.List;

/**
* @author cloud<br>
* @version 2019年5月28日上午10:54:02<br><br>
* 
*<b>（0）在泛型没有出现之前，Java也提供了对Object的引用“任意化”操作，即对Object引用进行向下转型或向上转型，但有些强制转换的错误，编译的时候
*不会被捕捉，运行的时候会出错，所以这种方法不安全。所以在此提供了泛型机制。</b>
*
*<pre>
*  Object obj;
*  obj = new Boolean(true);    //向上转型
*  Boolean b = (Boolean)obj;   //向下转型，但是有时候不安全，错误产生 ClassCastException 异常
*</pre>
*
*<b>（1）泛型：泛型类名称&lt;T&gt;，T代表某个还未定的类型名</b>
*<pre>
*      /**
*       * Generics：泛型类名
*       * T：某个还未确定的类型名，注意这个 T 不是固定的，可以是任何标识符，比如 J 
*       * t.setT(new Boolean(true));   产生一个Boolean对象，期间不需要向上转型
*       * t.getT();                    返回一个Boolean对象，期间不需要向下转型
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
*（1.1）使用泛型将不会产生 ClassCastException 异常，因为在编译器中就可以依据对象创建过程定义的具体类型名，来判断之后 setT 的类是否匹配。<br>
*（1.2）可以声明多个类型： public class Test&lt;T1,T2&gt;; Test&lt;Boolean,Float&gt; t = new Test&lt;Boolean,Float&gt;();<br><br>
*（1.3）定义泛型类，类中可声明泛型类数组：public class Test&lt;T&gt;; private T[] tArray;<br>
*（1.3.1）但是 private T[] tArray = new T[10]; 这种直接建立数组的实例是错误的，因为 T 的具体类型没法确定，所需空间更是不能确定，也就没法分配
*空间，实例化。<br><br>
*
*（1.4）声明集合类容器中的泛型类：public class Test&lt;K,V&gt;; Map&lt;K,V&gt; t = new Test&lt;K,V&gt;();<br>
*（1.4.1）其实Java中的集合框架都已经实现了泛型化，即可以直接使用 Map&lt;Boolean,Float&gt; t = new Test&lt;Boolean,Float&gt;();<br>
*（1.4.2）常用的被泛型化的集合类：ArrayList&lt;E&gt;  HashMap&lt;K,V&gt;  HashSet&lt;E&gt;  Vector&lt;E&gt; <br><br>
*
*
*
*<b>（2）泛型的高级用法</b><br>
*<b>（2.1）限制泛型可用类型：class 泛型类名&lt;T extends anyClass&gt;</b><br>
*（2.1.1）限制可用来实例化的类型范围<br>
*（2.1.2）anyClass ：类或接口<br>
*（2.1.3）当不使用 extends 限制时，默认 Object 类下的所有子类都可以实例化泛型类对象<br><br>
*
*<b>（2.2）使用类型通配符：</b><br>
*（2.2.1）在创建一个泛型类对象时：Generics&lt;? extends ArrayList&gt; a = new Generics&lt;AL2&gt;(); 限制这个类型是某个类的子类，或是某个接口的实现。
*比如 ？必须是 Father 类的子类；？必须是 Father 接口的实现。这里 Generics 同样也可以声明为 public class Generics&lt;T extends List&gt;，只不过
*前后两者的差距仅是，前者只对实例化进行了一次限制（创建对象 的时候），后者对实例化进行了两次限制（ 定义类 / 创建对象 的时候）。
*<pre>
*	public class Generics&lt;T&gt;{
*		class AL2 extends ArrayList{
*		public AL2() {
*			super();
*		}
*	  }
*	}
*</pre>
*（2.2.2）将该限制放置在方法参数中：public void S(A&lt;? extends Father&gt; a); 限制这个方法参数的实现类型是某个类的子类，或是某个接口的实现。比如 ？必须是 Father 类的子类；？必须是 Father 接口的实现<br>
*（2.2.3）方法参数如果是这种特殊情况：public void S(A&lt;? extends Father&gt; a); 限制这个方法参数的实现类型是 Object 的子类<br>
*（2.2.4）这里注意使用通配符声明的泛型对象不能添加信息；只能读取，删除信息<br>
*<pre>
*	List&lt;String&gt; ls = new List&lt;String&gt;();
*	ls.add("添加元素");
*   
*	List&lt;?&gt; ls2 = ls;
*	ls2.get(0);
*	ls2.remove(0);
*	ls2.add("添加元素2"); //这里是错误的
*</pre> 
*
*<b>（2.3）泛型类型向上限制，之前讨论的都是泛型向下限制，泛型还可以向上限制：A&lt;? super anyClass&gt; a = null;</b><br>
*（2.3.1）a 只能接受 anyClass 接口，或者 anyClass 类，或者 anyClass 父类<br> 
*（2.3.2）注意这里的向上限制也仅仅适用于创建对象时限制，不能用于类声明时的限制<br><br>
*
*<b>（2.4）泛型类的继承</b><br>
*（2.4.1）子类继承泛型类或实现泛型接口，可以在声明的时候保留父类或接口的泛型类型<br>
*<pre>
*		public class Class&lt;T1&gt;{}
*		public interface Inter&lt;T2&gt;{}
*		public class SubClass&lt;T1,T2,T3&gt; extends Class&lt;T1&gt; implements Inter&lt;T2&gt;{}
*</pre>
*
*（2.4.2）如果继承泛型类或实现泛型接口时，没有指明泛型类型，则子类中所有泛型自动变为 Object 类，而不再是泛型类型，
*如下将来对 T1，T2，T3 操作的时候就必然会出现向下转型的问题，不安全；而不再有原来不需要转型的便利了。<br>
*<pre>
*		/* 这里 Generics 中的 T1，T2 都将变为 Object 类
*		 * 如下面这句：Object s2 = a; a 本身已经变为 Object 类
*		 * 如下面这句：T s = (T)a; a 已经自动变为 Object 类，所以需要赋值给 T 类型，需要进行一次强制转换才可以
*		 * 如下面方法：getT()， 返回 a ，则方法返回类型必是 Object
*		 * 如下面方法：get()，如要返回 T 类型，必须强制转换为 T ，再也不像之前一样，默认就是 T
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
		l1.add("添加元素");
		List<?> l2 = l1;
		//l2.add("? 泛型添加元素");     //这个操作错误，? 泛型不能添加，
		System.out.println(l2.get(0)); // ? 泛型查询成功
		l2.remove(0);
		
		try {
			String s = (String)l2.get(0);
			System.out.println("删除失败");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("删除成功 : " + e); // ? 泛型删除成功
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
