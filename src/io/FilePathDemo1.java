package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: ʹ��File.separator ���� System.getProperty("file.separator")�����ļ�·�� 
 * @author hjd
 * @date 2016��12��22�� ����5:56:12 
 *  
 */
public class FilePathDemo1 {

	public static void main(String[] args) {
		String filename="newfile.txt";
		
		String workingDirectory = System.getProperty("user.dir"); //��ǰ����Ŀ¼
		String absoluteFilePath = "";
		
		absoluteFilePath = workingDirectory + File.separator + filename;
		//���� absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
		
		System.out.println("workingDirectory: "+ workingDirectory);
		System.out.println("absoluteFilePath: " + absoluteFilePath);
		
		//����ʵ��������ֵ
		File file = new File(absoluteFilePath);
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
