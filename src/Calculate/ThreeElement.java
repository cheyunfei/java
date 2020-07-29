package Calculate;
/**三元运算符：    “条件式？值1：值2；”，值1表示条件式成立，值2表示条件式不成立*/
public class ThreeElement {
	static final int s1=20;
	static final int s2=45;
	final int s3=15;
	public static void main(String[] args) {
		boolean b = s1 >= s2 ? true : false ;
		int c= s1 < s2 ? 2:5;
		boolean a;
		if (20 < 45)
			a = true;
		else
			a = false;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
