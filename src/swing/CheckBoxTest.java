package swing;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;

/**<p>��1����ѡ���뵥ѡ��ťΨһ�Ĳ�ͬ�ǣ���ѡ����Խ��ж�ѡ����
 * <p>��2����ѡ��public JCheckBox��Icon icon/String text��boolean checked����icon��ֻ�ܿ���ͼƬ��û�з���
 *                  �����ǵ���Կ��Ըı临ѡ��״̬���������������������ǲ���ͼƬ��ס�˷����д�ʵ��������text����ѡ
 *                  ���Աߵ�˵�����֡���checked����ѡ��ĳ�ʼ״̬��trueѡ��/falseδѡ�С��������������������������
 *                  �ӻ򳹵ײ���<br>
 *          ��2.1��JCkeckBox.isSelected()������boolean���͵�ֵ��true��ʱ��ѡ��״̬Ϊѡ��/false��
 *               ʱ��ѡ��״̬Ϊδѡ�С�<br><br>
 * <p>��3����ѡ����Ӵ����������һ�θ�ѡ��״̬�ı�һ�Σ�����һ�ζ���������<br><br>
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
					jt.append("��ѡ��1��ѡ��\n");
				else
					jt.append("��ѡ��1δ��ѡ��\n");
			}
		});

		panel2.add(jc2);
		jc2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jc2.isSelected())
				jt.append("��ѡ��2��ѡ��\n");
			}
		});

		panel2.add(jc3);
		jc3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jc3.isSelected())
				jt.append("��ѡ��3��ѡ��\n");
			}
		});
		
		setSize(300,300);
		setVisible(true);
		setTitle("��ѡ���ʹ��");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CheckBoxTest();

	}

}