package code_2023_02_26.Code;

import java.util.HashSet;
import java.util.Set;

public class Code1 {
    public static void main(String[] args) {

    }

}

/*
class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i)) return i;
            set.add(i);
        }
        return -1;

    }
}
*/


/*
class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] compare = new int[nums.length];
        for(int num : nums) {
            if(compare[num] != 0) return num;
            compare[num]++;
        }
        return -1;
    }
}*/
