package code_LeetCode.code_2023_02_26.Code;

public class Code2 {
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(nums[mid] < target) {
                left = mid +1;
            } else if(nums[mid] > target) {
                right = mid -1;
            } else {
                while(true) {
                    if(nums[left] != target) {
                        left++;
                    }
                    if(nums[right] !=target) {
                        right--;
                    }
                    if(nums[left] == nums[right]) {
                        return right - left +1;
                    }
                }
            }
        }
        return 0;
    }
}



/*class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.get(num) != null) {
                int i = map.get(num);
                map.put(num,i+1);
            } else {
                map.put(num,1);
            }
        }
        if(map.get(target) != null  ) {
            return map.get(target);
        }
        return 0;
    }

}*/
