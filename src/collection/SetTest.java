package collection;

/**
 * 一、Set集合: （1）Set集合由Set接口和Set接口的实现类组成<br>
 *          （2）Set集合中的对象排列没有顺序<br>
 *          （3）不能包含重复对象【例如String，即使字符串字面值相同，但对象不同也是可以的】<br><br>
 *二、Set集合的两个实现：HashSet，TreeSet<br><br>
 *（1）HashSet<br>
 *    （1.1）HashSet是基于HashMap来实现的，更像是对HashMap做了一次“封装”<br>
 *    （1.2）而且只使用了HashMap的key来实现各种特性，而HashMap的value始终都是PRESENT<br><br>
 *（2）TreeSet<br>
 *    （1.1）基于 TreeMap 的 NavigableSet 实现<br>
 *    （1.2）使用元素的自然顺序对元素进行排序，或者根据创建 set 时提供的 Comparator进行排序，具体取决于使用的构造方法。<br><br>
 *   
 *
 */
public class SetTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
