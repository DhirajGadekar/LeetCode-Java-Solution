/*
 * 77] Number of Laser Beams in a Bank
 */

class Solution {
    public int numberOfBeams(String[] bank) {
        
        int lbeam = 0; 
        for(int i = 0; i < bank[0].length(); i++) {

            if(bank[0].charAt(i) == '1' ) {

                lbeam++;
            }
        }
        int sum = 0;
        for(int i = 1; i < bank.length; i++) {

            int tempBeam = 0;
            for(int j = 0; j < bank[i].length(); j++) {

                if(bank[i].charAt(j) == '1') {

                    tempBeam++;
                }
            }
            if(tempBeam != 0) {

                sum = sum + (tempBeam * lbeam);
                lbeam = tempBeam;
            }
        }
        return sum;
    }
}
