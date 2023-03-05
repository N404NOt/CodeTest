package code_LeetCode.code_2023_03_05.Test;

import java.util.Arrays;

public class InsertSort_ {
 


    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 7, 6, 4, 1, 0, 2, 9, 8};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
 
    public static void insertSort(int[] arr) {
        if (arr.length < 2)
            return;
 
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
 
            int j = i - 1;
            while (j >= 0 && tmp < arr[j]) // 从后往前扫描，找到待插入的位置。同时移动数组内容
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
    }
}