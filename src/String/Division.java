package String;
/**�ַ����ָString[] strArray=str.split( String mode , int limit )��mode���ָ�ģʽ����һ�ָ�"\\."����ʾ���ַ�'.'Ϊ�ָ������
 *                      �طָ�"\\.|2"����ʾ���ַ� '.' �� '2' Ϊ�ָ�����м��� '|' ��������limit�����Ʒָ������Ҳ���Ƿָ��
 *                      ���ַ�����Ŀ����limit���޾���<br><br>
 * ע�⣺�ָ����ָ���غ������ַ�ʱ�����ٷָ���������ָ�������Էָ��һ�����ַ�����������"\\.|1"Ϊ
 *          �ָ�ģʽ���ָ��ַ��� "221.331." ����һ�� '1'��'.' ֮����Էָ��һ�����ַ��������һ�� '1'��'.' ֮��
 *          ���ٷָ�ַ����� "1." ����һ���ָ����ء�<br>
 *          */

public class Division{
	public static void main(String[] args) {
		// �����ַ���
		String str = "21.92.168.0.1.";
		// ����"."���зָ�
		String[] firstArray = str.split("\\.|1");
		// ����"."�������ηָ�
		String[] secondArray = str.split("\\.|1", 2);
		// ���strԭֵ
		System.out.println("str��ԭֵΪ��[" + str + "]");
		// ���ȫ���ָ�Ľ��,����ʹ�õ���foreach���
		System.out.print("ȫ���ָ�Ľ����");
		for (String a : firstArray) {
			System.out.print("[" + a + "]");
		}
		System.out.println();
		for (String a : firstArray) {
			if((a.equals(""))==false){
			System.out.print("[" + a + "]");}
		}
		System.out.println(firstArray.length+"��");// ����
		// ����ָ����εĽ��
		System.out.print("�ָ����εĽ����");
		for (String a : secondArray) {
			System.out.print("[" + a + "]");
		}
		System.out.println();
		
		
		String str2="sfssffsds";
		String[] str3=str2.split("f");
		for(String s : str3){
			System.out.print("["+s+"]"+"p p");
		}
		System.out.println(str2);
	}
}
