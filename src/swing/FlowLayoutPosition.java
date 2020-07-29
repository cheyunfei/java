package swing;

import java.awt.*;
import javax.swing.*;

/**<p>（1）流布局：组件从左向右摆放，摆满一行在向下一行摆放，默认每行的组件居中
 * <p>（2）流布局管理器：FlowLayout flow=new FlowLayout(int alignment,int horizGap,int vertGap)，
 *                       alignment【组件摆放对齐方式，FlowLayout.LEFT=0/左对齐，
 *                       FlowLayout.CENTER=1/中间对齐，FlowLayout.RIGHT=2/右对齐】，horizGap
 *                       【以像素为单位指定组件间的水平间隔】，vertGap【以像素为单位指定组件间
 *                       的垂直间隔】<br><br>
 *<p>（3） 设置流布局管理器：frame.setLayout(flow)，flow 为 FlowLayout 的对象
 *
 */
public class FlowLayoutPosition extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlowLayoutPosition() {
		setTitle("本窗体使用流布局管理器"); // 设置窗体标题
		Container c = getContentPane();
		// 设置窗体使用流布局管理器，使组件右对齐，并且设置组件之间的水平间隔与垂直间隔
		setLayout(new FlowLayout(2, 10, 10));
		for (int i = 0; i < 10; i++) { // 在容器中循环添加10个按钮
			c.add(new JButton("button" + i));
		}
		setSize(300, 200); // 设置窗体大小
		setVisible(true); // 设置窗体可见
		// 设置窗体关闭方式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FlowLayoutPosition();
	}
}

