package swing;
import java.awt.*;
import java.net.*;

import javax.swing.*;

/**<p>��1������ͼƬͼ��ImageIcon��<br>
 *               ��1.1������JLabel����<br>
 *               ��1.2��ͨ��ImageIconʵ������ת��ΪIcon����Icon i=new ImageIcon( Image image/URL url/String filename )<br>
 *                ��1.3��Ȼ�� label.setIcon(i)��ΪJLabel���ͼƬͼ��<br><br>
 *<p>��2��ImageIcon���ʹ�ã�public ImageIcon��Image image/URL url/String filename��
 *                                String description����image/url/filename��ͼƬԴ����description
 *                                ��ͼƬ����/�������������ͼ����(��ͨ��getDescription()��ȡ����)����
 *                                ������������ѡ������<br><br>
 *<p>��3��Image���ǳ����࣬������ʵ������ֻ��ͨ������ת��<br><br>
 * <p>��4��ͼƬ·�� URL���ʹ�ã�URL url= ��������.class.getResource("ͼƬ����·��/ͼƬ���·��")<br><br>
 * <p>��5������ͼ��͸���ԣ�label.setOpaque(boolean)��boolean��true��͸��/false͸������
 *                          Opaque��ad.��͸���ġ�
 *
 */
public class JlabelImageIcon extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JlabelImageIcon() {
		Container container = getContentPane();
		container.setBackground(Color.red);
		// ����һ����ǩ
		JLabel jl = new JLabel("����һ��JFrame����", JLabel.CENTER);
		jl.setBounds(200, 100, 300, 100);
		// ��ȡͼƬ���ڵ�URL
		URL url = JlabelImageIcon.class.getResource("imageButton.jpg");
		Icon icon= new ImageIcon(url,"�ְ�"); // ʵ����Icon����
		jl.setIcon(icon); // Ϊ��ǩ����ͼƬ
		// �������ַ����ڱ�ǩ�м�
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true); // ���ñ�ǩΪ��͸��״̬
    	setLayout(null);
		container.add(jl); // ����ǩ��ӵ�������
		setSize(250, 100); // ���ô����С
		setVisible(true); // ʹ����ɼ�
		// ���ô���ر�ģʽ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new JlabelImageIcon(); // ʵ����MyImageIcon����
	
	}
}
