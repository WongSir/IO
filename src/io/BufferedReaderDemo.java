package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/** 
 * @Description: ʹ��BufferedReader���ȡ�ļ�
 * @author hjd
 * @date 2016��12��22�� ����8:26:03 
 *  
 */
public class BufferedReaderDemo {

	private static final String fileName ="E:/major/workspaces/io/test.txt";
	/**
	 * jdk7 �е�ʾ��
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String sCurrentLine;
			try {
				while((sCurrentLine = br.readLine())!=null){
					System.out.println(sCurrentLine);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
