package swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 * <p>（1）密码框：构造方法public JPasswordField(String text,int fieldwidth)，text【程序初始化之后，未对密码框
 *             编辑前出现的文字】，fieldwidth【密码框的长度】，这两个参数可以视情况取舍或都不加，而
 *             通过后面的步骤通过类内方法设置<br><br>
 * <p>（2）密码框对应的方法：<br>
 *                （2.1）JPasswordField类中的方法同JTextField类中的大部分方法相同，参见JTextFieldTest
 *                                      类中方法的说明<br>
 *                （2.2）p.setEchoChar('*')【设置密码框中将文本加密转换后的显示字符，比如这里是
 *                                     字符'*' 】<br>
 *                 （2.3）public char[] getPassword()【将密码以字符数组的形式返回】<br>
 * <p>（3）密码框的此构造方法有特殊需要时学习：public JPasswordField(Document docModel,String text,int fieldwidth)
 *                             
 *
 */
public class JPasswordFieldTest extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPasswordFieldTest(){
		setSize(400,300);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		getContentPane().setLayout(new FlowLayout());
		final JPasswordField jpt=new JPasswordField("aaa",20);
		jpt.setEchoChar('*');
		cp.add(jpt);
		jpt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成方法存根
				System.out.println(jpt.getText());
				jpt.setText("触发事件");
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new JPasswordFieldTest();
	}
}