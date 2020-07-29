package collection;
import java.util.*;


/**
 * һ�������ࣺ�ɰ� java.util �����룬�����������鲻ͬ���ǣ����鳤�ȹ̶������ϳ��ȿɱ䣻�����������
 *              �������͵����ݣ�����������Ŷ�������ã���Ϊ�������õļ��ϡ�<br><br>
 *�������νṹ�����ü��Ͻ��� Map���ϡ�Set���ϡ�List���ϣ�Set �� List �̳���Collection�ӿڣ�Map��Set��
 *                     List��Ϊ�ӿ�<br><br>
 * ����Collection�ӿ��еķ�����Set��List����������ͬ������ʹ�á�:collect Ϊ�������������Collection�����е�Ԫ�������ظ�<br>
 *                          collect.add(Object o)����ָ��������ӵ������С�<br>
 *                          collect.remove(Object o)�����ƶ�����Ӽ������Ƴ���<br>
 *                          collect.isEmpty()���жϼ����Ƿ�Ϊ�ա�<br>
 *                          collect.size()������ int ֵ����ȡ������Ԫ�ظ�����<br>
 *                          collect.iterator�����أ�Iterator it�����󣬼��ü�����ĵ���������
 *                                              �������������������ϵĹ��߻��߿������Ϊָ�롿<br><br>
 * ���������� Iterator��Iterator&lt;String&gt; it = collect.iterator()���������������˴����͵�ʹ�òμ�����˵����<br><br>
 * �������еķ�����it.hasNext()���жϼ������Ƿ�����һ��Ԫ�أ������󣬵�������ʼ��Ӧ����������ָ���˵�һ��
 *                              Ԫ�ص�ǰһ��λ�ã������ڶ��б�����ʼʱָ��ָ���ͷ��it.hasNext()�жϵı��ǵ�һ��
 *                              Ԫ�ء�<br>
 *                          it.next()�����أ�Object o������ȡ��������һ��Ԫ�أ�������ָ����÷� it=it.next ��<br><br>
 *
 */
public class CollectionTest { // ������Muster
	public static void main(String args[]) {
	    Collection<String> list = new ArrayList<>(); // ʵ�������������
		String s="a";
	    list.add(s); // �򼯺��������
		list.add("b");
		list.add("c");
		list.remove("a");
		Iterator<String> it = list.iterator(); // ����������
		while (it.hasNext()) { // �ж��Ƿ�����һ��Ԫ��
			//String str = (String) it.next(); // ��ȡ������Ԫ��
			System.out.println(it.next());
		}
	}
}

