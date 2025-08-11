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
    private int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        helperFn(root, root.val);
        return count;
    }
    
    public void helperFn(TreeNode root, int max) {
        if (root == null) {
            return;
        }

        if (root.val >= max) {
            count++;
            max = root.val;
        }

        helperFn(root.left, max);
        helperFn(root.right, max);
    }

}