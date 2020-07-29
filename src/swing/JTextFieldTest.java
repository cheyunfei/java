package swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 * <p>��1���ı��򣺹��췽��public JTextField(String text,int fieldwidth)��text�������ʼ��֮��δ���ı���
 *             �༭ǰ���ֵ����֡���fieldwidth���ı���ĳ��ȡ����������������������ȡ��򶼲��ӣ���
 *             ͨ������Ĳ���ͨ�����ڷ�������<br><br>
 *<p>��2�� �ı����Ӧ�ķ�����<br>
 *                            ��2.1��text.addActionListener()��Ϊ�ı�������¼�������������꽹�����ڴ��ı���
 *                             ������ Enter ��ʱ������������<br><br>
 *                             ��2.2��text.setText(string)�������ı����е�����Ϊ string��<br>
 *                             ��2.3��text.getText()����ȡ�ı����е��ı���<br>
 *                             ��2.4��text.requestFocus()������꽹�㷵�ص� text �����Ӧ���ı����С�<br>
 *                             ��2.5��text.setCaretColor(Color.red)�����ù����ɫ���������������ѧϰ��<br>
 *                             ��2.6��text.setEditable(boolean)�������ı����Ƿ�ɱ༭��true�ɱ༭/false���ɱ༭��<br><br>
 *                             ��2.7��text.setFont(new Font(String type,int style,int size))��type�����壬"����"/"����"...
 *                                                ��������еľͿ����á���style����ʽ��Font.BOLD ����/Font.ITALIC б��
 *                                                /Font.PLAIN ��ͨ��ʽ����size���ֺš�<br><br>
 *                             ��2.8��text.setForeground(Color.red)�������ı�����������ɫ��<br>
 *                            ��2.9��text.setBackground(Color.green)�������ı��򱳾���ɫ��<br>
 * <p>��3���������ã�������Font��Font  f=new Font(String type,int style,int size)��type�����壬"����"/"����"...��
 *                 ������еľͿ����á���style����ʽ��Font.BOLD ����/Font.ITALIC б��/Font.PLAIN ��ͨ��
 *                 ʽ����size���ֺš�<br><br>
 * <p>��4���ı���Ĵ˹��췽����������Ҫʱѧϰ��public JTextField(Document docModel,String text,int fieldwidth)
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
		jt.setFont(new Font("����",Font.PLAIN,16));
		jt.setForeground(Color.red);
		jt.setBackground(Color.green);
		final JTextField jt2=new JTextField("aaa",20);
		final JButton jb=new JButton("���");
		cp.add(jt);cp.add(jt2);
		cp.add(jb);
		jt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɷ������
				jt.setText("�����¼�");
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

