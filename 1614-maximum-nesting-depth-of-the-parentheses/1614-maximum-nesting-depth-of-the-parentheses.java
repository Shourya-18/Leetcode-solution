class Solution {
    public int maxDepth(String s) {
        int res = 0 , curr = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                curr++;
                res = Math.max(res , curr);
            }
            if(ch == ')') curr--;
        }
        return res;
    }
}