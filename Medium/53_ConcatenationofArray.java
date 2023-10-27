/*
 * 53] Concatenation of Array
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[nums.length + nums.length];
        int itr = 0;
        for(int i = 0; i < nums.length; i++) {

            arr[itr] = nums[i];
            itr++;
        }
        for(int i = 0; i < nums.length; i++) {

            arr[itr] = nums[i];
            itr++;
        }
        return arr;
    }
}
