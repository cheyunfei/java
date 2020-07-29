package swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 * <p>（1）动作事件ActionEvent：事件名【ActionEvent】，事件源【JButton、JList、JTextField、
 *                                     JPasswordField....等等】，监听接口【ActionListener】，
 * <p>（2）添加或删除监听器：component.addActionListener( listenerObj )，component.removeActionListener( listenerObj )】<br><br>
 * <p>（3）创建动作事件监听器类<br>
 *                 （3.1）自定义动作监听器类实现 ActionListener 接口： class MyListener implements ActionListener，并实现
 *                        类内方法 public void actionPerformed(ActionEvent e)<br>
                    （3.2）也可以直接使用方法 add(new ActionListener{}) 实现匿名内部类，为组件添加事件监听器，并且要实现类内方法<br><br>
 *
 */
public class ActionEventTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jb=new JButton("我是按钮，单击我");
	public ActionEventTest(){
		setLayout(null);
		setSize(200,100);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		cp.add(jb);
		jb.setBounds(10, 10,100,30);
		jb.addActionListener(new jbAction());
		setVisible(true);
	}
	class jbAction implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			jb.setText("我被单击了");
		}
	}
	public static void main(String[] args) {
		new ActionEventTest();
	}
}

