package Thread;
/**<p>（1）线程同步安全：避免因多个线程对同一个数据进行修改导致的错误，如火车票售票系统
 * <p>（2）同步机制：使用 synchronized 关键字修饰<br><br>
 *      （2.1）修饰代码块：即把 run() 方法中需要保护的数据操作过程，即共享资源放到 synchronized 语句
 *            块（同步块）中（共享资源也可能是 run 方法调用的类静态全局变量，此时该静态全局变量为所有
 *            对象公用）<br>
 *      （2.11）修饰代码块： synchronized(Object){同步块}，Object【synchronized 将锁定的目标，
 *            这个目标可以是任意的，this/对象名（锁定的是对象），""/类名.class（锁定的是类）】<br>
 *      （2.12）锁定的是对象 synchronized(this/对象名):当 run() 方法所在的类实现了 Runnable 接口时，所有连接了该类同一个对象的 Thread
 *            对象访问的是同一块共享资源，即此时这些线程互斥。而当多个 Thread 线程对象连接的是不同的 Runnable 对象
 *            时，他们访问的不是同一块共享资源，所以这些线程不互斥，互不干扰可以同时运行；但如果共享资源是类级别的成员
 *             的时候加 static 修饰，两个不互锁的线程公用一个资源会发生错误<br>
 *      （2.13）锁定的是类 synchronized(""/类名.class)：其他都和 2.12 相同，但是只有最后对于锁定类来说共享资源是类级别的成员
 *             的时候加 static 修饰，两个不互锁的线程公用一个资源不会冲突<br><br>
 *      
 *            
 *      （2.2）修饰非静态方法：synchronized void f(){}，即在方法面前修饰 synchronized 关键字，方法体中是共享资源，
 *          相比修饰代码块只是同步的代码量变大了而已，相当于对象锁<br>
 *      （注意：）两个线程分别调用同一个对象的两个不同的同步方法（即线程A调用对象P的同步方法a，线程B调用对象P的同步方法b），
 *              两个线程互斥，即方法a被执行的时候，方法b需等待a执行完毕，即两个同步方法互斥。
 *          
 *        
 *      （2.3）修饰静态方法：synchronized static void f(){}，该方法由所有对象共享，相当于当前类的class锁<br><br>
 *      （注意：）线程A和线程B分别访问同一个对象的 synchronized static 方法和非静态synchronized 不互斥<br><br> 
 * <p>（3） synchronized关键字不能继承，当子类方法调用父类的同步方法的时候，子类方法才有同步功能<br>
 *       
 *    （注意：）某个对象调用了同步方法时，该对象上的其他同步方法必须等待该同步方法执行完后才能被执行       */
public class ThreadSafe/* implements Runnable */{
	   private static int count=0;

//	   public  void run() {
//	      synchronized(ThreadSafe.class) {
//	         for (int i = 0; i < 5; i++) {
//	            try {
//	               System.out.println(Thread.currentThread().getName() + ":" + (count++));
//	               Thread.sleep(10);
//	            } catch (InterruptedException e) {
//	               e.printStackTrace();
//	            }
//	         }
//	      }
//	   }

	   public int getCount() {
	      return count;
	   }
	   
	   private int count2=0;
	   
	   public synchronized void add(){
		   count2++;
		   System.out.println("add"+count2);
	   }
	   public synchronized void sub(){
		   count2--;
		   System.out.println("sub"+count2);
	   }
	   public static void main(String[] args){
		   //ThreadSafe ThreadSafe = new ThreadSafe();
//		   Thread thread1 = new Thread(new ThreadSafe(), "ThreadSafe1");
//		   Thread thread2 = new Thread(new ThreadSafe(), "ThreadSafe2");
//		   thread1.start();
//		   thread2.start();
		   ThreadSafe s=new ThreadSafe();
		   Thread thread3=new Thread(new Runnable(){
			   public void run(){
				   int n=0;
				   while(n<5){
					   n++;
					   s.add();
					   try{ Thread.sleep(100);}catch(Exception e){}
				   }
			   }
		   });
		   Thread thread4=new Thread(new Runnable(){
			   public void run(){
				   int n=0;
				   while(n<5){
					   n++;
					   s.add();
					   try{ Thread.sleep(100);}catch(Exception e){}
				   }
			   }
		   });
		   thread4.start();
		   thread3.start();
		   
	   }
}

