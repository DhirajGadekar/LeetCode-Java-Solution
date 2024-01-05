/*
 * 83] Container With Most Water
 */

class Solution {
    public int maxArea(int[] height) {

        int area = 0;
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while(start < end) {

            int min = Math.min(height[start], height[end]);
            area = min * (end - start);
            if(max < area) {

                max = area;
            }
            if(height[start] < height[end]) {

                start++;
            } else {

                end--;
            }
        }
        return max;
    }
}
