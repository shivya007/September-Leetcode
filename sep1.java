//2022. Convert 1D Array Into 2D Array
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // 2nd Approach
        int[][] twoDarray = new int[m][n];
        if(m * n != original.length){
            return new int[0][0];
        }
        for(int i = 0; i < original.length; i++){
            int row = i / n;
            int col = i % n;
            twoDarray[row][col] = original[i];
        }
        return twoDarray;


        // brute force Approach
        /*int[][] twoDarray = new int[m][n];
        if(m * n != original.length){
            return new int[0][0];
        }
        int i = 0;
        int row = 0;
        while(i < original.length){
            for(int k = 0; k < n; k++){
                int curr = original[i];
                twoDarray[row][k] = curr;
                i++;
            }
            row++;
        }
        return twoDarray;*/
    }
}