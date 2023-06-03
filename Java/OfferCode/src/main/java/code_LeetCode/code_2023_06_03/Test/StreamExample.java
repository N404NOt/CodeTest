package code_LeetCode.code_2023_06_03.Test;

import code_LeetCode.code_2023_03_02.Test.B;

import java.io.*;
import java.util.Scanner;

public class StreamExample {
    public static void main(String[] args) {
        File file = new File("source.txt");
        File file2 = new File("resource.txt");
        Scanner sc = new Scanner(System.in);
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("源文件创建成功！ 文件位置为： " + file.getAbsolutePath());
                } else {
                    System.out.println("源文件创建失败!");
                    return;
                }
            }

            try(FileOutputStream outputStream = new FileOutputStream(file);
                BufferedOutputStream bufferedInputStream = new BufferedOutputStream(outputStream);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedInputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {
                while (sc.hasNext()) {
                    String line = sc.nextLine();
                    if (line.equals("exit")) {
                        System.out.println("输入结束！");
                        break;
                    } else {
                        outputStreamWriter.write(line);
//                        outputStreamWriter.write(System.lineSeparator());
                        bufferedWriter.newLine();

                    }
                }
                System.out.println("源文件写入完成！");
            }

            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("目标文件创建成功! 文件位置为： " + file.getAbsolutePath());
                } else {
                    System.out.println("目标文件创建失败！");
                    return;
                }
            }

            try(FileInputStream inputStream = new FileInputStream(file);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);) {
                int byteRead;
                while ( (byteRead = bufferedInputStream.read()) != -1) {
                    System.out.println(byteRead);
                }
            }


        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
