package code_LeetCode.code_2023_05_29.Code;

import code_LeetCode.code_2023_05_24.ListNode;

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param pHead ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if(pHead == null || k == 0) {
            return null;
        }

        ListNode fast = pHead;
        ListNode slow = pHead;
        while (k != 0) {
            if(fast == null) {
                return null;
            }
            fast = fast.next;
   
            k--;
        } 
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}