class Solution {
    public int minDistance(String word1, String word2) {

        int dp[][] = new int[word1.length()+1][word2.length()+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){

                dp[i][j] = -1;
            }
        }
        
      return solve(word1.length()-1, word2.length()-1, word1, word2, dp);
    }

    public int solve(int i, int j, String s1, String s2, int dp[][]){

         if(j < 0){
            return i+1;
         }

         if(i < 0){
            return j+1;
         }

         if(dp[i][j] != -1){
            return dp[i][j];
         }

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] =  0 + solve(i-1, j-1, s1 , s2, dp);
        }

        else{
                int insert = 1 + solve(i-1, j, s1, s2, dp);
                int delete = 1 + solve(i, j-1, s1, s2, dp);
                int replace = 1 + solve(i-1, j-1, s1, s2, dp);

                return dp[i][j] =  Math.min(insert, Math.min(delete, replace));
        }
    }
}
