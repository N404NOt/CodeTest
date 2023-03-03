package code_LeetCode.code_2023_03_03.Test;

    import java.util.Scanner;

    public class Demo1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(n);
                System.out.print(" ");
            }
            System.out.println();
            for (int i = n + 1; i < n * 2; i++) {
                for (int j = 0; j < i-n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n*2-i; j++) {
                    System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println();

            }
        }
    }




