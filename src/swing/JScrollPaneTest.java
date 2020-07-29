package swing;

import java.awt.*;

import javax.swing.*;

/**
 * <p>��1��JScrollPane��壺������������壬ֻ�ܷ���һ�������������ʹ�ò��ֹ����������Խ��JPanel
 *                            ���ö��������JScrollPane jp=new JScrollPane(object)��object����Ҫ���
 *                            ��������������󡿣�container.add(jp)����JScrollPane��ӵ�ĳ�������С�
 *<p>��2��JScrollPane ��������һ����� A������������ A ������������壬���� JScrollPane ����"��С��λ��"ʱ��
 *               ������� A �������"��С��λ��"������ JScrollPane �����ã����� JScrollPane ������"��С��λ��"ʱ��
 *                JScrollPane ��"��С��λ��"������� A ���õ�"��С��λ��"
 * 
 * 
 *
 */
public class JScrollPaneTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JScrollPaneTest() {
		Container c = getContentPane(); // ��������
		c.setLayout(null);
		JTextArea ta = new JTextArea(); // �����ı��������
		JScrollPane sp = new JScrollPane(ta); // ����JScrollPane������
		sp.setBounds(20, 20, 200, 100);
		c.add(sp); // ���������ӵ���������
		
		setTitle("�������������ֱ�����");
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JScrollPaneTest();
		
	}
	
}

