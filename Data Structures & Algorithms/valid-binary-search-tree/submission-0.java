

class Solution {
    public boolean isValidBST(TreeNode root) {
        
        if(root == null){
            return true;
        }

        return valid(root, null, null);
    }

    public boolean valid(TreeNode root, TreeNode min, TreeNode max){

        if(root == null){
            return true;
        }

        if(min != null && root.val <= min.val){
            return false;
        }

        else if(max != null && root.val >= max.val){
            return false;
        }

        return valid(root.left, min, root) && valid(root.right, root, max);
    }
}
