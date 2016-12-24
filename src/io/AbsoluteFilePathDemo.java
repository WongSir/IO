package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: 通过File.getAbsolutePath()方法获取文件的绝对路径
 * @author hjd
 * @date 2016年12月24日 下午4:22:09 
 *  
 */
public class AbsoluteFilePathDemo {

	public static void main(String[] args) {
		try {
			File temp = File.createTempFile("i-am-a-temp-file", ".tmp");
			String absolutePath = temp.getAbsolutePath();
			System.out.println("file path: "+absolutePath);
			
			//去除文件名
			String filepath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
			System.out.println("file path: " + filepath);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
