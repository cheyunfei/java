package Calculate;
/**
 * ��1����������в�ͬ���͵����ݻ��Զ�����ת����ͳһ���߼�����������<br>
 * ��2������������ֵ��'/'Ϊȡ����'%'Ϊȡ�ࣻ���ڸ�������ֵ��'/'ֱ�Ӱ�����������㣬�� 7f/2f=3.5f��
 *        7f%3.5f=0.0f��7/2=3��7%2=1<br>
 * ��3�������Լ������ֻ���������λ򸡵��ͱ�����a+=b���൱��a=a+b��a++����ʹ��a����ʹa�Լ�<br>
 * ��4���� byte/char �����ֽڳ����ַ��ͱ��������Ϊ����int
 */
public class Arith { // ������
	public static void main(String[] args) { // ������
		float number1 = 45.56f; // ����float�ͱ�������ֵ
		int number2 = 152; // ����int�ͱ�������ֵ
		float s=7.2f % 3.5f;
		System.out.println("��Ϊ��" + (number1 + number2)); // ���������֮�����
		System.out.println("��Ϊ��" + (number2-number1));//���������֮�����
		System.out.println("��Ϊ��" + number1 * number2); // ��������˵Ļ����
		System.out.println("��Ϊ��" + number1 / number2); // ����������������
		System.out.println(s);
	}
}

