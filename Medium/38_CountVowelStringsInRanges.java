/*
 * 38] Count Vowel Strings in Ranges
 */

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int num[] = new int[words.length];
        int count= 0;
        for(int i = 0; i < words.length; i++) {
            int end = words[i].length() - 1;
            if((words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e' || words[i].charAt(0) == 'i' || words[i].charAt(0) == 'o' || words[i].charAt(0) == 'u') && (words[i].charAt(end) == 'a' || words[i].charAt(end) == 'e' || words[i].charAt(end) == 'i' || words[i].charAt(end) == 'o' || words[i].charAt(end) == 'u')) {
                count++;
            }
            num[i] = count;
        }
        int nums[] = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            if(queries[i][0] == 0) {
                nums[i] = num[queries[i][1]];
            } else {
                nums[i] = num[queries[i][1]] - num[queries[i][0] - 1];
            }
        }
        return nums;
    }
}
