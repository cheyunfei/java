package class_high_character;

interface OutInterface{
	public void f();
}

/**�ڲ��ࣺ�������ٶ����һ�����Ϊ�ڲ��࣬��Ϊ��Ա�ڲ��ࡢ�ֲ��ڲ��ࡢ������<br><br>
 * <p>��һ����Ա�ڲ��ࣺclass OuterClass{ class InnerClass{  } }
 * <p>��1���ڲ����������ֱ��ʹ���ⲿ��ĳ�Ա�����ͷ�������ʹ��Щ�����ͷ����� private ����Ҳ���ԣ�����
 *                  �ⲿ�಻����ֱ��ʹ���ڲ���ĳ�Ա<br>
 *<p>��2���ڲ���ʵ�������̣�<br>
 *          ��2.1���ڲ�������������ⲿ��������������ⲿ�����Ҳ�Ͳ�������ڲ�����󣬱�����ڲ�����Ϊ
 *          ���ⲿ����$�ڲ�����������Ӧ������ �ⲿ����$�ڲ�����.class���͡� �ⲿ��.class�������ֽ����ļ�<br>
 *          ��2.2��һ�����ⲿ���л����ⲿ��ķǾ�̬������ʵ������InnerClass in=new InnerClass()�����ڲ������ⲿ��
 *          ��ʵ������Ķ������ⲿ��ĳ�Ա����֮һ�������ⲿ����󴴽����̴˳�Ա����Ҳ���ʼ��<br>
 *          ��2.3���ھ�̬������ʵ�����ڲ������һ���ⲿ�෽���ķ���ֵ���ڲ������ Outer.Inner in=out.doit()������
 *            ֱ�Ӵ����ڲ������ Outer.Inner in=out.new Inner()<br>
 * <p>��3���ڲ������������;������ڲ���̳�ͬһ���ӿڣ��Բ�ͬ�ķ�ʽʵ�ֽӿ��еķ������Ϳ���ʵ��һ���ⲿ����ʵ��
 *             �ӿ��еķ�������������ڲ��౻ private ���Σ����ڲ���ʵ�ֵĽӿ��еķ������� private����Ҳ����ͨ���ⲿ��
 *             ���ڲ�����������Щ������������ͨ�����ڲ�������ת��Ϊ�ӿڣ�Ȼ��ͨ���ӿڶ��������Щ�������ܺõ�������
 *             �ڲ����еķ�����ʵ��ϸ�ڡ����ּ��ɾ������� Swing �����
 *  <p>��4��this��ʹ�� this �ؼ�����ͬһ�����п�������ȫ�ֱ����;ֲ��������������ڲ���ʱ�����ڲ���ķ����г���
 *                      x���ڲ��෽���еľֲ���������this.x���ڲ����ȫ�ֱ��������ⲿ����.this.x���ⲿ��ķǾ�̬ȫ�ֱ�����
 *                      ��Ȼ����Ǿ�̬��������Ҳ���ԣ����Ǿ�̬�������򵥵�д�� "�ⲿ����.x"��
 *          
 *<p>�������ֲ��ڲ��ࣺ����ķ����л�������������о����Զ���
 *<p>��1���������������ⲿ���еķ�����������ܷ��ʸ��ڲ��࣬���Ǹ��ڲ�����Է��ʡ���ǰ�����������͡��ⲿ�����г�Ա��<br>
 *           ��1.1��ֻ�ܷ��ʳ�����ԭ����Ϊ�ֲ��ڲ������ͨ������ת�ͳ�ĳ���ⲿ�࣬Ȼ�����ⲿ����ã���������п������
 *           �þֲ��ڲ�����ĳЩ��Ա�����÷�Χ���ܳ����䶨��������򣬹ʴ˱��뽫�ֲ��ڲ�����ʹ�õ�
 *           ����������ĳ�Ա��������Ϊ������ʹ�䲻�ܸı�
 *<p>��2�������ļ����ֲ��ڲ����������ɵ��ļ���ʽΪ---���ⲿ����$1�ڲ�����.class����ע���ļ����еġ�1��Ϊ���֡�1�����²��������local���ֲ�����
 *<p>�����������ڲ��ࣺnew ��/�ӿ�/������ { �����ڲ���ṹ���� }��new A { private int i=0;};����ע������
 *                ���һ���ֺš�����<br>
 *  ��1�������ڲ���û�����ƣ� A ��ĳ����/�ӿ�/����������ƣ������ڲ�������þ��Ǵ���һ��ʵ���� A ����������󣬲��ҿ���
 *      �����Ľṹ������ʵ�ֻ��߸������еķ���<br>
 *��2�������ڲ���༭���������ⲿ����$���.class���ļ��������1~n����ʾ�ڼ��������ڲ���
 *
 *<p>���ģ���̬�ڲ��ࣺ���ڲ���ǰ������η� static�����Զ��徲̬����<br>
 *��1���Ǿ�̬�ڲ����в���������̬��������̬�ڲ��಻��ʹ���ⲿ��ķǾ�̬����<br>
 *��2�����ܴӾ�̬�ڲ���Ķ����з����ⲿ��ķǾ�̬����<br>
 *��3���д�֤�����н�������д�뾲̬�ڲ�����÷�����Ҫ���ڷ�����ԣ���ʽ��̴��벻ʹ��<br>
 *
 *<p>���壩�ڲ���ļ̳У�class OutClass extends ClassA.ClassB{ public OutClass( ClassA a ){ a.super(); } }<br>
 *��1��ĳ����̳��ڲ���ʱ������Ӳ�Ը��������һ���������Ĺ��췽�������Ҹù��췽������Ϊ��Ҫ�̳��ڲ����
 *              �ⲿ������ã�ͬʱ�ڹ��췽����ʹ�� a.super() 
 *
 *             */


public class OuterClass {
	innerClass in = new innerClass(); // ���ⲿ��ʵ�����ڲ����������
	 static int a=1;
	
	public OuterClass(){
		System.out.println("�ⲿ���޲ι��췽��");
	}
	
	public void ouf() {
		innerClass inn = new innerClass();//���ⲿ��ķǾ�̬������ʵ�����ڲ������Ӧ��
		in.inf();                        // ���ⲿ�෽���е����ڲ��෽��
	}
	public void dd(int a){//��������aΪ2
		class innerPart{
			//int a=3;
			innerPart(){
				System.out.println("�ֲ��ڲ��๹�췽��");
			    iP();
			}
			void iP(){ 
				//System.out.println("�ֲ��ڲ�������ⲿ�ೣ��"+this.a);
				System.out.println("�ֲ��ڲ�������ⲿ�ೣ��"+OuterClass.a);
				System.out.println("�ֲ��ڲ�������ⲿ�ೣ��"+a);
			}
		}
		innerPart iP=new innerPart();
	}
	
	public class innerClass {
		int y = 0;                   // �����ڲ����Ա����
		//static int z=3;  //�Ǿ�̬�ڲ������޷�������̬��Ա
		innerClass() {              // �ڲ��๹�췽��
			System.out.println("�ڲ����޲ι��췽��");
		}
		public void inf() {      // �ڲ����Ա����
			System.out.println("�ڲ�����Է��������ⲿ��ĳ�Ա��"+(a));
			System.out.println("�ڲ����еķ���");
		}
	}
	
	public innerClass doit() {              //�ⲿ�಻����ֱ�ӷ����ڲ����Ա����
		in.y = 4;
		return new innerClass(); // �����ڲ�������
	}
	
	class innerClass1 implements OutInterface{
		public void f(){System.out.println("�ڲ���ʵ�ֽӿڷ���1");}
	}
	class innerClass2 implements OutInterface{
		public void f(){System.out.println("�ڲ���ʵ�ֽӿڷ���2");}
	}
	public OutInterface doit1(){
		return new innerClass1();
	}
	public OutInterface doit2(){
		return new innerClass2();
	}
	

	
	public static void main(String args[]) {
		OuterClass out = new OuterClass();
		out.ouf();
		System.out.println();
		
		OutInterface oin1=out.new innerClass1();
		oin1.f();
		OutInterface oin2=out.doit2();
		oin2.f();
		System.out.println();
		
		OuterClass.innerClass inx = out.doit();
		OuterClass.innerClass in2 = out.new innerClass();
		System.out.println();
		
		out.dd(2);
	}
}