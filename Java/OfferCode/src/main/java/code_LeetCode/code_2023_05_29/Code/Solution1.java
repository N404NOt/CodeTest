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

public class Solution1 {
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
        if (pHead == null || k == 0){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = pHead;
        while(cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        ListNode result = null;
        if(stack.size() < k) {
            return null;
        }
        ListNode firstNode = stack.pop();
        while (--k > 0) {
            ListNode temp = stack.pop();
            firstNode = temp;
        }
        return firstNode;
    }
}