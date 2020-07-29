package collection;

import java.util.*;

/**
 * 
 <table id="mytable" border="1" style="border-color:red;">
<caption><b>list��set��map�Ա�</b></caption>
<thead>
<tr class="header">
<th>�ӿ�</th>
<th>�ӽӿ�</th>
<th>�Ƿ�����</th>
<th>�Ƿ�����Ԫ���ظ�</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>Collection��</td>
<td>������������������</td>
<td>��</td>
<td>��</td>
</tr>
<tr class="even">
<td>List ����</td>
<td>ArrayList</td>
<td>��</td>
<td>��</td>
</tr>
<tr class="odd">
<td>������������</td>
<td>LinkedList</td>
<td>��</td>
<td>��</td>
</tr>
<tr class="even">
<td>������������</td>
<td>Vector</td>
<td>��</td>
<td>��</td>
</tr>
<tr class="odd">
<td>Set</td>
<td>AbstractSet</td>
<td>��</td>
<td>��</td>
</tr>
<tr class="even">
<td>����</td>
<td>HashSet</td>
<td>��</td>
<td>��</td>
</tr>
<tr class="odd">
<td>����</td>
<td>TreeSet</td>
<td>�ǣ��ö�����������</td>
<td>��</td>
</tr>
<tr class="even">
<td>Map</td>
<td>AbstractMap</td>
<td>��</td>
<td>ʹ��key-value��ӳ��ʹ洢���ݣ�key����Ψһ��value�����ظ�</td>
</tr>
<tr class="odd">
<td>����</td>
<td>HashMap</td>
<td></td>
<td>��</td>
</tr>
<tr class="even">
<td>����</td>
<td>TreeMap</td>
<td>�ǣ��ö�����������</td>
<td>ʹ��key-value��ӳ��ʹ洢���ݣ�key����Ψһ��value�����ظ�</td>
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
		UpdateStu stu1 = new UpdateStu("��ͬѧ", 01011);
		UpdateStu stu2 = new UpdateStu("��ͬѧ", 01021);
		UpdateStu stu3 = new UpdateStu("��ͬѧ", 01051);
		UpdateStu stu4 = new UpdateStu("��ͬѧ", 01012);
		TreeSet<UpdateStu> tree = new TreeSet<>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		Iterator<UpdateStu> it = tree.iterator();
		System.out.println("Set�����е�����Ԫ�أ�");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		it = tree.headSet(stu2).iterator();
		System.out.println("��ȡǰ�沿�ֵļ��ϣ�");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		it = tree.subSet(stu2, stu3).iterator();
		System.out.println("��ȡ�м䲿�ֵļ���");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
	}
}
