package io;

import java.io.File;

/** 
 * @Description: 使用递归方法删除文件夹及文件夹下的文件
 * @author hjd
 * @date 2016年12月24日 上午10:46:44 
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
	    
	    File[] files = path.listFiles();   //列出文件夹中的所以文件，并逐一删除
	    
	    for (int i = 0; i < files.length; i++) { 
	    	System.out.println("文件：" + files[i]);
	        deleteAllFilesOfDir(files[i]);  
	    }  
	    path.delete(); 
	    System.out.println("已删除");
	}  
	
	public static void main(String[] args) {
		new DeleteFolderDemo().deleteAllFilesOfDir(path);
	}
	
	
}
