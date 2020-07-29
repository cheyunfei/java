package String;
/**�ַ������ɣ�һ����ʽ���޸��ַ�����ʵ�Ǵ����һ���µ��ַ�������Ƶ���Ķ��ַ�����Ӵ�ϵͳ����������ʹ
               �õ��� StringBuiler ���ڴ��еı�������ԭ�ַ����ռ��ϵĶ�̬�޸�<br>
��1�������ַ�����������StringBuiler builder=new StringBuilder( String str )��str����ʼ�ַ�����<br>
��2��StringBuilder�����ӣ�builder.append( content )������ StringBuilder����ԭ�ַ�����׷��content��
                          content��������һ���͵����ݣ�int��double�ȣ�Ҳ��������һ���ַ���������StringBuilder��<br>
��3��StringBuilder���ɾ����builder.delete( int start , int end )������ StringBuilder��start����ʼɾ����λ�á�
                               ��end��ɾ��������λ�õ���ɾ���±�Ϊ end λ�õ��ַ���<br>
��4��StringBuilder��Ĳ��룺builder.insert( int index , content)������ StringBuilder��index����Ҫ�����λ�ã�
                                     ��� index �����ַ������ȣ�����Խ����󡿣�content����Ҫ��������ݣ�content����
                                     ����һ���͵����ݣ�int��double�ȣ�Ҳ��������һ���ַ���������StringBuilder��*/

public class BuilderStr { // �½���
	public static void main(String[] args) { // ������
		String str = ""; // �������ַ���
		// ������ַ���ִ�в�������ʼʱ��
		long starTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) { // ����forѭ��ִ��10000�β���
			str = str + i; // ѭ��׷���ַ���
		}
		long endTime = System.currentTimeMillis(); // ������ַ����������ʱ��
		long time = endTime- starTime; // ������ַ���ִ�в�����ʱ��
		System.out.println("Sting����ʱ�䣺" + time); // ��ִ�е�ʱ�����
		StringBuilder builder = new StringBuilder(""); // �����ַ���������
		starTime = System.currentTimeMillis(); // �������ִ��ǰ��ʱ��
		for (int j = 0; j < 10000; j++) { // ����forѭ�����в���
			builder.append(j); // ѭ��׷���ַ�
		}
		endTime = System.currentTimeMillis(); // ����������ʱ��
		time = endTime - starTime; // ׷�Ӳ���ִ�е�ʱ��
		System.out.println("StringBuilder����ʱ�䣺" + time); // ������ʱ�����
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
