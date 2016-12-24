package io;

import java.io.File;

/** 
 * @Description: 删除文件
 * @author hjd
 * @date 2016年12月23日 下午8:23:26 
 *  
 */
public class DeleteFileDemo {

	public static void main(String[] args) {
		
		File file = new File("E:/major/workspaces/io/newFile.txt");
		if(file.delete()){
			System.out.println(file.getName() + " is deleted!");
		}else{
			System.out.println("delete file is failed!");
		}
	}
}
