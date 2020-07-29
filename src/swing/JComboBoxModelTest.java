package swing;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

/**
 * <p>��һ�������б��������������ֳ��õļ򵥹��췽��<br>
 *         <p>��1��public JComboBox��ComboBoxModel dataModel����<br>
 *            ��1.1���Զ����� MyJComboBox ��Ҫ�̳���AbstractListModel���������ýӿ�ComboBoxModel��
 *            ��class MyComboBox extends AbstractListModel&lt;ObjectType&gt; implements ComboBoxModel
 *               &lt;ObjectType&gt;����&lt;ObjectType&gt;������ָ����ʱ�����б���������ʲô���͵����ݣ�����
 *               &lt;String&gt;�������ַ�����&lt;Integer&gt;���������֡����Դ˴�����MyJComboBox��������ת��
 *               Ϊ ComboBoxModel �ӿ����ͣ�Ȼ����Ϊ�� JComboBox ���췽���Ĳ���<br>
 *             ��1.2���������� MyJComboBox ��ʵ�ֽӿ� ComboBoxModel �еķ�������public void setSelectedItem(Object item)����
 *                                    �������������б���е�ѡ�������public Object getSelectedItem()�������ѡ���
 *                                       ������Objectָ�����������б�����Ҫ��ʾ��ѡ�����ڵĶ��󣬱����������
 *                                       String[]��Integer[].....�ȵ�<br>
                ��1.3������ MyJComboBox ��ʵ�ֳ�����AbstractListModel�еķ�������int getSize()������ȡ�б��ȡ���
 *                          ��public Object getElementAt(int index)����ָ���±괦��ֵ��<br>
 *             ��1.4��Ȼ�󴴽�MyJComboBox����MyComboBox cb=new MyComboBox()<br>
 *             ��1.5��Ȼ���б��ʵ������JComboBox&lt;ObjectType&gt; jcb = new JComboBox&lt;&gt;(cb)������
 *                                      ��������б������<br>
 *              ��1.6�����ӣ�<br>
 *              class MyComboBox extends AbstractListModel&lt;String&gt; implements ComboBoxModel&lt;String&gt; {<br>
 *                                                                          String selecteditem = "���б�༭���ʼֵ����Ϊnull���༭��Ϊ��";<br>
 *                                                                          String[] test = { "���֤", "����֤", "ѧ��֤", "����֤" };<br>
 *                                                                          public String getElementAt(int index) {return test[index];}<br>
 *                                                                          public int getSize() {return test.length;}<br>
 *                                                                          public void setSelectedItem(Object item) {selecteditem = (String) item;}<br>
 *                                                                          public Object getSelectedItem() {return selecteditem;}<br>
 *                                                                          }<br><br>
 * <p>��2��public JComboBox��Object[] arrayData��:<br>
 *             ��2.1��Object[]Ϊ������󣬱��� String[] arrayDate={��������};<br>
 *             ��2.2��JComboBox&lt;Object&gt; jcb=new JComboBox&lt;&gt;(arrayDate)�����˴��������б����<br><br>
 * <p>��3��public JComboBox������<br>
 *             ��3.1��JComboBox&lt;Object&gt; jcb=new JComboBox&lt;&gt;()�����������б�Ķ���<br>
 *             ��3.2��jcb.setModel(ComboBoxModel aModel)��ͨ���������������б��Ӧ�� ComboBoxModel �࣬ͬ��
 *                           һ�����췽���е�����һ��<br>
 * <p>��4��public JComboBox��Vector vt��<br>
 *                 ��4.1��Vector&lt;Object&gt; vt=new Vector&lt;&gt;()��Vector��ʵ������һ���ɱ䳤���飬ʹ�� Object ָ
 *                            ������Ԫ���������͡�<br>
 *                 ��4.2��vt.add(obj1)��vt.add(obj2).......����Vector�����ѡ�<br>
 *                 ��4.3��JComboBox&lt;Object&gt; jcb=new JComboBox&lt;&gt;(vt)�������б�����<br><br>
 * <p>������ע�����<br>
 * <p> ��1��Ϊ�����б����Ӷ����¼�������ActionListener�������б���ѡ��һ��ʱ���������¼�������<br>
 * <p> ��2�� ��̬��Ϊ�����б���������Ŀ��Jcombobox.addItem(String s)��ע�ⲻ�ܶ��Ѿ����������
 *                                                �����б��ʹ�����������<br>
 * <p> ��3��JComboBox.setToolTipText("�����б�")��Ϊ�����б�����˵�����֣�����ƶ��������б�
 *          ������λ��ʱ�Ż���֡�<br>
 * <p> ��4������&lt; ObjectType &gt;Ϊʲô����������ʽ�Ĵ��룬�μ�  ����  ��֪ʶ��<br>
 * <p>��5����������ݸı�ʱ��ʹ�� obj.updateUI() ���Լ�ʱˢ��������Է���Ϣ����ʱ�ڽ��������ɵĴ���<br>
 */
public class JComboBoxModelTest extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a=0;
	MyComboBox cb=new MyComboBox();
	JComboBox<String> jc1 = new JComboBox<>(cb);
	
	Integer[] number={1,2,3,4};
	JComboBox<Integer> jc2=new JComboBox<>(number);
	
	String[] sex={"null","��","Ů"};
	JComboBox<String> jc3=new JComboBox<>(sex);
	
	Vector<Integer> vt=new Vector<>();
	JComboBox<Integer> jc4=new JComboBox<>(vt);
	
	JComboBox<String> jc5=new JComboBox<String>();
	
	JLabel jl = new JLabel("��ѡ��֤��:");
	
	public JComboBoxModelTest() {
		Container cp = getContentPane();
		cp.setLayout(null);
		
		jc1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				vt.add(23);
				jc4.updateUI();
				System.out.println(cb.getIndex()+cb.selecteditem);
			}
		});
		jc1.setToolTipText("�����б�");
		jc1.setBounds(20, 50, 100, 30);
		jc2.setBounds(20, 100, 100, 30);
		jc3.setBounds(20, 150, 100, 30);
		jc4.setBounds(20, 200, 100, 30);
		jc5.addItem("1");jc5.addItem("2");jc5.addItem("3");jc5.setBounds(20,250,100,30);
		cp.add(jl);cp.add(jc1);cp.add(jc2);cp.add(jc3);cp.add(jc4);cp.add(jc5);
		
		setSize(new Dimension(160, 400));
		setVisible(true);
		setTitle("�ڴ��������������б��");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JComboBoxModelTest();
	}
}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String selecteditem = "�Ҳ�";
	String[] test = { "���֤", "����֤", "ѧ��֤", "����֤" };
	
	public String getElementAt(int index) {
		return test[index];
	}
	
	public int getSize() {
		return test.length;
	}
	
	public void setSelectedItem(Object item) {
		selecteditem = (String) item;
	}
	
	public Object getSelectedItem() {
		return selecteditem;
	}
	
	public int getIndex() {
		for (int i = 0; i < test.length; i++) {
			if (test[i].equals(getSelectedItem()))
				return i;
		}
		return 0;
	}
}
