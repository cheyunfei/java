package package1.package2;
import java.util.Date;
import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.System.out;
import static java.lang.Math.max;

/**<p>��1��������ʹ����ͬ��ĳ�ͻ��java.util.Date date=new java.util.Date();<br>
 *                                                        java.sql.Date date2=new java.sql.Date(233);
 *<p>��2��������ָ������ʱ��Ҫ�� package ���ʽ���ڳ���ĵ�һ�У����������Ϊ�����е�һ����
 *<p>��3��ͬһ���е��಻�ش����ͬһ��λ�ã��� com.lzw.class1 �� com.lzw.class2 ���Է���������ͬ�ĵط���ֻҪ
 *                ϵͳ�е� CLASSPATH �ֱ�ָ��������λ�þͿ�����            
 *<p>��4��java�еİ���ʹ��Сд��ĸ
 *<p>��5�������е��Զ���������� java���е�������ͻʱ�������Զ�����İ������Զ�ʹ���Զ����࣬
 *                    ��ʱ��ʹ�� java���е���ʱ������ȫ����ʽ��java.lang.Math��
 *<p>��6�����ĵ��룺import ����.���������� �� import ����.*  ��  ��ʾ�ð��е������࣬���������Ӱ��е���
 *<p>��7����̬��Ա�ĵ��룺��import static ��̬��Ա��<br>
 *            ��7.1�����Ե��뾲̬��Ա�����;�̬��Ա������Ȼ���ڳ����оͿ���ֱ��ʹ����Щ��̬��Ա��������Ҫͨ�������ã���
 *            �� import static java.lang.Math.max ��ֱ��ʹ��max( int , int )��������Ҫ Math.max( int , int )��   <br>
 *            ��7.2��out �� System �ľ�̬��Ա������ע�ⲻ�ǳ�Ա������out ���� PrintStream ���ͣ�out ͨ��
 *            ���� PrintStream �ķ��� println �����һ�У�������� System.out.println()                                                              */

public class Package {
	public static void main(String[] args){
		java.util.Date date=new java.util.Date();
		java.sql.Date date2=new java.sql.Date(233);
		java.lang.System.out.println("sfaf");
		System.out.println(E);
		out.println(max(1,2));
	}

}
