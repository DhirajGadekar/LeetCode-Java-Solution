/*
 * 76] Merge Strings Alternately
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int w1Len = word1.length(), w2Len = word2.length();
        int i = 0, j = 0;
        while(i < w1Len && j < w2Len){
            builder.append(word1.charAt(i));
            builder.append(word2.charAt(j));
            i++; j++;
        }
        while(i < w1Len){
            builder.append(word1.charAt(i));
            i++;
        }
        while(j < w2Len){
            builder.append(word2.charAt(j));
            j++;
        }
        return builder.toString();
    }
}
