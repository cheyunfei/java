package collection;
import java.util.*;


/**
 * 一、集合类：由包 java.util 包导入，集合类与数组不同的是，数组长度固定，集合长度可变；数组用来存放
 *              基本类型的数据，集合用来存放对象的引用，即为对象引用的集合。<br><br>
 *集合类层次结构：常用集合接有 Map集合、Set集合、List集合，Set 和 List 继承了Collection接口，Map、Set、
 *                     List均为接口<br><br>
 * 二、Collection接口中的方法【Set和List及其下属类同样可以使用】:collect 为集合类对象名，Collection集合中的元素允许重复<br>
 *                          collect.add(Object o)【将指定对象添加到集合中】<br>
 *                          collect.remove(Object o)【将制定对象从集合中移除】<br>
 *                          collect.isEmpty()【判断集合是否为空】<br>
 *                          collect.size()【返回 int 值，获取集合中元素个数】<br>
 *                          collect.iterator【返回（Iterator it）对象，即该集合类的迭代器，迭
 *                                              代器可以视作遍历集合的工具或者可以理解为指针】<br><br>
 * 三、迭代器 Iterator：Iterator&lt;String&gt; it = collect.iterator()【创建迭代器，此处泛型的使用参见泛型说明】<br><br>
 * 迭代器中的方法：it.hasNext()【判断集合中是否有下一个元素，即对象，迭代器初始化应该是类似于指向了第一个
 *                              元素的前一个位置，类似于队列遍历开始时指针指向队头，it.hasNext()判断的便是第一个
 *                              元素】<br>
 *                          it.next()【返回（Object o），获取集合中下一个元素，类似于指针的用法 it=it.next 】<br><br>
 *
 */
public class CollectionTest { // 创建类Muster
	public static void main(String args[]) {
	    Collection<String> list = new ArrayList<>(); // 实例化集合类对象
		String s="a";
	    list.add(s); // 向集合添加数据
		list.add("b");
		list.add("c");
		list.remove("a");
		Iterator<String> it = list.iterator(); // 创建迭代器
		while (it.hasNext()) { // 判断是否有下一个元素
			//String str = (String) it.next(); // 获取集合中元素
			System.out.println(it.next());
		}
	}
}

