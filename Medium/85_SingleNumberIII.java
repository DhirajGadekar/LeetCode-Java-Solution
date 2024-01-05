/*
 * 85] Single Number III
 */

class Solution {
    public int[] singleNumber(int[] nums) {
        int arrayxor = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            arrayxor = (arrayxor ^ nums[i]);
        }

        int mask = 1;
        int v1 = 0;
        while ((mask & arrayxor) == 0){
            mask = (mask << 1);
        }

        for(int i  = 0; i < n; i++){
            if((nums[i] & mask) > 0){
                v1 = (v1 ^ nums[i]);
            }
        }

        int ans[] = new int[2];
        ans[0] = v1;
        ans[1] = (arrayxor ^ v1);

        return ans;
    }
}
