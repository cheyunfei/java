package swing;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;


/**
 * <p>��1���ı��򣺹��췽��  public JTextArea(String text,int rows,int columns)��text�������ʼ�����ı���δ
 *             ����ǰ��ʾ���ı����ݡ���rows���ı���ĳ�����columns���ı����ʼ��������text��
 *             (rows,columns)������������ȡ�ᣬ������ȫ���ӣ���֮��ͨ�����ڷ�������<br><br>
 * <p>��2���ı����Ӧ�ķ�����<br>
 *                     ��2.1��JTextArea���еķ���ͬJTextField���еĴ󲿷ַ�����ͬ���μ���JTextFieldTest��
 *                                          �ķ���˵��<br>
 *                      ��2.2��area.setLineWrap(boolean)�������ı����Ƿ�����Զ����У�Ĭ�� false ���Զ����С�<br><br>
 * <p>��3�����ı�����ӹ�������JTextArea  ta=new JTextArea()<br>
 *                                 JScrollPane  js=new JScrollPane(ta)<br>
 *                                 container.add(js)<br><br>
 *
 */
public class JTextAreaTest extends JFrame{

	public JTextAreaTest(){
		setSize(200,300);
		setTitle("�����Զ����е��ı���");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		JTextArea jt=new JTextArea("�ı���",6,6);
		jt.addFocusListener(new FocusListener(){
			      public void focusGained(FocusEvent e){
			    	  jt.setText(null);
			      }
			      public void focusLost(FocusEvent e){
			    	  jt.setText("��������");
			      }
		});
		JScrollPane  js=new JScrollPane(jt);
		jt.setLineWrap(true);//�����Զ�����
		cp.add(js);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
}
