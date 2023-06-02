package code_LeetCode.code_2023_06_02.Test;

import java.io.*;
import java.util.Scanner;
/*
* bufferwriter.close() 文件关闭或者是手动刷新 flush() 都会刷新缓冲区
*
* */
public class StreamExample {
    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String targetFile = "target.txt";

        try {
            File file = new File(sourceFile);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("源文件创建成功！");
                } else {
                    System.out.println("无法创建源文件！");
                    return;
                }
            }

            System.out.println("源文件位置为： " + file.getAbsolutePath());
            System.out.println("请输入需要输入的内容: ");
//            try(FileWriter writerResource = new FileWriter(file)) {
            try(FileWriter writerResource = new FileWriter(file)) {
                BufferedWriter bufferedWriter = new BufferedWriter(writerResource);
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()) {
                    String input = sc.nextLine();
                    if (input.equals("exit")) {
                        System.out.println("输入结束!");
                        break;
                    } else {
                        bufferedWriter.write(input);
                        bufferedWriter.newLine();

                    }
                }
//                bufferedWriter.flush();
                bufferedWriter.close();
            }

            // FileWriter writerResource = new FileWriter(file);



            FileReader reader = new FileReader(sourceFile);

            File file2 = new File(targetFile);

            if (!file2.exists()) {
                if (file2.createNewFile()) {
                    System.out.println("目标文件创建成功！");
                }
                 else {
                    System.out.println("无法创建目标文件!");
                    return;
                }
            }

            System.out.println("目标文件位置为： " + file2.getAbsolutePath());


            FileWriter writer = new FileWriter(file2);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            BufferedReader bufferedReader = new BufferedReader(reader);
            int count = 0;
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.print(line + " ");
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                count++;
            }
            System.out.println("文件拷贝成功！");
//            writerResource.close();
            bufferedWriter.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
