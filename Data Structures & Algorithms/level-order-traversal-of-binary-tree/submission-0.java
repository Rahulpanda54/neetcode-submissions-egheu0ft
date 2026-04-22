
class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return ans;
        }

        q.add(root);

        while(!q.isEmpty()){

             List<Integer> ds = new ArrayList<>();

             int size = q.size();

             for(int i=0; i < size; i++){

                TreeNode curr = q.remove();

                    ds.add(curr.val);

                    if(curr.left != null){
                        q.add(curr.left);
                    }

                    if(curr.right != null){
                        q.add(curr.right);
                    }
             }

             ans.add(ds);
        }

        return ans;
    }
}
