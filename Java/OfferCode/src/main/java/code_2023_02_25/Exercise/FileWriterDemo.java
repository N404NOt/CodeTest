package code_2023_02_25.Exercise;

import java.io.*;

public class FileWriterDemo {
	public static void main(String[] args) {
		String[] str= {"春眠不觉晓,","处处闻啼鸟,","夜来风雨声,","花落知多少,"};
		File file=new File("src\\cc.txt");//我们在该类的位置创建一个新文件
		FileWriter f=null;//创建文件写入对象
		BufferedWriter f1=null;//创建字符流写入对象
	
		try {
			//这里把文件写入对象和字符流写入对象分开写了
			f=new FileWriter("src\\cc.txt");//创建一个名为cc.txt的文件
			f1=new BufferedWriter(f);
			//通过循环遍历上面的String 数组中的元素
			for (int i = 0; i < str.length; i++) {
				f1.write(str[i]);//把String中的字符写入文件
				f1.newLine();//换行操作
				}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {//如果没有catch 异常，程序最终会执行到这里
			try {
				f1.close();
				f.close();//关闭文件
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
