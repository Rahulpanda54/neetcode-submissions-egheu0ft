class Solution {
    public String longestPalindrome(String s) {
        
        String ans = "";

        for(int i=0; i<s.length(); i++){

            int left = i;  int right = i;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){

                left--;   right++;
            }

            String str = s.substring(left+1, right);

            if(ans.length() < str.length()){
                ans = str;
            }

            left = i;  right = i+1;

            while(left >= 0  && right < s.length() && s.charAt(left) == s.charAt(right)){

                left--;   right++;
            }

            str = s.substring(left+1, right);

            if(ans.length() < str.length()){
                ans = str;
            }
        }

        return ans;
    }
}
