package code_2023_02_25.Exercise;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        File f1 = new File("xuk1.txt");
        if(f1.exists()) {
            System.out.println("文件已经存在");
        } else {
            try{
                f1.createNewFile();
                System.out.println("文件创建成功");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(f1.exists());
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.isDirectory());
        System.out.println(f1.length());
    }
}
