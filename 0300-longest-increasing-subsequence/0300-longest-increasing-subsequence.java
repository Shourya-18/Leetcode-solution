class Solution {
    public int lengthOfLIS(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : arr){
            if(ans.size()==0 || ele > ans.get(ans.size()-1)) ans.add(ele);
            else replace(ele , ans);
        }  
        return ans.size();
    }
    static void replace(int ele , ArrayList<Integer> ans){
        int lo = 0 , hi = ans.size()-1 , lb = -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(ans.get(mid)>=ele){
                 lb = mid;
                 hi = mid-1;
            }
            else lo = mid+1;
        }
        ans.set(lb , ele);
    }
}