package ProgramLogic;
/**��1��switch����б��ʽֵ���������͡��ַ��͡��ַ�����<br>
 * ��2��switch(���ʽ) { case ����1�����飻break��default�����飻}������һֱ���е�break��default���޾���<br>
 */
public class Switch { // ������
	public static void main(String args[]) { // ������
		int week = 3; // ����int�ͱ���week
		switch (week) { // ָ��switch���ı��ʽΪ����week
			case 1: // ����case����еĳ���Ϊ1
				System.out.println("Monday"); // �����Ϣ
				break;
			case 2: // ����case����еĳ���Ϊ2
				System.out.println("Tuesday");
				break;
			case 3: // ����case����еĳ���Ϊ3
				System.out.println("Wednesday");
				break;
			default: // default���
				System.out.println("Sorry,I don't Know");
		}
		switch(week){
		case 2:System.out.println("sdddddddddddddd");break;
		default:System.out.println("dddd");
		case 1:System.out.println("ssss");break;
		}
	}
}

