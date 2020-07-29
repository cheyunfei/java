package String;
/**字符串生成：一般形式的修改字符串其实是创造出一个新的字符串对象，频繁改动字符串会加大系统开销，这里使
               用的类 StringBuiler 在内存中的表现是在原字符串空间上的动态修改<br>
（1）创建字符串生成器：StringBuiler builder=new StringBuilder( String str )，str【初始字符串】<br>
（2）StringBuilder类的添加：builder.append( content )，返回 StringBuilder，【原字符串后追加content，
                          content可以是任一类型的数据，int、double等，也可以是另一个字符串生成器StringBuilder】<br>
（3）StringBuilder类的删除：builder.delete( int start , int end )，返回 StringBuilder，start【开始删除的位置】
                               ，end【删除结束的位置但不删除下标为 end 位置的字符】<br>
（4）StringBuilder类的插入：builder.insert( int index , content)，返回 StringBuilder，index【将要插入的位置，
                                     如果 index 超出字符串长度，产生越界错误】，content【将要插入的内容，content可以
                                     是任一类型的数据，int、double等，也可以是另一个字符串生成器StringBuilder】*/

public class BuilderStr { // 新建类
	public static void main(String[] args) { // 主方法
		String str = ""; // 创建空字符串
		// 定义对字符串执行操作的起始时间
		long starTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) { // 利用for循环执行10000次操作
			str = str + i; // 循环追加字符串
		}
		long endTime = System.currentTimeMillis(); // 定义对字符串操作后的时间
		long time = endTime- starTime; // 计算对字符串执行操作的时间
		System.out.println("Sting消耗时间：" + time); // 将执行的时间输出
		StringBuilder builder = new StringBuilder(""); // 创建字符串生成器
		starTime = System.currentTimeMillis(); // 定义操作执行前的时间
		for (int j = 0; j < 10000; j++) { // 利用for循环进行操作
			builder.append(j); // 循环追加字符
		}
		endTime = System.currentTimeMillis(); // 定义操作后的时间
		time = endTime - starTime; // 追加操作执行的时间
		System.out.println("StringBuilder消耗时间：" + time); // 将操作时间输出
		StringBuilder s=new StringBuilder("");
		for(int j=0;j<10;j++){
			System.out.println(s.append(j));
		}
		long pt=System.currentTimeMillis();
		System.out.println(pt);
		StringBuilder ss=new StringBuilder("hello");
		ss.insert(5, "word");
		System.out.println(ss.toString());
	}
}
