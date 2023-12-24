/*
 * 56] Check If Two String Arrays are Equivalent
 */ 

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String str1 = new String();
        String str2 = new String();
        for(int i = 0; i < word1.length; i++) {

            str1 = str1 + word1[i];
        }
        for(int i = 0; i < word2.length; i++) {

            str2 = str2 + word2[i];
        }
        return str1.equals(str2);
    }
}
