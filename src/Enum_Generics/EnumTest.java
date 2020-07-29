package Enum_Generics;
/**
*@author:cloud<br>
*@date:2019年5月27日下午3:22:42<br>
*@class:Enum_T.EnumTest.java<br><br>
*/


/**
 * @author 云飞<br><br>
 *（0）enum：枚举类型，另一种定义常量的方式，不需要final、static关键字<br>
 *<pre>
 *    /**
 *     * 枚举名Constant，相当于类名
 *     * 每个枚举成员默认修饰符：public、static、final
 *     * 其中定义了两个枚举常量，两个成员变量，三个构造方法，两个get函数
 *     * 调用get函数：Constant.Con1.getI()
 *     * 枚举中的方法、变量、构造函数对于每个枚举常量都是公用的
 *     <i>*</i>/
 *     public enum Constant{
 *         Con1("string"),Con2(2);
 *         String str;
 *         int i;
 *         
 *         private Constant(){};
 *         private Constant(String str,in){}
 *         private Constant(int i){}
 *         
 *         public String getStr(){return str;}
 *         public int getI(){return i;}
 *     }
 *</pre>
 *（1.1）enum继承自java.lang.Enum，在编译的时候也会生成一个单独的class类文件，如果在另一个类内定义，则作为一个内部类。<br>
 *（1.2）访问枚举常量时：Constant.Con1<br>
 *（1.3）每一个枚举常量都可以看作是该枚举的一个实例，即相当于调用类构造函数创建一个对象<br>
 *（1.4）注意：java的枚举不同于c++的枚举，java枚举的每个成员没有默认值，并且只作为一种枚举类型的值。<br><br>
 *
 *（2.1）Constant.values()：返回值Constant[]枚举类型数组。<br>
 *（2.2）Constant con = Constant.Con1;<br>
 *                   con.name()、con.toString()：返回String，两个方法都是显示当前常量的名称<br>
 *（2.3）Constant.valueOf(String conName)：返回enum常量，这里是Constant常量，将常量名字符串转换成enum常量。<br>
 *（2.4）Con1.equals(Con2)：比较两个枚举常量值<br>
 *（2.5）Con1.ordinal()：获取该枚举常量的位置索引，以第一个常量索引值为0开始。<br><br>
 *
 *（3.1）枚举构造方法：可以添加无参或带参构造方法，但是必须用private修饰<br>
 *（3.2）如果不对每个枚举使用构造函数，则枚举中的成员变量使用初始值，int为0，String为null...<br><br>
 *
 *（1）enum：另一种书写枚举的高级形态<br>
 *<pre>
 *    /**
 *     * 枚举名Constant2，相当于类名
 *     * 当Con2要访问Constant2中的变量b时，需要将b修饰为static
 *     <i>*</i>/
 *     enum Constant2 implements ss{
 *         Con1{
 *		       public boolean getB(){
 *			       return b;
 *		       }
 *		   },
 *         Con2{
 *		       boolean s=false;
 *			   public boolean getB(){
 *				   return b;
 *			   }
 *		   };
 *		   private static boolean b=false;
 *		   private String s;
 *	 	   private Constant2(){}
 *		   private Constant2(String str){this.s=str;}
 *		   public String getStr(){return "fuck";}
 *	   }
 *    
 *    /**
 *     * 将每个枚举类型成员需要实现的方法提取到接口中
 *     <i>*</i>/
 *     interface ss{
 *         public boolean getB();
 *     }
 *</pre>
 *（1.1）当需要为每个枚举常量单独设置方法、成员变量时，需将单独设置的方法提出到一个接口中，然后使该枚举实现该接口<br>
 *（1.2）当枚举常量中单独设置方法需要访问枚举中的成员变量时，该成员变量需设置为static<br>
 */
public class EnumTest {
	
	enum Constant{
		Con1("String"),Con2(2);
		String str;
		int i;
		
		private Constant(){};
		private Constant(String str){this.str=str;}
		private Constant(int i){this.i=i;}
		
		public String getStr(){return str;}
		public int getI(){return i;}
	}
	
	enum Constant2 implements ss{
	    Con1{
			public boolean getB(){
				return b;
			}
		},Con2{
			boolean s=false;
			public boolean getB(){
				return s;
			}
		};
		private static boolean b=false;
		@SuppressWarnings("unused")
		private String s;
		private Constant2(){}
		private Constant2(String str){this.s=str;}
		public String getStr(){return "fuck";}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Constant[] values=Constant.values();
		for(Constant e:values){
			System.out.println(e.name()+" "+e.toString());
		}
		Constant str2enum=Constant.valueOf("Con1");
		System.out.println("convert string to enum success or failure?："+(str2enum.equals(Constant.Con1)?"success":"failure"));
		
		int con=Constant.Con2.ordinal();
		System.out.println("索引："+con);
	}

}


interface ss{
	public boolean getB();
}