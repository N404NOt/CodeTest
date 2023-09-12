package code_LeetCode.code_2023_09_12.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) {
            return null;
        }
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            if(nums[i] > 0) {
                return list;
            }
            int sum = 0;
            int L = i + 1;
            int R = nums.length-1;
            List<Integer> tmp = new ArrayList<>();
            while(L < R) {
                sum = nums[i] + nums[L] + nums[R];
                if(sum > 0) {
                    R--;
                }else if (sum < 0) {
                    L++;
                } else {
                    tmp.add(nums[i]);
                    tmp.add(nums[L]);
                    tmp.add(nums[R]);
                    list.add(tmp);
                    tmp = new ArrayList<>();
                    while(L < R && nums[L] == nums[L+1]) {
                        L++;
                    }
                    while(L < R && nums[R] == nums[R-1]) {
                        R--;
                    }
                    L++;
                    R--;

                }
            }
        }
        return list;

    }
}