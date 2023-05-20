class Solution {
    public int[] runningSum(int[] nums) {

        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i -1] + nums[i];
        }   
        return nums;
    }
}
class Main {
	
	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int nums[] = {1,2,3,4,5};
		int arr[] = obj.runningSum(nums);

		for(int i = 0; i < arr.length; i++){
			
			System.out.println(arr[i]);
		}
	}
}
