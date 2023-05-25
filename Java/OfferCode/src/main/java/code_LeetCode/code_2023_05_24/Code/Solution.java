package code_LeetCode.code_2023_05_24.Code;

import code_LeetCode.code_2023_05_24.ListNode;

public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null) {
            return list1 == null? list2 : list1;
        }
        if(list1.val < list2.val) {
            list1.next = Merge(list1.next,list2);
            return list1;
        } else {
            list2.next = Merge(list1,list2.next);
            return list2;
        }
    }
}
