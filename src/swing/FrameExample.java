package swing;

import java.awt.*;
import javax.swing.*;


/**
 * ��1���´������࣬��Ŀ�괰�壬����̳� JFrame �࣬��ֱ���� new JFrame() �����Ĵ��岻����
 *                        �����������ʹ�� extends �̳� JFrame<br><br>
 *��2�� �´����Ĵ���Ĭ�ϲ��ɼ������ڹ��췽����ʹ��  setVisible(true) ʹ������ʾ����<br><br>
 * ��3�����崴����JFrame frame = new JFrame(title);<br>
 *                Container container = frame.getContentPane();<br>
 *                container.add(�������);<br><br>
 * ��4����������������ɫ�� frame.setBackground( Color.white)<br><br>
 * ��5�����ô�����ӣ� frame.setVisible(true)<br><br>
 * ��6�����ô���ɷ�ı��С��frame.setResizable(boolean)��true�ɸı��С/false���ɸı��С��<br><br>
 *��7������ر�������䣺frame.setDefaultCloseOperation ( WindowConstants.���� )��������ⳣ�����ĸ�����<br>
 *  ��7.1��DISPOSE_ON_CLOSE�����ص�ǰ���ڣ����ͷŸô���ռ�е�������Դ��������رճ���Ҳ����˵����ó���ͬʱ
 *               ��ʾ������ڣ��رձ�����Ϊ��������Ĵ��ڵ�ʱ�򣬶�����������Ӱ�졣�ڴ��ڱ��رյ�ʱ��� dispose ���
 *                ���ڣ������д��ڶ��� dispose ��JVMҲ���˳����� dispose �Ĵ��ڿ���ͨ������ pack() �� show() ���»��
 *                ��Դ�������ڡ�<br>
 *  ��7.2��EXIT_ON_CLOSE���˳�����Ĭ�ϴ��ڹرգ��ڴ��ڱ��رյ�ʱ����˳�JVM��Ҳ����˵����ó���ͬʱ��ʾ���
 *            ���ڣ��ڹرձ�����Ϊ��������Ĵ��ڵ�ʱ����������Ҳ���رա�<br>
 *   ��7.3��HIDE_ON_CLOSE�����������ش��ڣ�������Դ�Դ��ڣ���������������Կɼ�<br>
 *   ��7.4��DO_NOTHING_ON_CLOSE��������رմ��ڵİ�ťʱ�����ڲ��ܹرգ���������κ�Ч����������رհ�ť������<br>
*   ��7.5��ע������ʹ�õ��� WindowConstants����ǰ��ʹ�õ���JFrame<br>
*   ��7.6��������Ⱦ�������������������һ��ѡ����رմ��ڵ�ʱ����ֱ���˳������ǽ����رմ���<br>
 * ��8�����ô�����⣺frame.setTitle("�������")<br><br>
 * ��9��ע�⣺����дUI�������ʱ��Ӧ����������Ȼ��� JFrame �� Size��Visible�����Խ������ã�
 *          ����������������������������������ʱһ��ʼ���ֵĻ���ֻ�� JFrame ��ܣ���û
 *          ���������������ֻ�е��϶�����ʹ���С�ı�ʱ����Ż����Ž���ˢ�¶����ֵĴ�����
 *          ������������ĳЩ�����лᵼ������ʧ�ܡ�
 *
 */
public class FrameExample extends JFrame {// ����һ����̳�JFrame��
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameExample(){
		setSize(200,200);
		setVisible(true);
	}
	public void CreateJFrame(String title) { // ����һ��CreateJFrame()����
		JFrame jf = new JFrame(title); // ʵ����һ��JFrame����
		Container container = jf.getContentPane(); // ��ȡһ������
		JLabel jl = new JLabel("����һ��JFrame����"); // ����һ��JLabel��ǩ
		// ʹ��ǩ�ϵ����־���
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		container.add(jl); // ����ǩ��ӵ�������
		container.setBackground(Color.white);//���������ı�����ɫ
		jf.setVisible(true); // ʹ�������
		jf.setSize(200, 150); // ���ô����С
		// ���ô���رշ�ʽ
		jf.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	}
	
	public static void main(String args[]){//���������е���createJFrame()����
		new FrameExample().CreateJFrame("����һ��JFrame����");
	}
}