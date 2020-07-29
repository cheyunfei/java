/**
 * @author   :MSI-NB
 * @version  :2020年7月21日
 * @see      :collection
 */
package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

/**
 *一、Vector 类实现一个动态数组：主要用在事先不知道数组的大小，或者只是需要一个可以改变大小的数组的情况<br>
 *（1）Vector 是同步访问的<br>
 *（2）Vector 包含许多传统的方法，这些方法不属于集合框架<br>
 *（3）Vector 实现的接口 Serializable、Cloneable、Iterable&lt;E&gt;、Collection&lt;E&gt;、List&lt;E&gt;<br>
 *（4）Vector 子类 Stack<br><br>
 *
 *二、Vector构造方法：默认下标从 <b>0</b> 开始<br>
 *（1）Vector v = new Vector()，如果不添加具体类型，如（2）所示，那么 v 默认存储 Object 类型，即可以存储任何类型，包括基本类型和复合类型<br>
 *（2）Vector&lt;T&gt; v = new Vector&lt;T&gt;()，默认容量为 10，增量为 10；即未规定增量的情况下增量大小等于初始容量大小<br>
 *（3）Vector&lt;T&gt; v = new Vector&lt;T&gt;(int size)，创建初始容量为 size 的向量，增量为 size；即未规定增量的情况下增量大小等于初始容量大小<br>
 *（4）Vector&lt;T&gt; v = new Vector&lt;T&gt;(int size, int incr)，创建初始容量的为 size 的向量，增量为 incr<br>
 *（5）Vector v = new Vector(Collection&lt;? extends E&gt; c)，创建一个包含集合 <b>c</b> 元素的向量<br>
 *（6）Vector&lt;T&gt; v = new Vector&lt;T&gt;(Collection&lt;? extends E&gt; c)，创建一个包含集合 <b>c</b> 元素的指定类型的向量<br><br>
 *
 *三、Vector 实现的方法：<br>
 *（1）v.add(int index, Object element)：向指定位置 index 插入指定的元素 element<br>
 *（2）boolean b = v.add(Object element)：向末尾插入指定的元素 element，返回 boolean 值表示是否添加成功<br>
 *（3）v.addElement(Object element)：向末尾插入指定的元素 element<br>
 *（4）int i = v.capacity()：获取当前向量的容量，即当前向量总空间<br>
 *（5）int i = v.size()：获取已添加的元素数目，即当前向量被占用的空间<br>
 *（6）int i = v.capacity()：获取当前向量的容量，即当前向量总空间<br>
 *（7）Object obj = v.lastElement()：获取最后一个元素<br> 
 *（8）Object[] oarr = v.toArray()：返回向量的 Object 数组形式<br>
 *（9）T[] oarr = v.toArray(T[] a)：返回向量的 T 数组形式，并将转换后的数组同时存储在 oarr 和 a 两个数组当中<br>
 *（10）v.setSize(int newSize)：重设向量大小，即容量不变，被占用空间变化，相当于截取保留部分向量<br>
 *（11）v.trimToSize()：重设向量容量，使容量等于向量大小，一般为了避免每次添加向量总要扩容，所以一般容量大于向量<br><br>
 *
 */

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(10);
		for(int i=0;i<16;i++) {
			v.add(new Integer(i));
		}
		System.out.println(v.size()+" "+v.capacity());
		v.setSize(5);
		v.trimToSize();
		System.out.println(v.size()+" "+v.capacity());
		
		Enumeration<Integer> s = v.elements();
		while(s.hasMoreElements()) {
			System.out.print(s.nextElement());
		}
		System.out.println();
		
		
		Integer[] k = new Integer[5];
	    Integer[] p=v.toArray(k);
		for(int i=0;i<v.size();i++) {
			System.out.print(p[i]+" ");
		}
		for(int i=0;i<v.size();i++) {
			System.out.print(k[i]+" ");
		}
		System.out.println();
		
		
		List<String> l=new ArrayList<>();
		l.add("sf");l.add("sfee");l.add("ssdf");
		Vector<String> v2 = new Vector<String>(l);
		for(int i=0;i<v2.size();i++) {
			System.out.print(v2.get(i)+" ");
		}
	}

}
