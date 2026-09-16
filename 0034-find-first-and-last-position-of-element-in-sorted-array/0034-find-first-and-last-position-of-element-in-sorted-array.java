class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lo = 0; int hi = n-1;
        int[] arr = {-1 , -1};
        int idex = -1;
        int ldex = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]>target) hi = mid-1;
            else if(nums[mid]<target) lo = mid+1;
            else{
                idex = mid;
                hi = mid-1;
            }
        }
        lo = 0;
        hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]>target) hi = mid-1;
            else if(nums[mid]<target) lo = mid+1;
            else{
                ldex = mid;
                lo = mid+1;
            }
        }
        arr[0] = idex;
        arr[1] = ldex;
        return arr;
    }
}