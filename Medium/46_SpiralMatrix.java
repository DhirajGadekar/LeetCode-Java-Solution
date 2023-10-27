/*
 * 46] Spiral Matrix :
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = 0;

        List<Integer> al = new ArrayList<Integer>();

        while(n > 1 && m > 1) {
            
            for(int x = 0; x < m - 1; x++) {
                al.add(matrix[i][j]);
                j++;
            }
            for(int x = 0; x < n - 1 && m != 1; x++) {
                al.add(matrix[i][j]);
                i++;
            }
            for(int x = 0; x < m - 1; x++) {
                al.add(matrix[i][j]);
                j--;
            }
            for(int x = 0; x < n - 1 && m !=1; x++) {
                al.add(matrix[i][j]);
                i--;
            }
            n -= 2;
            m -= 2;
            i++;
            j++;
        }
        if(m == 1) {

            for(int x = 0; x < n; x++) {
                al.add(matrix[i][j]);
                i++;
            }
            return al;
        } else if(n == 1 && m >= 0) {
            for(int x = 0; x < m; x++) {
                al.add(matrix[i][j]);
                j++;
            }
        }
        return al;
    }
}
