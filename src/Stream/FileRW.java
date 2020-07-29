package Stream;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
/**
*@author:cloud<br>
*@date:2019年5月7日下午2:13:57<br>
*@class:Stream.FileRW.java<br><br>
*/

/**
 * @author 云飞<br><br>
*（1）由于汉字在文件中占用两个字节，如果使用字节流，读取不好可能会出现乱码现象，此时采用
*   Reader或Writer。【英文在文件中占用一个字节】<br>
*（2）构造方法：FileReader r=new FileReader(File file)<br>
*（2.1）r.write(String s)：将一个字符串写入文件中，在文件中同String一样，汉字占两个字节，英文占一个字节<br>
*（2.2）r.close()：关闭数据输入流<br><br>
*
*（3）构造方法：FileWriter w=new FileWriter(File file)<br>
*（3.1）w.read(Byte[] byte)：将文件内容读入一个字节数组中<br>
*（3.2）w.close()：关闭数据输出流<br><br>
*（4）注意FileTest中关于数据流占用File对象后的注意事项！！！
 */
public class FileRW {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		boolean success=false;
		FileWriter w=null;
		try{
			File f=new File("./src/Stream/a.txt");
			if(!f.exists()) f.createNewFile();
			else System.out.println("文件存在");
			System.out.println("原文件长度："+f.length());
			w=new FileWriter(f);
			
			String s="写入文件的字符串sss";
			System.out.println("字符串s字节数："+s.getBytes().length);
			w.write(s);
			w.close();
			System.out.println("现文件长度："+f.length());
		    success=true;
		}catch(IOException e){
			if(w==null)success=false;
			System.out.println("IO error:"+e.getMessage());
		}
		if(success==false)System.out.println("文件打开错误");
		else System.out.println("文件打开成功");
	}

}
