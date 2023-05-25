package code_LeetCode.code_2023_04_03.Code;

import java.util.Arrays;
import java.util.Scanner;

/*
*         5
        12 10 15 20 6
        6 10 12 15 20
            * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temp = new int[n];
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
            temp[i] = sc.nextInt();
            arr[i] = temp[i];
        }
        Arrays.sort(temp);
        boolean flag = false;
        int mid = temp[n/2];
        System.out.println(mid);
        for(int i = 0;i< n ;i++) {
            int val = mid - arr[i];
            if(val > 0) {
                System.out.print(val+1 +" ");
            } else if (val < 0) {
                System.out.print(0 + " ");
            } else {
                if(temp[n/2 -1] == mid || temp[n/2 +1] == mid) {
                    System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
                }
            }
        }

    }
}
