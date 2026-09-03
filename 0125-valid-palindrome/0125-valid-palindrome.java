class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j = t.length()-1;
        while(i<j){
            char ch = t.charAt(i);
            char hc = t.charAt(j);
            if(ch!=hc) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}