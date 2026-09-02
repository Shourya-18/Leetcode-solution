class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(map.containsKey(x)){
                int freq = map.get(x);
                map.put(x , freq+1);
            }
            else map.put(x , 1);
        }

        int maxFreq = 0;
        for(int x : map.keySet()){
            int freq = map.get(x);
            if(freq>maxFreq) maxFreq = freq;
        }
        int ans = nums[0];
        for(int x : map.keySet()){
            int freq = map.get(x);
            if(freq==maxFreq) ans = x;
        }
        return ans;
    }
}