package Exception;

/**<p>��1�������쳣���ƣ���ĳһ�����з�������ʱ����������ᴴ��һ���쳣���󲢴���ϵͳ�������������������������߼�
 *                             ���룬�������ط������쳣
 *<p> ��2��ע�ⷢ���쳣ʱ�������ֹ��ֻ�е����ڴ����쳣�ķ���ʱ���쳣����Ĵ���Ż�˳��ִ��                           
 * <p>��3�������쳣�ķ�����try��catch��finally �����������<br>
 *             ��3.1��try�����ܻ�����쳣��Java���롿<br>
 *             ��3.2��catch( Exception e )��Exception��ָ���쳣���ͣ�����쳣��Ϣ����e.getMessage()���������ʡ���
 *                                  e.toString()  ���쳣���ͺ����ʡ���e.printStackTrace()���쳣��ϸ��Ϣ��<br>
 *             ��3.3��finally���쳣��������ִ�в��֣����ܻ᲻�ᷢ���쳣��������ζ���ִ�еĴ��롿����ʹfinally��ֹ�����
 *                                       ��finally�������쳣����finally֮ǰ�����˳�System.exit()��
 *                                         �߳��������ر�CPU��<br>
 *              ��3.4��try �е���䷢���쳣ʱ�����򽫲���ִ�� try ���쳣���֮�����䣬ת����ʼִ�� catch�� finally�����<br>
 *              ��3.5�������쳣�� catch ����ͬʱ�ж����ĳһ�� catch �����쳣�󣬺���� catch ������ִ�У���
 *                      �� Exception �������쳣�ĸ��࣬����� catch( Exception e ) ���ڵ�һ��λ�ã���ô����� catch ����
 *                      Զ����ִ��
 *<p>��4���������쳣��<br>
 *     ��4.1��ClassCastException������ת���쳣<br>
 *     ��4.2��ClassNotFoundException��δ�ҵ���Ӧ���쳣<br>
 *     ��4.3��ArithmeticException�������쳣<br>
 *     ��4.4��ArrayIndexOutOfBoundsException�������±�Խ���쳣<br>
 *     ��4.5��ArrayStoreException�������а��������ݵ�ֵ�׳����쳣<br>
 *     ��4.6��SQLException���������ݿ��쳣��<br>
 *     ��4.7��NullPointerException����ָ���쳣<br>
 *     ��4.8��NoSuchFieldException���ֶ�δ�ҵ��쳣<br>
 *     ��4.9��NoSuchMethodException������δ�ҵ��׳����쳣<br>
 *     ��4.10��NumberFormatException���ַ���ת��Ϊ�����׳����쳣��java.lang.NumberFormatException��<br>
 *     ��4.11��NegativeArraySizeException������Ԫ�ظ���Ϊ�����׳����쳣<br>    
 *     ��4.12��StringIndexOutOfBoundsException���ַ�������������Χ�׳����쳣<br>
 *     ��4.13��IOException����������쳣<br>
 *     ��4.14��IllegalAccessException�����������ĳ���쳣<br>
 *     ��4.15��InstantiationException����Ӧ�ó�����ͼʹ�� Class ���е� newInstance() ��������һ�����ʵ������ָ��
 *                    ����Ķ����޷���ʵ����ʱ���׳����쳣<br>
 *     ��4.16��EOFException���ļ��ѽ����쳣<br>
 *     ��4.17��FileNotFoundException���ļ�δ�ҵ��쳣<br>   
 *     
 *<p>��5��Throwable �������������࣬Exception �ࡾ���������࣬�䰴����ԭ���Ϊ RuntimeException �ࡢ�������ࡿ��
 *             Error �ࡾ���ش����࣬java ����ϵͳ�е��ڲ�������Դ�ľ�����
 * 
 *
 */
public class TakeException {             // ������
	public static void main(String[] args) {
		try {                                          // try����а������ܳ����쳣�ĳ������
			String str = "lili";                      // �����ַ�������
			System.out.println(str + "�����ǣ�"); // �������Ϣ
			int age = Integer.parseInt("20"); // ��������ת��
			System.out.println(age);
		}catch (Exception e) {// catch����������ȡ�쳣��Ϣ
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());// ����쳣����
		}finally{
		System.out.println("�쳣����try/catch/finally��֮������,program over"); // �����Ϣ
		}
	}
}
