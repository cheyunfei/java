package Thread;
import java.awt.*;

import javax.swing.*;

/** <p>（1）线程的的加入：在一个线程 A 执行的过程中，插入线程 B，并要求 B 执行完毕后才继续执行 A<br>
 * <p>（2）加入方式：在线程 A 的 run 方法中用 threadB.join()，并将 join 方法放入try-catch语句块中，因可能发生中断错误 InterruptedException<br>
 *           
 *           */


public class JoinThread extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread threadA; // 定义两个线程
	private Thread threadB;
	final JProgressBar progressBar = new JProgressBar(); // 定义两个进度条组件
	final JProgressBar progressBar2 = new JProgressBar();
	int count = 0;
	
	public static void main(String[] args) {
		init(new JoinThread(), 100, 100);
		
	}
	
	public JoinThread() {
		super();
		// 将进度条设置在窗体最北面
		getContentPane().add(progressBar, BorderLayout.NORTH);
		// 将进度条设置在窗体最南面
		getContentPane().add(progressBar2, BorderLayout.SOUTH);
		progressBar.setStringPainted(true); // 设置进度条显示数字字符
		progressBar2.setStringPainted(true);
		// 使用匿名内部类形式初始化Thread实例子
		threadA = new Thread(new Runnable() {
			int count = 0;
			
			public void run() { // 重写run()方法
				while (true) {
					progressBar.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100); // 使线程A休眠100毫秒
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					if(count==100){
						break;
					}
					try {
						threadB.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} // 使线程B调用join()方法
					
				}
				
				
			}
		});
		threadA.start(); // 启动线程A
		threadB = new Thread(new Runnable() {
			int count = 0;
			
			public void run() {
				while (true) {
					progressBar2.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100); // 使线程B休眠100毫秒
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (count == 100) // 当count变量增长为100时
						break; // 跳出循环
				}
			}
		});
		threadB.start(); // 启动线程B
	}
	
	// 设置窗体各种属性方法
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
}
