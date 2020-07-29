package Stream;
import java.io.*;
/**
 * @author 云飞<br><br>
 *（1）File类是java.io包中唯一代表磁盘文件本身的对象，File类定义了一些与平台无关的方法来操作文件，
 *  可以通过调用File类中的方法，实现创建、删除、重命名文件等操作。<br><br>
 *（2）File主要用来获取文件的一些信息：文件所在目录、文件的长度、文件读写权限等。<br><br>
 *（3）File构造函数：<br>
 *（3.1）File file=new File(String filepath)，filepath【路径名称，包括文件名（File file=new File("d:/a.txt")），filepath的格式
 *   可以是"./src/Stream/"、"./src/Stream/"、".\\src\\Stream"、".\\src\\Stream\\"，当使用file.getPath()
 *   输出文件相对路径时结果都是".\src\Stream"】<br>
 *（3.2）File file=new File(String parent,String child)，parent【父路径字符串（d:\doc）】，child【子路径字符串（letter.txt）】<br>
 *（3.3）File file=new File(File f,String child)，f【父路径对象（File file=new File(...)）】，child【子路径字符串（letter.txt）】<br><br>
 *（4）File方法：<br>
 *（4.1）file.exists()：判断文件是否存在<br>
 *（4.2）file.createNewFile()：创建不存在的文件，如果文件已经存在，则重复创建无效，即不会覆盖原文件<br>
 *（4.3）file.delete()：删除文件<br>
 *（4.4）file.getName()：获取文件名称<br>
 *（4.5）file.canRead()：判断文件是否为可读<br>
 *（4.6）file.canWrite()：判断文件是否可被写入<br>
 *（4.7）file.length()：获取文件的长度，以字节为单位<br>
 *（4.8）file.getAbsolutePath()：获取文件的绝对路径<br>
 *（4.9）file.getParent()：获取文件的父路径<br>
 *（4.10）file.isFile()：判断是否是一个正常的文件，而不是文件夹或者不存在的文件<br>
 *（4.11）file.isDirectory()：判断文件是否为一个目录<br>
 *（4.12）file.isHidden()：判断文件是否为隐藏文件<br>
 *（4.13）file.lastModified()：获取文件的最后修改时间，返回值【long】<br>
 *（4.14）file.toURI()：获取文件的URI标识符，也即URL路径<br>
 *（5）问题：当我们在使用new File().length()获取文件长度的时候，文件中的确有内容，但是却显示结果为0？？<br>
 *（5.1）分析：经过多次试验，原因为File类创建完成后；如果将File类对象file被用作其他输入输出流，如FileReader、FileWriter、
 *   FileInputStream、FileOutputStream....【new FileReader(new File("a.txt"))】；那么因为file对象指向的文件被占用，
 *   此时调用file.length()会返回值0，表示File对象被占用。<br>
 *（5.2）源码：通过对源码的分析可以看出，在方法length()中会有一系列步骤来判断文件的状态，如果状态返回表示invalid，无效，默认返回值0L；
 *  表示File对象操作不可用；这应该也是一种文件保护机制<br><br>
 *（5.2）解决：要获取文件长度只有两个地方（可能对File对象的其他操作也是这种情况）：<br>
 *    1.File对象被其他对象占用之前调用length()；<br>
 *    2.数据流如Reader、Writer关闭【inOrout.close()】之后，即数据流解除对File对象的占用之后调用<br><br>
 *（6）关于文件路径的问题：<br>
 *（6.1）文件URI路径格式：<br>
 *    [  Linux ]file:/home/cloud/a.txt<br>
 *    [ window ]file:/c:/user/a.txt<br><br>
 *（6.2）文件路径：<br>
 * 相对路径：相对路径表示相对于工程上下文环境，此处的上下文环境为contextPath="item/"<br><br>
 */
public class FileTest {
	public static void main(String[] args){
		File file=new File("./src/Stream/a.txt");
		System.out.println(file.exists());
		System.out.println(file.toURI());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(file.isFile());
		System.out.println(file.getAbsolutePath());
	}
}
