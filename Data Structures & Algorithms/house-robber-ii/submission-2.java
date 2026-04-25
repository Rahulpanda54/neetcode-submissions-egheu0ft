class Solution {
    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        
        int arr1[] = new int[nums.length-1];
        int arr2[] = new int[nums.length-1];

        int dp1[] = new int[arr1.length+1];

        for(int i=0; i<dp1.length; i++){
            dp1[i] = -1;
        }

        int dp2[] = new int[arr2.length+1];

        for(int i=0; i<dp2.length; i++){
            dp2[i] = -1;
        }


        for(int i=1; i<nums.length; i++){
            arr1[i-1] = nums[i];
        }

        for(int i=0; i<nums.length-1; i++){
            arr2[i] = nums[i];
        }

        return Math.max(solve(0, arr1, dp1), solve(0, arr2, dp2));
    }

    public int solve(int idx, int arr[], int dp[]){

        if(idx >= arr.length){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int incl = arr[idx] + solve(idx+2, arr, dp);
        int excl = 0 + solve(idx+1, arr, dp);

        return dp[idx] =  Math.max(incl, excl);

    }
}
