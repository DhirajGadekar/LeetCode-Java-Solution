/*
 * 30] Majority Element :
 */

class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int count = 0;
        int temp = nums[0];
        for(int i = 0; i < nums.length; i++) {

            if(temp == nums[i]) {

                count++;
            } else {

                count = 0;
                temp = nums[i];
                i--;
            }
            if(count > nums.length/2) {

                return temp;
            }
        }
        return -1;
    }
}
