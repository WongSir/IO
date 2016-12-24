package io;

import java.io.File;
import java.io.IOException;

/** 
 * @Description: �������ļ� 
 * @author hjd
 * @date 2016��12��24�� ����2:39:44 
 *  
 */
public class RenameFileDemo {

	public static void main(String[] args) {
		
		File oldfile = new File("oldfile.txt");
		File newfile = new File("newfile.txt");
		
		if(!oldfile.exists()){
			try {
				oldfile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(oldfile.renameTo(newfile)){
			System.out.println("�ļ��������ɹ�");
		}else{
			System.out.println("�ļ�������ʧ��");
		}
	}
}
