package class_high_character;
import java.util.Random;
import static java.lang.System.out;

class Test {
	int i = 0;
}
class Test2{
	private void t() { }
	final void t1() { }
}


/**<p>��1��final���εĳ�����������������ͬʱ���丳ֵ�����ҳ����������ٱ���ֵ�ı�<br>
 *           ��1.1��final���ε�ȫ�ֳ�����������ͬʱ���Բ����丳ֵ����Ϊ�հ� final����������Ĺ��췽���б�����丳ֵ<br>
 *           ��1.2��final ���������η����Ĳ���
 * <p>��2��final���εĶ������ã�ֻ�ܺ㶨ָ��һ�������޷��ı�ָ����һ�����󣬵��Ƕ����ڵĳ�Ա�������Ա����ģ�
 *                 ���⡾�����飬�����ڶ���final ���ε����鲻�����ٱ���ֵָ����һ�����飬���������ڵ�ÿλ��ֵ������
 *                 �����ġ�
 * <p>��3��final���εĳ��� a ֻ�ܱ�֤��ĳһ�������в��䣬���Ҫ��֤ a �ڶ�������ж����䣬���á�static final������
 *               ���Ա����ڴ���Ϊ a ����һ��̶����������
 *<p>��4��final���εķ��������Ա��̳е����ܱ���д����ֹ����Ը��෽���ĸ�����д�����෽��������Ϊ private������
 *                 ���޷��̳и��Ǹ÷�����������Ϊ����ʽ�ĵ�ָ��Ϊ final ���ͣ�����private final��<br>
 *          ��4.1�������ĸ����ǽ����ڼ̳еĻ����ϵģ�final ���εķ������Ա��̳в��ܱ����ǣ��������಻�ܳ���ͬ���ķ�����
 *                   ��Ϊ�����Ļ�����ɵ��û��ң����ǡ�private�����ߡ�private final�����εķ������ܱ��̳У��������������
 *                   ����ͬ���ĳ�Ա���������µĺ͸�����޹�ϵ�ĳ�Ա����
 *<p>��5��final ���ε��ࣺ���಻�ܱ��̳У��������з������� final ���ͣ������ܱ��̳в��ܱ��޸ģ����еĳ�Ա����������                  
 **/

public final class FinalKey extends Test2{
	static Random rand=new Random();
	private int a1 = rand.nextInt(10);
	private static final int a2 = rand.nextInt(10);
	
	static int x=3;
	final int a = 3;
	final int aa;
	public FinalKey(){
		aa=3;
	}
	public void t() {}
	//public void t1() {}
	
	private final Test test = new Test(); // ����һ��final����
	private Test test2 = new Test();
	final int[] b={1,2,3,4,5};
	
	void doit(final int c) {
		System.out.println("�� final ���εķ���������"+c);
	}
	
	public static void main(String args[]) {
		FinalKey f=new FinalKey();
		FinalKey f2=new FinalKey();
		out.println("��final��static���εı���ȴ����в��ԣ�"+f.a1+" "+f2.a1+" "+f.a2+" "+f2.a2);
	
		f.b[2]=9;
		FinalKey.x++;
		out.println(FinalKey.x);
		out.println(f.b[2]);
		
		f.test2=new Test();
		f.test2.i=9;
		System.out.println(f.test2.getClass().getName()+" "+f.test2.i);
	}
}