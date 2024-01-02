/*
 * 68] Sum of Unique Elements
 */

class Solution {
    public int sumOfUnique(int[] nums) {

        int arr[] = new int[101];
        int sum=0;

        for(int i : nums){
            arr[i]++;

            if(arr[i]==1) sum+=i;
            else if (arr[i]==2) sum -=i;
        }

        return sum;
    }
}
