package io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/** 
 * @Description: ʹ��BufferedInputStream������ȡ�ļ� 
 * @author hjd
 * @date 2016��12��22�� ����8:04:20 
 *  
 *  ע�Ͳ���Ϊ����һ��ʵ�ַ�ʽ����û��ע�Ͳ��� Ϊ����һ��ʵ�ַ�ʽ
 */
public class BufferedInputStreamDemo {

	
	public static void main(String[] args) {
		File file = new File("test.txt");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			
			
			try {
				while(dis.available()!=0){
					System.out.println(dis.readLine());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				bis.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	
}
