package code_LeetCode.code_2023_02_24.Code;

public class Code2 {

}

//class Solution {
//    int[] a;
//    int i = 0;
//    int j =0;
//    public int[] reversePrint(ListNode head) {
//        ListNode temp = head;
//        reverse(temp);
//        return a;
//    }
//
//    public void reverse(ListNode temp) {
//        if(temp == null) {
//            a = new int[i];
//            return;
//        }
//        i++;
//        reverse(temp.next);
//        a[j++] = temp.val;
//
//    }
//}
//class Solution {
//    public int[] reversePrint(ListNode head) {
//        LinkedList<Integer> stack = new LinkedList<Integer>();
//        while(head != null) {
//            stack.add(head.val);
//            head = head.next;
//        }
//        int[] res = new int[stack.size()];
//        for(int i = 0; i < res.length; i++)
//            res[i] = stack.removeLast();
//        return res;
//    }
//}
//class Solution {
//    public int[] reversePrint(ListNode head) {
//        ListNode temp = new ListNode();
//        int count = 0;
//        while(temp != null) {
//            count++;
//        }
//        int[] result = new int[count];
//
//        while(count >0) {
//            result[count-1] = head.val;
//            head = head.next;
//        }
//
//        return result;
//    }
//}
