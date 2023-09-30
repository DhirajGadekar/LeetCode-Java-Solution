/*
 * 34] Find the Middle Index in Array :
 */

class Solution {
    public int findMiddleIndex(int[] nums) {

        int leftSum = 0;
        int rightSum = 0;
        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                leftSum = 0;
            } else {
                leftSum = nums[i - 1];
            }
            if(i == nums.length - 1) {

                rightSum = 0;
            } else {
                rightSum = nums[nums.length - 1] - nums[i];
            }
            if(leftSum == rightSum ) {
                return i;
            }
        }
        return -1;
    }
}
