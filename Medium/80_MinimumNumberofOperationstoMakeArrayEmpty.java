/*
 * 80] Minimum Number of Operations to Make Array Empty
 */

class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums)
            map.put(i, map.getOrDefault(i,0)+1);
        int ans = 0;
        for(int v:map.values()){
            if(v==1)
                return -1;
            if(v%3 == 0)
                ans += v/3;
            else if((v-2)%3 == 0)
                ans = ans + 1 + (v-2)/3;
            else if((v-4)%3 == 0)
                ans = ans + 2 + (v-4)/3;
        }
        return ans;
    }
}
