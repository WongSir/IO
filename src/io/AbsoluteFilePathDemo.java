package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: ͨ��File.getAbsolutePath()������ȡ�ļ��ľ���·��
 * @author hjd
 * @date 2016��12��24�� ����4:22:09 
 *  
 */
public class AbsoluteFilePathDemo {

	public static void main(String[] args) {
		try {
			File temp = File.createTempFile("i-am-a-temp-file", ".tmp");
			String absolutePath = temp.getAbsolutePath();
			System.out.println("file path: "+absolutePath);
			
			//ȥ���ļ���
			String filepath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
			System.out.println("file path: " + filepath);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
