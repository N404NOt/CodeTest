package code_LeetCode.code_2023_03_14.Code;

import java.util.Scanner;

public class KMP1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.next();
            String sub = sc.next();
            System.out.println(KMP(str, sub));
        }

    }

    public static int KMP(String str, String sub) {

        int strLength = str.length();
        int subLength = sub.length();

        if (subLength > strLength - 0) return -1;
        int[] next = new int[subLength];

        getNext(sub, next);

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < strLength ) {
            //这里就是母串不会往回返只会勇往直前或者稍微停留
            //j==-1是子串第一个字符都与母串无法匹配所以母串向后走，子串走到0的位置
            if(j == subLength) {
                j = 0;
                count++;
                continue;
            }
            if (j == -1 || str.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
                //这块代码等看了第五部分再看
                //这里的子串回到对应的重复位置上减少重复匹配次数
            } else {
                j = next[j];

            }
        }
        if( j == subLength) {
            count++;
        }
        return count;
    }
    public static void getNext(String sub, int[] next) {
        next[0] = -1;
        int i;
        if(sub.length() >=2) {
            next[1] = 0;
            i = 2;
        } else {
            i = 1;
        }
        int k = 0;
        int subLength = sub.length();
        while (i < subLength) {
            if (k == -1 || sub.charAt(i - 1) == sub.charAt(k)) {
                next[i] = k + 1;
                i++;
                k++;
            } else {
                k = next[k];
            }
        }
    }
}