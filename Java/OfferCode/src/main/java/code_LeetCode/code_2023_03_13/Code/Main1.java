package code_LeetCode.code_2023_03_13.Code;

import java.util.Scanner;

import java.util.*;

public class Main1{
    public static ArrayList<Integer> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            list = new ArrayList<>();
            int n = sc.nextInt();
            getNum(n);
            int len = list.size();
            System.out.print(n + " = ");
            for(int i = 0;i<len ;i++) {
                System.out.print(list.get(i));
                if(i != len-1) {
                    System.out.print(" * ");
                }
            }
            System.out.println();

        }
    }

    public static void getNum(int n) {
        for(int i = 2; i <= n ; i++) {
            if(n%i == 0) {
                list.add(i);
                getNum(n/i);
                return;
            }
        }
    }
}