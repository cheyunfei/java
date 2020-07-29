package collection;

import java.util.*;

/**
 * 
 <table id="mytable" border="1" style="border-color:red;">
<caption><b>list，set，map对比</b></caption>
<thead>
<tr class="header">
<th>接口</th>
<th>子接口</th>
<th>是否有序</th>
<th>是否允许元素重复</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>Collection　</td>
<td>　　　　　　　　　</td>
<td>否</td>
<td>　</td>
</tr>
<tr class="even">
<td>List 　　</td>
<td>ArrayList</td>
<td>否</td>
<td>是</td>
</tr>
<tr class="odd">
<td>　　　　　　</td>
<td>LinkedList</td>
<td>否</td>
<td>是</td>
</tr>
<tr class="even">
<td>　　　　　　</td>
<td>Vector</td>
<td>否</td>
<td>是</td>
</tr>
<tr class="odd">
<td>Set</td>
<td>AbstractSet</td>
<td>否</td>
<td>否</td>
</tr>
<tr class="even">
<td>　　</td>
<td>HashSet</td>
<td>否</td>
<td>否</td>
</tr>
<tr class="odd">
<td>　　</td>
<td>TreeSet</td>
<td>是（用二叉排序树）</td>
<td>否</td>
</tr>
<tr class="even">
<td>Map</td>
<td>AbstractMap</td>
<td>否</td>
<td>使用key-value来映射和存储数据，key必须唯一，value可以重复</td>
</tr>
<tr class="odd">
<td>　　</td>
<td>HashMap</td>
<td></td>
<td>否</td>
</tr>
<tr class="even">
<td>　　</td>
<td>TreeMap</td>
<td>是（用二叉排序树）</td>
<td>使用key-value来映射和存储数据，key必须唯一，value可以重复</td>
</tr>
</tbody>
</table>
 * 
 *
 */
public class UpdateStu implements Comparable<Object> {
	String name;
	long id;
	public UpdateStu(String name, long id) {
		this.id = id;
		this.name = name;
	}
	public int compareTo(Object o) {
		UpdateStu upstu = (UpdateStu) o;
		int result = id > upstu.id ? 1 : (id == upstu.id ? 0 : -1);
		return result;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		UpdateStu stu1 = new UpdateStu("李同学", 01011);
		UpdateStu stu2 = new UpdateStu("陈同学", 01021);
		UpdateStu stu3 = new UpdateStu("王同学", 01051);
		UpdateStu stu4 = new UpdateStu("马同学", 01012);
		TreeSet<UpdateStu> tree = new TreeSet<>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		Iterator<UpdateStu> it = tree.iterator();
		System.out.println("Set集合中的所有元素：");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		it = tree.headSet(stu2).iterator();
		System.out.println("截取前面部分的集合：");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		it = tree.subSet(stu2, stu3).iterator();
		System.out.println("截取中间部分的集合");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
	}
}
