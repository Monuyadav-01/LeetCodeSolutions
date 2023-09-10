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
  int maxsum=0;
    public int maxSumBST(TreeNode root) {
        post(root);
        return maxsum;
    }
    public int [] post(TreeNode root){
      if(root==null){
        return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0};
      }
        // postorder -> left,right,root
        int left[] =post(root.left);
        int right[] =post(root.right);
        if(left==null || right==null || root.val <=left[1] || root.val >=right[0])
          {
        return null;
          }
          int sum=root.val+left[2]+right[2];
          maxsum=Math.max(maxsum,sum);
          int max=Math.max(root.val,right[1]);
          int min=Math.min(root.val,left[0]);

          return new int[] {min,max,sum};

    }
}