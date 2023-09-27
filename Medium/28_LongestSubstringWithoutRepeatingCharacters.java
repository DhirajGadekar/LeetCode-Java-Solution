/*
 * 28] Longest Substring Without Repeating Characters :
 */

/*
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        int itr = 0;
        
        ArrayList<Character> al = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++) {

            if(!al.contains(s.charAt(i))) {

                al.add(s.charAt(i));
            } else {
                int size = al.size();
                al = new ArrayList<Character>();
                if(size > max) {

                    max = size;
                }
                i = itr++;
            }
        }
        if(al.size() > max) {

            max = al.size();
        }
        return max;
    }
}*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int max = 0;
        int itr = 0;

        ArrayList<Character> al = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++) {

            if(!al.contains(s.charAt(i))) {

                al.add(s.charAt(i));
            } else {
                int size = al.size();
                al.remove(0);
                if(size > max) {

                    max = size;
                }
                i--;
            }
        }
        if(al.size() > max) {

            max = al.size();
        }
        return max; 
    }
}
