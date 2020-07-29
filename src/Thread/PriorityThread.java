package Thread;
/**<p>��1���߳����ȼ����������߳��ڳ����е���Ҫ�ԣ�ϵͳ���Ը������ȼ������ĸ��߳��Ƚ�������״̬<br>
 * ��1.1�����ȼ�������Thread.MIN_PRIORITY������1����Thread.MAX_PRIORITY������10����Thread.NORM_PRIORITY������5�������ȼ�����1~10֮��<br>
 * ��1.2���������ȼ���thread.setPriority(int p)��p��ֵԽ�����ȼ�Խ��  <br>
 * ��1.3��Ĭ�����ȼ�ΪThread.NORM_PRIORITY������5����ÿ���²������̶߳��̳��˸��̵߳����ȼ�<br>
 * 
 * 
 * 
 */
import java.awt.*;

import javax.swing.*;

public class PriorityThread extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread threadA;
	private Thread threadB;
	private Thread threadC;
	private Thread threadD;
	
	public PriorityThread() {
		getContentPane().setLayout(new GridLayout(4, 1));
		// �ֱ�ʵ����4���߳�
		final JProgressBar progressBar = new JProgressBar();
		final JProgressBar progressBar2 = new JProgressBar();
		final JProgressBar progressBar3 = new JProgressBar();
		final JProgressBar progressBar4 = new JProgressBar();
		getContentPane().add(progressBar);
		getContentPane().add(progressBar2);
		getContentPane().add(progressBar3);
		getContentPane().add(progressBar4);
		progressBar.setStringPainted(true);
		progressBar2.setStringPainted(true);
		progressBar3.setStringPainted(true);
		progressBar4.setStringPainted(true);
		threadA = new Thread(new MyThread(progressBar));
		threadB = new Thread(new MyThread(progressBar2));
		threadC = new Thread(new MyThread(progressBar3));
		threadD = new Thread(new MyThread(progressBar4));
		setPriority("threadA", 5, threadA);
		setPriority("threadB", 5, threadB);
		setPriority("threadC", 4, threadC);
		setPriority("threadD", 1, threadD);
	}
	
	// ���������̵߳����ơ����ȼ��ķ���
	public static void setPriority(String threadName, int priority,
			Thread t) {
		t.setPriority(priority); // �����̵߳����ȼ�
		t.setName(threadName); // �����̵߳�����
		t.start(); // �����߳�
	}
	
	public static void main(String[] args) {
		init(new PriorityThread(), 100, 100);
	}
	
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
	
	private final class MyThread implements Runnable { // ����һ��ʵ��Runnable�ӿڵ���
		private final JProgressBar bar;
		int count = 0;
		
		private MyThread(JProgressBar bar) {
			this.bar = bar;
		}
		
		public void run() { // ��дrun()����
			while (true) {
				bar.setValue(count += 1); // ���ù�������ֵÿ������10
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.out.println("��ǰ�߳����ж�");
					break;
				}
			}
		}
	}
	
}
