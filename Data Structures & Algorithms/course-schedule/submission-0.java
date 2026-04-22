class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        // agr cycle hai to course complete nhi hoga.....

        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }


        for(int i=0; i<prerequisites.length; i++){

            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            adj.get(u).add(v);
            // adj.get(v).add(u);

        }


        boolean vis[] = new boolean[numCourses];
        boolean res[] = new boolean[numCourses];

        for(int i=0; i<vis.length; i++){

            if(vis[i] == false){

                if(dfs(i, vis, res, adj)){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean dfs(int node, boolean vis[], boolean rec[], List<List<Integer>> adj){

        vis[node] = true;
        rec[node] = true;

        for(int i : adj.get(node)){

            if(rec[i] == true){
                return true;
            }

            else if(!vis[i]){

                if(dfs(i, vis, rec, adj)){
                    return true;
                }
            }
        }

        rec[node] = false;

        return false;

    }
}
