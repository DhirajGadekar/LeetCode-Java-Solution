/*
 * 39] Check If String Is a Prefix of Array
 */

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        for(int i = 0; i < words.length; i++) {

            if(i != 0) {
                words[i] = words[i - 1] + words[i];
            }
            if(words[i].equals(s)) {

                return true;
            }
        }
        return false;
    }
}
