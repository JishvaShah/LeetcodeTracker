class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length, m=matrix[0].length,i=0,j=m-1;
        while(i<n && j<m && i>-1 && j>-1){
            int temp=matrix[i][j];
            if(target==temp) return true;
            else if(target<temp) j--;
            else i++;
        }
        return false;
    }
}