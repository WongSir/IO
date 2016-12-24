package io;

import java.io.File;

/** 
 * @Description: 通过File.length获取文件的字节长度
 * @author hjd
 * @date 2016年12月24日 下午4:15:06 
 *  
 */
public class GetFileSizeDemo {

	public static void main(String[] args) {
		File file = new File("test\\test.txt");
		if(file.exists()){
			 double bytes = file.length();
			 System.out.println("byte长度：" + bytes);
		}else{
			System.out.println("文件不存在");
		}
	}
}
