package swing;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

import javax.swing.*;

/**
 * <p>（1）JButton的构造方法：public  JButton（String text，Icon icon），text【按钮中需要显示的文字】，
 *                             icon【按钮中显示的图标】，text和icon可以随意取舍，文字和图片不重叠<br><br>
 * <p>（2）类方法：以下方法大多继承自JButton的父类AbstractButton<br>
 *         （2.1）button.setBounds(x,y,width,height)【设置按键位置大小】<br>
 *         （2.2）button.setIcon(icon)【设置按键的图标】<br>
 *         （2.3）button.setToolTipText(string)【当鼠标移动到按键上但未按下时，出现提示文字string】<br>
 *         （2.4）button.setBorderPainted(boolean)【设置是否显示按钮边界】<br>
 *         （2.5）button.addActonListener(new ActionListener(){public 
 *                                           void actionPerformed(ActionEvent e) {方法体} })；【设置按钮监听器】<br>
 *         （2.6）button.setHideActionText(boolean)【设置按钮按下后是否显示动作名称/具体功能有待查询】<br>
 *         （2.7）button.setEnabled(boolean)【设置按钮是否可用，即是否可以按下】<br>
 *         （2.8）button.setText(string)【设置按钮的文字标签】<br>
 *         （2.9）button.setMaximumSize( new Dimension( 90,30 ) )【具体用法不明，设置按钮与图片相同大小】
 *
 */
public class JButtonTest extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JButtonTest() {
		URL url = JButtonTest.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(3, 2, 5, 5)); // 设置网格布局管理器
		Container c = getContentPane(); // 创建容器
		for (int i = 0; i < 5; i++) {
			// 创建按钮，同时设置按钮文字与图标
			JButton J = new JButton("button" + i, icon);
			c.add(J); // 在容器中添加按钮
			if (i % 2 == 0) {
				J.setEnabled(false); // 设置其中一些按钮不可用
			}
		}
		JButton jb = new JButton(); // 实例化一个没有文字与图片的按钮
		jb.setMaximumSize(new Dimension(90, 30)); // 设置按钮与图片相同大小
		jb.setIcon(icon); // 为按钮设置图标
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮"); // 设置按钮提示为文字
		jb.setBorderPainted(true); // 设置按钮边界不显示
		jb.addActionListener(new ActionListener() { // 为按钮添加监听事件
					public void actionPerformed(ActionEvent e) {
						// 弹出确认对话框
						System.out.println("dsfd");
						JOptionPane.showMessageDialog(new Frame("kagdg"), "弹出对话框");
						//JOptionPane.showMessageDialog(new sdf("xiaojfa"), "kjkj");
					}
				});
		c.add(jb); // 将按钮添加到容器中
		
		setTitle("创建带文字与图片的按钮");
		setSize(350, 150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new JButtonTest();
	}
}

class sdf extends JFrame{
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public sdf(String s){
		super(s);
		Container p=getContentPane();
		setSize(200,200);
		setVisible(true);
	}
}