package NumberFormat;
import java.util.Random;
/**��1����������������ַ�����Math.random() �� java.util.Random ��<br><br>
 * ��2��random() �������˷������Բ��� 0.0&lt;=m&lt;1.0 �� double ����������÷����Ե�ǰʱ��Ϊ�������������
 *        ������α�����<br>
 *     ע�⣺�� random() �����ԼӴ����� m + int ( Math.random() * n )�����Բ��� m~m+n ֮������������
 *             �� ( char )( char1 + Math.random() * ( char2 - char1 +1 ) )�����Բ����������� char1 �� char2 ֮�������һ��
 *             ���š�<br><br>
 *  ��3��ʵ���� Random ����ʵ��������ʱ�����ӿ������Ϊ�������������ʱ��Ҫ�Ĳ��������Ƕ�����Ϊ�趨����ֵ������
 *             ���ڣ������в���ȷ<br>
 *    (3.1)Random r=new Random()��Ĭ���Ե�ǰʱ����Ϊ���ӣ�����ʱ��ı仯������ͬ�������<br>
 *    (3.2)Random r=new Random( long seed ) ��  r.setSeed( long seed ) �趨����ֵ�������������ȫ������ֵȷ����
 *        ����������ͬ����ֵ������ Random �����ڳ���һ�������в������������ȫ��ͬ��������ĳһ����ֵ�����������
 *        �����ڳ���һ�������п��Բ����Ķ����ͬ����������ǳ��������в�����������������<br><br>
 *  ��4��Random ���󷽷���Random r=new Random(seed)<br>
 *    (4.1)int r.nextInt()������ int������һ���������<br>
 *    (4.2)int r.nextInt(int n)������ 0&lt;=m&lt;n ���������<br>
 *   (4.3)long r.nextLong()������һ�����������<br>
 *   (4.4)boolean r.nextBoolean()������һ����� boolean ֵ<br>
 *   (4.5)float r.nextFloat()������һ����� float ֵ<br>
 *   (4.6)double r.nextDouble()������һ����� double ֵ<br>
 *   (4.5)double r.nextGaussian()������һ�������ܶ�Ϊ��˹�ֲ������ double ֵ<br>
 *  */
public class RandomClass {
    public void randomnum(){
    	Random r=new Random(100);
    	System.out.println("�������һ������:" + r.nextInt());
    	System.out.println("�������һ������:" + r.nextInt());

		System.out.println(getClass().getName());
    }
	public static void main(String[] args) {
		RandomClass p=new RandomClass();
		p.randomnum();
		//randomnum();
		Random r = new Random(); // ʵ����һ��Random��
		// �������һ������
		System.out.println("�������һ������:" + r.nextInt());
		// �������һ�����ڵ���0С��10������
		System.out.println("�������һ�����ڵ���0С��10��������" + r.nextInt(10));
		// �������һ�������͵�ֵ
		System.out.println("�������һ�������͵�ֵ��" + r.nextBoolean());
		// �������һ��˫�����͵�ֵ
		System.out.println("�������һ��˫�����͵�ֵ��" + r.nextDouble());
		// �������һ�������͵�ֵ
		System.out.println("�������һ�������͵�ֵ��" + r.nextFloat());
		// �������һ�������ܶ�Ϊ��˹�ֲ���˫����ֵ
		System.out.println("�������һ�������ܶ�Ϊ��˹�ֲ���˫����ֵ��"
				+ r.nextGaussian());
	}

}
