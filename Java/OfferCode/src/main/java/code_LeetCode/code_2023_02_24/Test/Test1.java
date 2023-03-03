package code_LeetCode.code_2023_02_24.Test;

import java.util.Deque;
import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        MinStack min = new MinStack();
        System.out.println(min.minStack.peek());

    }

}
class MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
            minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int min() {
        return minStack.peek();
    }


    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.addLast((1));
        l.addLast(2);
        l.add(3);
        l.addLast(4);
        l.removeLast();
        System.out.println(l);
    }
}
