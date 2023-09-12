package code_LeetCode.code_2023_09_12.接雨水;

class Solution2 {
    public int trap(int[] height) {
        int len = height.length;
        int lMax = 0;
        int rMax = 0;
        int L = 0;
        int R = len-1;
        int max = 0;
        while(L != R) {
            lMax = Math.max(lMax,height[L]);
            rMax = Math.max(rMax,height[R]);

            if (height[L] < height[R]) {
                max += lMax - height[L];
                L++;
            } else {
                max += rMax - height[R];
                R--;
            }
        }
        return max;

    }
}