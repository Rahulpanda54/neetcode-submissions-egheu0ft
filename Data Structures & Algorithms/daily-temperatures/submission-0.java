class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        
        int res[] = new int[temperatures.length];

        for(int i=0; i<temperatures.length; i++){

            int diff = 0;

            for(int j=i+1; j<temperatures.length; j++){

                if(temperatures[j] > temperatures[i]){
                     
                     diff = Math.max(diff, j-i);

                     break;
                }
            }

            res[i] = diff;
        }

        return res;
    }
}
