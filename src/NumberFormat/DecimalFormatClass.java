package NumberFormat;

import java.text.*;

/**（1）十进制数字格式化输出：使用类 DecimalFormat，其是 NumberFormat 的子类<br><br>
 * （2）格式化的两种方式：<br>
 * (2.1)实例化 DecimalFormat 类时传递数字格式：一、DecimalFormat myf=new DecimalFormat( String str )，str【为
 *                           格式字符串】；二、String output=myf.format( value )，value【将要被格式化的数字】，output【
 *                           格式化后的数字字符串】<br>
 * (2.2)实例化 DecimalFormat 类后用专门的方法传递数字格式：一、DecimalFormat myf=new DecimalFormat()；
 *                         二、 myf.applyPattern( String str )，str【为格式字符串】；三、 String output=myf.format( value )，value
 *                         【将要被格式化的数字】，output【格式化后的数字字符串】<br><br>
 * （3）格式规定：<br>   0【表示一位阿拉伯数字，该位不存在则显示0】<br>
 *                      #【表示一位阿拉伯数字，该位不存在不显示】<br>
 *                      .【小数分隔符或货币小数分隔符】<br>
 *                      -【负号】<br>
 *                      ,【分组分隔符】<br>
 *                      E【科学计数法中分割尾数和指数 】<br>
 *                      %【放置在格式的前缀或后缀，数字显示为百分数，%仍然按格式的位置显示】<br>
 *                      \u2030【放置在格式的前缀或后缀，数字显示为千分数，千分号(\u2030)仍然按格式的位置显示】<br>
 *                      \u00A4【放置在格式的前缀或后缀，作为货币记号】<br>
 *                      '【此处是单引号，为以上特殊符号加上单引号，系统将视此符号为普通符号处理，即原样输出，而不会替换为数字】<br>
 *  (3.0)注意：百分号和千分号出现时，数字先乘以100或1000，然后再按格式变换<br>
 *  (3.1)注意：在格式字符串中，当需要货币记号\u00A4或千分号\u2030时，由于键盘无法打出这两个符号；需要使用
 *     转义字符，货币记号【“&#92;u00A4”】，千分号【“&#92;u2030”】<br><br>
 * （4）输出格式分组：DecimalFormat myf=new DecimalFormat()<br>
 *                                myf.setGroupingUsed( boolean b )，b【设置是否分组，b 值默认为 true 分组】<br>
 *                                myf.setGroupingSize( int size )，size【设置分组大小，size 值默认为 3 ，分组是按小数点开始向左右分组】<br>*/

public class DecimalFormatClass {
	// 使用实例化对象时设置格式化模式
	static public void SimgleFormat(String pattern, double value) {
		// 实例化DecimalFormat对象
		DecimalFormat myFormat = new DecimalFormat(pattern); 
		String output = myFormat.format(value); // 将数字进行格式化
		System.out.println(value + " " + pattern + " " + output);
	}
	
	// 使用applyPattern()方法对数字进行格式化
	static public void UseApplyPatternMethodFormat(String pattern, double value) {
		DecimalFormat myFormat=new DecimalFormat();//实例化DecimalFormat对象
		myFormat.applyPattern(pattern); // 调用applyPatten()方法设置格式化模板
		System.out
				.println(value + " " + pattern + " " + myFormat.format(value));
	}
	
	public static void main(String[] args) {
		SimgleFormat("###,###.###", 123456.789);// 调用静态SimgleFormat()方法
		SimgleFormat("00000000.###kg", 123456.789); // 在数字后加上单位
		// 按照格式模板格式化数字，不存在的位以0显示
		SimgleFormat("000000.000", 123.78);
		// 调用静态UseApplyPatternMethodFormat()方法
		UseApplyPatternMethodFormat("%#.######", 0.789); // 将数字转换为百分数形式
		UseApplyPatternMethodFormat("00000.000%", 0.789);
		// 将小数点后格式化为两位
		UseApplyPatternMethodFormat("\u00A4###.##", 123456.789);
		// 将数字转化为千分数形式
		UseApplyPatternMethodFormat("0.0000\u2030", 0.789);
		
		DecimalFormat myFormat = new DecimalFormat();
		myFormat.setGroupingSize(4); // 设置将数字分组为2
		String output = myFormat.format(123456.744549);
		myFormat.setGroupingUsed(false); // 设置不允许数字进行分组
		String output2 = myFormat.format(123456.744549);
		System.out.println(output+"          "+output2);
	}
}

