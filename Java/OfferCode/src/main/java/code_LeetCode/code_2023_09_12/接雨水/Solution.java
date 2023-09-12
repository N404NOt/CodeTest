package code_LeetCode.code_2023_09_12.接雨水;

class Solution {
    public static int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];

        int maxH = 0;
        for(int i = 0; i < len;i++) {
            maxH = height[i] > maxH ? height[i] : maxH;
            left[i] = maxH;
        }

        maxH = 0;
        for(int i = len-1; i >= 0;i--) {
            maxH = height[i] > maxH ? height[i] : maxH;
            right[i] = maxH;
        }
        int sum = 0;
        for(int i = 0 ; i<len;i++) {
            sum += Math.min(left[i],right[i]) - height[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int [] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

    }
}