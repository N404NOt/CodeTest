package code_2023_02_25.Exercise;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        File file = new File("src\\cc.txt");
        /*FileReader f  = null;
        BufferedReader f1 = null;
        try{
            f = new FileReader(file);
            f1 = new BufferedReader(f);

            String str = null;
            while((str = f1.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            // TODO: handle exception

        }finally {
            f1.close();
            f.close();

        }*/
        // 方法一：字节流
        // 读取
//        try {
//            FileInputStream f1 = new FileInputStream(file);
//            for(int i =0; i<file.length();i++) {
//                char c = (char)f1.read();
//                System.out.print(c + " ");
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }






    }
}
