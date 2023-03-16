package code_LeetCode.code_2023_03_16.Code;

import java.util.*;
public class Main3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String amail = sc.next();
            sc.nextLine();
            String target = sc.next();
            if(amail.contains(target)) {
                System.out.println("Ignore");
            } else {
                System.out.println("Important!");
            }
        }
    }
}