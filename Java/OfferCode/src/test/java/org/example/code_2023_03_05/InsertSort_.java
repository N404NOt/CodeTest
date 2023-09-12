/*

package org.example.code_2023_03_05;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

*/
/**
 * 借鉴了网上的插入排序，重新写了一个
 * 这个是从后往前比较，
 * 直观看起来少一重循环
 *//*

@Slf4j
public class InsertSort_ {
 
    @Test
    public void test() {
        int[] arr = new int[]{5, 3, 7, 6, 4, 1, 0, 2, 9, 8};
        log.info("init: {}", Arrays.toString(arr));
        insertSort(arr);
        log.info("result: {}", Arrays.toString(arr));
    }
 
    public void insertSort(int[] arr) {
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
}*/
