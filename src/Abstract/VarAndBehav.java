package Abstract;
/**��1������Ա����������������ԣ�����ȫ�ֱ��������Բ����ֵ������Ĭ��ֵ������󴴽��Ĺ����У���Ա����Ҳ��ʼ����
 *                                ���ֲ����������������ֵ���������<br>
 *��2����Ա����ִ�е� return �����<br>
 *��3�� private���ó�Ա�����ͳ�Ա����ֻ���ڱ����б�ʹ�ã������в��ɼ����������е��κ��಻�ɼ�<br>
 *��4��protected���������ͬ�������������ɼ����������е�������಻�ɼ�<br>
 *��5��public���κ�������඼�ɼ�<br>
 *��6����ͨ�ⲿ������η�ֻ������ public������(Abstract)����̬�������� private��protected��������ȱʡ�����η�
 *           Ȩ�޴�С�� protected ��ͬ���κ���ķ��������η������� private�����з�����Ȩ�����������Ȩ��<br>
 *     ��6.1�����ڲ�������η������� private��protected<br>
 *��7��this��this.��������������ʹ�ã��������������ã��������ö���ĳ�Ա�����ͳ�Ա��������Ҳ���Ե�����Ĺ��췽��
 *                   ��this������������������ֻ�����޲ι��췽���еĵ�һ������вι��췽������Ҳ���Ե���������
 *                   ����ֵ��return this�������ʾ����ֵΪ�࣬ע�ⲻ��������ݲ�����÷���;static ��̬�����в���ʹ
 *                   �� this �ؼ���<br>
 * ��7.1�������е��õ����ַ�����this.����������.����������ȻҲ������ this.����������.������<br><br>
 *��8����Ĺ��췽����public  ClassName��������{������}�����޹��췽����ʱ��������Զ�����һ�����������Ĺ���
 *                              ������ֻ�������вι��췽��ʱ���޷������޲ι��췽��<br><br>
 * ��9��static��static���εı������������������������У�ʹ�á�����.������������Щ��Ա��static���ε���������������
 *                    ִ�У�Ȼ������๹�췽��<br>
 *   ��9.1����ʹ�� static ���εķ���������̬�����в���ʹ�� this �ؼ��֣��Ҳ�����ֱ�ӵ��á��Ǿ�̬�������͡�ȫ�ַǾ�̬��������
 *                    ���Ǿ�̬�������͡�ȫ�ַǾ�̬�������༶��ķǾ�̬������������ͨ��������õķ�ʽʹ�ã����ͬ����
 *                     ��̬����������������<br><br>
 *��10���������У����������������Ҫ����ʱ���һ���ѡ�����з�ʽ��ѡ���������ã��ڶ�Ӧ��Ĳ������������ò���<br>
 **/
public class VarAndBehav {
	private String name;
	public static void main(String[] args){
		VarAndBehav book=new VarAndBehav("dc");
		String x=book.getName();
		System.out.println(x);
		book.method2();
		System.out.println("����ֵΪ�ࣺ"+book.getVariable());
		VarAndBehav.dd();
	}
	static{
		System.out.println("����ִ��static��ǵĳ����");
		}
	public VarAndBehav(String a){
		System.out.println("�вι��췽��");
	}
	public String getName(){
		int id=0;
		setName("Java");
		return id+this.name;
	}
	private void setName(String name){
		this.name=name;
	}
	public VarAndBehav getVariable(){
		return this;
	}
	
	public static void dd(){
		VarAndBehav ss=new VarAndBehav("dc");
		System.out.println(ss.getName());
	}
	
	
	final static double PI=3.23;
	static int id;
	public static void method1(){}
	public void method2(){
		System.out.println(VarAndBehav.PI);
		System.out.println(VarAndBehav.id);
		VarAndBehav.method1();
	}

}
