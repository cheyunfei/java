package Calculate;
/**��1���߼������&amp;&amp;��&amp;��|| �������ҽ�ϣ�������������<br>
 *��2��&amp;&amp;����·���������һ�����ʽfalse����ȥ����ڶ������ʽ<br>
 *��3��&amp;���Ƕ�·���������������������ʽ��Ҫ����<br>
 *��4��&amp;����λ�룬��2&amp;3����Ӧλ��Ϊ1�����λ��Ϊ1<br>
 *��5��|����λ����2|3����Ӧλ��Ϊ0�����λ��Ϊ0<br>
 *��6��~����λȡ������~7<br>
 *��7��^����λ����� 10^8��������Ӧλ��ͬ�����λΪ0<br>
 *��8����λ������'a&lt;&lt;3'����a����3λ���ұ߲�0��'a&gt;&gt;3'����a����3λ��aΪ����0��aΪ����1��
 *                        'a&gt;&gt;&gt;3'����a�޷�������3λ����ʼ�ղ�0<br>
 *��9����λ�����ʺϵ��������ͣ�byte,short,char,int,long<br>                        
*/
public class LogicAndBit { // ������
	public static void main(String[] args) {
		int a = 2; 
		int b = 5; 
		boolean result = ((a > b) && (a != b));//��Ҫʱ&&����ֻ����һ��false��ֹͣ
		int results=-2>>>32;//��ʹ&���false����Ȼ�����&�ұߵı��ʽ
		boolean result2 = ((a > b) || (a != b));
		System.out.println(result); 
		System.out.println(results);
		System.out.println(result2); 
	}
}

