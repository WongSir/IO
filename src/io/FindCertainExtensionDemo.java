package io;

import java.io.File;
import java.io.FilenameFilter;

/** 
 * @Description: �����ض���׺���ļ�
 * @author hjd
 * @date 2016��12��24�� ����10:27:53 
 *  
 */
public class FindCertainExtensionDemo {

	private static final String file_dir = "E:\\major\\course\\ELK\\Kibana\\data";
	private static final String file_ext =".json";
	
	public static void main(String[] args) {
		new FindCertainExtensionDemo().listFile(file_dir, file_ext);
	}
	
	public void listFile(String folder , String ext){
		GenericFilter filter = new GenericFilter(ext);
		File dir = new File(folder);
		
		if(dir.isDirectory()==false){
			System.out.println("��·�����ļ��в�����");
			return;
		}
		
		String[] list = dir.list(filter); 
		
		for(int i=0;i<list.length;i++){
			System.out.println("ͨ��String[]������յ��ļ���" + list[i]);
		}
		
		if(list.length==0){
			System.out.println("û�з��ϸú�׺���ļ�");
			return;
		}
		
		File[] lists= dir.listFiles(filter);
		for(int i=0;i<lists.length;i++){
			System.out.println("��׺Ϊ.json���ļ���" + lists[i]);
		}
		
//		for(String file : list){
//			String temp = new StringBuffer(file_dir).append(File.separator).append(file).toString();
//			System.out.println("file: " + temp);
//		}
		
	}
	
	//ʵ��FilenameFilter�ӿ�
	public class GenericFilter implements FilenameFilter{

		private String ext;
		
		public GenericFilter(String ext) {
			this.ext=ext;
		}
		
		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return (name.endsWith(ext));
		}
		
	}
}
