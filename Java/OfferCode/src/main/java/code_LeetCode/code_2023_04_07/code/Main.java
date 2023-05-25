package code_LeetCode.code_2023_04_07.code;

import java.io.IOException;
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long cnt = 0;
        for (long i = n * 4 / 5 * 5; i < Long.MAX_VALUE; i += 5) {
            long x = i;
            cnt = 0;
            while (x > 0) {
                x /= 5;
                cnt += x;
            }
            if (cnt >= n) {
                if (cnt == n) {
                    System.out.print(i);
                    return;
                } else {
                    System.out.print("-1");
                    return;
                }
            }
        }
        scanner.close();
    }
}