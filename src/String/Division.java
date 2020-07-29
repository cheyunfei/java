package String;
/**字符串分割：String[] strArray=str.split( String mode , int limit )，mode【分割模式：单一分割"\\."，表示以字符'.'为分割符；多
 *                      重分割"\\.|2"，表示以字符 '.' 或 '2' 为分割符，中间以 '|' 隔开】，limit【限制分割次数，也就是分割后
 *                      子字符串数目】，limit有无均可<br><br>
 * 注意：分割符或分割符簇后再无字符时，不再分割；相邻两个分割符还可以分割出一个空字符串，【如以"\\.|1"为
 *          分割模式，分割字符串 "221.331." ，第一个 '1'和'.' 之间可以分割出一个空字符串，最后一个 '1'和'.' 之间
 *          不再分割，字符串中 "1." 就是一个分隔符簇】<br>
 *          */

public class Division{
	public static void main(String[] args) {
		// 创建字符串
		String str = "21.92.168.0.1.";
		// 按照"."进行分割
		String[] firstArray = str.split("\\.|1");
		// 按照"."进行两次分割
		String[] secondArray = str.split("\\.|1", 2);
		// 输出str原值
		System.out.println("str的原值为：[" + str + "]");
		// 输出全部分割的结果,以下使用的是foreach语句
		System.out.print("全部分割的结果：");
		for (String a : firstArray) {
			System.out.print("[" + a + "]");
		}
		System.out.println();
		for (String a : firstArray) {
			if((a.equals(""))==false){
			System.out.print("[" + a + "]");}
		}
		System.out.println(firstArray.length+"草");// 换行
		// 输出分割两次的结果
		System.out.print("分割两次的结果：");
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
