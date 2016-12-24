package io;

import java.io.File;

/** 
 * @Description: ʹ�õݹ鷽��ɾ���ļ��м��ļ����µ��ļ�
 * @author hjd
 * @date 2016��12��24�� ����10:46:44 
 *  
 */
public class DeleteFolderDemo {

	private static final String spath = "E:\\major\\workspaces\\io\\test";
	private static File path = new File(spath);
	
	
	public void deleteAllFilesOfDir(File path) {  
	    if (!path.exists())  
	        return;  
	    if (path.isFile()) {  
	        path.delete();  
	        return;  
	    }   
	    
	    File[] files = path.listFiles();   //�г��ļ����е������ļ�������һɾ��
	    
	    for (int i = 0; i < files.length; i++) { 
	    	System.out.println("�ļ���" + files[i]);
	        deleteAllFilesOfDir(files[i]);  
	    }  
	    path.delete(); 
	    System.out.println("��ɾ��");
	}  
	
	public static void main(String[] args) {
		new DeleteFolderDemo().deleteAllFilesOfDir(path);
	}
	
	
}
