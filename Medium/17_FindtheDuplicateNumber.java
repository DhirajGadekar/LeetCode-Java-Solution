/*
 Problem 17 : Find the Duplicate Number
 */

import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
	
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	    map.put(nums[0],0);
	    for(int i = 1; i < nums.length; i++) {

		    if(map.containsKey(nums[i])) {
			return nums[i];
		    }
		    map.put(nums[i],i);

	    }
	    return -1;
    }
}

class Main {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,3};
		
		Solution obj = new Solution();

		int ret = obj.findDuplicate(arr);
		System.out.println(ret);
	}
}
