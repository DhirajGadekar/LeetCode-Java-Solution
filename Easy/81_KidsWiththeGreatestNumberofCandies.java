/*
 * 81] Kids With the Greatest Number of Candies
 */

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++) {

            if(max < candies[i]) {

                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++) {

            if(candies[i] + extraCandies >= max) {

                al.add(true);
            } else {

                al.add(false);
            }
        }
        return al;
    }
}
