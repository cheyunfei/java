package swing;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

/**
 * <p>（一）下拉列表框组件：介绍四种常用的简单构造方法<br>
 *         <p>（1）public JComboBox（ComboBoxModel dataModel）：<br>
 *            （1.1）自定义类 MyJComboBox 需要继承类AbstractListModel，并且引用接口ComboBoxModel：
 *            “class MyComboBox extends AbstractListModel&lt;ObjectType&gt; implements ComboBoxModel
 *               &lt;ObjectType&gt;”，&lt;ObjectType&gt;【用来指定此时下拉列表中内容是什么类型的内容，比如
 *               &lt;String&gt;内容是字符串、&lt;Integer&gt;内容是数字】，以此创建的MyJComboBox可以向上转型
 *               为 ComboBoxModel 接口类型，然后作为类 JComboBox 构造方法的参数<br>
 *             （1.2）接着在类 MyJComboBox 中实现接口 ComboBoxModel 中的方法：“public void setSelectedItem(Object item)”【
 *                                    用于设置下拉列表框中的选中项】；“public Object getSelectedItem()”【获得选中项】
 *                                       ；其中Object指的是在下拉列表中需要显示的选项所在的对象，比如数组对象
 *                                       String[]，Integer[].....等等<br>
                （1.3）在类 MyJComboBox 中实现抽象类AbstractListModel中的方法：“int getSize()”【获取列表长度】；
 *                          “public Object getElementAt(int index)”【指定下标处的值】<br>
 *             （1.4）然后创建MyJComboBox对象：MyComboBox cb=new MyComboBox()<br>
 *             （1.5）然后列表框实例化：JComboBox&lt;ObjectType&gt; jcb = new JComboBox&lt;&gt;(cb)，至此
 *                                      完成下拉列表的设置<br>
 *              （1.6）例子：<br>
 *              class MyComboBox extends AbstractListModel&lt;String&gt; implements ComboBoxModel&lt;String&gt; {<br>
 *                                                                          String selecteditem = "此列表编辑框初始值，若为null，编辑框为空";<br>
 *                                                                          String[] test = { "身份证", "军人证", "学生证", "工作证" };<br>
 *                                                                          public String getElementAt(int index) {return test[index];}<br>
 *                                                                          public int getSize() {return test.length;}<br>
 *                                                                          public void setSelectedItem(Object item) {selecteditem = (String) item;}<br>
 *                                                                          public Object getSelectedItem() {return selecteditem;}<br>
 *                                                                          }<br><br>
 * <p>（2）public JComboBox（Object[] arrayData）:<br>
 *             （2.1）Object[]为数组对象，比如 String[] arrayDate={数组内容};<br>
 *             （2.2）JComboBox&lt;Object&gt; jcb=new JComboBox&lt;&gt;(arrayDate)，至此创建下拉列表完成<br><br>
 * <p>（3）public JComboBox（）：<br>
 *             （3.1）JComboBox&lt;Object&gt; jcb=new JComboBox&lt;&gt;()，创建下拉列表的对象<br>
 *             （3.2）jcb.setModel(ComboBoxModel aModel)，通过方法设置下拉列表对应的 ComboBoxModel 类，同第
 *                           一个构造方法中的做法一样<br>
 * <p>（4）public JComboBox（Vector vt）<br>
 *                 （4.1）Vector&lt;Object&gt; vt=new Vector&lt;&gt;()【Vector类实际上是一个可变长数组，使用 Object 指
 *                            数组中元素数据类型】<br>
 *                 （4.2）vt.add(obj1)、vt.add(obj2).......【往Vector中添加选项】<br>
 *                 （4.3）JComboBox&lt;Object&gt; jcb=new JComboBox&lt;&gt;(vt)，创立列表框完成<br><br>
 * <p>（二）注意事项：<br>
 * <p> （1）为下拉列表框添加动作事件监听器ActionListener：当在列表中选中一项时触发动作事件监听器<br>
 * <p> （2） 动态的为下拉列表框中添加项目：Jcombobox.addItem(String s)【注意不能对已经赋予数组的
 *                                                下拉列表框使用这个方法】<br>
 * <p> （3）JComboBox.setToolTipText("下拉列表")【为下拉列表设置说明文字，鼠标移动到下拉列表
 *          所处的位置时才会出现】<br>
 * <p> （4）关于&lt; ObjectType &gt;为什么会有这种形式的代码，参见  泛型  的知识。<br>
 * <p>（5）当组件内容改变时，使用 obj.updateUI() 可以及时刷新组件，以防信息不及时在界面更新造成的错误<br>
 */
public class JComboBoxModelTest extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a=0;
	MyComboBox cb=new MyComboBox();
	JComboBox<String> jc1 = new JComboBox<>(cb);
	
	Integer[] number={1,2,3,4};
	JComboBox<Integer> jc2=new JComboBox<>(number);
	
	String[] sex={"null","男","女"};
	JComboBox<String> jc3=new JComboBox<>(sex);
	
	Vector<Integer> vt=new Vector<>();
	JComboBox<Integer> jc4=new JComboBox<>(vt);
	
	JComboBox<String> jc5=new JComboBox<String>();
	
	JLabel jl = new JLabel("请选择证件:");
	
	public JComboBoxModelTest() {
		Container cp = getContentPane();
		cp.setLayout(null);
		
		jc1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				vt.add(23);
				jc4.updateUI();
				System.out.println(cb.getIndex()+cb.selecteditem);
			}
		});
		jc1.setToolTipText("下拉列表");
		jc1.setBounds(20, 50, 100, 30);
		jc2.setBounds(20, 100, 100, 30);
		jc3.setBounds(20, 150, 100, 30);
		jc4.setBounds(20, 200, 100, 30);
		jc5.addItem("1");jc5.addItem("2");jc5.addItem("3");jc5.setBounds(20,250,100,30);
		cp.add(jl);cp.add(jc1);cp.add(jc2);cp.add(jc3);cp.add(jc4);cp.add(jc5);
		
		setSize(new Dimension(160, 400));
		setVisible(true);
		setTitle("在窗口中设置下拉列表框");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JComboBoxModelTest();
	}
}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String selecteditem = "我曹";
	String[] test = { "身份证", "军人证", "学生证", "工作证" };
	
	public String getElementAt(int index) {
		return test[index];
	}
	
	public int getSize() {
		return test.length;
	}
	
	public void setSelectedItem(Object item) {
		selecteditem = (String) item;
	}
	
	public Object getSelectedItem() {
		return selecteditem;
	}
	
	public int getIndex() {
		for (int i = 0; i < test.length; i++) {
			if (test[i].equals(getSelectedItem()))
				return i;
		}
		return 0;
	}
}
