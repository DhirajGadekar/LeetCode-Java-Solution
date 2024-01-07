/*
 * 87] Rotate Array
 */

/*
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int num[] = new int[nums.length];
        int itr = nums.length - k;
        for(int i = 0; i < k; i++) {

            num[i] = nums[itr];
            itr++;
        }
        itr = 0;
        for(int i = k; i < nums.length; i++) {

            num[i] = nums[itr];
            itr++;
        }
        for(int i = 0; i < nums.length; i++) {

            nums[i] = num[i];
        }
    }
}
*/

class Solution {
    public void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d%n;
        rotate(arr,0,n);
        rotate(arr,0,d);
        rotate(arr,d,n);
    }
    static void rotate(int arr[],int i,int n){
        for(int k=n-1;i<k;i++,k--){
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }
}
