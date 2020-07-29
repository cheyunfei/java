package swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 * <p>（1）文本框：构造方法public JTextField(String text,int fieldwidth)，text【程序初始化之后，未对文本框
 *             编辑前出现的文字】，fieldwidth【文本框的长度】，这两个参数可以视情况取舍或都不加，而
 *             通过后面的步骤通过类内方法设置<br><br>
 *<p>（2） 文本框对应的方法：<br>
 *                            （2.1）text.addActionListener()【为文本框添加事件监听器，当光标焦点落于此文本框，
 *                             并按下 Enter 键时触发监听器】<br><br>
 *                             （2.2）text.setText(string)【设置文本框中的文字为 string】<br>
 *                             （2.3）text.getText()【获取文本框中的文本】<br>
 *                             （2.4）text.requestFocus()【将光标焦点返回到 text 对象对应的文本框中】<br>
 *                             （2.5）text.setCaretColor(Color.red)【设置光标颜色】【这个方法不用学习】<br>
 *                             （2.6）text.setEditable(boolean)【设置文本框是否可编辑，true可编辑/false不可编辑】<br><br>
 *                             （2.7）text.setFont(new Font(String type,int style,int size))，type【字体，"宋体"/"楷体"...
 *                                                计算机上有的就可以用】，style【样式，Font.BOLD 粗体/Font.ITALIC 斜体
 *                                                /Font.PLAIN 普通样式】，size【字号】<br><br>
 *                             （2.8）text.setForeground(Color.red)【设置文本框中文字颜色】<br>
 *                            （2.9）text.setBackground(Color.green)【设置文本框背景颜色】<br>
 * <p>（3）字体设置：字体类Font，Font  f=new Font(String type,int style,int size)，type【字体，"宋体"/"楷体"...计
 *                 算机上有的就可以用】，style【样式，Font.BOLD 粗体/Font.ITALIC 斜体/Font.PLAIN 普通样
 *                 式】，size【字号】<br><br>
 * <p>（4）文本框的此构造方法在特殊需要时学习：public JTextField(Document docModel,String text,int fieldwidth)
 *                             
 *
 */
public class JTextFieldTest extends JFrame{
	
	public JTextFieldTest(){
		setSize(250,100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		getContentPane().setLayout(new FlowLayout());
		final JTextField jt=new JTextField("aaa",20);
		jt.setFont(new Font("楷体",Font.PLAIN,16));
		jt.setForeground(Color.red);
		jt.setBackground(Color.green);
		final JTextField jt2=new JTextField("aaa",20);
		final JButton jb=new JButton("清除");
		cp.add(jt);cp.add(jt2);
		cp.add(jb);
		jt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成方法存根
				jt.setText("触发事件");
			}
		});
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(jt.getText());  
				jt.setText("");
				jt.requestFocus();
			}
		});	
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldTest();
	}
}

