package io;

import java.io.File;

/** 
 * @Description: �ƶ��ļ�����һ��Ŀ¼
 * @author hjd
 * @date 2016��12��24�� ����3:18:46 
 *  
 */
public class MoveFileDemo {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		if(file.renameTo(new File("test\\"+file.getName()))){
			System.out.println("�ļ��ƶ��ɹ�");
		}else{
			System.out.println("�ƶ��ļ�ʧ��");
		}
	}
}
