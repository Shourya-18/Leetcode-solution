class Solution {
    public boolean search(int[] arr, int k) {
        int lo = 0 , hi = arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == k) return true;
            if(arr[lo]==arr[mid] && arr[mid]==arr[hi]){
                lo = lo + 1;
                hi = hi - 1;
                continue;
            }
            if(arr[lo]<=arr[mid]){
                if(arr[lo]<=k && k<=arr[mid]){
                    hi = mid-1;
                }
                else lo = mid+1;
            }
            else{
                if(arr[mid]<=k && k<=arr[hi]){
                    lo = mid+1;
                }
                else hi = mid-1;
            }
        }
        return false;
    }
}