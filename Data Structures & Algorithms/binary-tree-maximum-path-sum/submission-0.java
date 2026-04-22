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

      int maxsum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

           maxpath(root);
           return maxsum;    
    }

    public int maxpath(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = Math.max(maxpath(root.left), 0);
        int right = Math.max(maxpath(root.right), 0);

        int totalsum = left + right + root.val;

        maxsum = Math.max(maxsum, totalsum);

        return Math.max(left, right) + root.val; 
    }
}
