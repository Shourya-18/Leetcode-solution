1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap();
4        for(int i=0;i<nums.length;i++){
5            int x = nums[i];
6            if(map.containsKey(x)){
7                int freq = map.get(x);
8                map.put(x , freq+1);
9            }
10            else map.put(x , 1);
11        }
12
13        int maxFreq = 0;
14        for(int x : map.keySet()){
15            int freq = map.get(x);
16            if(freq>maxFreq) maxFreq = freq;
17        }
18        int ans = nums[0];
19        for(int x : map.keySet()){
20            int freq = map.get(x);
21            if(freq==maxFreq) ans = x;
22        }
23        return ans;
24    }
25}