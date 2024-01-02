/*
 * 71] Find Target Indices After Sorting Array
 */

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length;i++) {
          if(nums[i] == target) {
            ans.add(i);
          }
          if(nums[i] > target){
            break;
          }
        }
        return ans;
    }
}
