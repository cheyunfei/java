package Enum_Generics;
/**
*@author:cloud<br>
*@date:2019��5��27������3:22:42<br>
*@class:Enum_T.EnumTest.java<br><br>
*/


/**
 * @author �Ʒ�<br><br>
 *��0��enum��ö�����ͣ���һ�ֶ��峣���ķ�ʽ������Ҫfinal��static�ؼ���<br>
 *<pre>
 *    /**
 *     * ö����Constant���൱������
 *     * ÿ��ö�ٳ�ԱĬ�����η���public��static��final
 *     * ���ж���������ö�ٳ�����������Ա�������������췽��������get����
 *     * ����get������Constant.Con1.getI()
 *     * ö���еķ��������������캯������ÿ��ö�ٳ������ǹ��õ�
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
 *��1.1��enum�̳���java.lang.Enum���ڱ����ʱ��Ҳ������һ��������class���ļ����������һ�����ڶ��壬����Ϊһ���ڲ��ࡣ<br>
 *��1.2������ö�ٳ���ʱ��Constant.Con1<br>
 *��1.3��ÿһ��ö�ٳ��������Կ����Ǹ�ö�ٵ�һ��ʵ�������൱�ڵ����๹�캯������һ������<br>
 *��1.4��ע�⣺java��ö�ٲ�ͬ��c++��ö�٣�javaö�ٵ�ÿ����Աû��Ĭ��ֵ������ֻ��Ϊһ��ö�����͵�ֵ��<br><br>
 *
 *��2.1��Constant.values()������ֵConstant[]ö���������顣<br>
 *��2.2��Constant con = Constant.Con1;<br>
 *                   con.name()��con.toString()������String����������������ʾ��ǰ����������<br>
 *��2.3��Constant.valueOf(String conName)������enum������������Constant���������������ַ���ת����enum������<br>
 *��2.4��Con1.equals(Con2)���Ƚ�����ö�ٳ���ֵ<br>
 *��2.5��Con1.ordinal()����ȡ��ö�ٳ�����λ���������Ե�һ����������ֵΪ0��ʼ��<br><br>
 *
 *��3.1��ö�ٹ��췽������������޲λ���ι��췽�������Ǳ�����private����<br>
 *��3.2���������ÿ��ö��ʹ�ù��캯������ö���еĳ�Ա����ʹ�ó�ʼֵ��intΪ0��StringΪnull...<br><br>
 *
 *��1��enum����һ����дö�ٵĸ߼���̬<br>
 *<pre>
 *    /**
 *     * ö����Constant2���൱������
 *     * ��Con2Ҫ����Constant2�еı���bʱ����Ҫ��b����Ϊstatic
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
 *     * ��ÿ��ö�����ͳ�Ա��Ҫʵ�ֵķ�����ȡ���ӿ���
 *     <i>*</i>/
 *     interface ss{
 *         public boolean getB();
 *     }
 *</pre>
 *��1.1������ҪΪÿ��ö�ٳ����������÷�������Ա����ʱ���轫�������õķ��������һ���ӿ��У�Ȼ��ʹ��ö��ʵ�ָýӿ�<br>
 *��1.2����ö�ٳ����е������÷�����Ҫ����ö���еĳ�Ա����ʱ���ó�Ա����������Ϊstatic<br>
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
		// TODO �Զ����ɵķ������
		Constant[] values=Constant.values();
		for(Constant e:values){
			System.out.println(e.name()+" "+e.toString());
		}
		Constant str2enum=Constant.valueOf("Con1");
		System.out.println("convert string to enum success or failure?��"+(str2enum.equals(Constant.Con1)?"success":"failure"));
		
		int con=Constant.Con2.ordinal();
		System.out.println("������"+con);
	}

}


interface ss{
	public boolean getB();
}