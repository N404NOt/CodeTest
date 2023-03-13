package code_LeetCode.code_2023_03_13.Code;

import java.util.Scanner;

public class Main2 {

    /**
     * 分解因子
     *
     * @author haomin
     * @date 2022/05/30 17:09
     **/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int numE = in.nextInt();
            int num = numE;
            // 创建一个字符串存储已找到的因子
            int first = 0;
            String str = "";
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    while (num % i == 0) {
                        if (first == 0) {
                            str += i;
                            first++;
                        } else {
                            str += " * ";
                            str += i;
                        }
                        num /= i;
                    }
                }
            }
            System.out.println(numE + " = " + str);
        }
    }
}

