package ProgramLogic;
/**��1����if��û���������ʱ����if(boolean);������if(boolean){}�����ǿ��Ե�<br><br>
 * ��2������if�����䣺if(boolean)...else...��if(boolean)...else if(boolean)...else if(boolean)...else��
 *                  ���ж�� else if ������ƥ�䵽��һ��else if ��֮��� else if �Ͳ��ٹ���<br><br>
 * ��3����Ԫ���������if...else...�����䣬�������ַ�ʽ��Ч��ע����Ԫ���������������ֵ���㣬��Ԫ
 * ������Ľ������һ��ֵ����������������������֮��Ĵ�������<br>
 * if(a&gt;0) b=a ; else b=-a;<br>
 * b=a&gt;0?a:-a;<br>
 */
 
public class IfAndElse{ // ������
	public static void main(String args[]) { // ������
		int x = 45; // ����int�ͱ���x����������ֵ
		int y = 12; // ����int�ͱ���y����������ֵ
		if (x > y) 
		{ // �ж�x�Ƿ����y
			System.out.println("����x���ڱ���y"); // ��������������������Ϣ
		}
		if (x < y) { // �ж�x�Ƿ�С��y
			System.out.println("����xС�ڱ���y"); // ��������������������Ϣ
		}
	}
}

