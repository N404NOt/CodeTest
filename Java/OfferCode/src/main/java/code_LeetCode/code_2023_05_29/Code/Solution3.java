package code_LeetCode.code_2023_05_29.Code;/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
import code_LeetCode.code_2023_05_29.Code.RandomListNode;

import java.util.*;
public class Solution3 {
    public RandomListNode Clone(RandomListNode pHead) {
        //空节点直接返回
        if(pHead == null)
            return pHead;
        //添加一个头部节点
        RandomListNode res = null;
        //哈希表，key为原始链表的节点，value为拷贝链表的节点
        HashMap<RandomListNode, RandomListNode> mp = new HashMap<>();
        RandomListNode cur = pHead;
        RandomListNode pre = null;
        //遍历原始链表，开始复制
        while(cur != null){
            //拷贝节点
            RandomListNode clone = new RandomListNode(cur.label);
            if(res == null) {
                res = clone;
                pre = clone;
                mp.put(cur, clone);
                cur = cur.next;
                continue;
            }
            //用哈希表记录该节点下的拷贝节点
            mp.put(cur, clone);
            //连接
            pre.next = clone;
            pre = pre.next;
            //遍历
            cur = cur.next;
        }
        //遍历哈希表
        for(HashMap.Entry<RandomListNode, RandomListNode> entry : mp.entrySet()){
            //原始链表中random为空
            if(entry.getKey().random == null)
                entry.getValue().random = null;
            else
                //将新链表的random指向哈希表中原始链表的random
                entry.getValue().random = mp.get(entry.getKey().random);
        }
        //返回去掉头
        return res;
    }
}

