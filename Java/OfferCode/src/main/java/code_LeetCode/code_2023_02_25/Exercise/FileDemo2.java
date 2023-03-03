package code_LeetCode.code_2023_02_25.Exercise;

import java.io.*;

public class FileDemo2 {

    public static void main(String[] args) {
        try{
            File file = new File("xuk.txt");
            FileInputStream f1 = new FileInputStream(file);
            for (int i = 0; i < file.length(); i++) {
                char ch = (char)(f1.read());
                System.out.println(ch+" ");
            }
            f1.close();
            System.out.println("文件关闭");
        } catch (Exception e) {
            System.out.println("文件打开失败");
        }


        try{
            File file = new File("xuk.txt");
            FileOutputStream f1 = new FileOutputStream(file);
            String str = "123asd徐凯徐凯徐凯";
            byte[] buff = str.getBytes();
            f1.write(buff);
            System.out.println("写入成功");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
