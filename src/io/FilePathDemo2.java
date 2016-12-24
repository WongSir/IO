package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: 使用File.separator 或者 System.getProperty("file.separator")构建文件路径 
 * @author hjd
 * @date 2016年12月22日 下午7:06:35 
 *  
 */
public class FilePathDemo2 {

	public static void main(String[] args) {
		String filename = "newfile.txt";
		String workingDirectory = System.getProperty("user.dir");
		
		File file = new File(workingDirectory,filename);
		
		//输出该文件构建的绝对路径
		System.out.println("absoluteFilePath: " + file.getAbsolutePath());
		
		try {
			if(file.createNewFile()){
				System.out.println("File is created!");
			}else{
				System.out.println("File is already exists!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
