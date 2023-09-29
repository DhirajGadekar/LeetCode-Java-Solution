/*
 * 31] Remove Duplicates from Sorted Array :
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        if(nums.length == 1) {

            return 1;
        }
        if(nums.length == 2) {

            if(nums[left] != nums[right]) {

                return 2;
            }
        }
        while(!(right == nums.length - 1)) {
            if(nums[left] == nums[right]) {
                
                right++;
            }
            if(nums[left] !=  nums[right]) {

                left++;
                nums[left] = nums[right];
            }
        }
        
        return left + 1; 
    }
}
