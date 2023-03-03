package code_LeetCode.code_2023_02_24.Test;

import java.util.LinkedList;

class ListNode {

}

class Solution {
    public static void main(String[] args) {
        int[]a = reversePrint();
        for(int i =0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
    static int[] reversePrint() {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.addLast(1);
        stack.addLast(3);
        stack.addLast(2);
        int[] res = new int[stack.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = stack.removeLast();
    return res;
    }
    }