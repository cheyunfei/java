package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

/**
 * <p>（1）设置绝对布局（即取消布局管理器）：frame.setLayout(null) 或 Container.setLayout(null)，
 *                     因为 JFrame 是 Container 的子类，当然 JFrame 就继承了 Container 中的方法 setLayout<br><br>
 * <p>（2）硬性指定组件在容器内的位置：setBounds（x , y , width , height），（x，y）位置，
 *                                               （ width , height）大小
 */
public class AbsolutePosition extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AbsolutePosition() {
		setTitle("本窗体使用绝对布局"); // 设置该窗体的标题
		setLayout(null); // 使该窗体取消布局管理器设置
		setBounds(0, 0, 200, 150); // 绝对定位窗体的位置与大小
		Container c = getContentPane(); // 创建容器对象
		URL url = AbsolutePosition.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);
		JButton b1 = new JButton(icon); // 创建按钮
		JButton b2 = new JButton("按钮2"); // 创建按钮
		b1.setBounds(20, 20, 100, 60); // 设置按钮的位置与大小
		b2.setBounds(60, 70, 100, 20);
		c.add(b1); // 将按钮添加到容器中
		c.add(b2);
		setVisible(true); // 使窗体可见
		// 设置窗体关闭方式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new AbsolutePosition();
	}
}
