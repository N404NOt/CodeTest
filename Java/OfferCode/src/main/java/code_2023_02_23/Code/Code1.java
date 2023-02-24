package code_2023_02_23.Code;

import java.util.Stack;

/*
*   https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=f97g99e
* 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*
* */
public class Code1 {

    // 方法一：每个节点都是当前状态的留影
    class CQueue {

        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public CQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();

        }

        public void appendTail(int value) {
            if (!stack2.empty()) {
                while (!stack2.empty()) {
                    stack1.push(stack2.pop());
                }
            }
            stack1.push(value);
        }

        public int deleteHead() {
            if (!stack1.empty()) {

                while (!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.pop();

            }
            if (!stack2.empty()) {
                return stack2.pop();
            }
            return -1;

        }
    }


    // 方法二：

}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int para
 */

