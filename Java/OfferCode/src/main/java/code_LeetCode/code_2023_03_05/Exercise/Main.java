package code_LeetCode.code_2023_03_05.Exercise;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            char[] chars = str.toCharArray();
            int max = 0;
            String res = null;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= '0' && chars[i] <= '9') {
                    int start = i;
                    while (i < chars.length && chars[i] >= '0' && chars[i] <= '9') {
                        i++;
                    }
                    int len = i - start;
                    if (len > max) {
                        max = len;
                        res = str.substring(start, i);
                    } else if (len == max) {
                        max = len;
                        res = res + str.substring(start, i);
                    }
                }
            }
            System.out.println(res + "," + max);
        }
    }
}