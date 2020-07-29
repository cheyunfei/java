package Abstract;
/**��1������Ĵ���ͨ�� new ����ؼ��� ����䡰new ������������ʱ new �������������󣬵��ù��췽��<br><br>
 * ��2��ע��ͬһ�����в�ͬ����Գ�Ա�����������Ƕ����ģ��Ծ�̬�������������ص���<br><br>
 * ��3������Ĳ�����ʶ����ʵֻ��һ����������ã������һ��������ڴ��ַ<br><br>
 * ��4������ıȽϣ���obj1.equals(obj2)�������Ƚϵ��Ƕ��������Ƿ���ȡ�����obj1==obj2��,���Ƚϵ�
 *                       �Ƕ�������õ�ַ�Ƿ���ͬ��<br><br>
 * ��5����������٣����Ա��������ջ����Զ����ٵĶ����� new ���������ҳ������÷�Χ��obj=null����
 *                       ������Ա����١������ڷ� new �����Ķ���ͨ�������ж��� finalize() ������Object��ķ�������
 *                       �������ջ��ƺ� finalize ������ʱ�䲻������Java������ڴ����Ĵ���֮ǰ����ִ����������
 *                       ��ͨ����System.gc()��ǿ����������������<br><br>*/
public class CreateObject {
	private static int i=0;
	public CreateObject() { // ���췽��
		System.out.println("��������"+i);
		i++;
	}
	
	public CreateObject pp(){
		return this;
	}
	
	public static void main(String args[]) { // ������
		CreateObject x= new CreateObject(); // ��������
		System.out.println( x.pp());
		new CreateObject();
		
		
		String c1 = new String("abc"); // ��������String�Ͷ�������
		String c2 = new String("abc");
		String c3 = c1; // ��c1�������ø���c3
		//ʹ�á�==��������Ƚ�c1��c3
		System.out.println("c1==c3��������Ϊ��"+(c1==c3));
		// ʹ�á�==��������Ƚ�c2��c3
		System.out.println("c2==c3��������Ϊ��" + (c2 == c3));
		// ʹ��equals()�����Ƚ�c2��c3
		System.out.println("c2.equals(c3)��������Ϊ��" + (c2.equals(c3)));
		//ǿ�������������ջ���
		System.gc();
	}
}
