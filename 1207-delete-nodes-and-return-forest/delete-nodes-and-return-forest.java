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
    Set<Integer> set;
    List<TreeNode> res;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        set = new HashSet<>();
        res = new ArrayList<>();
        for(int i : to_delete){
            set.add(i);
        }
        helper(root,true);
        return res;
    }

    public TreeNode helper(TreeNode node,boolean r){
        if(node == null) return null;
        boolean delete = set.contains(node.val);
        if(r && !delete) res.add(node);
        node.left = helper(node.left, delete);
        node.right = helper(node.right,delete);
        return delete ? null : node;
    }
}