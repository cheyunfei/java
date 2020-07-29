package DataClass;
/**（1）Boolean 类封装基本类型 boolean<br>
 * （2）Boolean 构造：”Boolean b1 = new Boolean(boolean value)“，【通过引用 boolean 型变量获取
 *                          Boolean 对象】；Boolean b2 = new Boolean(String str)，【通过引用 boolean 型字符串
 *                          获取 Boolean 对象，其中 str 忽略大小写等于“true”时，Boolean对象的值为 true ；其他任何
 *                          形式的字符串如“ok”都视 Boolean 对象的值为 false 】<br><br>
 *  （3）Boolean 类的方法：Boolean b = new Boolean( boolean value )<br>
 *            （3.1）“b.booleanValue()”:返回 boolean ，【返回 Boolean 对象对应的 boolean 值】<br>
 *            （3.2）“b.equals( Object obj )”:返回boolean，obj 【可以是Boolean对象，也可以是基本
 *                        类型 boolean 的变量】，比较两个Boolean对象值是否相等<br>
 *             （3.3）“Boolean.parseBoolean( String str)”：返回 boolean，将字符串解析为对应的 boolean 值
 *                   ，规则和构造 Boolean 类对象时一样 ，str 忽略大小写等于“true”时，Boolean对象的值为 true ；
 *                   其他任何形式的字符串如“ok”都视 Boolean 对象的值为 false<br>
 *              （3.4）String str=b.toString()<br>
 *              （3.5）Boolean boo=Boolean.valueOf( String str)<br>
 * （4）Boolean 类的常量： Boolean.TRUE；Boolean.FALSE；Boolean.TYPE*/
public class BooleanClass { // 创建类GetBoolean
	public static void main(String args[]) { // 主方法
		Boolean b1 = new Boolean(true); // 创建Boolean对象
		Boolean b2 = new Boolean("tRue"); // 创建Boolean对象
		boolean a=b1.equals(b2);
		boolean b=Boolean.parseBoolean("tRue");
		String c=b1.toString();
		Boolean d=Boolean.valueOf("ww");
		System.out.println(a+" "+b+" "+c+" "+d);
		System.out.println("b1：" + b1.booleanValue());
		System.out.println("b2：" + b2.booleanValue());
		Class<Boolean> b3=Boolean.TYPE;//? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?
		System.out.println(Boolean.TRUE+" "+Boolean.FALSE+" "+Boolean.TYPE+" "+b3);
	}
}

