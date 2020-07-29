package Array;

import java.util.Arrays;;
/**һ������Ԫ������滻��ʹ���� Arrays �еķ���<br>
��1��Array.fill( int[] arr , int value )��������Ϊ����arr����Ҫ������滻Ԫ�ص�������󡿣�value����ֵvalue
                   ��������������Ԫ�ء�<br>
��2��Array.fill( int[] arr , int start , int end , int value )��������Ϊ����arr����Ҫ������滻Ԫ�ص��������
                  ��start������滻��ʼ���±꡿��end������滻�������±꣬�±�Ϊend��Ԫ�ز��滻��value��
                   ��ֵvalue�����������滻��Χ�ڵ�����Ԫ�ء�����start==endʱ�����滻<br><br>
   ������������Arrays.sort( object )��object����Ҫ������Ķ��󡿣�sort�ǰ���С��������<br>
   �����������飺ʹ���� Arrays �еķ���<br>
   ��1��int[] newarr=Arrays.copyOf( arr , int newlength)����������������Ϊ��������������arr������Ϊ 
                   newlength �������� newarr ��<br>
   ��2��int[] newarr=Arrays.copyOfRange( arr , int start , int end)����������������Ϊ��������������arr
                   �д� start �� end(������) ��Ԫ���������� newarr ��<br><br>
    �ġ������ѯ��ʹ���� Arrays �еķ�����int arr[] = new int[]{ 1, 8, 9, 5} ; Arrays.sort(arr) ;��ע�������ѯʹ
                                   �õķ��� binarySearch() �ǻ��ڶ��ַ������Բ�ѯǰ��������<br>
    ��1��int index=Arrays.binarySearch( arr , Object key)��arr����Ҫ����ѯ�����顿��key����Ҫ�����Ĺؼ��ʡ���
                      ��������� arr ����ֵ key������� -a-1 (a�ǽ� key ���뵽�����к󣬵�һ���ȴ�ֵ���ֵ������)��
                      ���������������ֵ���� key С������� -arr.length-1����������� key ������ڵ���0��ֵ��<br>
    ��2��int index=Arrays.binarySearch( arr , int start , int end , Object key )������������ arr �д� start ��ʼ��
                      end(������) ������Χ�ڵĹؼ��� key�������ֵ�ó��ķ���ͬ��һ����ͬ*/
public class OperateArray { // ������
	public static void main(String[] args) { // ������
		int arr[] = new int[5]; // ����int������
		Arrays.fill(arr, 8); // ʹ��ͬһ��ֵ������������
		for (int i = 0; i < arr.length; i++) { // ѭ�����������е�Ԫ��
			// �������е�Ԫ���������
			System.out.println("��" + i + "��Ԫ���ǣ�" + arr[i]);
		}
		
		int arr1[] = new int[] { 45, 12, 2, 10 }; // ���岢��ʼ��int������arr
		Arrays.fill(arr1, 1, 2, 8); // ʹ��fill������������г�ʼ��
		for (int i = 0; i < arr1.length; i++) { // ѭ������������Ԫ��
			// �������е�ÿ��Ԫ�����
			System.out.println("��" + i + "��Ԫ���ǣ�" + arr1[i]);
		}
		
		int arr2[]=new int[]{3,6,6,72,7};
		Arrays.sort(arr2);
		for(int x:arr2){
			System.out.print(x+" ");
			if(x==72) System.out.print("\n");
		}
		
		
		int arr3[] = new int[] { 23, 42, 12 }; // ��������
		int newarr[] = Arrays.copyOf(arr3, 5); // ��������arr
		for (int i = 0; i < newarr.length; i++) { // ѭ���������ƺ��������
			System.out.print(newarr[i]+" ");// �����������
		}
		System.out.println();
		
		int newarr2[]=Arrays.copyOfRange(arr3, 0, 4);
		for(int x:newarr2){
			System.out.print(x+" ");
		}
		System.out.println();
		
		int ia[] = new int[] { 1, 7, 9, 5}; // ����int������ia
		Arrays.sort(ia); // �������������
		int index1= Arrays.binarySearch(ia, 10); // ��������ia��Ԫ��10������λ��
		int index2=Arrays.binarySearch(ia, 8);
		System.out.println(index1+" "+index2);
		
		String str[] = new String[] { "ab", "cd", "ef", "yz" };
		Arrays.sort(str);
		int index = Arrays.binarySearch(str, 0, 2, "cd");
		System.out.println(index);
		
	}
}
