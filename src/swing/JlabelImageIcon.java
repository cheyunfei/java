package swing;
import java.awt.*;
import java.net.*;

import javax.swing.*;

/**<p>（1）创建图片图标ImageIcon：<br>
 *               （1.1）创建JLabel对象<br>
 *               （1.2）通过ImageIcon实例向上转型为Icon对象，Icon i=new ImageIcon( Image image/URL url/String filename )<br>
 *                （1.3）然后 label.setIcon(i)，为JLabel添加图片图标<br><br>
 *<p>（2）ImageIcon类的使用：public ImageIcon（Image image/URL url/String filename，
 *                                String description），image/url/filename【图片源】，description
 *                                【图片描述/描述不会出现在图标上(可通过getDescription()获取描述)】，
 *                                这两个参数有选择的添加<br><br>
 *<p>（3）Image类是抽象类，本身不能实例化，只能通过向上转型<br><br>
 * <p>（4）图片路径 URL类的使用：URL url= 窗体类名.class.getResource("图片绝对路径/图片相对路径")<br><br>
 * <p>（5）设置图标透明性：label.setOpaque(boolean)，boolean【true不透明/false透明】，
 *                          Opaque【ad.不透明的】
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
		// 创建一个标签
		JLabel jl = new JLabel("这是一个JFrame窗体", JLabel.CENTER);
		jl.setBounds(200, 100, 300, 100);
		// 获取图片所在的URL
		URL url = JlabelImageIcon.class.getResource("imageButton.jpg");
		Icon icon= new ImageIcon(url,"爸爸"); // 实例化Icon对象
		jl.setIcon(icon); // 为标签设置图片
		// 设置文字放置在标签中间
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true); // 设置标签为不透明状态
    	setLayout(null);
		container.add(jl); // 将标签添加到容器中
		setSize(250, 100); // 设置窗体大小
		setVisible(true); // 使窗体可见
		// 设置窗体关闭模式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new JlabelImageIcon(); // 实例化MyImageIcon对象
	
	}
}
