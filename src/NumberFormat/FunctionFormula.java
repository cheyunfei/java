package NumberFormat;
/**��1��Math �ࣺjava.lang.Math �����ṩ���ڶ���ѧ���������ͳ�����Math.��������Math.����<br><br>
 * ��2��Math ������Math.PI���У�3.14����Math.E��e��2.71828��<br><br>
 * ��3�����Ǻ�����public static double sin( double a )��cos�����ң������ǻ��ȡ���tan�����У������ǻ��ȡ�
 *                          ��asin�������ң������� -1~1����acos�������ң������� -1~1����atan�������У������� -1~1����
 *                          toRadians���Ƕ�ת��Ϊ���ȣ������ǽǶȡ���toDegrees������ת��Ϊ�Ƕȣ������ǻ��ȡ���
 *                          ע�⻡����Ƕ�֮���ת������ȷ<br><br>
 *  ��4��ָ��������public static double exp( double a )��e^a����log��In(a)������Ϊe�Ķ�������log10������
 *                        Ϊ10�Ķ�������sqrt��a��ƽ������a&gt;=0����cbrt��a������������pow( double a , double b )��a^b��<br><br>
 * ��5��ȡ��������public static double ceil( double a )��&gt;=a����С��������floor��&lt;=a�������������rint�������� a ��ӽ���
 *                           �������������ͬ���ӽ�ȡż������public static int round( float a )��ȡ������������������
 *                           public static long round( double a )��ȡ������������������ת��Ϊ�����͡�<br><br>
 *  ��6��ȡ�����С������ֵ������public static TYPE Method( TYPE a , TYPE b )��TYPE���������������ֵ����
 *                              ������ int��long��float��double����Method�����������࣬������ max��ȡ���ֵ����
 *                              min��ȡ��Сֵ����abs��ȡ����ֵ����*/
public class FunctionFormula {
	public static void main(String[] args) {
		// ȡ90�ȵ�����
		
		System.out.println(Math.PI+" "+Math.E);
		System.out.println("90�ȵ�����ֵ��" + Math.sin(Math.PI / 2));
		// ȡ2��ƽ������2�̵ķ�����
		System.out.println("2��ƽ������2�̵ķ�����ֵ��"
				+ Math.acos(Math.sqrt(2) / 2));
		// ȡ120�ȵĻ���ֵ
		System.out.println("120�ȵĻ���ֵ��" + Math.toRadians(120.0));
		// ȡ��/2�ĽǶ�
		System.out.println("��/2�ĽǶ�ֵ��" + Math.toDegrees(Math.PI / 2));
		// ȡe��2�η�
		System.out.println("e��ƽ��ֵ��" + Math.exp(2)); 
		// ȡ2��2�η�
		System.out.println("2��2�η�ֵ��" + Math.pow(2, 2)); 
		// �����������ӽ�������
		System.out.println("ʹ��rint()����ȡ����" + Math.rint(2.7));
		// �����������ӽ�������
		System.out.println("ʹ��rint()����ȡ����" + Math.rint(2.5));
		// ȡ��������������
		System.out.println("ʹ��round()����ȡ����" + Math.round(3.2f));
		// ȡ�����������������������ǿ��ת��Ϊ������
		System.out.println("ʹ��round()����ȡ����" + Math.round(2.2));
		//ȡ������������Сֵ
		System.out.println("ʹ��min()����ȡ��Сֵ��" + Math.min(2.2,2.4));
	}
}
