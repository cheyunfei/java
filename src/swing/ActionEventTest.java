package swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 * <p>��1�������¼�ActionEvent���¼�����ActionEvent�����¼�Դ��JButton��JList��JTextField��
 *                                     JPasswordField....�ȵȡ��������ӿڡ�ActionListener����
 * <p>��2����ӻ�ɾ����������component.addActionListener( listenerObj )��component.removeActionListener( listenerObj )��<br><br>
 * <p>��3�����������¼���������<br>
 *                 ��3.1���Զ��嶯����������ʵ�� ActionListener �ӿڣ� class MyListener implements ActionListener����ʵ��
 *                        ���ڷ��� public void actionPerformed(ActionEvent e)<br>
                    ��3.2��Ҳ����ֱ��ʹ�÷��� add(new ActionListener{}) ʵ�������ڲ��࣬Ϊ�������¼�������������Ҫʵ�����ڷ���<br><br>
 *
 */
public class ActionEventTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jb=new JButton("���ǰ�ť��������");
	public ActionEventTest(){
		setLayout(null);
		setSize(200,100);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		cp.add(jb);
		jb.setBounds(10, 10,100,30);
		jb.addActionListener(new jbAction());
		setVisible(true);
	}
	class jbAction implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			jb.setText("�ұ�������");
		}
	}
	public static void main(String[] args) {
		new ActionEventTest();
	}
}

