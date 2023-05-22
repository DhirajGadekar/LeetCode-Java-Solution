/*
 Problem 2 : en an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

	Example 1:
		Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		Explanation: After squaring, the array becomes [16,1,0,9,100].
			     After sorting, it becomes [0,1,9,16,100].

	Example 2:
		Input: nums = [-7,-3,2,3,11]
		Output: [4,9,9,49,121]
 

	Constraints:
		1 <= nums.length <= 104
		-104 <= nums[i] <= 104
		nums is sorted in non-decreasing order.
 */

/*
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {

            for(int j = 0; j < nums.length - 1 - i; j++) {

                int num2 = 0;

                if(nums[j + 1] < 0){

                    num2 = -(nums[j + 1]);
                }else{
                    num2 = nums[j + 1];
                }
                if(nums[j] < 0) {

                    int num1 = -(nums[j]);
                    

                    if(num1 > num2) {

                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }else {
                    
                    if(nums[j] > num2){

                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        }

        for(int i = 0; i < nums.length; i++){

            nums[i] = nums[i] * nums[i];
        }

        return nums;
    }
}
*/

class Solution {
    public int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length; i++){

            nums[i] = nums[i] * nums[i];
        }

        for(int i = 0;i < nums.length - 1; i++) {
            for(int j = 0;j < nums.length - 1 - i; j++) {

                if(nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
class Main {

	public static void main(String[] args) {
		
		int arr[] = {-7,-3,2,3,11};

		Solution obj = new Solution();

		int ret[] = obj.sortedSquares(arr); 
		for(int i = 0; i < ret.length; i++) {
			
			System.out.println(ret[i]);
		}
	}	
}
