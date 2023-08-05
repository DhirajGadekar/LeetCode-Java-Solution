//Subarray Sum Equals K

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 1; i < nums.length; i++) {

            nums[i] = nums[i] + nums[i - 1];
        }
        for(int i = 0; i < nums.length; i++) {

            for(int j = i; j < nums.length; j++) {
                int sum = 0;
                if( i == 0) {

                    sum = nums[j];
                } else {

                    sum = nums[j] - nums[i - 1];
                }
                if(sum == k) {

                    count++;
                }
            }
        }
        return count;
    }
}
