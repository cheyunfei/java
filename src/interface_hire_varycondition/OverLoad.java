package interface_hire_varycondition;
/**<p>��1�����أ���ͬһ����������ͬʱ����һ�����ϵ�ͬ����������Щ�����Ĳ������͡���Ŀ��˳�������������
 *                         ֻ�з������Ͳ�ͬ�Ǵ����
 *   <p>��2����������������������������ʽ����������ֵ ��������������������...������������int add( int...a )��
 *                     add( a1,a2,a3,a4 )����ֻ�����������ط���������ʱ�Ż���ò�����������*/
public class OverLoad {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static int add(int a) {
		return 1;
	}
	
	public static int add(int a, double b) {
		return 1;
	}
	
	public static int add(double a, int b) {
		return 1;
	}
	
	public static int add(int... a) { // ���岻������������
		int s = 0;
		for (int i = 0; i < a.length; i++)
			// ���ݲ���������ѭ������
			s += a[i]; // ��ÿ�������ۼ�
		System.out.println("\n"+"���ڵ��ò�������������");
		return s; // ������������
	}
	
	public static void main(String args[]) {
		System.out.println("����add(int,int)������" + add(1, 2));
		System.out.println("����add(double,double)������" + add(2.1, 3.3));
		System.out.println("����add(int)������" + add(1));
		// ���ò�������������
		System.out.println("���ò���������������" + add(1,2, 3,4, 5,6, 7, 8, 9));
		System.out.println("���ò���������������" + add(2,3,4));
	}
}
