class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int j = i+1;  int k = nums.length-1;

            while(j < k){
              
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                     List<Integer> ds = new ArrayList<>();
                     ds.add(nums[i]);
                     ds.add(nums[j]);
                     ds.add(nums[k]);

                      ans.add(ds);

                     while (j < k && nums[j] == nums[j+1]) j++;
                     while (j < k && nums[k] == nums[k-1]) k--;
                     j++;
                     k--;
                }

                else if(sum < 0){

                    j++;
                }

                else{
                       k--;
                }
            }
        }

        return ans;
    }
}