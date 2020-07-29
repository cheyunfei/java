package interface_hire_varycondition;

interface drawTest { // ����ӿ�
	 public abstract void draw(); // ���巽��
}

// ����ƽ���ı����࣬����̳����ı����࣬��ʵ����drawTest�ӿ�
class ParallelogramgleUseInterface extends AbstractAndInterface implements drawTest {
	public void draw() { // ���ڸ���ʵ���˽ӿڣ�������Ҫ����draw()����
		System.out.println("ƽ���ı���.draw()");
	}
	
	public void doAnyThing() { }
}

class SquareUseInterface extends AbstractAndInterface implements drawTest {
	public void draw() {
		System.out.println("������.draw()");
	}
	
	public void doAnyThing() { }
}

abstract class AnyThingUseInterface extends AbstractAndInterface {

	public abstract void doAnyThing();
}


/**
 *<p>��1�������ࣺpublic abstract class ����{ }�������಻����ʵ��������
 *<p>��2�����󷽷�����abstract void ������( );�������󷽷�û�з����壬�ұ�������ڳ������У�
 *                       �����౻�̳к󣬳������еĳ��󷽷����뱻������ʽ��ʵ�֣����ַ���ֵ������������
 *                       �����䴴�����ǳ��󷽷�����󷽷������������ǳ����ࣩ�����������еķǳ��󷽷�
 *                       ���Բ�����ʽ����д�Ϳ��Ա��̳�
 *<p>��3���ӿڣ��ӿ��ǳ���������졾 interface �ӿ���{ } ��������ĳ����࣬����������п���ͬʱ���ڳ���ͷǳ��󷽷���
 *                      �ӿ��еķ�����û�з����壬 abstract ������񶼿��ԣ�һ��ʡ�ԡ� ������ֵ ������();������void add();�� ��
 * <p>��4���̳нӿڣ��ӿڿ��Զ��ؼ̳С� ��implement inter1 , inter2 , inter3�� �������ұ�����ʽʵ�ֽӿ��е����з�������Ϊ�ӿ��еķ������ǳ����
 * <p>ע�⣺<br>
 * ��1.1���� public ���εĽӿڱ��������Լ�ͬ�����ļ���<br>
 * ��1.2���ӿ��ж���ķ���Ĭ���ǣ�Ҳֻ���ǣ� public <br>
 * ��1.3���ӿ��ж�����κ��ֶζ��� ��static final����<br>
 * ��1.4�����԰�һ��������ת��Ϊ����ʵ�ֵĽӿڣ����õľ��Ǹ������Ѿ�ʵ�ֵĽӿ��еķ���<br>
 *
 */
public abstract class AbstractAndInterface { // �����ı�����
	public abstract void doAnyThing();
	public void add(){
		System.out.println("�������еķǳ��󷽷�");
	}
	
	public static void main(String[] args) {
		ParallelogramgleUseInterface p=new ParallelogramgleUseInterface();
		System.out.println(p instanceof ParallelogramgleUseInterface);
		System.out.println(p instanceof drawTest);
		
		SquareUseInterface s=new SquareUseInterface();
		s.add();
		drawTest[] d = { // �ӿ�Ҳ���Խ�������ת�Ͳ���
		new SquareUseInterface(), new ParallelogramgleUseInterface() };
		for (int i = 0; i < d.length; i++) {
			d[i].draw(); // ����draw()����
		}
	}
}
