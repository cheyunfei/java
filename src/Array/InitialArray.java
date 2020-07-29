package Array;
/**（1）初始化一维数组：int x[]=new int[num]  或  int[] x=new int[num]  或  int[] x ; x=new int[num]，
 *                           num【数组可容纳元素个数，整数类型初始都为0，字符串类型初始都为null】，
 *                           声明之后可为数组每一个元素依次赋值<br><br>
 * （2）初始化一维数组：int x[]=new int[]{2,2,3,4}  或  int x[]={2,2,3,4}，声明的同时给数组赋初值<br><br>
 * （3）初始化二维数组：int arr[][] ; arr=new int[2][4]  或  int arr[][]=new int[2][4]  或  int arr[][]=new int[2][] ;
 *                                 a[0]=new int[2] ; a[1]=new int[4]，【数组可容纳元素个数，整数类型初始都为0，
 *                                 字符串类型初始都为null，第三种初始化方式可以创建两个不同维数的一维数组】
 *                                 声明之后可为数组每一个元素依次赋值<br><br>
 *（4）初始化二维数组：int arr[][] ; arr=new int[][]{{1,2},{2,4}}  或   int arr[][]=new int[2][] ; arr[0]=new int[]{4,5,6,6}
 *                        ; arr[1]=new int[5]，【注意 arr.length用来计算一维或二维数组，第一维长度；arr[0].length 用来计算二维数组，某一行的长度】<br><br>
 *（5）数组长度：int 长度=arr.length，即返回 int，【注意区分计算字符串长度的方法 str.length() 】<br><br>
 *（6）自定义类数组：MyClass[] arr=new MyClass[5]<br><br>
 *（7）数组初始：非常规数据类型数组的初始化，比如 BigDecimal[] s=new BigDecimal[100]，这时在使用这个数组之前需要初始化
 *  s[i]=new BigDeciaml("0")，不然在之后的赋值过程中会出错。<br><br>
 **/
public class InitialArray { // 创建类
	public static void main(String[] args) { // 主方法
		// 创建并初始化一维数组
		int day[]=new int[]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int p=1;
		for (int i : day) { // 利用循环将信息输出
			System.out.println(p++ + "月有" + i + "天"); // 输出的信息
		}
		System.out.println("这个数组长度为"+day.length);;
		
		
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