

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root == null && subRoot == null){
            return true;
        }

        if(root == null  || subRoot == null){
            return false;
        }

        if(isIdentical(root, subRoot)){
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); 
    }

    public boolean isIdentical(TreeNode root, TreeNode subroot){

        if(root == null && subroot == null){
            return true;
        }

        if(root == null || subroot == null){
            return false;
        }

        if(root.val == subroot.val){
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }

        return false;
    }
}
