package io;

import java.io.File;
import java.io.FilenameFilter;

/** 
 * @Description: 查找特定后缀的文件
 * @author hjd
 * @date 2016年12月24日 上午10:27:53 
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
			System.out.println("该路径的文件夹不存在");
			return;
		}
		
		String[] list = dir.list(filter); 
		
		for(int i=0;i<list.length;i++){
			System.out.println("通过String[]数组接收的文件：" + list[i]);
		}
		
		if(list.length==0){
			System.out.println("没有符合该后缀的文件");
			return;
		}
		
		File[] lists= dir.listFiles(filter);
		for(int i=0;i<lists.length;i++){
			System.out.println("后缀为.json的文件：" + lists[i]);
		}
		
//		for(String file : list){
//			String temp = new StringBuffer(file_dir).append(File.separator).append(file).toString();
//			System.out.println("file: " + temp);
//		}
		
	}
	
	//实现FilenameFilter接口
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
