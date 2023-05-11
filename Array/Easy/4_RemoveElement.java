class Solution {
    public int removeElement(int[] nums, int val) {
            int arr[] = new int[nums.length];

            int itr = 0;
            for(int i = 0; i < nums.length; i++){

                    if(nums[i] != val){

                            arr[itr] = nums[i];
                            itr++;
                    }
            }

            for(int i = 0; i < nums.length; i++){

                    nums[i] = arr[i];
            }
            return itr;

    }
}
