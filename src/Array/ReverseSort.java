package Array;

/**
 * ��ת�����㷨ʵ��
 * 
 * @author Che YunFei
 */
public class ReverseSort {
	public static void main(String[] args) {
		// ����һ������
		int[] array = { 10, 20, 30, 40,33, 50, 60 };
		// ������ת������Ķ���
		ReverseSort sorter = new ReverseSort();
		// �����������ķ��������鷴ת
		sorter.sort(array);
		float xx=7;float p=2;
		float x=xx/2;
		System.out.println(x);
	}
	
	/**
	 *ֱ��ѡ������
	 * 
	 * @param array
	 *            Ҫ���������
	 */
	public void sort(int[] array) {
		System.out.println("����ԭ�����ݣ�");
		showArray(array);// �������ǰ������ֵ
		int temp;
		int len = array.length;
		for (int i = 0; i < len / 2; i++) {
			temp = array[i];
			array[i] = array[len - 1 - i];
			array[len - 1 - i] = temp;
		}
		System.out.println("���鷴ת�����ݣ�");
		showArray(array);// �������������ֵ
	}
	
	/**
	 * ��ʾ��������Ԫ��
	 * 
	 * @param array
	 *            Ҫ��ʾ������
	 */
	public void showArray(int[] array) {
		for (int i : array) {// foreach��ʽ��������
			System.out.print("\t" + i);// ���ÿ������Ԫ��ֵ
		}
		System.out.println();
	}
	
}
