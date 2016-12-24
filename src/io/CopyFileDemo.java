package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/** 
 * @Description: 复制文件
 * @author hjd
 * @date 2016年12月24日 下午2:53:45 
 *  
 */
public class CopyFileDemo {

	public static void main(String[] args) {
		File oldfile = new File("oldfile.txt");
		File newfile = new File("newfile.txt");
		
		try {
			InputStream inStream = new FileInputStream(oldfile); //输入到内存
			OutputStream outStream = new FileOutputStream(newfile); //输出到文件			
			
			byte[] buffer = new byte[1024];
			int length;
			while((length=inStream.read(buffer))>0){
				outStream.write(buffer, 0, length);
			}
			
			
			inStream.close();
			outStream.close();
			
			System.out.println("文件复制结束");
			
			FileReader fr = new FileReader("newfile.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String content;
			while((content=br.readLine())!=null){
				System.out.println("复制的内容为："+ content);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
 	}
}
