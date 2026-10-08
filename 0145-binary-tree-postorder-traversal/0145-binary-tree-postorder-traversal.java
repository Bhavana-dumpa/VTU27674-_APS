import java.util.*;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        postorder(root, result);

        return result;
    }

    private void postorder(TreeNode root, List<Integer> result) {

        // Base case
        if (root == null) {
            return;
        }

        // 1. Visit left subtree
        postorder(root.left, result);

        // 2. Visit right subtree
        postorder(root.right, result);

        // 3. Visit root
        result.add(root.val);
    }
}