package swing;

import java.awt.*;

import javax.swing.*;


/**
 * <p>��һ���б��������������б�����������������ۣ��б����������ֱ�ӳ�������ѡ�����Ϊ���ֹ��췽��<br><br>
 *             ��1��public void JList��Object[] listData��<br>
 *                        ��1.1������һ������Object[] listData<br>
 *                        ��1.2��JList&lt;Object&gt; jl=new JList&lt;&gt;(listData)<br><br>
 *            ��2��public void JList��Vector listData��<br>
 *                        ��2.1��Vector&lt;Object&gt; vt=new Vector&lt;&gt;()��Vector��ʵ������һ���ɱ䳤���顿<br>
 *                         ��2.2��vt.add(obj1)��vt.add(obj2).......����Vector�����ѡ�<br>
 *                         ��2.3��JList&lt;Object&gt; jl=new JList&lt;&gt;(vt)�������б����ɡ�<br><br>
 *            ��3��public void JList��ListModel dataModel��<br>
 *                        ��3.1��class MyListModel extends AbstractListModel&lt;Object&gt;���Զ���һ����
 *                                 �̳нӿ� ListModel �ĳ����� AbstractListModel �����ڽӿ��ж���һ������Object[]��ʵ�ֽӿ��е�
 *                               ���� getElementAt( int x )����ȡ������ָ���±괦��ֵ���� getSize()��
 *                               ������鳤�ȡ�<br>
 *                          ��3.2��JList&lt;Object&gt; jl = new JList&lt;&gt;(new MyListModel())������
 *                                 �б�򴴽���ɡ�����ʽ��ʵ���� MylistModel ����ת��Ϊ�ӿ� ListModel<br><br>
 *             ��4��public void JList()<br>
 *                          ��4.1��JList&lt;Object&gt;  jl=new JList&lt;&gt;()<br>
 *                          ��4.2��jl.setListData(Object[] listData/Vector listData)�����÷���ֻ����Object[]/Vector
 *                                 ���������͵����顿<br><br>
 *              ��5��ͨ��ʹ�� DefaultListModel �������б�򣬸�����չ�� AbstractListModel ��������ת��Ϊ ListModel �ӿ�
 *                       ��ʼ���б��<br>
 *                       ��5.1��DefaultListModel&lt;Object&gt; items=new DefaultListModel&lt;&gt;()<br>
 *                       ��5.2��JList&lt;Object&gt; jl=new JList&lt;&gt;( items )<br>
 *                       ��5.3��ͨ������ items.addElement( obj ) ���б���ж�̬���ѡ��<br>
 * <p>���������б���С�Ctrl+������Ŀ�������л���Ŀ��ѡ��״̬���ѡ��״̬��������ѡ�ж����Ŀ��
 *                              ��Shift+������Ŀ������ѡ�д���Ŀ����һ����Ŀ�м��������Ŀ��
 *
 */
public class JListTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JListTest() {
		Container cp = getContentPane();
		
		cp.setLayout(null);
		JList<String> jl = new JList<>(new MyListModel());
		JScrollPane js = new JScrollPane(jl);
		js.setBounds(10, 10, 100, 100);
		
		Integer[] number={1,2,3,4};
		JList<Integer> jc2=new JList<>(number);
		jc2.setBounds(200, 10, 100, 50);
		
		cp.add(js);cp.add(jc2);
		setTitle("�����������ʹ�����б��");
		setSize(400, 150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new JListTest();
	}
}

class MyListModel extends AbstractListModel<String> {
	
	
	private String[] contents = { "�б�1", "�б�2", "�б�3", "�б�4", "�б�5", "�б�6" };
	
	public String getElementAt(int x) {
		if (x < contents.length)
			return contents[x++];
		else
			return null;
	}
	
	public int getSize() {
		return contents.length;
	}
}
