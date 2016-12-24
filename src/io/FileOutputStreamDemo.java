package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
 * @Description: ʹ���ֽ���FileOutputStream��д���ļ�
 * @author hjd
 * @date 2016��12��23�� ����7:39:02 
 *  
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		FileOutputStream fops = null;
		String content = "����д���ļ������ݡ�";
		File file = new File("E:/major/workspaces/io/newFile.txt");
		
		try {
			fops = new FileOutputStream(file);
			if(!file.exists()){
				file.createNewFile();
			}
			
			//���ֽ�Ϊ��λ��ȡ����
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
