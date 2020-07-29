package swing;

import java.awt.*;

import javax.swing.*;

/**
 * <p>（1）网格布局管理器：GridLayout grid=new GridLayout(int rows,int columns,int horizGap,int vertGap),
 *                          rows【网格行数】，columns【网格列数】，horizGap【网格间水平间隔】，
 *                          vertGap【网格间垂直间隔】，后两个参数可不加<br><br>
 * <p>（2）添加管理器：frame.setLayout(new GridLayout( 7 , 3 , 5 , 5 ))<br><br>
 * <p>（3）注意：当添加的组件数多于网格布局管理器规定的网格数的时候，网格行数不变，列数随着添加的
 *          组件增加而增多，但组件总是排满一行再排另一行
 *  <p>（4）每个组件都会填满整个网格，改变窗体的大小，组件大小也会改变
 *
 */
public class GridLayoutPosition extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GridLayoutPosition() {
		Container c = getContentPane();
		// 设置容器使用网格布局管理器，设置7行3列的网格
		setLayout(new GridLayout(7, 3, 5, 5));
		for (int i = 0; i < 25; i++) {
			c.add(new JButton("button" + i)); // 循环添加按钮
		}
		setSize(300, 300);
		setTitle("这是一个使用网格布局管理器的窗体");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GridLayoutPosition();
	}
}
