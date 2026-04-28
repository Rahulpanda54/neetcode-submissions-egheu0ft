class Solution {

    public int longestPalindromeSubseq(String s) {
        
        StringBuilder sb = new StringBuilder(s);

        String s2 = sb.reverse().toString();

        return lcs(s, s2);
    }

    public int lcs(String s1, String s2){

        int dp[][] = new int[s1.length()+1][s2.length()+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){

                dp[i][j] = -1;
            }
        }

        return solve(0, 0, s1, s2, dp);
    }

    public int solve(int i, int j, String s1, String s2, int dp[][]){

        if(i == s1.length()){
            return 0;
        }

        if(j == s2.length()){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] =  1 + solve(i+1, j+1, s1, s2, dp);
        }

        else{
               return dp[i][j] =  0 + Math.max(solve(i+1, j, s1, s2, dp), solve(i, j+1, s1, s2, dp));
        }
    }
}
