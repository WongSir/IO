package io;

import java.io.File;

/** 
 * @Description: �����ļ��Ķ�дȨ�� 
 * @author hjd
 * @date 2016��12��24�� ����4:06:03 
 *  
 */
public class FileReadAttributeDemo {

	public static void main(String[] args) {
		File file = new File("test.txt");
		file.setReadOnly();
		if(file.canWrite()){
			System.out.println("�ļ���д");
		}else{
			System.out.println("�ļ�ֻ�ɶ�");
		}
		
		//���ÿ�д
		file.setWritable(true);
		
		if(file.canWrite()){
			System.out.println("�ļ���д");
		}else{
			System.out.println("�ļ�ֻ�ɶ�");
		}
	}
}
