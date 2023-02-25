package code_2023_02_25.Exercise;

import java.io.*;

public class FileReaderDemo {
	public static void main(String[] args) {
		File file=new File("src\\cc.txt");
		FileReader f=null;//文件读取对象
		BufferedReader f1=null;//字符流对象
		try {
			f=new FileReader(file);
			f1=new BufferedReader(f);
			//循环打印cc文件中的每行数据
			String str=null;
			while((str=f1.readLine())!=null) {
				System.out.println(str);
			}
				
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				f1.close();
				f.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
