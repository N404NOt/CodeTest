package code_LeetCode.code_2023_03_16.Code;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        in.nextLine(); //在这里单独写一句读取语句用于读取吸收换行符
        for (int i = 0; i < n; i++)
        {
            s[i] = in.nextLine();
        }
        for(String a:s)
        {
            System.out.println(a);
        }
    }
}
