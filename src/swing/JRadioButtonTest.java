package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.net.*;



/**
 *<p>��1����ѡ��ť�ࣺpublic JRadioButton( String text , Icon icon , boolean selected )��text
 *                                 ����ť�Ե�˵�����֣���ʵ����ѡ��˵������icon����ťͼ�꣬Ĭ�ϰ�ťͼ����
 *                                   һ��ԲȦ��ѡ��ʱȦ�г���һ������Ϊѡ�У�����icon���Խ�Ĭ�ϰ�ťͼ��
 *                                   �滻Ϊiconָ����ͼƬ������ icon ��ֵ null ʱ����ťͼ���ֻ᷵��Ĭ�ϵ�ԲȦ����
 *                                   selected��ȷ�������ʼ����ʱ��ѡ���״̬��true
 *                                   /��ʾѡ���ʼ��Ϊѡ��״̬��false/��ʾѡ���ʼ��Ϊδѡ��״̬��,��������
 *                                   �������������ӻ򳹵ײ��ӣ�Ȼ���ں���������ͨ����������<br>
 *      ��1.1��JRadiobutton.isSelected()������һ��Boolean��ֵ��true/��ʾ��ť��ʱ��״̬Ϊ
 *                                  ѡ�У�false/��ʾ��ť��ʱ��״̬Ϊδѡ�С�<br>
 *<p>��2����ѡ��ť��ʹ�ã���ѡ��ťֻ������״̬��ѡ�л���δѡ��<br><br>
 *<p>��3����ѡ��ť���ʹ�ã���ѡ��ť��δ���밴ť��֮ǰÿ����ť���ǵ����޹صģ�ʹ��ButtonGroup
 *                              group=new ButtonGroup()��group.add(��ѡ��ť)������ѡ��ť���뵽
 *                              ��ť���У��������ͬʱ����һ����ѡ��ť���Ա�ѡ�У�������Ϊδѡ��<br><br>
 *<p>��4����ť����ӣ������а�ť��ӵ���ť���б�֤��ѡ��Ψһ�ԣ���Ҫ�Ѱ�ť��ӵ������У����細���У���
 *                   ����ʹ�� container.add( ��ѡ��ť )��Ҳ����ʹ���������󵥶���ӣ�������ͨ����������
 *                   ��Ӱ�ť�飬�� container.add��group�����Ǵ���ġ�<br><br>
 * <p>��5��������������ӵĵ�ѡ��ť��ֹһ��ʱ������Ѵ��� JFrame �Ĳ��ֹ�������Ϊ�����ֹ���
 *           ��Flow�����߾��Բ���Absolute�����񲼾ֹ�����Grid������Ϊ����Ĭ�ϵĲ��ֹ�������
 *           �߽粼�ֹ���������Ϊ�����ϱ��У�Ĭ�����а�ť��ӵ��в��������ť���ص������ִ�
 *           ��<br><br>
 * <p>��6����ť��������ĳһ��ť��Ӷ���������<br>
                  ��6.1������ѡ��ťδ���밴ť���У����һ�θð�ť����ť��״̬�ı�һ�Σ�����һ�ζ���������<br>
                 ��6.2������ѡ��ť���밴ť���У��������ð�ťһ�ο��Դ�������������ʹѡ�к��ظ����Ҳ��
                    �������������ѡ��������ѡ��ť���ð�ť״̬�Զ��ı�Ϊδѡ��״̬��false������������µ�״̬��
 *                  �䲻�����ð�ť�Ķ�������������ֻ��ֱ�ӵ����ť�Żᴥ������������<br><br>
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
		
		JRadioButton j1=new JRadioButton("һֻС��",true);
		URL url=JRadioButtonTest.class.getResource("imageButton.jpg");
		Icon i=new ImageIcon(url);
		
		j1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				j1.setIcon(i);
			}
		});
		
		JRadioButton j2=new JRadioButton("һֻС��");
		j2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				j1.setIcon(null);
				if(j2.isSelected()==true)
					System.out.println("true");
				else
					System.out.println("false");
			}
		});
		
		JRadioButton j3=new JRadioButton("һֻС��");
		JRadioButton j4=new JRadioButton("һֻСè");
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
		new JRadioButtonTest("��ѡ��ť���Գ���");
	}

}
