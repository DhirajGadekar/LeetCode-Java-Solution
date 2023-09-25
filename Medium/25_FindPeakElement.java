/*
 * Find Peak Element :
 */

class Solution {
    public int findPeakElement(int[] nums) {
        int peak = -1;

        for(int i = 1 ; i < nums.length - 1; i++) {
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {

                peak = i;
            }
        }
        if(peak == -1) {

            int max = nums[0];
            peak = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > max) {

                    max = nums[i];
                    peak = i;
                }
            }
        }
        return peak;
    }
}
