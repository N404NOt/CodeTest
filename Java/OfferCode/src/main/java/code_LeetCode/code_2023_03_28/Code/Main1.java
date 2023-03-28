package code_LeetCode.code_2023_03_28.Code;

import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String[] results = src.split("[\\W]");
        for(int i = results.length -1 ;i >=0 ; i--) {
             if(results[i].equals("")) {
                 continue;
             } else {
                 System.out.print(results[i] + " ");
             }
        }
        System.out.println();
    }
}