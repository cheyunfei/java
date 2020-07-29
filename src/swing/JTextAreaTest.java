package swing;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;


/**
 * <p>（1）文本域：构造方法  public JTextArea(String text,int rows,int columns)，text【程序初始化，文本域未
 *             编译前显示的文本内容】，rows【文本域的长】，columns【文本域初始行数】，text和
 *             (rows,columns)两组参数视情况取舍，或者完全不加，在之后通过类内方法设置<br><br>
 * <p>（2）文本域对应的方法：<br>
 *                     （2.1）JTextArea类中的方法同JTextField类中的大部分方法相同，参见类JTextFieldTest中
 *                                          的方法说明<br>
 *                      （2.2）area.setLineWrap(boolean)【设置文本域是否可以自动换行，默认 false 不自动换行】<br><br>
 * <p>（3）对文本域添加滚动条：JTextArea  ta=new JTextArea()<br>
 *                                 JScrollPane  js=new JScrollPane(ta)<br>
 *                                 container.add(js)<br><br>
 *
 */
public class JTextAreaTest extends JFrame{

	public JTextAreaTest(){
		setSize(200,300);
		setTitle("定义自动换行的文本域");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		JTextArea jt=new JTextArea("文本域",6,6);
		jt.addFocusListener(new FocusListener(){
			      public void focusGained(FocusEvent e){
			    	  jt.setText(null);
			      }
			      public void focusLost(FocusEvent e){
			    	  jt.setText("输入内容");
			      }
		});
		JScrollPane  js=new JScrollPane(jt);
		jt.setLineWrap(true);//可以自动换行
		cp.add(js);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
}
