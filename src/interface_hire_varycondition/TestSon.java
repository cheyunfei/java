package interface_hire_varycondition;

class TestSon extends TestFather { // �̳и���
	public TestSon() { // ���췽��
		//super(); // ���ø����޲ι��췽��,��ʵ�����û�ж�����ν�������ʼ��ʱ�������޲ι��췽���Զ�����
		//super(2);//���ø�����вι��췽��
		System.out.println("����Ĺ��췽��");
		super.doSomething(); // ���ø����Ա����
	}
	
	public void doSomethingnew() { // ��������
		System.out.println("������³�Ա����");
	}
	
	
	protected void doSomething() { // ��д���෽��
		System.out.println("������д����ĳ�Ա����");
	}
	
	
	protected TestSon doIt() { // ��д���෽������������ֵ����ΪTest2����
		return new TestSon();
	}
	
	public String toString(){
		return "����������� 'һ������' �Զ��������¶���toString����:"+getClass().getName();
	}
	
	protected Object returnObject(){
		String s="son return a Object";
		return s;
	}
	
	protected TestFather returnFather(){
		TestFather s=new TestFather();
		return s;
	}
	
	public static void main(String[] args){
		System.out.println(new TestSon());
		System.out.println();
		TestSon s=new TestSon();
		s.doSomething();
		System.out.println(s.returnObject());
		System.out.println("���һ��"+s.getClass().getName()+"  ������"+s.getClass());
	}
}
