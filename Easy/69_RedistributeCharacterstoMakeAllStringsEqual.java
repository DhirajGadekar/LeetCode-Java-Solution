/*
 * 69] Redistribute Characters to Make All Strings Equal
 */

/*
 * With 21ms
 *  
class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> counts = new HashMap();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
        }
        int n = words.length;
        for (Character c : counts.keySet()) {
            int val = counts.get(c);
            if (val % n != 0) {
                return false;
            }
        }

        return true;
    }
}
*/

/*
 * 2ms
 */

class Solution {
    public boolean makeEqual(String[] words) {
        int[] fre = new int[26];
        for(int i=0;i<words.length;i++){
            String w = words[i];

            for(int j=0;j<w.length();j++){
                char ch = w.charAt(j);
                int idx = (int)(ch-'a');
                fre[idx]=fre[idx]+1;
            }
        }
        for(int i=0;i<26;i++){
            if(fre[i] % words.length!=0){
                return false;
            }
        }
        return true ;
    }
}
