package ProgramLogic;
/**��1��ע�⡱do...while(���ʽ);�������һ���ֺš�;��<br>
 * ��2��forѭ����ִ�й��̣���ʼ�����ʽ���������ʽ�ж������飬�����������������ʽ�ж�.....��ע���ʼ��
 *            ���������ж�������ֱ����������ִ��<br>
 * ��3��forѭ����������ѭ����ʽ����for(;;){}��<br>
 * ��4��foreach��䣺for�ļ򻯰汾����������������飬��for(����x : ��������) { ��xִ�еĲ��� }��*/
public class WhileAndFor { // ������
	public static void main(String args[]) { // ������
		int a = 100; // ����int�ͱ���a������ֵ100
		while (a == 60) // ָ������ѭ��������
		{
			System.out.println("ok1"); // while���ѭ����
			a--;
		}
		
		int b = 100; // ����int�ͱ���b������ֵ100
		do {
			System.out.println("ok2"); // do��while���ѭ����
			b--;
		} while (b == 60); // ָ��ѭ����������
		
		
		int sum = 0; // �������������ڱ��������Ӻ�Ľ��
		for (int i = 2; i <= 100; i += 2) {
			sum = sum + i; // ָ��ѭ��������ѭ����
		}
		System.out.println("2��100֮�������ż��֮��Ϊ��" + sum); 
		
		int arr[] = { 7, 10, 1 }; 
		for (int x : arr) {//foreach��䣬int x���õı�����arrָ��Ҫѭ�����������飬���x���
			System.out.println(x);
		}
	}
}