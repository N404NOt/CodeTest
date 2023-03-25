package code_LeetCode.code_2023_03_20.Code;

import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//class Solution1 {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        List<List<Integer>> res = new ArrayList<>();
//        if( root != null) {
//            queue.add(root);
//        }
//        while( !queue.isEmpty()) {
//            List<Integer> list = new LinkedList<>();
//            for(int i = queue.size(); i > 0;i--) {
//                TreeNode node = queue.poll();
//                list.add(node.val);
//                if(node.left != null) {
//                    queue.add(node.left);
//                }
//                if(node.right != null) {
//                    queue.add(node.right);
//                }
//            }
//            res.add(list);
//        }
//        return res;
//    }
//}