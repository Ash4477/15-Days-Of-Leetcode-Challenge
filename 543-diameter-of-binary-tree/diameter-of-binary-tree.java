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
    int maxD;
    public int diameterOfBinaryTree(TreeNode root) {
        maxD = 0;
        getHeight(root);
        return maxD;
    }

    public int getHeight(TreeNode root) {
        if (root == null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        maxD = Math.max(maxD, lh+rh);
        return (Math.max(lh, rh) + 1);
    }
}