import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            // Process all nodes in the current level
            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();
                level.add(current.val);

                // Add left child
                if (current.left != null) {
                    queue.add(current.left);
                }

                // Add right child
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            result.add(level);
        }

        return result;
    }
}