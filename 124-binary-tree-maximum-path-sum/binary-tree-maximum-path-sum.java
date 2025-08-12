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
    private int maxSum;

    private int maxGain(TreeNode n) {
        if (n == null) return 0;

        int leftGain = Math.max(0, maxGain(n.left));
        int rightGain = Math.max(0, maxGain(n.right));

        int currPathVal = n.val + leftGain + rightGain;

        maxSum = Math.max(currPathVal, maxSum);

        return (n.val + Math.max(leftGain, rightGain));
    }

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        maxGain(root);
        return maxSum;
    }
}