package code_LeetCode.code_2023_05_29.Code;

import code_LeetCode.code_2023_05_24.ListNode;

/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution4 {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null) 
            return pHead;

        ListNode res = new ListNode(0);
        res.next = pHead;
        ListNode cur = res;
        while(cur.next != null && cur.next.next != null) {
            if(cur.next.val == cur.next.next.val) {
                int tmp = cur.next.val;
                while(cur.next != null && cur.next.val == tmp) {
                    cur.next = cur.next.next;
                }
            } else 
                cur = cur.next;
        }
        return res.next;

    }
}
