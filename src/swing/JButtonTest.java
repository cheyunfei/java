package swing;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

import javax.swing.*;

/**
 * <p>��1��JButton�Ĺ��췽����public  JButton��String text��Icon icon����text����ť����Ҫ��ʾ�����֡���
 *                             icon����ť����ʾ��ͼ�꡿��text��icon��������ȡ�ᣬ���ֺ�ͼƬ���ص�<br><br>
 * <p>��2���෽�������·������̳���JButton�ĸ���AbstractButton<br>
 *         ��2.1��button.setBounds(x,y,width,height)�����ð���λ�ô�С��<br>
 *         ��2.2��button.setIcon(icon)�����ð�����ͼ�꡿<br>
 *         ��2.3��button.setToolTipText(string)��������ƶ��������ϵ�δ����ʱ��������ʾ����string��<br>
 *         ��2.4��button.setBorderPainted(boolean)�������Ƿ���ʾ��ť�߽硿<br>
 *         ��2.5��button.addActonListener(new ActionListener(){public 
 *                                           void actionPerformed(ActionEvent e) {������} })�������ð�ť��������<br>
 *         ��2.6��button.setHideActionText(boolean)�����ð�ť���º��Ƿ���ʾ��������/���幦���д���ѯ��<br>
 *         ��2.7��button.setEnabled(boolean)�����ð�ť�Ƿ���ã����Ƿ���԰��¡�<br>
 *         ��2.8��button.setText(string)�����ð�ť�����ֱ�ǩ��<br>
 *         ��2.9��button.setMaximumSize( new Dimension( 90,30 ) )�������÷����������ð�ť��ͼƬ��ͬ��С��
 *
 */
public class JButtonTest extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JButtonTest() {
		URL url = JButtonTest.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(3, 2, 5, 5)); // �������񲼾ֹ�����
		Container c = getContentPane(); // ��������
		for (int i = 0; i < 5; i++) {
			// ������ť��ͬʱ���ð�ť������ͼ��
			JButton J = new JButton("button" + i, icon);
			c.add(J); // ����������Ӱ�ť
			if (i % 2 == 0) {
				J.setEnabled(false); // ��������һЩ��ť������
			}
		}
		JButton jb = new JButton(); // ʵ����һ��û��������ͼƬ�İ�ť
		jb.setMaximumSize(new Dimension(90, 30)); // ���ð�ť��ͼƬ��ͬ��С
		jb.setIcon(icon); // Ϊ��ť����ͼ��
		jb.setHideActionText(true);
		jb.setToolTipText("ͼƬ��ť"); // ���ð�ť��ʾΪ����
		jb.setBorderPainted(true); // ���ð�ť�߽粻��ʾ
		jb.addActionListener(new ActionListener() { // Ϊ��ť��Ӽ����¼�
					public void actionPerformed(ActionEvent e) {
						// ����ȷ�϶Ի���
						System.out.println("dsfd");
						JOptionPane.showMessageDialog(new Frame("kagdg"), "�����Ի���");
						//JOptionPane.showMessageDialog(new sdf("xiaojfa"), "kjkj");
					}
				});
		c.add(jb); // ����ť��ӵ�������
		
		setTitle("������������ͼƬ�İ�ť");
		setSize(350, 150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new JButtonTest();
	}
}

class sdf extends JFrame{
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public sdf(String s){
		super(s);
		Container p=getContentPane();
		setSize(200,200);
		setVisible(true);
	}
}