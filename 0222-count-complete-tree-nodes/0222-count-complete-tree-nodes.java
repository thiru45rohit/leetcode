/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        TreeNode left=root,right=root;
        if(root==null)
        {
            return 0;
        }
        int lh=0,rh=0;
        while(left!=null)
        {
            lh++;
            left=left.left;
        }
        while(right!=null)
        {
            rh++;
            right=right.right;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}