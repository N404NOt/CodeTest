package code_LeetCode.code_2023_03_05.Exercise;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            int count = 0;
            int max = 0;
            int end = 0;
            for (int i = 0 ; i < s.length() ; i++) {
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    count++;
                    if(max < count) {
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(s.substring(end - max +1,end + 1));
        }
    }

}
