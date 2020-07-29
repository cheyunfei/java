package swing;

import java.awt.*;

import javax.swing.*;

/**
 * <p>��1�����ñ߽粼�ֹ���������Ĭ������´��岼��ģʽ�Ǳ߽粼�֣�frame.setLayout ( new BorderLayout()
 * )���Ὣ��������Ϊ�����������С�5������<br>
 * 
 * <p>��2����������container.add ( Component object , String border )��object����Ҫ��ӵ��������
 *                  border���������λ�ã�BorderLayout.EAST/����BorderLayout.SOUTH/�ϣ�BorderLayout.WEST/����
 *                    BorderLayout.NORTH/����BorderLayout.CENTER/�С���<br>
 *      ��2.1������ border ������������ String���� BorderLayout.EAST ������� String ���͵����ݣ���
 *                 String border=BorderLayout.EAST��ע��û��˫����
 */
public class BorderLayoutPosition extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ��������ڷ�λ�õ�����
	String[] border = { BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST,
			BorderLayout.EAST };
	String[] buttonName = { "center button", "north button", "south button", "west button", "east button" };

	public BorderLayoutPosition() {
		setTitle("�������ʹ�ñ߽粼�ֹ�����");
		Container c = getContentPane(); // ����һ������
		setLayout(new BorderLayout()); // ��������Ϊ�߽粼�ֹ�����
		for (int i = 0; i < border.length; i++) {
			// ����������Ӱ�ť�������ð�ť����
			c.add(new JButton(buttonName[i]),border[i]);
		}
		setSize(350, 200); // ���ô����С
		setVisible(true); // ʹ�������
		// ���ô���رշ�ʽ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BorderLayoutPosition();
	}
}
