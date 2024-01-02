/*
 * 70] Merge Sorted Array
 */

/* 1ms
 *
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int itr1 = 0;
        int itr2 = 0;
        for(int i = 0; i < n; i++) {
            
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}*/

// Runtime : 0ms
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        for(int p = m+n-1; p>=0; p--){
            if(p2 < 0) break;
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1--];
            }
            else{
                nums1[p] = nums2[p2--];
            }
        }
    }
}
