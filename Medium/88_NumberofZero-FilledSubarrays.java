/*
 * 88] Number of Zero-Filled Subarrays
 */

class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long zeroCount = 0;
        long sum = 0;
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 0) {

                zeroCount++;
            } else {

                sum += (long)(zeroCount )* (zeroCount + 1) >> 1;
                zeroCount = 0;
            }
        }
        if(nums[nums.length - 1] == 0) {

            sum += (long)(zeroCount) * (zeroCount + 1) >> 1;
        }
        return sum;
    }
}
