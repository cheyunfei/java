package swing;

import java.awt.*;
import java.net.URL;

import javax.swing.*;

/**
 *<p>（1）标签的构造方法：public JLabel( String , Icon ,  aligment )，String【标签中需要显示的文本】，
 *                       Icon【标签中需要显示的图标】，aligment【标签中内容包括文本和图表的对齐方式，“JLabel.CENTER”或“直接创建
 *                       JLabel对象时为 label.setHorizontalAligment(SwingContants.CENTER)”】，
 *                       其中String和Icon可以有选择的添加，两个内容并不重叠，并设置他们的aligment<br><br>
 * <p>（2）使用自建图标类：MyIcon i=new MyIcon( int width , int height ) <br>
 *           （1.1）必须实现Icon接口，接口中的方法都没有方法体，并在类中设置两个变量 width 和 height<br><br>
 *           （1.2）实现Icon接口中的三个方法：<br>
 *           （1.21）public int getIconHeight()【获取需要绘制的图标的高】，同时在<br>
              （1.22）public int getIconWidth()【获取需要绘制的图标的宽】<br>
 *            （1.23）public void paintIcon(Component arg0,Graphics arg1,int x,int y)【
 *                              arg0往图标中添加轻量级组件/arg1调用绘图类/（x , y）绘制的图标左上角
 *                              在容器中的位置(注意不是组件中的位置)】<br>
 *            （注意）实现的方法 paintIcon 中绘制图标【如 arg1.fillOval（x，y， width，height）
 *                              绘制一个位置为（x，y），宽高为（width，height）的实心圆】，如要将
 *                              图标添加到组件中，不要设置x和y，否则会使图标离开组件位置，转而以
 *                              窗口为参考放置到相应位置<br>
 *  <p>（3）设置标签大小位置：label.setBounds( x,y,width,height )，只有先取消窗体的布局管理
 *               器 Container.setLayout(null)，成为绝对布局后再添加标签组件，这时标签设置的大小位置才会起作用
 */
public class JLabelIcon implements Icon { // 实现Icon接口
	private int width; // 声明图标的宽
	private int height; // 声明图标的长
	
	public int getIconHeight() { // 实现getIconHeight()方法
		return this.height;
	}
	
	public int getIconWidth() { // 实现getIconWidth()方法
		return this.width;
	}
	
	public JLabelIcon(int width, int height) { // 定义构造方法
		this.width = width;
		this.height = height;
	}
	
	// 实现paintIcon()方法
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		arg1.fillOval(x,y, width, height); // 绘制一个圆形
	}
	
	public static void main(String[] args) {
		JFrame jf = new JFrame(); // 创建一个JFrame窗口
		Container c = jf.getContentPane();
		c.setLayout(null);
		
		JLabelIcon icon = new JLabelIcon(15, 15);
		// 创建一个标签，并设置标签上的文字在标签正中间
		JLabel j = new JLabel("测试", icon, SwingConstants.CENTER);
		j.setBounds(20, 20, 200, 30);
		
		c.add(j);
		jf.setSize(400,200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
