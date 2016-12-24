package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: 使用File.createNewFile 方法创建一个文件 
 * @author hjd
 * @date 2016年12月22日 下午5:34:48 
 *  
 */
public class CreateNewFileDemo {

	public static void main(String[] args) {
		
		File file = new File("E:/major/workspaces/io/newFile.txt");
		
		try {
			if(file.createNewFile()){
				System.out.println("File is created!");
			}else{
				System.out.println("File is exists!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
