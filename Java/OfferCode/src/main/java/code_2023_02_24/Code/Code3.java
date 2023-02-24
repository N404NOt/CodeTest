package code_2023_02_24.Code;

public class Code3 {
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;
        while(cur != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            if(cur == null) {
                break;
            }
            next = next.next;
        }
        return pre;
    }
}*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;

    }
}*/
