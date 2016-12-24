package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/** 
 * @Description: �����ļ�
 * @author hjd
 * @date 2016��12��24�� ����2:53:45 
 *  
 */
public class CopyFileDemo {

	public static void main(String[] args) {
		File oldfile = new File("oldfile.txt");
		File newfile = new File("newfile.txt");
		
		try {
			InputStream inStream = new FileInputStream(oldfile); //���뵽�ڴ�
			OutputStream outStream = new FileOutputStream(newfile); //������ļ�			
			
			byte[] buffer = new byte[1024];
			int length;
			while((length=inStream.read(buffer))>0){
				outStream.write(buffer, 0, length);
			}
			
			
			inStream.close();
			outStream.close();
			
			System.out.println("�ļ����ƽ���");
			
			FileReader fr = new FileReader("newfile.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String content;
			while((content=br.readLine())!=null){
				System.out.println("���Ƶ�����Ϊ��"+ content);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
 	}
}
