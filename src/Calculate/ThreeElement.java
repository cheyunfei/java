package Calculate;
/**��Ԫ�������    ������ʽ��ֵ1��ֵ2������ֵ1��ʾ����ʽ������ֵ2��ʾ����ʽ������*/
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
