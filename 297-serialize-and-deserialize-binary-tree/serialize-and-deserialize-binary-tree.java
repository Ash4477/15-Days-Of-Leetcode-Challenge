/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    private static final String NULL = "X";
    private static final String SEP  = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildPreorder(root, sb);
        return sb.toString();
    }

    private void buildPreorder(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NULL).append(SEP);
            return;
        }
        sb.append(node.val).append(SEP);
        buildPreorder(node.left, sb);
        buildPreorder(node.right, sb);
    }

    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) return null;
        String[] tokens = data.split(SEP);
        Deque<String> q = new ArrayDeque<>(Arrays.asList(tokens));
        return buildTree(q);
    }

    private TreeNode buildTree(Deque<String> q) {
        String token = q.removeFirst();
        if (token.equals(NULL)) return null;
        TreeNode node = new TreeNode(Integer.parseInt(token));
        node.left  = buildTree(q);
        node.right = buildTree(q);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));