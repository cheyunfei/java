package swing;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;

/**<p>（1）复选框：与单选按钮唯一的不同是，复选框可以进行多选设置
 * <p>（2）复选框：public JCheckBox（Icon icon/String text，boolean checked），icon【只能看见图片，没有方框
 *                  ，但是点击仍可以改变复选框状态，并触发监听器，至于是不是图片挡住了方框有待实验解决】，text【复选
 *                  框旁边的说明文字】，checked【复选框的初始状态，true选中/false未选中】，以上两个参数可以视情况添
 *                  加或彻底不加<br>
 *          （2.1）JCkeckBox.isSelected()【返回boolean类型的值，true此时复选框状态为选中/false此
 *               时复选框状态为未选中】<br><br>
 * <p>（3）复选框添加触发器：点击一次复选框，状态改变一次，触发一次动作触发器<br><br>
 * 
 * 
 */
public class CheckBoxTest extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JTextArea jt=new JTextArea(8,15);
	URL url = CheckBoxTest.class.getResource("imageButton.jpg");
	Icon icon= new ImageIcon(url);
	private JCheckBox jc1=new JCheckBox(icon);
	private JCheckBox jc2=new JCheckBox("2");
	private JCheckBox jc3=new JCheckBox("3");
	public CheckBoxTest(){
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(panel1, BorderLayout.NORTH);
		final JScrollPane scrollPane = new JScrollPane(jt);
		panel1.add(scrollPane);


		c.add(panel2, BorderLayout.SOUTH);
	     panel2.add(jc1);
		jc1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jc1.isSelected())
					jt.append("复选框1被选中\n");
				else
					jt.append("复选框1未被选中\n");
			}
		});

		panel2.add(jc2);
		jc2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jc2.isSelected())
				jt.append("复选框2被选中\n");
			}
		});

		panel2.add(jc3);
		jc3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jc3.isSelected())
				jt.append("复选框3被选中\n");
			}
		});
		
		setSize(300,300);
		setVisible(true);
		setTitle("复选框的使用");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CheckBoxTest();

	}

}