package swing;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**<p>��1����������JProgressBar pb=new JProgressBar()<br>
<p>��2������:<br>
   ��2.1��pb.setValue(int value)�������ý���������ֵ��<br>
   ��2.2��pb.setStringPainted(boolean)�������ý������Ƿ���ʾ���Ȱٷֱȣ�Ĭ��false��<br>
  ��2.3��pb.setBounds(x,y,width,heigh)������������Сλ�ã�ע����������ǰ����������Ϊ���Բ��֡�<br>
   */ 
public class JProgressBarTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
