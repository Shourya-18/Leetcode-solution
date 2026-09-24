class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int currentCount = 0;
        int maxCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                currentCount++;
                maxCount = Math.max(maxCount , currentCount);
            }
            else currentCount = 0;
        }
        return maxCount;
    }
}