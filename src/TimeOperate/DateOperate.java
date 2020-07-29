package TimeOperate;

import java.util.*;

/**获取当前系统毫秒级时间：long time=System.currentTimeMillis()，返回长整型整数long，【获取从1970-01-01 00:00:00 到现在经过的毫秒数】<br>
 * 获取当前日期和时间：Date p=new Date()，在类 Date 的基础上可以获得当前的时间、日期、时区<br>*/
public class DateOperate {
	public static void main(String[] args){
		long pt=System.currentTimeMillis();
		Date p=new Date();
		System.out.println(pt);
	}
}