package Calculate;
/**
 * Java �е�����ֻ��С�� e(-6) �� 0.000001ʱ���Զ���Ϊ������ȣ����������Ƚ����<br><br>
 * �д���֤��ʵ����Ҳ���ܱ�֤����֮���������������С��0.00000016�� e(-7)ʱ��������Ϊ��ȣ���֪���ǲ��Ǻͼ������
 * λ���;����йأ��д���֤<br>
 * */
public class NumberCompare { // ������
	public static void main(String[] args) {
		float number1 = 4.001f; // ����int�ͱ���number1
		float number2 = 4.0010001663f; // ����int�ͱ���number2
		System.out.println("number1>number2�ķ���ֵΪ��" +(number1 > number2));
		/* ���ν�����number1�����number2�ıȽϽ����� */
		System.out.println("number1<number2�ķ���ֵΪ��"+(number1 < number2));
		System.out.println("number1==number2����ֵΪ��"+(number1== number2));
		System.out.println("number1!=number2����ֵΪ��"+(number1 != number2));
		System.out.println("number1>= number2����ֵΪ��"+(number1 >= number2));
		System.out.println("number1<=number2����ֵΪ��"+(number1 <= number2));
	}
}

