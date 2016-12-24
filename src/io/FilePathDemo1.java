package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: 使用File.separator 或者 System.getProperty("file.separator")构建文件路径 
 * @author hjd
 * @date 2016年12月22日 下午5:56:12 
 *  
 */
public class FilePathDemo1 {

	public static void main(String[] args) {
		String filename="newfile.txt";
		
		String workingDirectory = System.getProperty("user.dir"); //当前工作目录
		String absoluteFilePath = "";
		
		absoluteFilePath = workingDirectory + File.separator + filename;
		//或者 absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
		
		System.out.println("workingDirectory: "+ workingDirectory);
		System.out.println("absoluteFilePath: " + absoluteFilePath);
		
		//创建实例，并赋值
		File file = new File(absoluteFilePath);
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
