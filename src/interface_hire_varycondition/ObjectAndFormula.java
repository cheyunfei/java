package interface_hire_varycondition;

class V { // �Զ�����V
	//��дObject���е�equals������equalsĬ��ʹ�á�==�������Ƚ϶���������Ƿ���ͬ
	public boolean equals(Object a){
		if(a.getClass().getName().compareTo(getClass().getName())==0)
		return true;
	else{
		System.out.println(getClass().getName());
		return false;
	}
	}
}

class V2{}

/**<p>��1��java.lang.Object ����������ĸ��࣬����Ҫ���� clone()��finalize()��equals()��toString() ���Ա����ǣ�
 *                getClass()��notify()��notifyAll()��wait() ������Ϊ final�������Ա�����
 *   <p>��2��getClass()������ Class ��ֵ������ִ��ʱ�� Class ʵ���� getClass().toString() ��� ��class ����.��������
 *   <p>��3��getClass().getName()������ String ��ֵ�����ض���ִ��ʱ����������� ������.��������
 *   <p>��4��toString()����һ�����󷵻�Ϊ�ַ�����ʽ�����Ա����ǣ������һ������ʱ�Զ�������д�� toString()
 *   <p>��5���� String �С�==�����ڱȽ����õ�ַ�Ƿ���ͬ����equals�����ڱȽ����ݣ���������С�==����equals��
 *                 ������ͬ�Ƚ����õ�ַ*/
public class ObjectAndFormula {
	public static void main(String[] args) {
		String s1 = "123"; // ʵ������������������ͬ
		String s2 = "123";
		System.out.println(s1.equals(s2)); // ʹ��equals()��������
		V v1= new V(); // ʵ��������V�����
		V v2=new V();
		V2 v = new V2();
		V2 vv = new V2();
		ObjectAndFormula ss=new ObjectAndFormula();
		System.out.println(v.getClass().getName());
		System.out.println(v1.equals(v)); // ʹ��equals()�����Ƚ�v1��v2����
	}
}

