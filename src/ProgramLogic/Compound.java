package ProgramLogic;
/** { } ��ס�ĵ�Ϊһ�����飬�������Ƕ�ף�ͬʱע�������б�����������*/
public class Compound {
	public static void main(String[] args){
		int x=20;
		{
			int y=40;
			System.out.println(y);
			int z=245;
			boolean b;
			{
				b=y>z;
				System.out.println(b);
			}
		}
		String word="Hello java";
		System.out.println(word);
		System.out.println(x);
	}

}
