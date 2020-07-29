/**
 * @author   :MSI-NB
 * @version  :2020��7��21��
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
 *һ��Vector ��ʵ��һ����̬���飺��Ҫ�������Ȳ�֪������Ĵ�С������ֻ����Ҫһ�����Ըı��С����������<br>
 *��1��Vector ��ͬ�����ʵ�<br>
 *��2��Vector ������ഫͳ�ķ�������Щ���������ڼ��Ͽ��<br>
 *��3��Vector ʵ�ֵĽӿ� Serializable��Cloneable��Iterable&lt;E&gt;��Collection&lt;E&gt;��List&lt;E&gt;<br>
 *��4��Vector ���� Stack<br><br>
 *
 *����Vector���췽����Ĭ���±�� <b>0</b> ��ʼ<br>
 *��1��Vector v = new Vector()���������Ӿ������ͣ��磨2����ʾ����ô v Ĭ�ϴ洢 Object ���ͣ������Դ洢�κ����ͣ������������ͺ͸�������<br>
 *��2��Vector&lt;T&gt; v = new Vector&lt;T&gt;()��Ĭ������Ϊ 10������Ϊ 10����δ�涨�����������������С���ڳ�ʼ������С<br>
 *��3��Vector&lt;T&gt; v = new Vector&lt;T&gt;(int size)��������ʼ����Ϊ size ������������Ϊ size����δ�涨�����������������С���ڳ�ʼ������С<br>
 *��4��Vector&lt;T&gt; v = new Vector&lt;T&gt;(int size, int incr)��������ʼ������Ϊ size ������������Ϊ incr<br>
 *��5��Vector v = new Vector(Collection&lt;? extends E&gt; c)������һ���������� <b>c</b> Ԫ�ص�����<br>
 *��6��Vector&lt;T&gt; v = new Vector&lt;T&gt;(Collection&lt;? extends E&gt; c)������һ���������� <b>c</b> Ԫ�ص�ָ�����͵�����<br><br>
 *
 *����Vector ʵ�ֵķ�����<br>
 *��1��v.add(int index, Object element)����ָ��λ�� index ����ָ����Ԫ�� element<br>
 *��2��boolean b = v.add(Object element)����ĩβ����ָ����Ԫ�� element������ boolean ֵ��ʾ�Ƿ���ӳɹ�<br>
 *��3��v.addElement(Object element)����ĩβ����ָ����Ԫ�� element<br>
 *��4��int i = v.capacity()����ȡ��ǰ����������������ǰ�����ܿռ�<br>
 *��5��int i = v.size()����ȡ����ӵ�Ԫ����Ŀ������ǰ������ռ�õĿռ�<br>
 *��6��int i = v.capacity()����ȡ��ǰ����������������ǰ�����ܿռ�<br>
 *��7��Object obj = v.lastElement()����ȡ���һ��Ԫ��<br> 
 *��8��Object[] oarr = v.toArray()������������ Object ������ʽ<br>
 *��9��T[] oarr = v.toArray(T[] a)������������ T ������ʽ������ת���������ͬʱ�洢�� oarr �� a �������鵱��<br>
 *��10��v.setSize(int newSize)������������С�����������䣬��ռ�ÿռ�仯���൱�ڽ�ȡ������������<br>
 *��11��v.trimToSize()����������������ʹ��������������С��һ��Ϊ�˱���ÿ�����������Ҫ���ݣ�����һ��������������<br><br>
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
