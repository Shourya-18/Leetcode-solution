1class Solution {
2    public int findMaxConsecutiveOnes(int[] arr) {
3        int currentCount = 0;
4        int maxCount = 0;
5        for(int i=0;i<arr.length;i++){
6            if(arr[i]==1){
7                currentCount++;
8                maxCount = Math.max(maxCount , currentCount);
9            }
10            else currentCount = 0;
11        }
12        return maxCount;
13    }
14}