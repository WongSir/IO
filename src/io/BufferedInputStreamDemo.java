package io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/** 
 * @Description: 使用BufferedInputStream类来读取文件 
 * @author hjd
 * @date 2016年12月22日 下午8:04:20 
 *  
 *  注释部分为其中一种实现方式，，没有注释部分 为另外一种实现方式
 */
public class BufferedInputStreamDemo {

	
	public static void main(String[] args) {
		File file = new File("test.txt");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			
			
			try {
				while(dis.available()!=0){
					System.out.println(dis.readLine());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				bis.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	
}
