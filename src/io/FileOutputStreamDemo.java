package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
 * @Description: 使用字节流FileOutputStream类写入文件
 * @author hjd
 * @date 2016年12月23日 下午7:39:02 
 *  
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		FileOutputStream fops = null;
		String content = "这是写入文件的内容。";
		File file = new File("E:/major/workspaces/io/newFile.txt");
		
		try {
			fops = new FileOutputStream(file);
			if(!file.exists()){
				file.createNewFile();
			}
			
			//以字节为单位获取内容
			byte[] contentInBytes = content.getBytes();
			
			fops.write(contentInBytes);
			fops.flush();
			fops.close();
			
			System.out.println("Done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fops!=null){
				try {
					fops.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
