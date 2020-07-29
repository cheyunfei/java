package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class JDialogExample extends JDialog { /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// ��������̳�JDialog��

	public JDialogExample(JDialogJFrame frame) {
		// ʵ����һ��JDialog�����ָ���Ի���ĸ����塢������������
		super(frame, "��һ��JDialog����", true);
		Container container =getContentPane(); // ����һ������
		container.add(new JLabel("����һ���Ի���")); // ����������ӱ�ǩ
		setBounds(120, 120, 100, 100); // ���öԻ������С
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	}
}

/**
 *<p>��1���Ի��� JDialog ����Ĵ���������̳� JDialog����ֱ�Ӵ��� JDialog ����
 *                                         super(JFrame, String, boolean)����JDialog  j=new JDialog
 *                                         (JFrame, String, boolean)������String��Boolean������ѡ��
 *                                         �Եļӻ򲻼�<br>
 *        ��1.1��JFrame��ָ���ĸ����塿��String��JDialog��ʾ�ı��⡿��boolean��true
 *                                          ��ʾ�˶Ի������ʱ�������������ڲ��� / false ��ʾ�˶Ի������
 *                                          ʱ���л����������ڲ�����<br>
 *           ��1.2���Ի���������������úʹ�������û���һ��<br>
 * <p>��2���ڴ�����A�����öԻ���B����new B( A.this )������ A.this ��ʾ B �ĸ��ര���� A��
 * <p>��3��JDialogͬ��Ҫ������������	Container container = j . getContentPane() ; container.add(���);
 * <p>��4����Ϣ��ʾ�������ڶԻ���ֻ������Ϣ��ʾ���Ѿ߱�һ����ȷ������ť<br>
 *                 ��4.1��JOptionPane.showMessageDialog(Component parentComponent,Object message)
 *                                      ����ʾһ����Ϣ��ʾ�򡿣�parentComponent��ѡ�����ʾ��ĸ������
 *                                      �����ƶԻ���ѡ�����Ӧ�ĸ����壬���ѡ��JFrame������Ϣ��ʾ����
 *                                      ���ڸ���������λ�õ��м䣩/���ѡ��JButton������Ϣ��ʾ��������
 *                                      ����ť����λ�õ��м䣩�����ѡ�� null ������ʾ��ȡȱʡ�����壬��ʾ��
 *                                      ��ʾ����Ļ�����롿��message��ѡ�����ʾ����Ҫ��ʾ�����ݣ����ݲ��ޣ�
 *                                      ������String��Button��Icon��URL����ʾһ��·���ַ�������Container
 *                                      ��������.........�Ķ���<br>
 *              ��4.2������� JOptionPane.showMessageDialog ��Ϣ��ʾ����������ͬһ����ť��������ʱ������ͬһ��
 *                    �����С���ֻ�йر�һ��ʱ��һ���Ż���ʾ<br>
 *
 */
public class JDialogJFrame extends JFrame { 

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// ��������

	public static void main(String args[]) {
		new JDialogJFrame (); // ʵ����JDialogExample�����
	}
	
	public JDialogJFrame() {
		Container container = getContentPane(); // ����һ������
		container.setLayout(null);
		JLabel jl = new JLabel("����һ��JFrame����"); // �ڴ��������ñ�ǩ
		// ����ǩ���������ڱ�ǩ�м�λ��
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("�����Ի���"); // ����һ����ť
		bl.setBounds(10, 10, 100, 21);
		bl.addActionListener(new ActionListener() { // Ϊ��ť�����굥���¼�
					public void actionPerformed(ActionEvent e) {
						System.out.println("���������"+e);
						// ʹMyJDialog����ɼ�
						new JDialogExample(JDialogJFrame.this).setVisible(true);
					}
				});
		container.add(bl); // ����ť��ӵ�������
		container.setBackground(Color.white);
		setSize(200, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
