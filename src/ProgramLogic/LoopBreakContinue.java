package ProgramLogic;
/**��1��breakһ��ֻ�������ڲ�ѭ��<br>
 * ��2������ǩ��ѭ���� { break ��ǩ }��������������ѭ��<br>
 * ��3��continue����һ��ѭ������ִ�к������룬Ȼ������������ʼ��һ��ѭ��<br>
 * ��4������ǩ��ѭ����{ continue ��ǩ }��,��ѭ����ֻ��һ��ʱ����ǩ���ú�û��ʱһ������ѭ�����ж�㣬
 *            ����continue���ڵĲ���˵��ǩ���ú�break��ͬ�����Ǽ�����ǩ��ָ��ѭ��λ�õ���һ��ѭ��<br>
 * */
public class LoopBreakContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (j == 4) {// ���j����4��ʱ��ͽ����ڲ�ѭ��
					break;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
		
		
		Loop: for (int i = 0; i < 3; i++) {// ��forѭ��ǰ�ñ�ǩ���
			for (int j = 0; j < 6; j++) {
				if (j == 4) {// ���j����4��ʱ��ͽ������ѭ��
					break Loop;// ����Loop��ǩ��ǵ�ѭ����
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
		
		
		loop:for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (j == 4) {// ���j����4��ʱ��ͽ����ڲ�ѭ��
					continue loop;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
		
		
		
	}
}