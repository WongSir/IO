package io;

import java.io.File;

/** 
 * @Description: ͨ��File.length��ȡ�ļ����ֽڳ���
 * @author hjd
 * @date 2016��12��24�� ����4:15:06 
 *  
 */
public class GetFileSizeDemo {

	public static void main(String[] args) {
		File file = new File("test\\test.txt");
		if(file.exists()){
			 double bytes = file.length();
			 System.out.println("byte���ȣ�" + bytes);
		}else{
			System.out.println("�ļ�������");
		}
	}
}
