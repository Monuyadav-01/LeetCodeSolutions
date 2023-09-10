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
  int total=0;
  public int value(TreeNode root){
    if(root==null){
      return 0;
    }
    
    int left=value(root.left);
    int right=value(root.right);
    int tilt=Math.abs(left-right);
    total+=tilt;
    return root.val+left+right;
  }
    public int findTilt(TreeNode root) {
        
        value(root);
        return total;
    }
}