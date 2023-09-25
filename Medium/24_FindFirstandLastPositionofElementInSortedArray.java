/*
Find First and Last Position of Element in Sorted Array
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[]{-1,-1};

        int count = 0;
        int first = -1;
        int last = -1;
        for(int i = 0; i < nums.length; i++) {

            if(target == nums[i]) {

                count++;
                if(count == 1) {

                    first = i;
                } else {

                    last = i;
                }
            }

        }
        if(first != -1 && last != -1) {

            arr[0] = first;
            arr[1] = last;
        }  else if(first != -1 && last == -1) {

            arr[0] = first;
            arr[1] = first;
        }
        return arr;
    }
}
