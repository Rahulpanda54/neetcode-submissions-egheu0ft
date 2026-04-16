class Solution {

    public String minWindow(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);

            map.put(ch, map.getOrDefault(ch , 0) + 1);
        }

        int left=0;  int right = 0;  int minlen = Integer.MAX_VALUE;  int count = 0;   int st = 0;

        while(right < s.length()){

            char ch = s.charAt(right);

            if(map.containsKey(ch)){

                map.put(ch, map.get(ch) - 1);

                if(map.get(ch) >=0){
                    count++;
                }
            }

            while(count == t.length()){

                if((right-left+1) < minlen){

                    minlen = right-left+1;
                    st = left;
                }

                char chh = s.charAt(left);

                if(map.containsKey(chh)){
                     
                     map.put(chh, map.get(chh) + 1);

                     if(map.get(chh) > 0){

                        count--;
                     }
                }

                left++;
            }

            right++;
        }

        if(minlen == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(st, st+minlen);
    }
}
