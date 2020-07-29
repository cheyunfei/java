package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 * <p>��1�������¼�FocusEvent���¼�����FocusEvent������꽹���뿪һ��������߽���꽹�㷵�ظ����������
 *                                  ��Դ��Component�Լ������ࡿ�������ӿڡ�FocusListener��
 *  <p>��2����ӻ�ɾ����������component.addFocusListener( listenerObj )��component.removeFocusListener( listenerObj )<br><br>
 * <p>��3�������¼������� FocusListener��<br>
 *                     ��3.1���Զ��役���������ʵ�� FocusListener�ӿڣ�class MyListener implements FocusListener��
 *                                ʵ�����ڷ��� public void focusLost(FocusEvent e)��ʧȥ�����¼�����
 *                                public void focusGained(FocusEvent e)����ý����¼���<br>
 *                      ��3.2��Ҳ��ͨ�� add(new FocusListener{}) ʵ�������ڲ��࣬Ϊ�����ӽ����¼�������<br>
 *                      ��3.3��ע�⣺focusLost �� focusGained �����������в���ͬʱ�е����Ĵ��룬��������������������γ�
 *                      ��ѭ�����޷�����<br><br>
 *
 */
public class FocusEventTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FocusEventTest() {
		setSize(250,100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		getContentPane().setLayout(new FlowLayout());

		final JLabel label = new JLabel("��ǩ");
		getContentPane().add(label);
		JTextField jt=new JTextField("�뵥�������ı���",10);
		JTextField jt2=new JTextField("�뵥����",10);
		cp.add(jt);
		cp.add(jt2);
		jt.addFocusListener(new FocusListener(){
			//���ʧȥ����ʱ���õķ��� 
			public void focusLost(FocusEvent arg0) {
				JOptionPane.showMessageDialog(null, "�ı���ʧȥ����");
			}
			//�����ȡ���̽���ʱ���õķ���
			public void focusGained(FocusEvent arg0) {
				System.out.println("�ı����ý���");
				//JOptionPane.showMessageDialog(null, "�ı����ý���");
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new FocusEventTest();
	}

}

