package swing;

import java.awt.*;
import java.net.URL;

import javax.swing.*;

/**
 *<p>��1����ǩ�Ĺ��췽����public JLabel( String , Icon ,  aligment )��String����ǩ����Ҫ��ʾ���ı�����
 *                       Icon����ǩ����Ҫ��ʾ��ͼ�꡿��aligment����ǩ�����ݰ����ı���ͼ��Ķ��뷽ʽ����JLabel.CENTER����ֱ�Ӵ���
 *                       JLabel����ʱΪ label.setHorizontalAligment(SwingContants.CENTER)������
 *                       ����String��Icon������ѡ�����ӣ��������ݲ����ص������������ǵ�aligment<br><br>
 * <p>��2��ʹ���Խ�ͼ���ࣺMyIcon i=new MyIcon( int width , int height ) <br>
 *           ��1.1������ʵ��Icon�ӿڣ��ӿ��еķ�����û�з����壬�������������������� width �� height<br><br>
 *           ��1.2��ʵ��Icon�ӿ��е�����������<br>
 *           ��1.21��public int getIconHeight()����ȡ��Ҫ���Ƶ�ͼ��ĸߡ���ͬʱ��<br>
              ��1.22��public int getIconWidth()����ȡ��Ҫ���Ƶ�ͼ��Ŀ�<br>
 *            ��1.23��public void paintIcon(Component arg0,Graphics arg1,int x,int y)��
 *                              arg0��ͼ����������������/arg1���û�ͼ��/��x , y�����Ƶ�ͼ�����Ͻ�
 *                              �������е�λ��(ע�ⲻ������е�λ��)��<br>
 *            ��ע�⣩ʵ�ֵķ��� paintIcon �л���ͼ�꡾�� arg1.fillOval��x��y�� width��height��
 *                              ����һ��λ��Ϊ��x��y�������Ϊ��width��height����ʵ��Բ������Ҫ��
 *                              ͼ����ӵ�����У���Ҫ����x��y�������ʹͼ���뿪���λ�ã�ת����
 *                              ����Ϊ�ο����õ���Ӧλ��<br>
 *  <p>��3�����ñ�ǩ��Сλ�ã�label.setBounds( x,y,width,height )��ֻ����ȡ������Ĳ��ֹ���
 *               �� Container.setLayout(null)����Ϊ���Բ��ֺ�����ӱ�ǩ�������ʱ��ǩ���õĴ�Сλ�òŻ�������
 */
public class JLabelIcon implements Icon { // ʵ��Icon�ӿ�
	private int width; // ����ͼ��Ŀ�
	private int height; // ����ͼ��ĳ�
	
	public int getIconHeight() { // ʵ��getIconHeight()����
		return this.height;
	}
	
	public int getIconWidth() { // ʵ��getIconWidth()����
		return this.width;
	}
	
	public JLabelIcon(int width, int height) { // ���幹�췽��
		this.width = width;
		this.height = height;
	}
	
	// ʵ��paintIcon()����
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		arg1.fillOval(x,y, width, height); // ����һ��Բ��
	}
	
	public static void main(String[] args) {
		JFrame jf = new JFrame(); // ����һ��JFrame����
		Container c = jf.getContentPane();
		c.setLayout(null);
		
		JLabelIcon icon = new JLabelIcon(15, 15);
		// ����һ����ǩ�������ñ�ǩ�ϵ������ڱ�ǩ���м�
		JLabel j = new JLabel("����", icon, SwingConstants.CENTER);
		j.setBounds(20, 20, 200, 30);
		
		c.add(j);
		jf.setSize(400,200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
