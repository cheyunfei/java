package String;
/**�ַ������巽���У�<br>
��1�������壬String s=new String("sdfasdf");<br><br>
��2��ֱ���ַ�����ֵ��String s3="1+2";<br><br>
��3��ʹ���ַ���������壬char a[ ]={'a','v',' ','c'}��String s=new String(a,int head,int length) ��a��ʾ�ַ�����
      ����head��ʼ��ȡ�ַ�������±꣬length��ȡ�ַ���Ŀ������head��length����ʡ��<br><br>
��4��ʹ�� byte[] �ֽ���������壬byte a[]��String s=new String(a,int head,int length)��a��ʾ�ֽ�����
      ����head��ʼ��ȡ�ֽ�������±꣬length��ȡ�ֽ���Ŀ������head��length����ʡ�ԡ��������ֽ�������ASCII��ռһ���ֽڣ�����
      ռ�����ֽڣ����˹��췽�����������ı����Щ��ASCII�룬��Щ�Ǻ��ӣ������ʹ�õ� head��length ��ɺ��ӱ��ָ��޷�������ȡ�ͻ�
      ��ɺ������룬����ASCII������������<br>
��4.1��ʹ��ϵͳ�����ʱ��  System.in.read(byte a[])���ǽ��ն�������ַ�ת�����ֽڣ�����ASCII���ַ����ֽ�������ռһ���ֽڣ�����
  ���ֽ�������ռ�����ֽڡ���ֱ���� System.out.print(a[i]) ʱ����ֱ�Ӱ��ֽ������е� byte ���������������һ�����֣���ȻASCII��
  �ַ���һ�����֣��������������֣���System.out.write(a[i]) ʱ���ǽ��ֽ������е�ÿ�� byte ������ת�����ַ���Ȼ�������������һ��һ��
  ת��������ASCII���������ת�������Ǻ��ӾͲ����ˡ�<br>
  ��4.2��ʹ���ն������ʱ�� System.in.read(byte a[])���س�Ҳ������س��ͻ��������ַ���������� byte[] �����㹻�Ļ����������ַ�
  Ҳ������ֽ������С�<br><br>
 ��5�����ʱ���ַ����������ַ������ӣ����ַ������ַ������ʱ������ toString()
 */
public class InitailString { // ������
	public static void main(String args[]) { // ������
		String s1 = new String("hello"); // ����String����s1
		String s2 = new String("word"); // ����String����s2
		String s = s1 + " " + s2; // ������s1��s2���Ӻ�Ľ����ֵ��s
		String s3="1+2";
		String s5=new String("sdfasdf");
		char a[ ]={'a','v',' ','c'};
		String s4=new String(a,1,3);
		System.out.println(s4);
		System.out.println("ddggg\n"+'g'); // ��s���
		String s6="������";
		byte[] b=s6.getBytes();
		System.out.println(b.length);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		System.out.println(new String(b,0,b.length));
	}
}