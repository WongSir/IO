package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/** 
 * @Description: ʹ���ַ���BufferedWriter��д���ļ� 
 * @author hjd
 * @date 2016��12��23�� ����7:55:55 
 *  
 */
public class BufferedWriterDemo {

	private static final String filename = "E:/major/workspaces/io/newFile.txt";
	public static void main(String[] args) {
		BufferedWriter bw =null;
		FileWriter fw =null;
		
		try {
			String content = "����ʹ���ַ���BufferedWriter��д����ļ����ݡ�";
			fw = new FileWriter(filename,true);  //���캯���еĵڶ�������true��ʾ��׷����ʽд�ļ�
			bw = new BufferedWriter(fw);
			bw.write(content);
			
			System.out.println("Done");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (bw != null) {
					bw.close();
				}
				
				if(fw != null){
					fw.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
