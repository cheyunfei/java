package collection;
import java.util.*;

import javax.swing.JButton;


/**
 * List���ϣ���1��List���ϰ���List�ӿ��Լ�List�ӿڵ�����ʵ����<br>
 *                ��2��List��������Ԫ���ظ�������<br>
 *                ��3����Ԫ�ص�˳����Ƕ�������˳��<br>
 *                ��4���������飬��ͨ���������ʼ����е�Ԫ�ء�<br><br>
 * List��ķ�������1������Collection�ӿ��е����з���<br>
 *                      ��2��list.get��int index��������ֵ��Object o��������ָ������λ�õĶ���Ԫ�ء�<br>
 *                      ��3��list.set��int index��Object obj������ָ������ index ���Ķ����޸�Ϊָ���Ķ��� obj��<br><br>
 *                      ��4��list.remove��Object obj/int index������List�����Ƴ�������Ԫ�صķ�������ֱ��ָ��
 *                              �Ƴ����� obj ֮�⣬������ָ������λ�� index �Ķ�����Collection����ֻ��ǰ�߿�
 *                              ��ʹ�á�<br><br>
 * List�������ʵ���ࣺ��1��ArrayList��ʵ�ֿɱ�����洢���ŵ㣺ֱ���������ʿ죬ȱ�㣺����Ȳ������¡�<br>
 *                        ��1.1��sort�����������Ҫ��ArrayList��������ֻ��Ҫ��������������ṩComparator�Ƚ�������<br><br>
 *                    ��2��LinkedList��ʵ������ṹ�洢���ŵ㣺����Ȳ�����ݣ�ȱ�㣺����̫����<br>
 *                        ��2.1�������������ά����first��lastָ�룬firstָ���һ��Ԫ�أ�lastָ�����һ��Ԫ�ء�
 *                                 LinkedList��һ��������������ղ�����Ⱥ�˳�����򣬲��ṩsort�������ڲ�Ԫ������<br><br>
 *                                 
 * 
 *
 */
public class ListTest { // ������Gather
	public static void main(String[] args) { // ������
		List<String> List4=new ArrayList<>();
		LinkedList<String> list3=new LinkedList<>();
		ArrayList<JButton> list2 = new ArrayList<>();
		
		ArrayList<JButton> list = new ArrayList<>(); // �������϶���
		JButton b1=new JButton("9");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		list.add(b1); // �򼯺����Ԫ��
		list.add(b2);
		list.add(b3);
		int i = (int) (Math.random() * (list.size() - 1)); // ���0~1֮��������
		System.out.println("�����ȡ�����е�Ԫ�أ�" + list.get(i).getText());
		list.remove(2); // ��ָ������λ�õ�Ԫ�شӼ������Ƴ�
		System.out.println("��������'2'��Ԫ�ش������Ƴ��������е�Ԫ���ǣ�");
		for (int j = 0; j < list.size(); j++) { // ѭ����������
			System.out.println(list.get(j).getText());
		}
	}
}

