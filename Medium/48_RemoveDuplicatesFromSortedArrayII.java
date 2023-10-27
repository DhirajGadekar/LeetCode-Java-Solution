/*
 * 48] Remove Duplicates from Sorted Array II
 */
class Solution {
    public int removeDuplicates(int[] nums) {

        int temp = nums[0];
        int itr = 0;
        int totalCount = 0;
        int count =  0;
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(temp == nums[i]) {

                count++;
                if(count <= 2) {

                    arr[itr] = nums[i];
                    itr++;
                }
            } else {
                if(count > 2) {

                    totalCount = totalCount + 2;
                } else {

                    totalCount = totalCount + count;
                }
                temp = nums[i];
                count = 0;
                i--;
            }
        }
        if(count > 2) {

            totalCount = totalCount + 2;
        } else {

            totalCount = totalCount + count;
        }
        for(int i = 0; i < nums.length; i++) {

            nums[i] = arr[i];
        }
        return totalCount;
    }
}
