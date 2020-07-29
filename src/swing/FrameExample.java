package swing;

import java.awt.*;
import javax.swing.*;


/**
 * （1）新创建的类，即目标窗体，必须继承 JFrame 类，而直接用 new JFrame() 创建的窗体不用在
 *                        类的声明语句后使用 extends 继承 JFrame<br><br>
 *（2） 新创建的窗体默认不可见，需在构造方法中使用  setVisible(true) 使窗体显示出来<br><br>
 * （3）窗体创建：JFrame frame = new JFrame(title);<br>
 *                Container container = frame.getContentPane();<br>
 *                container.add(组件对象);<br><br>
 * （4）设置容器背景颜色： frame.setBackground( Color.white)<br><br>
 * （5）设置窗体可视： frame.setVisible(true)<br><br>
 * （6）设置窗体可否改变大小：frame.setResizable(boolean)【true可改变大小/false不可改变大小】<br><br>
 *（7）窗体关闭设置语句：frame.setDefaultCloseOperation ( WindowConstants.常量 )，以下详解常见的四个常量<br>
 *  （7.1）DISPOSE_ON_CLOSE：隐藏当前窗口，并释放该窗体占有的其他资源，但不会关闭程序。也就是说如果该程序同时
 *               显示多个窗口，关闭被设置为这个常量的窗口的时候，对其他窗口无影响。在窗口被关闭的时候会 dispose 这个
 *                窗口，当所有窗口都被 dispose 后，JVM也会退出，被 dispose 的窗口可以通过调用 pack() 和 show() 重新获得
 *                资源构建窗口。<br>
 *  （7.2）EXIT_ON_CLOSE：退出程序默认窗口关闭，在窗口被关闭的时候会退出JVM。也就是说如果该程序同时显示多个
 *            窗口，在关闭被设置为这个常量的窗口的时候，其他窗口也将关闭。<br>
 *   （7.3）HIDE_ON_CLOSE：仅仅是隐藏窗口，窗口资源仍存在，在任务管理器中仍可见<br>
 *   （7.4）DO_NOTHING_ON_CLOSE：当点击关闭窗口的按钮时，窗口不能关闭，不会产生任何效果，即剥夺关闭按钮的作用<br>
*   （7.5）注意这里使用的是 WindowConstants，从前我使用的是JFrame<br>
*   （7.6）可以类比经常出现在软件设置里的一个选项：即关闭窗口的时候是直接退出程序还是仅仅关闭窗口<br>
 * （8）设置窗体标题：frame.setTitle("窗体标题")<br><br>
 * （9）注意：当编写UI界面程序时，应先添加组件，然后对 JFrame 的 Size，Visible等属性进行设置；
 *          如果先设置属性再添加组件，程序测试运行时一开始出现的画面只有 JFrame 框架，而没
 *          有其他组件，并且只有当拖动窗口使其大小改变时组件才会随着界面刷新而出现的错误情
 *          况；更严重在某些程序当中会导致运行失败。
 *
 */
public class FrameExample extends JFrame {// 定义一个类继承JFrame类
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameExample(){
		setSize(200,200);
		setVisible(true);
	}
	public void CreateJFrame(String title) { // 定义一个CreateJFrame()方法
		JFrame jf = new JFrame(title); // 实例化一个JFrame对象
		Container container = jf.getContentPane(); // 获取一个容器
		JLabel jl = new JLabel("这是一个JFrame窗体"); // 创建一个JLabel标签
		// 使标签上的文字居中
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		container.add(jl); // 将标签添加到容器中
		container.setBackground(Color.white);//设置容器的背景颜色
		jf.setVisible(true); // 使窗体可视
		jf.setSize(200, 150); // 设置窗体大小
		// 设置窗体关闭方式
		jf.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	}
	
	public static void main(String args[]){//在主方法中调用createJFrame()方法
		new FrameExample().CreateJFrame("创建一个JFrame窗体");
	}
}