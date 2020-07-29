package String;

import java.util.*;
/**字符串格式化：String s=String.format( String mode , Object obj)，mode【格式化模式】，obj【将要被格式化
                       的对象】<br>
   obj：如果格式化对象为 Date，即表示对日期时间的格式化处理；如果是一般的参数类型，比如 String.format( "%x" , 345)，
          表示将整数 345 格式化为十六进制数，"%x"和"%X"的区别在于格式化后十六进制中出现的 abcdef 大小写，"%x"小写，
           "%X"大写<br>
    格式化模式大全：Java从入门到精通，P97-P100*/
public class ReformatStr { // 新建类
	public static void main(String[] args) { // 主方法
		Date date = new Date(); // 创建Date对象date
		System.out.println(date);
		String year = String.format("%tY", date); // 将date进行格式化
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		System.out.println("今年是：" + year + "年"); // 输出信息
		System.out.println("现在是：" + month);
		System.out.println("今天是：" + day + "号");
		System.out.println(String.format("%tQ", date));
	}
}
