class Solution {
    
    public static void swap(int[][] matrix, int i, int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
    
    public static void reverse(int[] nums){
        int i=0,j=nums.length-1;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            //transpose matrix
            for(int j=i;j<matrix[0].length;j++){
                swap(matrix,i,j);
            }
            //reverse matrix rows[0..n]
            reverse(matrix[i]);
        }
    }
}