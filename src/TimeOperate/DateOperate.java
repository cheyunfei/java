package TimeOperate;

import java.util.*;

/**��ȡ��ǰϵͳ���뼶ʱ�䣺long time=System.currentTimeMillis()�����س���������long������ȡ��1970-01-01 00:00:00 �����ھ����ĺ�������<br>
 * ��ȡ��ǰ���ں�ʱ�䣺Date p=new Date()������ Date �Ļ����Ͽ��Ի�õ�ǰ��ʱ�䡢���ڡ�ʱ��<br>*/
public class DateOperate {
	public static void main(String[] args){
		long pt=System.currentTimeMillis();
		Date p=new Date();
		System.out.println(pt);
	}
}