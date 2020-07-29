package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.net.*;



/**
 *<p>（1）单选按钮类：public JRadioButton( String text , Icon icon , boolean selected )，text
 *                                 【按钮旁的说明文字，其实就是选项说明】，icon【按钮图标，默认按钮图标是
 *                                   一个圆圈，选中时圈中出现一个点则为选中，而此icon可以将默认按钮图标
 *                                   替换为icon指定的图片，当给 icon 赋值 null 时，则按钮图标又会返回默认的圆圈】，
 *                                   selected【确定程序初始化的时候选项的状态，true
 *                                   /表示选项初始化为选中状态，false/表示选项初始化为未选中状态】,这三个参
 *                                   数可以视情况添加或彻底不加，然后在后续过程中通过方法设置<br>
 *      （1.1）JRadiobutton.isSelected()【返回一个Boolean数值，true/表示按钮此时的状态为
 *                                  选中，false/表示按钮此时的状态为未选中】<br>
 *<p>（2）单选按钮的使用：单选按钮只有两种状态，选中或者未选中<br><br>
 *<p>（3）单选按钮组的使用：单选按钮在未加入按钮组之前每个按钮都是单独无关的，使用ButtonGroup
 *                              group=new ButtonGroup()，group.add(单选按钮)，将单选按钮加入到
 *                              按钮组中，则该组中同时仅有一个单选按钮可以被选中，其他的为未选中<br><br>
 *<p>（4）按钮的添加：将所有按钮添加到按钮组中保证了选中唯一性，当要把按钮添加到容器中（比如窗口中），
 *                   必须使用 container.add( 单选按钮 )【也就是使用容器对象单独添加，而不能通过容器对象
 *                   添加按钮组，如 container.add（group）就是错误的】<br><br>
 * <p>（5）当往容器中添加的单选按钮不止一个时，必须把窗口 JFrame 的布局管理器改为流布局管理
 *           器Flow【或者绝对布局Absolute，网格布局管理器Grid】，因为窗口默认的布局管理器是
 *           边界布局管理器，分为东西南北中，默认所有按钮添加到中部，多个按钮会重叠，出现错
 *           误<br><br>
 * <p>（6）按钮动作：给某一按钮添加动作监听器<br>
                  （6.1）当单选按钮未加入按钮组中，点击一次该按钮，按钮的状态改变一次，触发一次动作监听器<br>
                 （6.2）当单选按钮加入按钮组中，如果点击该按钮一次可以触发监听器，即使选中后重复点击也会
                    触发，但是如果选中其他单选按钮，该按钮状态自动改变为未选中状态（false），此种情况下的状态改
 *                  变不触发该按钮的动作监听器，即只有直接点击按钮才会触发动作监听器<br><br>
 */
public class JRadioButtonTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int p=0;
	JRadioButtonTest(String s){
		super(s);
		Container c=getContentPane();
		setLayout(new GridLayout(4,1, 1,1));
		
		JRadioButton j1=new JRadioButton("一只小猪",true);
		URL url=JRadioButtonTest.class.getResource("imageButton.jpg");
		Icon i=new ImageIcon(url);
		
		j1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				j1.setIcon(i);
			}
		});
		
		JRadioButton j2=new JRadioButton("一只小狗");
		j2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				j1.setIcon(null);
				if(j2.isSelected()==true)
					System.out.println("true");
				else
					System.out.println("false");
			}
		});
		
		JRadioButton j3=new JRadioButton("一只小鸡");
		JRadioButton j4=new JRadioButton("一只小猫");
		ButtonGroup group=new ButtonGroup();
		group.add(j1);
		group.add(j2);
		group.add(j3);
		group.add(j4);
		c.add(j1);c.add(j2);c.add(j3);c.add(j4);
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new JRadioButtonTest("单选按钮测试程序");
	}

}
