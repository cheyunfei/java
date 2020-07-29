package Exception;

/**<p>（1）处理异常机制：当某一方法中发生错误时，这个方法会创建一个异常对象并传给系统，将非正常处理代码与程序主逻辑
 *                             分离，在其他地方处理异常
 *<p> （2）注意发生异常时程序会终止，只有当存在处理异常的方法时，异常后面的代码才会顺利执行                           
 * <p>（3）处理异常的方法：try、catch、finally 这三部分组成<br>
 *             （3.1）try【可能会产生异常的Java代码】<br>
 *             （3.2）catch( Exception e )：Exception【指定异常类型，获得异常信息】，e.getMessage()【错误性质】，
 *                                  e.toString()  【异常类型和性质】，e.printStackTrace()【异常详细信息】<br>
 *             （3.3）finally【异常处理最后的执行部分，不管会不会发生异常，无论如何都会执行的代码】，会使finally终止的情况
 *                                       【finally本身发生异常，在finally之前程序退出System.exit()，
 *                                         线程死亡，关闭CPU】<br>
 *              （3.4）try 中的语句发生异常时，程序将不会执行 try 中异常语句之后的语句，转而开始执行 catch和 finally代码块<br>
 *              （3.5）捕获异常的 catch 可以同时有多个，某一个 catch 捕获到异常后，后面的 catch 将不会执行；由
 *                      于 Exception 是所有异常的父类，如果将 catch( Exception e ) 放在第一个位置，那么后面的 catch 将永
 *                      远不会执行
 *<p>（4）常见的异常：<br>
 *     （4.1）ClassCastException：类型转换异常<br>
 *     （4.2）ClassNotFoundException：未找到相应类异常<br>
 *     （4.3）ArithmeticException：算数异常<br>
 *     （4.4）ArrayIndexOutOfBoundsException：数组下标越界异常<br>
 *     （4.5）ArrayStoreException：数组中包含不兼容的值抛出的异常<br>
 *     （4.6）SQLException：操作数据库异常类<br>
 *     （4.7）NullPointerException：空指针异常<br>
 *     （4.8）NoSuchFieldException：字段未找到异常<br>
 *     （4.9）NoSuchMethodException：方法未找到抛出的异常<br>
 *     （4.10）NumberFormatException：字符串转换为数字抛出的异常【java.lang.NumberFormatException】<br>
 *     （4.11）NegativeArraySizeException：数组元素个数为负数抛出的异常<br>    
 *     （4.12）StringIndexOutOfBoundsException：字符串索引超出范围抛出的异常<br>
 *     （4.13）IOException：输入输出异常<br>
 *     （4.14）IllegalAccessException：不允许访问某类异常<br>
 *     （4.15）InstantiationException：当应用程序试图使用 Class 类中的 newInstance() 方法创建一个类的实例，而指定
 *                    的类的对象无法被实例化时，抛出该异常<br>
 *     （4.16）EOFException：文件已结束异常<br>
 *     （4.17）FileNotFoundException：文件未找到异常<br>   
 *     
 *<p>（5）Throwable 类派生两个子类，Exception 类【非致命性类，其按错误原因分为 RuntimeException 类、其他子类】和
 *             Error 类【严重错误类，java 运行系统中的内部错误及资源耗尽错误】
 * 
 *
 */
public class TakeException {             // 创建类
	public static void main(String[] args) {
		try {                                          // try语句中包含可能出现异常的程序代码
			String str = "lili";                      // 定义字符串变量
			System.out.println(str + "年龄是："); // 输出的信息
			int age = Integer.parseInt("20"); // 数据类型转换
			System.out.println(age);
		}catch (Exception e) {// catch语句块用来获取异常信息
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());// 输出异常性质
		}finally{
		System.out.println("异常（即try/catch/finally）之后的语句,program over"); // 输出信息
		}
	}
}
