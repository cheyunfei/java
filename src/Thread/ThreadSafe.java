package Thread;
/**<p>��1���߳�ͬ����ȫ�����������̶߳�ͬһ�����ݽ����޸ĵ��µĴ������Ʊ��Ʊϵͳ
 * <p>��2��ͬ�����ƣ�ʹ�� synchronized �ؼ�������<br><br>
 *      ��2.1�����δ���飺���� run() ��������Ҫ���������ݲ������̣���������Դ�ŵ� synchronized ���
 *            �飨ͬ���飩�У�������ԴҲ������ run �������õ��ྲ̬ȫ�ֱ�������ʱ�þ�̬ȫ�ֱ���Ϊ����
 *            �����ã�<br>
 *      ��2.11�����δ���飺 synchronized(Object){ͬ����}��Object��synchronized ��������Ŀ�꣬
 *            ���Ŀ�����������ģ�this/���������������Ƕ��󣩣�""/����.class�����������ࣩ��<br>
 *      ��2.12���������Ƕ��� synchronized(this/������):�� run() �������ڵ���ʵ���� Runnable �ӿ�ʱ�����������˸���ͬһ������� Thread
 *            ������ʵ���ͬһ�鹲����Դ������ʱ��Щ�̻߳��⡣������� Thread �̶߳������ӵ��ǲ�ͬ�� Runnable ����
 *            ʱ�����Ƿ��ʵĲ���ͬһ�鹲����Դ��������Щ�̲߳����⣬�������ſ���ͬʱ���У������������Դ���༶��ĳ�Ա
 *             ��ʱ��� static ���Σ��������������̹߳���һ����Դ�ᷢ������<br>
 *      ��2.13������������ synchronized(""/����.class)���������� 2.12 ��ͬ������ֻ����������������˵������Դ���༶��ĳ�Ա
 *             ��ʱ��� static ���Σ��������������̹߳���һ����Դ�����ͻ<br><br>
 *      
 *            
 *      ��2.2�����ηǾ�̬������synchronized void f(){}�����ڷ�����ǰ���� synchronized �ؼ��֣����������ǹ�����Դ��
 *          ������δ����ֻ��ͬ���Ĵ���������˶��ѣ��൱�ڶ�����<br>
 *      ��ע�⣺�������̷ֱ߳����ͬһ�������������ͬ��ͬ�����������߳�A���ö���P��ͬ������a���߳�B���ö���P��ͬ������b����
 *              �����̻߳��⣬������a��ִ�е�ʱ�򣬷���b��ȴ�aִ����ϣ�������ͬ���������⡣
 *          
 *        
 *      ��2.3�����ξ�̬������synchronized static void f(){}���÷��������ж������൱�ڵ�ǰ���class��<br><br>
 *      ��ע�⣺���߳�A���߳�B�ֱ����ͬһ������� synchronized static �����ͷǾ�̬synchronized ������<br><br> 
 * <p>��3�� synchronized�ؼ��ֲ��ܼ̳У������෽�����ø����ͬ��������ʱ�����෽������ͬ������<br>
 *       
 *    ��ע�⣺��ĳ�����������ͬ������ʱ���ö����ϵ�����ͬ����������ȴ���ͬ������ִ�������ܱ�ִ��       */
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

