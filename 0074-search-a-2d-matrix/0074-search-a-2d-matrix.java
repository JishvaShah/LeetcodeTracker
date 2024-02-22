class Solution {
    
    public static boolean BinarySearch(int[] matrix, int target){
        int s=0, e=matrix.length;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(matrix[mid]==target) return true;
            else if(matrix[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length, curr_elem=matrix[0][n-1];
        for(int i=0;i<m;i++){
            if(target==matrix[i][n-1]) return true;
            else if(target<matrix[i][n-1]) return BinarySearch(matrix[i], target);
            else continue;
        }
        return false;
    }
}