package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 * <p>（1）焦点事件FocusEvent：事件名【FocusEvent，将光标焦点离开一个组件或者将光标焦点返回该组件】，事
 *                                  件源【Component以及派生类】，监听接口【FocusListener】
 *  <p>（2）添加或删除监听器：component.addFocusListener( listenerObj )，component.removeFocusListener( listenerObj )<br><br>
 * <p>（3）焦点事件监听器 FocusListener：<br>
 *                     （3.1）自定义焦点监听器类实现 FocusListener接口，class MyListener implements FocusListener；
 *                                实现类内方法 public void focusLost(FocusEvent e)【失去焦点事件】和
 *                                public void focusGained(FocusEvent e)【获得焦点事件】<br>
 *                      （3.2）也可通过 add(new FocusListener{}) 实现匿名内部类，为组件添加焦点事件监听器<br>
 *                      （3.3）注意：focusLost 和 focusGained 两个方法体中不能同时有弹窗的代码，否则两个弹窗交替出现形成
 *                      死循环，无法结束<br><br>
 *
 */
public class FocusEventTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FocusEventTest() {
		setSize(250,100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		getContentPane().setLayout(new FlowLayout());

		final JLabel label = new JLabel("标签");
		getContentPane().add(label);
		JTextField jt=new JTextField("请单击其他文本框",10);
		JTextField jt2=new JTextField("请单击我",10);
		cp.add(jt);
		cp.add(jt2);
		jt.addFocusListener(new FocusListener(){
			//组件失去焦点时调用的方法 
			public void focusLost(FocusEvent arg0) {
				JOptionPane.showMessageDialog(null, "文本框失去焦点");
			}
			//组件获取键盘焦点时调用的方法
			public void focusGained(FocusEvent arg0) {
				System.out.println("文本框获得焦点");
				//JOptionPane.showMessageDialog(null, "文本框获得焦点");
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new FocusEventTest();
	}

}

