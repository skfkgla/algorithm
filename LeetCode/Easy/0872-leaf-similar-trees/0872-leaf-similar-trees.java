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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        
        getLeafNodeValues(root1, leaf1);
        getLeafNodeValues(root2, leaf2);

        return leaf1.equals(leaf2);
    }

    private void getLeafNodeValues(TreeNode tree, List<Integer> leafNodeValues) {
        if (tree == null) return;
        
        if (tree.left == null && tree.right == null) {
            leafNodeValues.add(tree.val);
        }

        getLeafNodeValues(tree.left, leafNodeValues);
        getLeafNodeValues(tree.right, leafNodeValues);
    }
}