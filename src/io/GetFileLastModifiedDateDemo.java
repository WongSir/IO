package io;

import java.io.File;
import java.text.SimpleDateFormat;

/** 
 * @Description: 获取文件的最后修改时间
 * @author hjd
 * @date 2016年12月24日 下午3:56:11 
 *  
 */
public class GetFileLastModifiedDateDemo {

	public static void main(String[] args) {
		File file = new File("test\\test.txt");
		System.out.println("时间格式设置之前的时间："+ file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("after format: " + sdf.format(file.lastModified()));
	}
}
