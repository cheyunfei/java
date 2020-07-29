package Stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
/**
*@author:cloud<br>
*@date:2019年5月7日上午12:53:22<br>
*@class:Stream.FileStreamTest.java<br><br>
*/

/**
 * @author 云飞<br><br>
*（1）FileInputStream和FileOutputStream两个类都是用来操作磁盘文件<br>
*（2）FileInputStream extends InputStream； FileOutputStream extends OutputStream<br>
*（3）注意FileOutputStream对象往文件中写入的时候，该文件不能是正在被其他程序占用的文件<br><br>
*（4）构造函数：<br>
*（4.1）FileInputStream in=new FileInputStream(String name)，name【使用给定的文件名创建FileInputStream对象】<br>
*（4.1.1）in.read(byte[] s)：将从文件读出的信息写入字节数组中<br>
*（4.1.2）in.close()：关闭输入流<br><br>
*（4.2）FileOutputStream out=new FileOutputStream(File file,boolean append)，file【使用一个File对象创建FileOutputStream对象】，
*   append【true，以添加的方式写入文件；false，以覆盖的方式写入文件】<br>
*（4.2.1）out.wirte(byte[] s)：将字节数组中的数据写入文件中<br>
*（4.2.2）out.close()：关闭输出数据流<br><br>
*（5）注意FileTest中关于数据流占用File对象后的注意事项！！！
 */
public class FileIOputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自动生成的方法存根
		File f=new File("./src/Stream/a.txt");
		try {
			if(!f.exists()) f.createNewFile();
			else System.out.println("文件a.txt已存在！！");
			System.out.println(f.length());
			FileOutputStream s=new FileOutputStream(f,false);
			
			byte[] buy="发生的发生".getBytes();
			s.write(buy);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
