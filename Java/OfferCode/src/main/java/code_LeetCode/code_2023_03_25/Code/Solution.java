package code_LeetCode.code_2023_03_25.Code;

class Solution {
    public int fib(int n) {
        int a =0;
        int b =1;
        for(int i = 0; i< n;i++) {
            int temp = a;
            a = (a+b) % 1000000007;
            b = temp;
        }
        return a;

    }
}