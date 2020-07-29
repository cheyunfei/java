package Exception;

class CreateException extends Exception{
	String s;
	public CreateException(String error){
		super(error);
		s=error;
	}
	public String getMessage(){
		return s;
	}
	public String toString(){
		return s;
	}
}

/**
 * <p>��1���Զ����쳣���û�ֻ��Ҫ�̳� Exception �༴���Զ����쳣��<br>
 *          ��1.1��class  MyE  extends  Exception{    public MyE(String error) { super(error); }    }<br>
             ��1.2��MyE���Զ����쳣��������super�����๹�췽������error����Ҫ����Ĵ�����Ϣ��<br>
             ��1.3���Զ����쳣�ڼ̳и��� Exception �󣬿��Բ�ʹ�� super ���̳и��๹�췽��������ͨ�����Ǹ����
                   �� public String getMessage() / public String toString()�� ��������쳣��Ϣ
 *<p>��2�� �ɷ����׳��쳣����������ٷ������д����쳣������ͨ�����쳣�׸����ø÷����ĵ����ߴ���<br>
 *          ��2.1���ڷ��������׶�ָ��Ҫ�׸����������ߵ��쳣���ࡾint mothed��parameter1��parameter2�� throws MyE����
 *                 throws �ؼ����׳��쳣�������׳������쳣���ö��š�,������<br>
 *          ��2.2��Ȼ���ڷ������а����������׳��Զ����쳣����䡾throw new MyE(error);����java �����쳣���Բ��� throw ��ʽ
 *                       �׳����������׳��쳣ʱ���ɵ��ø÷����ĵ�����ʹ�� try-catch ���񲢴����쳣<br>
 *           ��2.3�����Խ��쳣�׳������壬���������ø÷����ķ�������Ҳ���Բ����������׳���
 *                         ֱ������������쳣�Ĵ���<br>
 *                         
 *<p>��3���쳣�ڼ̳��е�ʹ��ԭ�򣺵�����ķ����׳��쳣ʱ���������������˴˷������������еĴ˷���Ҫô���׳��쳣��
 *                 Ҫô�׳��븲��ǰ������ͬ���쳣���쳣��������쳣���Ӽ��������׳����쳣<br>                     
 *
 *
 */
public class  MyException{ // ������
	 // ���巽�����׳��쳣
	static int avg(int number1, int number2) throws CreateException {
		if (number1 < 0 || number2 < 0) { // �жϷ����в����Ƿ�����ָ������
			throw new CreateException("������ʹ�ø���"); // ������Ϣ
		}
		if (number1 > 100 || number2 > 100) { // �жϷ����в����Ƿ�����ָ������
			throw new CreateException("��ֵ̫����"); // ������Ϣ
		}
		return (number1 + number2) / 2; // ��������ƽ��ֵ����
	}
	
	public static void main(String[] args) { // ������
		try { // try����鴦����ܳ����쳣�Ĵ���
			int result = avg(102, 150); // ����avg()����
			System.out.println(result); // ��avg()�����ķ���ֵ���
		} catch (CreateException e) {
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage()); // ����쳣��Ϣ
		}
	}
}
