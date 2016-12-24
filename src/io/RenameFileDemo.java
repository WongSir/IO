package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: 重命名文件 
 * @author hjd
 * @date 2016年12月24日 下午2:39:44 
 *  
 */
public class RenameFileDemo {

	public static void main(String[] args) {
		
		File oldfile = new File("oldfile.txt");
		File newfile = new File("newfile.txt");
		
		if(!oldfile.exists()){
			try {
				oldfile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(oldfile.renameTo(newfile)){
			System.out.println("文件重命名成功");
		}else{
			System.out.println("文件重命名失败");
		}
	}
}
