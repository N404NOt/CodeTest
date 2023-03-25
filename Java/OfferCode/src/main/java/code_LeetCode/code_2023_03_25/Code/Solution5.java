package code_LeetCode.code_2023_03_25.Code;

class Solution5 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i =1;i<nums.length;i++) {
            nums[i] += Math.max(nums[i-1],0);
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}

