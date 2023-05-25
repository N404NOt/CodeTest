package code_LeetCode.code_2023_04_03.Code;

import java.util.Scanner;

public class Main1 {
    //用循环累乘求n的阶乘
    public static void main(String[] args) {
        long r = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i > 0;i--){
            r *= i;
        }
        System.out.println(r);
    }
}
