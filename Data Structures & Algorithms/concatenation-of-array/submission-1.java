class Solution {
    
    public int[] getConcatenation(int[] nums) {
        
        int res[] = new int[nums.length + nums.length];

        int idx = 0;

        for(int i=0; i<nums.length; i++){
            res[idx++] = nums[i];
        }

        for(int i=0; i<nums.length; i++){
            res[idx++] = nums[i];
        }

        return res;
    }
}