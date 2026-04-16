class Solution {

    public int lengthOfLongestSubstring(String s) {

       HashMap<Character, Integer> map = new HashMap<>();

        int j = 0;   int maxlen = 0;

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(!map.containsKey(ch) || map.get(ch) < j){
                map.put(ch, i);
            }

            else{
                   j = map.get(ch) + 1;
                   map.put(ch, i);
            }

            maxlen = Math.max(maxlen, i-j+1);
        } 
          
          return maxlen;
    }
}
