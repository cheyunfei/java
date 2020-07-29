package Thread;
import java.awt.*;

import javax.swing.*;

/**
 *
 *��1���߳��жϣ�ǿ��ֹͣ�߳�<br>
 *��1.1���߳����� sleep()�� wait()��������ͣ����ʱ��ͨ�� interrupt()ʹ�߳�ֹͣ<br>
 *��1.2��interrupt() ����������������߳�ֹͣ�����ǻ����߳��׳� InterruptException �쳣��ʹ�߳̽��봦���쳣�� catch ��䣬�� catch ������
 *���Ա�д��ֹ����ķ��������� return ��������ֹ�������䣻��� catch �����в���ֹ����ô������Ϊ�������쳣����������ִ�й��̣���������ֹ����
 *ִ��<br><br>
 *
 *��2��interrupt ������public void interrupt()<br>
 *��2.1�����������жϴ��̣߳����̲߳�һ���ǵ�ǰ�̣߳�����ָ���ø÷����� Thread ʵ����������̣߳�<br>
 *��2.2����ʵ����ֻ�Ǹ��߳�����һ���жϱ�־���߳��Ի�������С�<br><br>
 *
 *
 *��3��interrupted ������public static boolean interrupted()<br>
 *��3.1�������ǲ��Ե�ǰ�߳��Ƿ��жϣ�����жϱ�־��������һ��boolean��������ж�״̬<br>
 *��3.2���ڶ����ٵ���ʱ�ж�״̬�Ѿ��������������һ��false<br><br>
 *
 *
 *��4��isInterrupted ������public boolean isInterrupted()<br>
 *��4.1�������ǲ��Ե�ǰ�߳��Ƿ��жϣ�����жϱ�־��������һ��boolean��true ��ʾ�̱߳��ж��ˣ���������ж�״̬<br>
 */


public class InterruptThread extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Thread thread;
	
	public static void main(String[] args) {
		init(new InterruptThread(), 100, 100);
	}
	
	public InterruptThread() {
		super();
		final JProgressBar progressBar = new JProgressBar(); // ����������
		// �������������ڴ������λ��
		getContentPane().add(progressBar, BorderLayout.NORTH);
		progressBar.setStringPainted(true); // ���ý���������ʾ����
		thread = new Thread(new Runnable() {
			int count = 0;
			
			public void run() {
				while (true) {
					progressBar.setValue(++count); // ���ý������ĵ�ǰֵ
					try {
						Thread.sleep(1000); // ʹ�߳�����1000����
						// ��׽InterruptedException�쳣
					} catch (InterruptedException e) {
						System.out.println("��ǰ�߳����ж�");
						break;
					}
				}
			}
		});
		thread.start(); // �����߳�
		while(true) {
			System.out.println(progressBar.getValue());
			if(progressBar.getValue() > 3) {
				thread.interrupt(); // �ж��߳�
				break;
			}
		}
	}
	
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
	
}

