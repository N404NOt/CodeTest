package code_LeetCode.code_2023_02_24.Code;

public class Code4 {
}

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
/*
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur != null) {
            map.put(cur,new Node(cur.val));
            cur =cur.next;
        }
        cur = head;

        while(cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }
}*/