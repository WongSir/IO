package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: ʹ��File.separator ���� System.getProperty("file.separator")�����ļ�·�� 
 * @author hjd
 * @date 2016��12��22�� ����7:06:35 
 *  
 */
public class FilePathDemo2 {

	public static void main(String[] args) {
		String filename = "newfile.txt";
		String workingDirectory = System.getProperty("user.dir");
		
		File file = new File(workingDirectory,filename);
		
		//������ļ������ľ���·��
		System.out.println("absoluteFilePath: " + file.getAbsolutePath());
		
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
