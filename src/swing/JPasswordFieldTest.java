package swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 * <p>��1������򣺹��췽��public JPasswordField(String text,int fieldwidth)��text�������ʼ��֮��δ�������
 *             �༭ǰ���ֵ����֡���fieldwidth�������ĳ��ȡ����������������������ȡ��򶼲��ӣ���
 *             ͨ������Ĳ���ͨ�����ڷ�������<br><br>
 * <p>��2��������Ӧ�ķ�����<br>
 *                ��2.1��JPasswordField���еķ���ͬJTextField���еĴ󲿷ַ�����ͬ���μ�JTextFieldTest
 *                                      ���з�����˵��<br>
 *                ��2.2��p.setEchoChar('*')������������н��ı�����ת�������ʾ�ַ�������������
 *                                     �ַ�'*' ��<br>
 *                 ��2.3��public char[] getPassword()�����������ַ��������ʽ���ء�<br>
 * <p>��3�������Ĵ˹��췽����������Ҫʱѧϰ��public JPasswordField(Document docModel,String text,int fieldwidth)
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
				// TODO �Զ����ɷ������
				System.out.println(jpt.getText());
				jpt.setText("�����¼�");
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new JPasswordFieldTest();
	}
}