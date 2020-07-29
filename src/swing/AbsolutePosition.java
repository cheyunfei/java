package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

/**
 * <p>��1�����þ��Բ��֣���ȡ�����ֹ���������frame.setLayout(null) �� Container.setLayout(null)��
 *                     ��Ϊ JFrame �� Container �����࣬��Ȼ JFrame �ͼ̳��� Container �еķ��� setLayout<br><br>
 * <p>��2��Ӳ��ָ������������ڵ�λ�ã�setBounds��x , y , width , height������x��y��λ�ã�
 *                                               �� width , height����С
 */
public class AbsolutePosition extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AbsolutePosition() {
		setTitle("������ʹ�þ��Բ���"); // ���øô���ı���
		setLayout(null); // ʹ�ô���ȡ�����ֹ���������
		setBounds(0, 0, 200, 150); // ���Զ�λ�����λ�����С
		Container c = getContentPane(); // ������������
		URL url = AbsolutePosition.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);
		JButton b1 = new JButton(icon); // ������ť
		JButton b2 = new JButton("��ť2"); // ������ť
		b1.setBounds(20, 20, 100, 60); // ���ð�ť��λ�����С
		b2.setBounds(60, 70, 100, 20);
		c.add(b1); // ����ť��ӵ�������
		c.add(b2);
		setVisible(true); // ʹ����ɼ�
		// ���ô���رշ�ʽ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new AbsolutePosition();
	}
}
