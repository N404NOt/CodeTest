package code_LeetCode.code_2023_03_26.Code;

class Solution {
    public int numTrees(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        for(int i = 1;i<=n ;i++) {
            for(int j = 1; j <=i ; j++) {
                arr[i] += arr[j-1] * arr[i-j];
            }
        }
        return arr[n];
    }
}