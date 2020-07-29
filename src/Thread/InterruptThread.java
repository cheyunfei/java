package Thread;
import java.awt.*;

import javax.swing.*;

/**
 *
 *（1）线程中断：强制停止线程<br>
 *（1.1）线程由于 sleep()或 wait()方法而暂停，这时可通过 interrupt()使线程停止<br>
 *（1.2）interrupt() 方法并不会真的让线程停止，而是会让线程抛出 InterruptException 异常，使线程进入处理异常的 catch 语句，在 catch 语句块中
 *可以编写终止程序的方法，比如 return 等正常终止程序的语句；如果 catch 语句块中不终止，那么程序将认为处理完异常，继续后续执行过程，并不会终止程序
 *执行<br><br>
 *
 *（2）interrupt 方法：public void interrupt()<br>
 *（2.1）其作用是中断此线程（此线程不一定是当前线程，而是指调用该方法的 Thread 实例所代表的线程）<br>
 *（2.2）但实际上只是给线程设置一个中断标志，线程仍会继续运行。<br><br>
 *
 *
 *（3）interrupted 方法：public static boolean interrupted()<br>
 *（3.1）作用是测试当前线程是否被中断（检查中断标志），返回一个boolean，并清除中断状态<br>
 *（3.2）第二次再调用时中断状态已经被清除，将返回一个false<br><br>
 *
 *
 *（4）isInterrupted 方法：public boolean isInterrupted()<br>
 *（4.1）作用是测试当前线程是否被中断（检查中断标志），返回一个boolean，true 表示线程被中断了；但不清除中断状态<br>
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
		final JProgressBar progressBar = new JProgressBar(); // 创建进度条
		// 将进度条放置在窗体合适位置
		getContentPane().add(progressBar, BorderLayout.NORTH);
		progressBar.setStringPainted(true); // 设置进度条上显示数字
		thread = new Thread(new Runnable() {
			int count = 0;
			
			public void run() {
				while (true) {
					progressBar.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(1000); // 使线程休眠1000豪秒
						// 捕捉InterruptedException异常
					} catch (InterruptedException e) {
						System.out.println("当前线程序被中断");
						break;
					}
				}
			}
		});
		thread.start(); // 启动线程
		while(true) {
			System.out.println(progressBar.getValue());
			if(progressBar.getValue() > 3) {
				thread.interrupt(); // 中断线程
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

