package swing;

import java.awt.*;
import javax.swing.*;

/**<p>��1�������֣�����������Ұڷţ�����һ��������һ�аڷţ�Ĭ��ÿ�е��������
 * <p>��2�������ֹ�������FlowLayout flow=new FlowLayout(int alignment,int horizGap,int vertGap)��
 *                       alignment������ڷŶ��뷽ʽ��FlowLayout.LEFT=0/����룬
 *                       FlowLayout.CENTER=1/�м���룬FlowLayout.RIGHT=2/�Ҷ��롿��horizGap
 *                       ��������Ϊ��λָ��������ˮƽ�������vertGap��������Ϊ��λָ�������
 *                       �Ĵ�ֱ�����<br><br>
 *<p>��3�� ���������ֹ�������frame.setLayout(flow)��flow Ϊ FlowLayout �Ķ���
 *
 */
public class FlowLayoutPosition extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlowLayoutPosition() {
		setTitle("������ʹ�������ֹ�����"); // ���ô������
		Container c = getContentPane();
		// ���ô���ʹ�������ֹ�������ʹ����Ҷ��룬�����������֮���ˮƽ����봹ֱ���
		setLayout(new FlowLayout(2, 10, 10));
		for (int i = 0; i < 10; i++) { // ��������ѭ�����10����ť
			c.add(new JButton("button" + i));
		}
		setSize(300, 200); // ���ô����С
		setVisible(true); // ���ô���ɼ�
		// ���ô���رշ�ʽ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FlowLayoutPosition();
	}
}

