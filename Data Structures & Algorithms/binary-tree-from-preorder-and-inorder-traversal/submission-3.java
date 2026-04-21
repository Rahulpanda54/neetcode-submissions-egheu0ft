

class Solution {
    
    int idx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        idx = 0;

        return build(preorder, inorder, 0, inorder.length-1);
    }

    public TreeNode build(int pre[] , int in[], int st, int end){

        if(st > end){
            return null;
        }

        int root = pre[idx++];

        TreeNode rootnode = new TreeNode(root);

        int rootidx = -1;

        for(int i=st; i<= end; i++){

            if(in[i] == root){
               rootidx = i;
               break;
            }
        }

        rootnode.left = build(pre, in, st, rootidx-1);
        rootnode.right =  build(pre, in, rootidx+1, end);

        return rootnode;


    }
}
