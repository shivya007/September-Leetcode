//2326. Spiral Matrix IV
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for(int i =0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = -1;
            }
        }
        int startRow = 0;
        int startCol = 0;
        int endRow = m-1;
        int endCol = n-1;
        ListNode temp = head;
        while((startRow <= endRow && startCol <= endCol) && (temp != null)){
            // top 
            for(int j = startCol; j <= endCol; j++){
                if(temp == null){
                    break;
                }
                matrix[startRow][j] = temp.val;
                temp = temp.next;
            }
            // right
            for(int i = startRow+1; i <= endRow; i++){
                if(temp == null){
                    break;
                }
               matrix[i][endCol] = temp.val;
               temp = temp.next;
            }
            // bottom
            for(int j = endCol-1; j >= startCol; j--){
                if(temp == null){
                    break;
                }
                if(startRow == endRow){
                    break;
                }
                matrix[endRow][j] = temp.val;
                temp = temp.next;
            }
            // left
            for(int i = endRow-1; i >= startRow+1; i--){
                if(temp == null){
                    break;
                }
                if(startCol == endCol){
                    break;
                }
                matrix[i][startCol] = temp.val;
                temp = temp.next;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return matrix;
    }
}