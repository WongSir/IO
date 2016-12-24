package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: 设置文件权限 
 * @author hjd
 * @date 2016年12月22日 下午7:23:45 
 *  
 */
public class FilePermissionDemo {

	public static void main(String[] args) {
		
		File file = new File("shellscript.sh");
		
		
		if(file.exists()){
			System.out.println("Is execute allow: " + file.canExecute());
			System.out.println("Is read allow: " + file.canRead());
			System.out.println("Is write allow: " + file.canWrite());
		}
		
//		//设置文件权限
		boolean b1 = file.setExecutable(false);
		boolean b2 = file.setReadable(true);
		boolean b3 = file.setWritable(false);
		
		System.out.println("Is Execute allow: " + file.canExecute());
		System.out.println("Is Read allow: " + file.canRead());
		System.out.println("Is Write allow: " + file.canWrite());
		
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
