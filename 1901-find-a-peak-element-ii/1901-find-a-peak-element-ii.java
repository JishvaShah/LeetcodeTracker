class Solution {
    public static int findMax(int[][] matrix, int mid){
        int max=Integer.MIN_VALUE, temp=0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][mid]>max){
                max=matrix[i][mid];
                temp=i;
            }
        }    
        return temp;
    }
    public int[] findPeakGrid(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, low=0, high=n-1, index=0, mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            index = findMax(matrix, mid);
            int max = matrix[index][mid];
            int left=(mid==0)?-1:matrix[index][mid-1];
            int right=(mid==n-1)?-1:matrix[index][mid+1];
            
            if(max>left && max>right) break;
            else if(max<left) high=mid-1;
            else low=mid+1;
        }
        return new int[]{index,mid};
    }
}