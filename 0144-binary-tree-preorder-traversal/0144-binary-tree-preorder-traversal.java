import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        preorder(root, result);

        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {

        // Base case
        if (root == null) {
            return;
        }

        // 1. Visit root
        result.add(root.val);

        // 2. Visit left subtree
        preorder(root.left, result);

        // 3. Visit right subtree
        preorder(root.right, result);
    }
}