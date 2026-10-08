class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        // Empty tree
        if (root == null) {
            return false;
        }

        // Check if current node is a leaf
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        // Subtract current value and check both subtrees
        int remainingSum = targetSum - root.val;

        return hasPathSum(root.left, remainingSum) ||
               hasPathSum(root.right, remainingSum);
    }
}