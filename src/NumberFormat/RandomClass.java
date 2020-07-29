package NumberFormat;
import java.util.Random;
/**（1）产生随机数的两种方法：Math.random() 和 java.util.Random 类<br><br>
 * （2）random() 方法：此方法可以产生 0.0&lt;=m&lt;1.0 的 double 型随机数，该方法以当前时间为参数生成随机数
 *        ，属于伪随机数<br>
 *     注意：对 random() 方法稍加处理，如 m + int ( Math.random() * n )【可以产生 m~m+n 之间的随机数】；
 *             如 ( char )( char1 + Math.random() * ( char2 - char1 +1 ) )【可以产生两个符号 char1 和 char2 之间的任意一个
 *             符号】<br><br>
 *  （3）实例化 Random 对象：实例化对象时的种子可以理解为进行随机数运算时必要的参数，但是对于人为设定种子值的意义
 *             何在（？）尚不明确<br>
 *    (3.1)Random r=new Random()：默认以当前时间作为种子，随着时间的变化产生不同的随机数<br>
 *    (3.2)Random r=new Random( long seed ) 或  r.setSeed( long seed ) 设定种子值：这里随机数完全由种子值确定，
 *        即对于有相同种子值的两个 Random 对象在程序一次运行中产生的随机数完全相同；而对于某一种子值的随机数生成
 *        器，在程序一次运行中可以产生的多个不同随机数，但是程序多次运行产生的随机数结果不变<br><br>
 *  （4）Random 对象方法：Random r=new Random(seed)<br>
 *    (4.1)int r.nextInt()：返回 int，返回一个随机整数<br>
 *    (4.2)int r.nextInt(int n)：返回 0&lt;=m&lt;n 的随机整数<br>
 *   (4.3)long r.nextLong()：返回一个随机长整数<br>
 *   (4.4)boolean r.nextBoolean()：返回一个随机 boolean 值<br>
 *   (4.5)float r.nextFloat()：返回一个随机 float 值<br>
 *   (4.6)double r.nextDouble()：返回一个随机 double 值<br>
 *   (4.5)double r.nextGaussian()：返回一个概率密度为高斯分布的随机 double 值<br>
 *  */
public class RandomClass {
    public void randomnum(){
    	Random r=new Random(100);
    	System.out.println("随机产生一个整数:" + r.nextInt());
    	System.out.println("随机产生一个整数:" + r.nextInt());

		System.out.println(getClass().getName());
    }
	public static void main(String[] args) {
		RandomClass p=new RandomClass();
		p.randomnum();
		//randomnum();
		Random r = new Random(); // 实例化一个Random类
		// 随机产生一个整数
		System.out.println("随机产生一个整数:" + r.nextInt());
		// 随机产生一个大于等于0小于10的整数
		System.out.println("随机产生一个大于等于0小于10的整数：" + r.nextInt(10));
		// 随机产生一个布尔型的值
		System.out.println("随机产生一个布尔型的值：" + r.nextBoolean());
		// 随机产生一个双精度型的值
		System.out.println("随机产生一个双精度型的值：" + r.nextDouble());
		// 随机产生一个浮点型的值
		System.out.println("随机产生一个浮点型的值：" + r.nextFloat());
		// 随机产生一个概率密度为高斯分布的双精度值
		System.out.println("随机产生一个概率密度为高斯分布的双精度值："
				+ r.nextGaussian());
	}

}
