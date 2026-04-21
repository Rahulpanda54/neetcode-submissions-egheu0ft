class Solution {

    public List<List<String>> partition(String s) {
        
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();

        solve(s, ans, ds);
        return ans;
    }

    void solve(String str, List<List<String>> ans, List<String> ds){

        if(str.length() == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<str.length(); i++){

            String curr = str.substring(0, i+1);

            if(ispalindrome(curr)){
                ds.add(curr);
                solve(str.substring(i+1), ans, ds);
                ds.remove(ds.size()-1);
            }
        }
    }

    public boolean ispalindrome(String str){

        int i=0;      int j = str.length()-1;

        while(i <= j){

            if(str.charAt(i) != str.charAt(j)){
                return false;
            }

            i++;  j--;
        }

        return true;
    }
}
