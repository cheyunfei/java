package swing;

import java.awt.*;

import javax.swing.*;

/**
 * <p>（1）设置边界布局管理器：在默认情况下窗体布局模式是边界布局，frame.setLayout ( new BorderLayout()
 * )，会将容器划分为“东南西北中”5个区域<br>
 * 
 * <p>（2）添加组件：container.add ( Component object , String border )，object【所要添加的组件】，
 *                  border【组件所在位置，BorderLayout.EAST/东，BorderLayout.SOUTH/南，BorderLayout.WEST/西，
 *                    BorderLayout.NORTH/北，BorderLayout.CENTER/中】，<br>
 *      （2.1）变量 border 的数据类型是 String，即 BorderLayout.EAST 本身就是 String 类型的数据，即
 *                 String border=BorderLayout.EAST，注意没有双引号
 */
public class BorderLayoutPosition extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 定义组件摆放位置的数组
	String[] border = { BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST,
			BorderLayout.EAST };
	String[] buttonName = { "center button", "north button", "south button", "west button", "east button" };

	public BorderLayoutPosition() {
		setTitle("这个窗体使用边界布局管理器");
		Container c = getContentPane(); // 定义一个容器
		setLayout(new BorderLayout()); // 设置容器为边界布局管理器
		for (int i = 0; i < border.length; i++) {
			// 在容器中添加按钮，并设置按钮布局
			c.add(new JButton(buttonName[i]),border[i]);
		}
		setSize(350, 200); // 设置窗体大小
		setVisible(true); // 使窗体可视
		// 设置窗体关闭方式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BorderLayoutPosition();
	}
}
