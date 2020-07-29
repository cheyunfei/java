package NumberFormat;

import java.text.*;

/**��1��ʮ�������ָ�ʽ�������ʹ���� DecimalFormat������ NumberFormat ������<br><br>
 * ��2����ʽ�������ַ�ʽ��<br>
 * (2.1)ʵ���� DecimalFormat ��ʱ�������ָ�ʽ��һ��DecimalFormat myf=new DecimalFormat( String str )��str��Ϊ
 *                           ��ʽ�ַ�����������String output=myf.format( value )��value����Ҫ����ʽ�������֡���output��
 *                           ��ʽ����������ַ�����<br>
 * (2.2)ʵ���� DecimalFormat �����ר�ŵķ����������ָ�ʽ��һ��DecimalFormat myf=new DecimalFormat()��
 *                         ���� myf.applyPattern( String str )��str��Ϊ��ʽ�ַ����������� String output=myf.format( value )��value
 *                         ����Ҫ����ʽ�������֡���output����ʽ����������ַ�����<br><br>
 * ��3����ʽ�涨��<br>   0����ʾһλ���������֣���λ����������ʾ0��<br>
 *                      #����ʾһλ���������֣���λ�����ڲ���ʾ��<br>
 *                      .��С���ָ��������С���ָ�����<br>
 *                      -�����š�<br>
 *                      ,������ָ�����<br>
 *                      E����ѧ�������зָ�β����ָ�� ��<br>
 *                      %�������ڸ�ʽ��ǰ׺���׺��������ʾΪ�ٷ�����%��Ȼ����ʽ��λ����ʾ��<br>
 *                      \u2030�������ڸ�ʽ��ǰ׺���׺��������ʾΪǧ������ǧ�ֺ�(\u2030)��Ȼ����ʽ��λ����ʾ��<br>
 *                      \u00A4�������ڸ�ʽ��ǰ׺���׺����Ϊ���ҼǺš�<br>
 *                      '���˴��ǵ����ţ�Ϊ����������ż��ϵ����ţ�ϵͳ���Ӵ˷���Ϊ��ͨ���Ŵ�����ԭ��������������滻Ϊ���֡�<br>
 *  (3.0)ע�⣺�ٷֺź�ǧ�ֺų���ʱ�������ȳ���100��1000��Ȼ���ٰ���ʽ�任<br>
 *  (3.1)ע�⣺�ڸ�ʽ�ַ����У�����Ҫ���ҼǺ�\u00A4��ǧ�ֺ�\u2030ʱ�����ڼ����޷�������������ţ���Ҫʹ��
 *     ת���ַ������ҼǺš���&#92;u00A4������ǧ�ֺš���&#92;u2030����<br><br>
 * ��4�������ʽ���飺DecimalFormat myf=new DecimalFormat()<br>
 *                                myf.setGroupingUsed( boolean b )��b�������Ƿ���飬b ֵĬ��Ϊ true ���顿<br>
 *                                myf.setGroupingSize( int size )��size�����÷����С��size ֵĬ��Ϊ 3 �������ǰ�С���㿪ʼ�����ҷ��顿<br>*/

public class DecimalFormatClass {
	// ʹ��ʵ��������ʱ���ø�ʽ��ģʽ
	static public void SimgleFormat(String pattern, double value) {
		// ʵ����DecimalFormat����
		DecimalFormat myFormat = new DecimalFormat(pattern); 
		String output = myFormat.format(value); // �����ֽ��и�ʽ��
		System.out.println(value + " " + pattern + " " + output);
	}
	
	// ʹ��applyPattern()���������ֽ��и�ʽ��
	static public void UseApplyPatternMethodFormat(String pattern, double value) {
		DecimalFormat myFormat=new DecimalFormat();//ʵ����DecimalFormat����
		myFormat.applyPattern(pattern); // ����applyPatten()�������ø�ʽ��ģ��
		System.out
				.println(value + " " + pattern + " " + myFormat.format(value));
	}
	
	public static void main(String[] args) {
		SimgleFormat("###,###.###", 123456.789);// ���þ�̬SimgleFormat()����
		SimgleFormat("00000000.###kg", 123456.789); // �����ֺ���ϵ�λ
		// ���ո�ʽģ���ʽ�����֣������ڵ�λ��0��ʾ
		SimgleFormat("000000.000", 123.78);
		// ���þ�̬UseApplyPatternMethodFormat()����
		UseApplyPatternMethodFormat("%#.######", 0.789); // ������ת��Ϊ�ٷ�����ʽ
		UseApplyPatternMethodFormat("00000.000%", 0.789);
		// ��С������ʽ��Ϊ��λ
		UseApplyPatternMethodFormat("\u00A4###.##", 123456.789);
		// ������ת��Ϊǧ������ʽ
		UseApplyPatternMethodFormat("0.0000\u2030", 0.789);
		
		DecimalFormat myFormat = new DecimalFormat();
		myFormat.setGroupingSize(4); // ���ý����ַ���Ϊ2
		String output = myFormat.format(123456.744549);
		myFormat.setGroupingUsed(false); // ���ò��������ֽ��з���
		String output2 = myFormat.format(123456.744549);
		System.out.println(output+"          "+output2);
	}
}

