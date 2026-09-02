1class Solution {
2     private void swap(int[] nums , int i , int j){
3            int temp = nums[i];
4            nums[i] = nums[j];
5            nums[j] = temp;
6        }
7    public int firstMissingPositive(int[] nums) {
8        int i = 0 , n = nums.length;
9        while(i<n){
10            if(nums[i]<=0 || nums[i]>n || nums[i] == i+1 || nums[i]==nums[nums[i]-1]){
11                i++;
12            }
13            else{
14                swap( nums , i , nums[i]-1);
15            }
16        }
17        for( i=0;i<n;i++){
18            if(nums[i]!=i+1) return i+1;
19        }
20        return n+1;
21    }
22}