package code_LeetCode.code_2023_03_20.Code;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//class Solution {
//    public int[] levelOrder(TreeNode root) {
//        if(root == null) return new int[0];
//        Queue<TreeNode> queue = new LinkedList<>(){{ add(root); }};
//        ArrayList<Integer> ans = new ArrayList<>();
//        while(!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            ans.add(node.val);
//            if(node.left != null) queue.add(node.left);
//            if(node.right != null) queue.add(node.right);
//        }
//        int[] res = new int[ans.size()];
//        for(int i = 0; i < ans.size(); i++)
//            res[i] = ans.get(i);
//        return res;
//    }
//}