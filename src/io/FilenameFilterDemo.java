package io;

import java.io.File;
import java.io.FilenameFilter;

/** 
 * @Description: ʹ��FilenameFilter���˲�ɾ���ض���׺���ļ� 
 * @author hjd
 * @date 2016��12��24�� ����8:58:07 
 *  
 */
public class FilenameFilterDemo {

	private static final String FILE_DIR= "E:/major/workspaces/io/fileTest";
	private static final String file_filter = ".txt";
	
	public static void main(String[] args) {
		new FilenameFilterDemo().deleteFile(FILE_DIR, file_filter);
	}
	
	
	public void deleteFile(String folder, String ext){
		GenericExtFilter filter = new GenericExtFilter(ext);
		File dir  = new File(folder);
		
		//�г�������.txtΪ��׺���ļ�
		String[] list = dir.list(filter);
		
		if(list.length==0) return;
		
		File fileDelete;
		
		for(String file : list){
			String temp = new StringBuffer(FILE_DIR).append(File.separator).append(file).toString();
			fileDelete = new File(temp);
			boolean isDelete = fileDelete.delete();
			System.out.println("file: " + temp + " is deleted: " + isDelete);
		}
	}
	
	
	//ʵ��FilenameFilter�ӿ�
	public class GenericExtFilter implements FilenameFilter{

		private String ext;

		
		/**
		 * @param ext
		 */
		public GenericExtFilter(String ext) {
			this.ext = ext;
		}

		
		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return (name.endsWith(ext));
		}
		
	}
}
