/*
 Problem 1 : Find the Index of the First Occurrence in a String

	-Given two strings needle and haystack, return the index of the first occurrence 
	 of needle in haystack, or -1 if needle is not part of haystack.

	Example 1:
		Input: haystack = "sadbutsad", needle = "sad"
		Output: 0
		Explanation: "sad" occurs at index 0 and 6.
			     The first occurrence is at index 0, so we return 0.

	Example 2:
		Input: haystack = "leetcode", needle = "leeto"
		Output: -1
		Explanation: "leeto" did not occur in "leetcode", so we return -1.

	Constraints:
		1 <= haystack.length, needle.length <= 104
		haystack and needle consist of only lowercase English characters.
 */

class Solution {
    public int strStr(String haystack, String needle) {

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int count = 0;
            for(int j = 0;j < needle.length(); j++)  {

                if(haystack.charAt(j + i) == needle.charAt(j)) {
                    count++;
                }
            }
            if(count == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}

class Main {
	
	public static void main(String[] args) {
		
		Solution obj = new Solution();

		String haystack = "sadbutsad";
		String needle = "sad";

		int ret = obj.strStr(haystack, needle);
		System.out.println(ret);
	}
}
