package swing;

import java.awt.*;

import javax.swing.*;


/**
 * <p>（一）列表框组件：与下拉列表框的明显区别在于外观，列表框不用下拉，直接呈现所有选项，以下为四种构造方法<br><br>
 *             （1）public void JList（Object[] listData）<br>
 *                        （1.1）定义一个数组Object[] listData<br>
 *                        （1.2）JList&lt;Object&gt; jl=new JList&lt;&gt;(listData)<br><br>
 *            （2）public void JList（Vector listData）<br>
 *                        （2.1）Vector&lt;Object&gt; vt=new Vector&lt;&gt;()【Vector类实际上是一个可变长数组】<br>
 *                         （2.2）vt.add(obj1)、vt.add(obj2).......【往Vector中添加选项】<br>
 *                         （2.3）JList&lt;Object&gt; jl=new JList&lt;&gt;(vt)【创立列表框完成】<br><br>
 *            （3）public void JList（ListModel dataModel）<br>
 *                        （3.1）class MyListModel extends AbstractListModel&lt;Object&gt;【自定义一个类
 *                                 继承接口 ListModel 的抽象类 AbstractListModel 】，在接口中定义一个数组Object[]，实现接口中的
 *                               方法 getElementAt( int x )【获取数组中指定下标处的值】和 getSize()【
 *                               获得数组长度】<br>
 *                          （3.2）JList&lt;Object&gt; jl = new JList&lt;&gt;(new MyListModel())【至此
 *                                 列表框创建完成】，此式中实现了 MylistModel 向上转型为接口 ListModel<br><br>
 *             （4）public void JList()<br>
 *                          （4.1）JList&lt;Object&gt;  jl=new JList&lt;&gt;()<br>
 *                          （4.2）jl.setListData(Object[] listData/Vector listData)【即该方法只接受Object[]/Vector
 *                                 这两种类型的数组】<br><br>
 *              （5）通过使用 DefaultListModel 来创建列表框，该类扩展了 AbstractListModel ，可向上转型为 ListModel 接口
 *                       初始化列表框<br>
 *                       （5.1）DefaultListModel&lt;Object&gt; items=new DefaultListModel&lt;&gt;()<br>
 *                       （5.2）JList&lt;Object&gt; jl=new JList&lt;&gt;( items )<br>
 *                       （5.3）通过方法 items.addElement( obj ) 向列表框中动态添加选项<br>
 * <p>（二）在列表框中【Ctrl+单击项目，可以切换项目的选择状态或非选择状态，可任意选中多个项目】
 *                              【Shift+其他项目，可以选中此项目和另一个项目中间的所有项目】
 *
 */
public class JListTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JListTest() {
		Container cp = getContentPane();
		
		cp.setLayout(null);
		JList<String> jl = new JList<>(new MyListModel());
		JScrollPane js = new JScrollPane(jl);
		js.setBounds(10, 10, 100, 100);
		
		Integer[] number={1,2,3,4};
		JList<Integer> jc2=new JList<>(number);
		jc2.setBounds(200, 10, 100, 50);
		
		cp.add(js);cp.add(jc2);
		setTitle("在这个窗体中使用了列表框");
		setSize(400, 150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new JListTest();
	}
}

class MyListModel extends AbstractListModel<String> {
	
	
	private String[] contents = { "列表1", "列表2", "列表3", "列表4", "列表5", "列表6" };
	
	public String getElementAt(int x) {
		if (x < contents.length)
			return contents[x++];
		else
			return null;
	}
	
	public int getSize() {
		return contents.length;
	}
}
