package code_LeetCode.code_2023_05_25.Code;

import code_LeetCode.code_2023_05_24.ListNode;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode tmp1 = pHead1;
        ListNode tmp2 = pHead2;

        int l1 = 0;
        int l2 = 0;

        while(tmp1 != null) {
             l1++;
             tmp1 = tmp1.next;
        }
        while(tmp2 != null) {
            l2++;
            tmp2 = tmp2.next;
        }
        if((l1 - l2) > 0) {
            int l3 = l1 - l2;
            while(l3 != 0) {
                l3--;
                pHead1 = pHead1.next;
            }
        }

        if((l2 - l1) > 0) {
            int l3 = l2 - l1;
            while(l3 != 0) {
                l3--;
                pHead2 = pHead2.next;
            }
        }

        while(pHead2 != null && pHead1 != null) {
            if(pHead1.val == pHead2.val) {
                return pHead1;
            } else {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }

        return null;
    }
}
