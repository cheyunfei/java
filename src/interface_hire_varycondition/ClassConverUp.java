package interface_hire_varycondition;

/**<p>��1�������ǽϳ�����࣬�����ǽϾ������
<p>��2������ת�ͣ����������Կ�����һ���������Father obj=new Son()�����˶�����Ϊ���෽���в���ʱ��
                          ����ʵ�ֶ����ͬ������̳�ͬһ�����෽���������෽���а��������ͷֱ����Ӷ�����ÿ������
                          ����д�˷�����ɵĴ��븴�ӣ���ʵ�ֶ�̬���� public void Method( Father obj )����
                          �� Method( new Son )��Ȼ���ڷ��� Method ��ʹ�� obj.getClass().getName().equals("����.������") ��
                          �ж����ĸ����࣬Ȼ�󰴲�ͬ����ʹ�ò�ͬ�Ĵ�����̡�<br>
        ��2.1������ת�ͺ�ע���������ת�ͺ��ܵ����ϼ��಻���ڣ��¼�����ڵķ�������Ȼ��ʱ�Ǹ�����󣬵��õ�
                         ȴ�������и��Ǹ������·���

<p>��3������ת�ͣ��������׳������⣬��������������������ʵ����Father fatherObj=new Father()��������ת
                            �ͳ��� ClassCastException ����ֻ�и����������������ʵ����Father fatherObj=new Son()����
                            Ȼ����ʽ��ʹ��ǿ��ת����ʽ���� Son obj=(Son)fatherObj������ת�Ͳ��ܳɹ������Ϊ���ж����������
                            ���� instanceof
   
<p>��4��instanceof����obj instanceof Class�������� boolean ֵ<br>
  ��4.1��ֻ�������жϸ��������֮��Ĺ�ϵ�������ж��޹����Ĺ�ϵ����Father��Son��Any�����࣬��public Son extends Father��
                             ��fatherObj instanceof Son����sonObj instanceof Father�����Ϸ������ǡ�fatherObj instanceof Any����䱾���
                             �Ǵ���ġ�<br>
  ��4.2��������ת��֮ǰ�������жϸ�������Ƿ�����������ʵ����Father obj=new Son()����
                             ʱ��obj instanceof Son������ true����obj instanceof Father������true������Ȼ Son �� Father �����ࡾ Father obj=new Father()��
                             ��ʱ��obj instanceof Son������ false����obj instanceof Father������true��<br>
   ��4.3������ʹ�� instanceof �ж�ĳ���Ƿ�ʵ����ĳ���ӿڣ�Ҳ�����ж�һ��ʵ�������Ƿ�����һ���ֻ࣬Ҫ������(����)ת�������
              �Ķ�����ࡰobj instanceof Class������ֵ���� true ������ת�ͺ����������������ʵ��������ת�ͺ�����
              �����Ǹ�������ʵ����<br>*/

public class ClassConverUp { // �ı�����
	public void olt(){
		System.out.println("�����еķ���");
	}
	public void olt2(){
		System.out.println("�����д��ڣ������в����ڵķ���");
	}
	
	public static  void draw(ClassConverUp q) { // �ı������еķ���
		if(q.getClass().getName().equals("interface_hire_varycondition.Son")){
			System.out.println("������ Son �Ķ���");
		}
		if(q.getClass().getName().equals("interface_hire_varycondition.Son1")){
			System.out.println("������ Son1 �Ķ���");
		}
	}
	
	public static void main(String args[]) {
		Son p1 = new Son(); // ʵ����ƽ���ı������������
		Son1 p2=new Son1();
		draw(p1);
		draw(p2); // ���ø��෽��
		//����ת��
		ClassConverUp q = new Son();
		q.olt();
		q.olt2();
		//Ȼ������ת��
		Son p=(Son)q;
		System.out.println((p instanceof ClassConverUp)+"  hjgj");
//		ClassConver q2=new ClassConver();
//		Son r=(Son) q2;
	
		
		ClassConverUp t1=new ClassConverUp();//�����������������ʵ��
		System.out.println("t1�Ƿ���ClassConver�Ķ���ʵ����"+(t1 instanceof ClassConverUp));
		ClassConverUp t2=new Son();//�����������������ʵ��
		System.out.println(t2 instanceof ClassConverUp);
	    System.out.println("Anythingû�м̳�ClassConver������"+"  t1 instanceof Anything  "+"����������");
	}

}
class Anything{}
class Son extends ClassConverUp {
	public void olt(){
		System.out.println("�����еķ���");
	}
}
class Son1 extends ClassConverUp{}




