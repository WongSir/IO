package io;

import java.io.File;
import java.text.SimpleDateFormat;

/** 
 * @Description: ��ȡ�ļ�������޸�ʱ��
 * @author hjd
 * @date 2016��12��24�� ����3:56:11 
 *  
 */
public class GetFileLastModifiedDateDemo {

	public static void main(String[] args) {
		File file = new File("test\\test.txt");
		System.out.println("ʱ���ʽ����֮ǰ��ʱ�䣺"+ file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("after format: " + sdf.format(file.lastModified()));
	}
}
