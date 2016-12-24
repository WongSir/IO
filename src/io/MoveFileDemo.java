package io;

import java.io.File;

/** 
 * @Description: 移动文件到另一个目录
 * @author hjd
 * @date 2016年12月24日 下午3:18:46 
 *  
 */
public class MoveFileDemo {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		if(file.renameTo(new File("test\\"+file.getName()))){
			System.out.println("文件移动成功");
		}else{
			System.out.println("移动文件失败");
		}
	}
}
