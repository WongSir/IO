package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: ʹ��File.createNewFile ��������һ���ļ� 
 * @author hjd
 * @date 2016��12��22�� ����5:34:48 
 *  
 */
public class CreateNewFileDemo {

	public static void main(String[] args) {
		
		File file = new File("E:/major/workspaces/io/newFile.txt");
		
		try {
			if(file.createNewFile()){
				System.out.println("File is created!");
			}else{
				System.out.println("File is exists!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
