package Array;

import java.util.Arrays;;
/**一、数组元素填充替换：使用类 Arrays 中的方法<br>
（1）Array.fill( int[] arr , int value )，以整数为例，arr【将要被填充替换元素的数组对象】，value【将值value
                   赋给数组中所有元素】<br>
（2）Array.fill( int[] arr , int start , int end , int value )，以整数为例，arr【将要被填充替换元素的数组对象】
                  ，start【填充替换开始的下标】，end【填充替换结束的下标，下标为end的元素不替换】value【
                   将值value赋给数组中替换范围内的所有元素】，当start==end时，不替换<br><br>
   二、数组排序：Arrays.sort( object )，object【将要被排序的对象】，sort是按从小到大排序<br>
   三、复制数组：使用类 Arrays 中的方法<br>
   （1）int[] newarr=Arrays.copyOf( arr , int newlength)，这里以整数数组为例，【复制数组arr至长度为 
                   newlength 的新数组 newarr 】<br>
   （2）int[] newarr=Arrays.copyOfRange( arr , int start , int end)，这里以整数数组为例，【复制数组arr
                   中从 start 至 end(不包括) 的元素至新数组 newarr 】<br><br>
    四、数组查询：使用类 Arrays 中的方法，int arr[] = new int[]{ 1, 8, 9, 5} ; Arrays.sort(arr) ;【注意数组查询使
                                   用的方法 binarySearch() 是基于二分法，所以查询前必须排序】<br>
    （1）int index=Arrays.binarySearch( arr , Object key)，arr【将要被查询的数组】，key【将要检索的关键词】，
                      【如果数组 arr 内无值 key，则输出 -a-1 (a是将 key 插入到数组中后，第一个比此值大的值的索引)；
                      如果此数组内所有值都比 key 小，则输出 -arr.length-1；如果检索到 key 输出大于等于0的值】<br>
    （2）int index=Arrays.binarySearch( arr , int start , int end , Object key )，【检索数组 arr 中从 start 开始到
                      end(不包括) 结束范围内的关键字 key】，结果值得出的方法同上一个相同*/
public class OperateArray { // 创建类
	public static void main(String[] args) { // 主方法
		int arr[] = new int[5]; // 创建int型数组
		Arrays.fill(arr, 8); // 使用同一个值对数组进行填充
		for (int i = 0; i < arr.length; i++) { // 循环遍历数组中的元素
			// 将数组中的元素依次输出
			System.out.println("第" + i + "个元素是：" + arr[i]);
		}
		
		int arr1[] = new int[] { 45, 12, 2, 10 }; // 定义并初始化int型数组arr
		Arrays.fill(arr1, 1, 2, 8); // 使用fill方法对数组进行初始化
		for (int i = 0; i < arr1.length; i++) { // 循环遍历数组中元素
			// 将数组中的每个元素输出
			System.out.println("第" + i + "个元素是：" + arr1[i]);
		}
		
		int arr2[]=new int[]{3,6,6,72,7};
		Arrays.sort(arr2);
		for(int x:arr2){
			System.out.print(x+" ");
			if(x==72) System.out.print("\n");
		}
		
		
		int arr3[] = new int[] { 23, 42, 12 }; // 定义数组
		int newarr[] = Arrays.copyOf(arr3, 5); // 复制数组arr
		for (int i = 0; i < newarr.length; i++) { // 循环变量复制后的新数组
			System.out.print(newarr[i]+" ");// 将新数组输出
		}
		System.out.println();
		
		int newarr2[]=Arrays.copyOfRange(arr3, 0, 4);
		for(int x:newarr2){
			System.out.print(x+" ");
		}
		System.out.println();
		
		int ia[] = new int[] { 1, 7, 9, 5}; // 定义int型数组ia
		Arrays.sort(ia); // 将数组进行排序
		int index1= Arrays.binarySearch(ia, 10); // 查找数组ia中元素10的索引位置
		int index2=Arrays.binarySearch(ia, 8);
		System.out.println(index1+" "+index2);
		
		String str[] = new String[] { "ab", "cd", "ef", "yz" };
		Arrays.sort(str);
		int index = Arrays.binarySearch(str, 0, 2, "cd");
		System.out.println(index);
		
	}
}
