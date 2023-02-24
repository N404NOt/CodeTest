package code_2023_02_24.Code;

import java.util.Deque;
import java.util.LinkedList;

/*
* https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/
* 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
* 剑指 Offer 30. 包含min函数的栈
* */
public class Code1 {

public static void main(String[] args) {
    }

}
class MinStack {

    private Node head;

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if(head == null) {
            head = new Node(x,x,null);
        } else {
            head = new Node(x,Math.min(head.min,x),head);
        }
    }

    public void pop() {
        head = head.next;

    }

    public int top() {
        return head.val;

    }

    public int min() {
        return head.min;

    }

    private class Node{
        int val;
        int min;
        Node next;

        public Node(int val,int min,Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }




    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.min();
     */


    // 方法二 ：辅助栈
    class MinStack1 {
        Deque<Integer> stack1;
        Deque<Integer> stack2;

        /** initialize your data structure here. */
        void MinStac() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
            stack2.push(Integer.MAX_VALUE);


        }

        public void push(int x) {
            stack1.push(x);
            stack2.push(Math.min(stack2.peek(), x));

        }

        public void pop() {
            stack1.pop();
            stack2.pop();

        }

        public int top() {
            return stack1.peek();

        }

        public int min() {
            return stack2.peek();

        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
}