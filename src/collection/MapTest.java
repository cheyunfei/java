package collection;

/**
 *一、Map集合：<br>
 *  1、Map集合中存储的是键值对，键不能重复，值可以重复<br>
 *  2、根据键得到值，对map集合遍历时先得到键的set集合，对set集合进行遍历，得到相应的值<br>
 *  3、Map集合的方法：
 *  （3.1）V put(K key,V value)：可以使用该方法添加多次相同的key值；但是新添加的value值会覆盖旧的value，并且该方法返回值为旧的value；
 *            如果执行该方法之前没有该键值对就返回null<br>
 *  （3.2）putAll(Map&lt;? extends K,? extends V&gt; m)：从指定映射中将所有映射关系复制到此映射中（可选操作）<br>
 *  （3.3）remove()：删除关联对象，指定key对象<br>
 *  （3.4）clear()：清空集合对象<br>
 *  （3.5）value get(key)：可以用于判断键是否存在的情况。当指定的键不存在的时候，返回的是null<br>
 *  （3.6）isEmpty()：长度为0返回true否则false<br>
 *  （3.7）containsKey(Object key)：判断集合中是否包含指定的key<br>
 *  （3.8）containsValue(Object value)：判断集合中是否包含指定的value<br>
 *  （3.9）size()：map集合长度<br><br>
 *  
 *二、Map集合的两个实现：HashMap，TreeMap<br>
 *  1、HashMap：<br>
 *  （1.1）数组方式存储key/value，线程非安全，允许null作为key和value<br>
 *  （1.2）key不可以重复，value允许重复，不保证元素迭代顺序是按照插入时的顺序<br>
 *  （1.3）key的hash值是先计算key的hashcode值，然后再进行计算，每次容量扩容会重新计算所以key的hash值，会消耗资源，要求key必须重写equals和hashcode方法<br>
 *  （1.4）默认初始容量16，加载因子0.75，扩容为旧容量乘2，查找元素快，如果key一样则比较value，如果value不一样，则按照链表结构存储value，就是一个key后面有多个value；<br><br>
 * 2、 TreeMap：<br>
 *  （2.1）基于红黑二叉树的NavigableMap的实现，线程非安全，不允许null，key不可以重复，value允许重复<br>
 *  （2.2）存入TreeMap的元素应当实现Comparable接口或者实现Comparator接口，会按照排序后的顺序迭代元素<br>
 *  （2.3）两个相比较的key不得抛出classCastException。主要用于存入元素的时候对元素进行自动排序，迭代输出的时候就按排序顺序<br><br>

 *
 */
public class MapTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
