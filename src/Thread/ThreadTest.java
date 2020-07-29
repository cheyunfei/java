package Thread;

/**
 * <p>��0���̣߳�Java���߳��ڲ�ͬ�Ĳ���ϵͳ�������з�ʽ�������죻�� Windows Ϊ����ϵͳ���� CPU ��Դ�Խ���Ϊ��λ��һ�����̿��԰�������߳�<br><br>
 * 
 * <p>��1��ʵ�ַ�����ʵ���̵߳����ַ�ʽ�ֱ���<br>
 * <p>��1.1���̳� java.lang.Thread ��<br>
 * <p>��1.2��ʵ�� java.lang.Runnable �ӿ�<br><br>
 * 
 * <p>��2���̳� Thread ��:public class MyThread extends Thread{}<br>
 *��2.1����java��������������������� main �߳��⣬����Ա����һ�����߳���Ҫ����һ�� Thread ʵ��<br>
 *��2.11����һ����Thread th = new Thread() �� Thread th = new Thread(String threadName)��������Ϊ threadName ���̶߳���<br>
 *��2.12���ڶ��������Ǹ��� Thread �еķ��� <b>run()</b>���÷��������߳̾����ִ���������<br>
 *��2.13����������ִ�� start �������� �÷���ִ��ǰ��Thread ����ֻ��һ��ʵ���������߳�<br>
 *��2.14��start() ��������һ���Ѿ��������̻߳��׳��쳣 IllegalThreadStateException<br><br>
 *
 *��2.2��Thread ���еķ�����Thread th=new Thread()<br>
 *��2.21��th.start()�������̣߳��̴߳��ھ���״̬<br>
 *��2.22��Thread.currentThread()�����ص�ǰ�̵߳� Thread ����<br>
 *��2.23��Thread.currentThread().getName()�����ص�ǰ�̵߳����֣������߳���Ϊ main<br>
 *��2.24��Thread.currentThread().getID()�����ص�ǰ�̵߳�ID�������߳�IDΪ 1<br><br>
 *
 *<p>��3��ʵ�� Runnable �ӿڣ�public class MyThread extends T implements Runnable{}<br>
 *<p>��3.1����Ϊjava��һ��ֻ�ܵļ̳�һ���࣬���Ѿ��̳�ĳ���� T ����Ҫʵ���̹߳��ܾͲ����ټ̳� Thread �࣬������ͨ��ʵ�ֽӿ� Runnable<br>
 *��3.11��ʵ���� Thread ��ʵ���� Runnable �ӿڣ���ʵ���˸ýӿ��н��е�һ������ run() ��start���� Thread ����<br>
 *��3.12��ʵ�ֽӿ� Runnable ����Ҫ�������Ӧ�� Thread ���������� start �����߳�<br><br>
 * <p>��3.2��ʵ�ֹ��̣�<br>
 *��3.21����һ�������� Runnable ����Runnable r=new Runnable()<br>
 *��3.22���ڶ��������� Thread ����Thread t=new Thread(Runnable r) �� Thread t=new Thread(Runnable r,String name),
 *           r��Runnable ���󡿣�name�����߳����ơ�<br> 
 *��3.23����������t.start()�����߳�<br><br>   
 * 
 * <p>��4���߳�״̬��<br>
 *  ��4.1������״̬���߳�ʵ������ start ����ǰ�����ڳ���״̬<br>
 *  ��4.2������״̬������״̬���߳�ʵ������ start �������ھ���״̬��Ȼ����ϵͳ��Դ��������״̬<br>
 *  ��4.3���ȴ�״̬��������״̬�µ��� Thread ���е� wait()����ȴ�״̬�������� Thread���е� notify() ���ѣ�notifyAll() �ǽ����еȴ����̻߳���<br>
 *  ��4.4������״̬������ Thread ���е� sleep(int time)��time������ʱ�䣬��λ���롿����Ҫ���� try-catch �����У����п����׳� InterruptException �쳣
 * <pre>
 * 		try{ 
 * 				Thread.sleep(1000)
 * 			}
 * 		 catch(InterruptException e)
 * 		{
 * 			e.printStackTrace();
 * 		}
 * </pre><br>
 *  ��4.5������״̬����������/�������󣬵ȴ�����/��������Ĺ��̼�Ϊ����״̬<br>
 *  ��4.5������״̬��run()ִ����Ϻ�<br>
 *  
 */
public class ThreadTest extends Thread { // ָ����̳�Thread��
	private int count = 10;
	public ThreadTest(String s){
		super(s);
	}
	
	public void run() { // ��дrun()����
		while (true) {
			if (--count == 0) { // ʹcount�����Լ������Լ�Ϊ0ʱ���˳�ѭ��
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
					Thread.sleep(200); // ʹ�߳�����1000����
				} catch (Exception e) {
					e.printStackTrace();
				}
				count += 10; // ʹ������ÿ������4
				System.out.println("runnable to : "+count);
				if (count == 200) {
					// ��ͼ�굽���ǩ�����ұߣ�ʹ��ص���ǩ�����
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
		System.out.println("���߳�l��Ϣ��"+l.getId()+" "+l.getName());
		System.out.println("���߳�k��Ϣ��"+k.getId()+" "+k.getName());
		System.out.println("���߳���Ϣ��"+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
	}
}
