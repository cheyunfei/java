package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class JDialogExample extends JDialog { /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// 创建新类继承JDialog类

	public JDialogExample(JDialogJFrame frame) {
		// 实例化一个JDialog类对象，指定对话框的父窗体、窗体标题和类型
		super(frame, "第一个JDialog窗体", true);
		Container container =getContentPane(); // 创建一个容器
		container.add(new JLabel("这是一个对话框")); // 在容器中添加标签
		setBounds(120, 120, 100, 100); // 设置对话框窗体大小
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	}
}

/**
 *<p>（1）对话框 JDialog 窗体的创建：必须继承 JDialog，或直接创建 JDialog 对象，
 *                                         super(JFrame, String, boolean)，或JDialog  j=new JDialog
 *                                         (JFrame, String, boolean)，其中String和Boolean可以有选择
 *                                         性的加或不加<br>
 *        （1.1）JFrame【指定的父窗体】，String【JDialog显示的标题】，boolean【true
 *                                          表示此对话框出现时不能在其他窗口操作 / false 表示此对话框出现
 *                                          时能切换到其他窗口操作】<br>
 *           （1.2）对话框的其他特性设置和窗体的设置基本一样<br>
 * <p>（2）在窗体类A中设置对话框B，【new B( A.this )，其中 A.this 表示 B 的父类窗口是 A】
 * <p>（3）JDialog同样要创建容器对象：	Container container = j . getContentPane() ; container.add(组件);
 * <p>（4）消息提示框：类似于对话框，只不过消息提示框已具备一个“确定”按钮<br>
 *                 （4.1）JOptionPane.showMessageDialog(Component parentComponent,Object message)
 *                                      【显示一个消息提示框】，parentComponent【选择此提示框的父组件，
 *                                      即类似对话框选择其对应的父窗体，如果选择JFrame（此消息提示框会出
 *                                      现在父窗体所在位置的中间）/如果选择JButton（此消息提示框会出现在
 *                                      父按钮所在位置的中间），如果选择 null ，则提示框取缺省父窗体，提示框
 *                                      显示在屏幕正中央】，message【选择此提示框需要提示的内容，内容不限，
 *                                      可以是String、Button、Icon、URL（显示一个路径字符串）、Container
 *                                      （容器）.........的对象】<br>
 *              （4.2）将多个 JOptionPane.showMessageDialog 消息提示框连续放在同一个按钮监听器中时【或者同一个
 *                    语句块中】，只有关闭一个时下一个才会显示<br>
 *
 */
public class JDialogJFrame extends JFrame { 

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// 创建新类

	public static void main(String args[]) {
		new JDialogJFrame (); // 实例化JDialogExample类对象
	}
	
	public JDialogJFrame() {
		Container container = getContentPane(); // 创建一个容器
		container.setLayout(null);
		JLabel jl = new JLabel("这是一个JFrame窗体"); // 在窗体中设置标签
		// 将标签的文字置于标签中间位置
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("弹出对话框"); // 定义一个按钮
		bl.setBounds(10, 10, 100, 21);
		bl.addActionListener(new ActionListener() { // 为按钮添加鼠标单击事件
					public void actionPerformed(ActionEvent e) {
						System.out.println("输出动作："+e);
						// 使MyJDialog窗体可见
						new JDialogExample(JDialogJFrame.this).setVisible(true);
					}
				});
		container.add(bl); // 将按钮添加到容器中
		container.setBackground(Color.white);
		setSize(200, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
