package Array;
/**��1����ʼ��һά���飺int x[]=new int[num]  ��  int[] x=new int[num]  ��  int[] x ; x=new int[num]��
 *                           num�����������Ԫ�ظ������������ͳ�ʼ��Ϊ0���ַ������ͳ�ʼ��Ϊnull����
 *                           ����֮���Ϊ����ÿһ��Ԫ�����θ�ֵ<br><br>
 * ��2����ʼ��һά���飺int x[]=new int[]{2,2,3,4}  ��  int x[]={2,2,3,4}��������ͬʱ�����鸳��ֵ<br><br>
 * ��3����ʼ����ά���飺int arr[][] ; arr=new int[2][4]  ��  int arr[][]=new int[2][4]  ��  int arr[][]=new int[2][] ;
 *                                 a[0]=new int[2] ; a[1]=new int[4]�������������Ԫ�ظ������������ͳ�ʼ��Ϊ0��
 *                                 �ַ������ͳ�ʼ��Ϊnull�������ֳ�ʼ����ʽ���Դ���������ͬά����һά���顿
 *                                 ����֮���Ϊ����ÿһ��Ԫ�����θ�ֵ<br><br>
 *��4����ʼ����ά���飺int arr[][] ; arr=new int[][]{{1,2},{2,4}}  ��   int arr[][]=new int[2][] ; arr[0]=new int[]{4,5,6,6}
 *                        ; arr[1]=new int[5]����ע�� arr.length��������һά���ά���飬��һά���ȣ�arr[0].length ���������ά���飬ĳһ�еĳ��ȡ�<br><br>
 *��5�����鳤�ȣ�int ����=arr.length�������� int����ע�����ּ����ַ������ȵķ��� str.length() ��<br><br>
 *��6���Զ��������飺MyClass[] arr=new MyClass[5]<br><br>
 *��7�������ʼ���ǳ���������������ĳ�ʼ�������� BigDecimal[] s=new BigDecimal[100]����ʱ��ʹ���������֮ǰ��Ҫ��ʼ��
 *  s[i]=new BigDeciaml("0")����Ȼ��֮��ĸ�ֵ�����л����<br><br>
 **/
public class InitialArray { // ������
	public static void main(String[] args) { // ������
		// ��������ʼ��һά����
		int day[]=new int[]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int p=1;
		for (int i : day) { // ����ѭ������Ϣ���
			System.out.println(p++ + "����" + i + "��"); // �������Ϣ
		}
		System.out.println("������鳤��Ϊ"+day.length);;
		
		
		int a[][];
		a=new int[2][];
		a[0]=new int[]{4,5,6,6};/*new int[3]*/;
		a[1]=new int[5];
		for(int x:a[1]){
			System.out.println(x);
		}
		
		
		int b[][]=new int[][]{{3,2,2,4},{4,4,5,7},{3,5,6,6}};
		int t=b.length;
		int t1=b[0].length;
		int t2=b[1].length;
		System.out.println(t+" "+t1+" "+t2);
		System.out.println();
		for(int x[]:b){
			for(int y:x){
				System.out.print(y);
			}
		}
	}
}