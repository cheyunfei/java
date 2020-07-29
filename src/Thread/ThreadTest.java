package Thread;

/**
 * <p>（0）线程：Java多线程在不同的操作系统的中运行方式有所差异；以 Windows 为例，系统分配 CPU 资源以进程为单位；一个进程可以包含多个线程<br><br>
 * 
 * <p>（1）实现方法：实现线程的两种方式分别是<br>
 * <p>（1.1）继承 java.lang.Thread 类<br>
 * <p>（1.2）实现 java.lang.Runnable 接口<br><br>
 * 
 * <p>（2）继承 Thread 类:public class MyThread extends Thread{}<br>
 *（2.1）除java虚拟机负责启动的主方法 main 线程外，程序员启动一个新线程需要创建一个 Thread 实例<br>
 *（2.11）第一步：Thread th = new Thread() 或 Thread th = new Thread(String threadName)【创建名为 threadName 的线程对象】<br>
 *（2.12）第二步：覆盖父类 Thread 中的方法 <b>run()</b>；该方法就是线程具体的执行任务代码<br>
 *（2.13）第三步：执行 start 方法；在 该方法执行前，Thread 对象只是一个实例而不是线程<br>
 *（2.14）start() 方法调用一个已经启动的线程会抛出异常 IllegalThreadStateException<br><br>
 *
 *（2.2）Thread 类中的方法：Thread th=new Thread()<br>
 *（2.21）th.start()，启动线程，线程处于就绪状态<br>
 *（2.22）Thread.currentThread()，返回当前线程的 Thread 对象<br>
 *（2.23）Thread.currentThread().getName()，返回当前线程的名字，如主线程名为 main<br>
 *（2.24）Thread.currentThread().getID()，返回当前线程的ID，如主线程ID为 1<br><br>
 *
 *<p>（3）实现 Runnable 接口：public class MyThread extends T implements Runnable{}<br>
 *<p>（3.1）因为java中一次只能的继承一个类，当已经继承某个类 T 后，想要实现线程功能就不能再继承 Thread 类，而可以通过实现接口 Runnable<br>
 *（3.11）实质上 Thread 类实现了 Runnable 接口，并实现了该接口中仅有的一个方法 run() ，start属于 Thread 独有<br>
 *（3.12）实现接口 Runnable 后，需要创建相对应的 Thread 对象来调用 start 启动线程<br><br>
 * <p>（3.2）实现过程：<br>
 *（3.21）第一步：建立 Runnable 对象：Runnable r=new Runnable()<br>
 *（3.22）第二步：创建 Thread 对象：Thread t=new Thread(Runnable r) 或 Thread t=new Thread(Runnable r,String name),
 *           r【Runnable 对象】，name【该线程名称】<br> 
 *（3.23）第三步：t.start()启动线程<br><br>   
 * 
 * <p>（4）线程状态：<br>
 *  （4.1）出生状态：线程实例调用 start 方法前都处于出生状态<br>
 *  （4.2）就绪状态和运行状态：线程实例调用 start 方法后处于就绪状态，然后获得系统资源进入运行状态<br>
 *  （4.3）等待状态：在运行状态下调用 Thread 类中的 wait()进入等待状态，必须用 Thread类中的 notify() 唤醒，notifyAll() 是将所有等待的线程唤醒<br>
 *  （4.4）休眠状态：调用 Thread 类中的 sleep(int time)，time【休眠时间，单位毫秒】；需要放入 try-catch 语句块中，因有可能抛出 InterruptException 异常
 * <pre>
 * 		try{ 
 * 				Thread.sleep(1000)
 * 			}
 * 		 catch(InterruptException e)
 * 		{
 * 			e.printStackTrace();
 * 		}
 * </pre><br>
 *  （4.5）阻塞状态：发出输入/输出请求后，等待输入/输出结束的过程即为阻塞状态<br>
 *  （4.5）死亡状态：run()执行完毕后<br>
 *  
 */
public class ThreadTest extends Thread { // 指定类继承Thread类
	private int count = 10;
	public ThreadTest(String s){
		super(s);
	}
	
	public void run() { // 重写run()方法
		while (true) {
			if (--count == 0) { // 使count变量自减，当自减为0时，退出循环
				return;
			}
			System.out.println("count is : "+count+"; info is :"+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
		}
	}
	
	class innerThread implements Runnable{
		
		int count;
		public void run() {
			while (count <= 200) {
				try {
					Thread.sleep(200); // 使线程休眠1000毫秒
				} catch (Exception e) {
					e.printStackTrace();
				}
				count += 10; // 使横坐标每次增加4
				System.out.println("runnable to : "+count);
				if (count == 200) {
					// 当图标到达标签的最右边，使其回到标签最左边
					count = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadTest l= new ThreadTest("gouride");
		l.start();
		Thread k = new Thread(l.new innerThread());
		k.start();
		System.out.println("子线程l信息："+l.getId()+" "+l.getName());
		System.out.println("子线程k信息："+k.getId()+" "+k.getName());
		System.out.println("主线程信息："+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
	}
}
