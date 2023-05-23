class Solution {
    public void merge(int nums[], int start, int end, int mid) {

        int size1 = mid - start + 1;
        int size2 = end - mid;

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        for(int i = 0 ; i < size1; i++) {
            arr1[i] = nums[start + i];
        }
        for(int i = 0; i < size2; i++) {
            arr2[i] = nums[mid + 1 + i];
        }

        int itr1 = 0, itr2 = 0, itr3 = start;

        while(itr1 < size1 && itr2 < size2) {

            if(arr1[itr1] < arr2[itr2]) {
                
                nums[itr3] = arr1[itr1];
                itr1++;
            }else{
                
                nums[itr3] = arr2[itr2];
                itr2++;
            }
            itr3++;
        }

        while(itr1 < size1) {
            nums[itr3] = arr1[itr1];
            itr1++;
            itr3++;
        }
        while(itr2 < size2) {
            nums[itr3] = arr2[itr2];
            itr2++;
            itr3++;
        }
    }
    public void mergeSort(int nums[], int start, int end) {
        
        if(start < end) {

            int mid = (start + end) / 2;
            mergeSort(nums,start, mid);
            mergeSort(nums, mid+1, end);

            merge(nums, start, end, mid);
        }
    }
    public int[] sortArray(int[] nums) {
        
        mergeSort(nums,0,nums.length - 1);
        return nums;
    }
}
