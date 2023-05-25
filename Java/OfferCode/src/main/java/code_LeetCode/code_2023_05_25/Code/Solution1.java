package code_LeetCode.code_2023_05_25.Code;/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
import code_LeetCode.code_2023_05_24.ListNode;

import java.util.*;
public class Solution1 {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        HashSet<ListNode> set = new HashSet<>();
        while(pHead != null) {
            if(set.contains(pHead)) {
                return pHead;
            } 
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }
}
