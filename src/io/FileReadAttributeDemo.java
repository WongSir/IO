package io;

import java.io.File;

/** 
 * @Description: 设置文件的读写权限 
 * @author hjd
 * @date 2016年12月24日 下午4:06:03 
 *  
 */
public class FileReadAttributeDemo {

	public static void main(String[] args) {
		File file = new File("test.txt");
		file.setReadOnly();
		if(file.canWrite()){
			System.out.println("文件可写");
		}else{
			System.out.println("文件只可读");
		}
		
		//设置可写
		file.setWritable(true);
		
		if(file.canWrite()){
			System.out.println("文件可写");
		}else{
			System.out.println("文件只可读");
		}
	}
}
