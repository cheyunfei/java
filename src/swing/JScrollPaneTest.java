package swing;

import java.awt.*;

import javax.swing.*;

/**
 * <p>（1）JScrollPane面板：带滚动条的面板，只能放置一个组件，不可以使用布局管理器，可以结合JPanel
 *                            放置多个容器，JScrollPane jp=new JScrollPane(object)，object【需要添加
 *                            滚动条的组件对象】，container.add(jp)【将JScrollPane添加到某个容器中】
 *<p>（2）JScrollPane 面板仅接受一个组件 A，所以这个组件 A 会铺满整个面板，当对 JScrollPane 设置"大小与位置"时，
 *               不管组件 A 如何设置"大小与位置"都服从 JScrollPane 的设置；当对 JScrollPane 不设置"大小与位置"时，
 *                JScrollPane 的"大小与位置"服从组件 A 设置的"大小与位置"
 * 
 * 
 *
 */
public class JScrollPaneTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JScrollPaneTest() {
		Container c = getContentPane(); // 创建容器
		c.setLayout(null);
		JTextArea ta = new JTextArea(); // 创建文本区域组件
		JScrollPane sp = new JScrollPane(ta); // 创建JScrollPane面板对象
		sp.setBounds(20, 20, 200, 100);
		c.add(sp); // 将该面板添加到该容器中
		
		setTitle("带滚动条的文字编译器");
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JScrollPaneTest();
		
	}
	
}

