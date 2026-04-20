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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> arr = new ArrayList<>();

         solve(root, arr, 0);

         return arr;
    }

    void solve(TreeNode root, List<Integer> ds, int level){

        if(root == null){
            return;
        }

        if(ds.size() == level){
            ds.add(root.val);
        }

        solve(root.right, ds, level+1);
        solve(root.left, ds, level+1);
        
    }
}
