package ProgramLogic;
/** { } 括住的的为一个语句块，语句块可以嵌套，同时注意语句块中变量的作用域*/
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
