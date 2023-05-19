/*
 Problem 3 : Reverse String
 	Write a function that reverses a string. The input string is given as an array of characters s.
	You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 */

class Solution {
    public void reverseString(char[] s) {
        int str = 0;
        int end = s.length -1;
        while(str < end){

            char temp = s[str];
            s[str] = s[end];
            s[end] = temp; 

            str++;
            end--;
        }
    }
}

class Main {
	
	public static void main(String[] args) {
		
		Solution obj = new Solution();

		char arr[] = {'H','e','l','l','o'};

		obj.reverseString(arr);
		System.out.println(arr);
	}
}
