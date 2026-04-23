class Solution {

    public int lengthOfLIS(int[] nums) {

        int dp[][] = new int[nums.length][nums.length+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){

                dp[i][j] = -1;
            }
        }
         
         return solve(nums, 0, -1, dp);

    }

    public int solve(int arr[],  int curr, int prev, int dp[][]){

        if(curr >= arr.length){
            return 0;
        }

        if(dp[curr][prev+1] != -1){
            return dp[curr][prev+1];
        }

        int incl = 0;       int excl = 0;

        if(prev == -1   ||   arr[prev] < arr[curr]){ 

           incl =   1 + solve(arr, curr+1, curr, dp);
        }

          excl =  0 + solve(arr, curr+1, prev, dp);
    
        return dp[curr][prev+1] =  Math.max(incl,  excl);

    }
}
