/*
 * 66] Minimum Time to Make Rope Colorful
 */

class Solution {
    public int minCost(String colors, int[] neededTime) {

        int sum = 0;
        char arr[] = colors.toCharArray();
        for(int i = 0; i < neededTime.length - 1; i++) {

            if(arr[i] == arr[i + 1]) {

                if(neededTime[i] < neededTime[i + 1]) {

                    sum = sum + neededTime[i];
                } else {

                    sum = sum + neededTime[i + 1];
                    int temp = neededTime[i + 1];
                    neededTime[i + 1] = neededTime[i];
                    neededTime[i] = temp;
                }
            }
        }
        return sum;
    }
}
