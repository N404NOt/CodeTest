package code_LeetCode.code_2023_03_25.Code;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution3 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : sameTree(root,root);
    }

    public boolean sameTree(TreeNode root1,TreeNode root2) {
        if(root1 == null && root2 == null ) {
            return true;
        }
        if(root1 == null || root2 == null || (root1.val != root2.val)) {
            return false;
        }
        
        return sameTree(root1.left,root2.right) && sameTree(root1.right,root2.left);
    } 
}