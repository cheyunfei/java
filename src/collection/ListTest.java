package collection;
import java.util.*;

import javax.swing.JButton;


/**
 * List集合：（1）List集合包括List接口以及List接口的所有实现类<br>
 *                （2）List集合允许元素重复，无序<br>
 *                （3）各元素的顺序就是对象插入的顺序<br>
 *                （4）类似数组，可通过索引访问集合中的元素。<br><br>
 * List类的方法：（1）包含Collection接口中的所有方法<br>
 *                      （2）list.get（int index）【返回值（Object o），返回指定索引位置的对象元素】<br>
 *                      （3）list.set（int index，Object obj）【将指定索引 index 处的对象修改为指定的对象 obj】<br><br>
 *                      （4）list.remove（Object obj/int index）【即List类中移除集合中元素的方法除了直接指定
 *                              移除对象 obj 之外，还可以指定索引位置 index 的对象，在Collection类中只有前者可
 *                              以使用】<br><br>
 * List类的两个实现类：（1）ArrayList【实现可变数组存储，优点：直接索引访问快，缺点：插入等操作费事】<br>
 *                        （1.1）sort方法，如果需要对ArrayList进行排序，只需要调用这个方法，提供Comparator比较器即可<br><br>
 *                    （2）LinkedList【实现链表结构存储，优点：插入等操作快捷，缺点：访问太慢】<br>
 *                        （2.1）对于这个链表，维护了first和last指针，first指向第一个元素，last指向最后一个元素。
 *                                 LinkedList是一个无序的链表，按照插入的先后顺序排序，不提供sort方法对内部元素排序<br><br>
 *                                 
 * 
 *
 */
public class ListTest { // 创建类Gather
	public static void main(String[] args) { // 主方法
		List<String> List4=new ArrayList<>();
		LinkedList<String> list3=new LinkedList<>();
		ArrayList<JButton> list2 = new ArrayList<>();
		
		ArrayList<JButton> list = new ArrayList<>(); // 创建集合对象
		JButton b1=new JButton("9");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		list.add(b1); // 向集合添加元素
		list.add(b2);
		list.add(b3);
		int i = (int) (Math.random() * (list.size() - 1)); // 获得0~1之间的随机数
		System.out.println("随机获取数组中的元素：" + list.get(i).getText());
		list.remove(2); // 将指定索引位置的元素从集合中移除
		System.out.println("将索引是'2'的元素从数组移除后，数组中的元素是：");
		for (int j = 0; j < list.size(); j++) { // 循环遍历集合
			System.out.println(list.get(j).getText());
		}
	}
}

