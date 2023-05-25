package code_LeetCode.code_2023_05_24.Code;/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import code_LeetCode.code_2023_05_24.ListNode;

import java.util.Stack;
public class Solution1 {
public ListNode ReverseList(ListNode head) {
    Stack<ListNode> stack = new Stack<>();
    ListNode tmp = head;
    while (tmp != null) {
        stack.push(tmp);
        tmp = tmp.next;
    }
    if(stack.isEmpty()) {
        return null;
    }
    ListNode node = stack.pop();
    ListNode newHead = node;
    while(!stack.isEmpty()) {
        ListNode tmpNode = stack.pop();
        node.next = tmpNode;
        node = tmpNode;
    }
    node.next = null;
    return newHead;
}
}