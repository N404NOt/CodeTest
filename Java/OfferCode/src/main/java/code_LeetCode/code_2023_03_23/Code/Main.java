package code_LeetCode.code_2023_03_23.Code;// write your code here
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = 0;
        while(sc.hasNext()) {
            long count = 0;
            n = sc.nextInt();
            count = allCount(n);
            System.out.println(count);
        }
    }
    public static long allCount(long n) {
        if(n == 2) {
            return 1;
        }
        if(n == 1) {
            return 0;
        }
        return  (n - 1) * (allCount(n-1) + allCount(n-2));

    }
    
}