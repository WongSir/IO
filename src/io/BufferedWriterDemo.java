package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/** 
 * @Description: 使用字符流BufferedWriter类写入文件 
 * @author hjd
 * @date 2016年12月23日 下午7:55:55 
 *  
 */
public class BufferedWriterDemo {

	private static final String filename = "E:/major/workspaces/io/newFile.txt";
	public static void main(String[] args) {
		BufferedWriter bw =null;
		FileWriter fw =null;
		
		try {
			String content = "这是使用字符流BufferedWriter类写入的文件内容。";
			fw = new FileWriter(filename,true);  //构造函数中的第二个参数true表示以追加形式写文件
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
