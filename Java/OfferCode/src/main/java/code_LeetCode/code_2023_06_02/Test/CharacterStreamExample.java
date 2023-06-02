package code_LeetCode.code_2023_06_02.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class CharacterStreamExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String targetFile = "target.txt";

        try {
            File file = new File(sourceFile);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("源文件已创建。");
                } else {
                    System.out.println("无法创建源文件。");
                    return;
                }
            }

            FileReader reader = new FileReader(file);

            file = new File(targetFile);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("目标文件已创建。");
                } else {
                    System.out.println("无法创建目标文件。");
                    return;
                }
            }

            FileWriter writer = new FileWriter(file);

            int character;

            // 从字符流中读取字符并写入到目标文件
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("文件复制完成。");

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
