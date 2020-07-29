package swing;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**<p>（1）进度条：JProgressBar pb=new JProgressBar()<br>
<p>（2）方法:<br>
   （2.1）pb.setValue(int value)，【设置进度条进度值】<br>
   （2.2）pb.setStringPainted(boolean)，【设置进度条是否显示进度百分比，默认false】<br>
  （2.3）pb.setBounds(x,y,width,heigh)，【进度条大小位置，注意需在设置前将容器设置为绝对布局】<br>
   */ 
public class JProgressBarTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame j=new JFrame();
		Container s=j.getContentPane();
		JProgressBar pb=new JProgressBar();
		pb.setValue(20);
		pb.setStringPainted(true);
		s.add(pb);
		j.setBounds(20, 20, 150,100);
		j.setVisible(true);
		

	}

}
