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
    private Map<Integer, Integer> inorderMap;
    private int preorderIndex;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        preorderIndex = 0;
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int inLeft, int inRight) {
        if (inLeft > inRight) return null;

        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        int inorderIndex = inorderMap.get(rootVal);

        root.left = build(preorder, inLeft, inorderIndex - 1);
        root.right = build(preorder, inorderIndex + 1, inRight);

        return root;
    }
}