package String;

import java.util.*;
/**�ַ�����ʽ����String s=String.format( String mode , Object obj)��mode����ʽ��ģʽ����obj����Ҫ����ʽ��
                       �Ķ���<br>
   obj�������ʽ������Ϊ Date������ʾ������ʱ��ĸ�ʽ�����������һ��Ĳ������ͣ����� String.format( "%x" , 345)��
          ��ʾ������ 345 ��ʽ��Ϊʮ����������"%x"��"%X"���������ڸ�ʽ����ʮ�������г��ֵ� abcdef ��Сд��"%x"Сд��
           "%X"��д<br>
    ��ʽ��ģʽ��ȫ��Java�����ŵ���ͨ��P97-P100*/
public class ReformatStr { // �½���
	public static void main(String[] args) { // ������
		Date date = new Date(); // ����Date����date
		System.out.println(date);
		String year = String.format("%tY", date); // ��date���и�ʽ��
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		System.out.println("�����ǣ�" + year + "��"); // �����Ϣ
		System.out.println("�����ǣ�" + month);
		System.out.println("�����ǣ�" + day + "��");
		System.out.println(String.format("%tQ", date));
	}
}
