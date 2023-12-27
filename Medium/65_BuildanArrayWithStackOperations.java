/*
 * 65] Build an Array With Stack Operations
 */

class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> ls = new ArrayList<String>();
        int itr = 1;
        for(int i = 0; i < target.length; i++) {
            if(itr == target[i]) {
                ls.add("Push");
            } else {
                ls.add("Push");
                ls.add("Pop");
                i--;
            }
            itr++;
        }
        return ls;
    }
}
