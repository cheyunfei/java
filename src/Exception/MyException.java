package Exception;

class CreateException extends Exception{
	String s;
	public CreateException(String error){
		super(error);
		s=error;
	}
	public String getMessage(){
		return s;
	}
	public String toString(){
		return s;
	}
}

/**
 * <p>（1）自定义异常：用户只需要继承 Exception 类即可自定义异常类<br>
 *          （1.1）class  MyE  extends  Exception{    public MyE(String error) { super(error); }    }<br>
             （1.2）MyE【自定义异常类名】，super【父类构造方法】，error【是要输出的错误信息】<br>
             （1.3）自定义异常在继承父类 Exception 后，可以不使用 super 来继承父类构造方法，可以通过覆盖父类的
                   【 public String getMessage() / public String toString()】 方法输出异常信息
 *<p>（2） 由方法抛出异常：如果不想再方法体中处理异常，可以通过将异常抛给调用该方法的调用者处理<br>
 *          （2.1）在方法声明阶段指定要抛给方法调用者的异常种类【int mothed（parameter1，parameter2） throws MyE】，
 *                 throws 关键字抛出异常，可以抛出多种异常，用逗号“,”隔开<br>
 *          （2.2）然后在方法体中按条件设置抛出自定义异常的语句【throw new MyE(error);】，java 内置异常可以不用 throw 显式
 *                       抛出。当遇到抛出异常时，由调用该方法的调用者使用 try-catch 捕获并处理异常<br>
 *           （2.3）可以将异常抛出方法体，由其他调用该方法的方法处理，也可以不处理，继续抛出，
 *                         直到遇到处理该异常的代码<br>
 *                         
 *<p>（3）异常在继承中的使用原则：当父类的方法抛出异常时，子类中若覆盖了此方法，则子类中的此方法要么不抛出异常，
 *                 要么抛出与覆盖前方法相同的异常或异常的子类或异常的子集，不能抛出新异常<br>                     
 *
 *
 */
public class  MyException{ // 创建类
	 // 定义方法，抛出异常
	static int avg(int number1, int number2) throws CreateException {
		if (number1 < 0 || number2 < 0) { // 判断方法中参数是否满足指定条件
			throw new CreateException("不可以使用负数"); // 错误信息
		}
		if (number1 > 100 || number2 > 100) { // 判断方法中参数是否满足指定条件
			throw new CreateException("数值太大了"); // 错误信息
		}
		return (number1 + number2) / 2; // 将参数的平均值返回
	}
	
	public static void main(String[] args) { // 主方法
		try { // try代码块处理可能出现异常的代码
			int result = avg(102, 150); // 调用avg()方法
			System.out.println(result); // 将avg()方法的返回值输出
		} catch (CreateException e) {
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage()); // 输出异常信息
		}
	}
}
