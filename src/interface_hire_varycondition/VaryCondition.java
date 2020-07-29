package interface_hire_varycondition;
/**<p>��1����̬�����������Կ�����һ���������Father obj=new Son()�����˶�����Ϊ���෽���в���ʱ��
                            ����ʵ�ֶ����ͬ������̳�ͬһ�����෽���������෽���а��������ͷֱ����Ӷ�����ÿ������
                            ����д�˷�����ɵĴ��븴�ӣ���ʵ�ֶ�̬���� public void Method( Father obj )��Method( new Son )��
     <p>ע�⣺�ο� ClassConverUp�� �б�д�Ĺ��ڶ�̬�ĳ�������ĳ�����ȫ���ֲ�����̬���ŵ�*/
public class VaryCondition {
	// ʵ���������ı��ζ�����������
	private VaryCondition[] qtest = new VaryCondition[6];
	private int nextIndex = 0;
	
	public void draw(VaryCondition q) { // ����draw()����������Ϊ�ı��ζ���
		if (nextIndex < qtest.length) {
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	
	public static void main(String[] args) {
		// ʵ���������ı��ζ������ڵ���draw()����
		VaryCondition q = new VaryCondition();
		q.draw(new Square()); // �������ζ���Ϊ��������draw()����
		// ��ƽ���ı��ζ���Ϊ��������draw()����
		q.draw(new Parallelogramgle());
		q.draw(new Parallelogramgle());
	}
}

class Square extends VaryCondition { // ����һ���������࣬�̳��ı�����
	public Square() {
		System.out.println("������");
	}
}

// ����һ��ƽ���ı����࣬�̳��ı�����
class Parallelogramgle extends VaryCondition {
	public Parallelogramgle() {
		System.out.println("ƽ���ı���");
	}
}

