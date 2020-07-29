package Thread;
/**<p>（1）线程优先级：表明该线程在程序中的重要性，系统可以根据优先级决定哪个线程先进入运行状态<br>
 * （1.1）优先级常量：Thread.MIN_PRIORITY（常数1），Thread.MAX_PRIORITY（常数10），Thread.NORM_PRIORITY（常数5），优先级都在1~10之间<br>
 * （1.2）设置优先级：thread.setPriority(int p)，p数值越大优先级越高  <br>
 * （1.3）默认优先级为Thread.NORM_PRIORITY（常数5），每个新产生的线程都继承了父线程的优先级<br>
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
		// 分别实例化4个线程
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
	
	// 定义设置线程的名称、优先级的方法
	public static void setPriority(String threadName, int priority,
			Thread t) {
		t.setPriority(priority); // 设置线程的优先级
		t.setName(threadName); // 设置线程的名称
		t.start(); // 启动线程
	}
	
	public static void main(String[] args) {
		init(new PriorityThread(), 100, 100);
	}
	
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
	
	private final class MyThread implements Runnable { // 定义一个实现Runnable接口的类
		private final JProgressBar bar;
		int count = 0;
		
		private MyThread(JProgressBar bar) {
			this.bar = bar;
		}
		
		public void run() { // 重写run()方法
			while (true) {
				bar.setValue(count += 1); // 设置滚动条的值每次自增10
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.out.println("当前线程序被中断");
					break;
				}
			}
		}
	}
	
}
