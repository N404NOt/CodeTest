package code_LeetCode.code_2023_03_16.Code;

import java.util.*;
public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int i = 0;
            sc.nextLine();
            for(;i < n;i++) {
                String str = sc.nextLine();
                if(judg(str)) {
                    System.out.print("\""+str +"\"");
                } else {
                    System.out.print(str);
                }
                if(i < n-1) {
                    System.out.print(", ");
                }
            }
                
                System.out.println();
        }
    }
    
    public static boolean judg(String str) {
        int len = str.length();
        for(int i = 0;i < len;i++) {
            char c = str.charAt(i);
            if(c == ' ' || c == ',') {
                return true;
            }
        }
        return false;
    }
}