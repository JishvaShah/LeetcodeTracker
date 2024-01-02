class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        //row=matrix[..][0]
        int col = matrix[0].length;
        //col=matrix[0][..]
        
        int col0=1;
        //first traversal
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    
                    if(j!=0)
                        matrix[0][j]=0;
                    else 
                        col0=0;
                }
            }
        }
        
        //second traversal except first row and first col
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 || matrix[0][j]==0) matrix[i][j]=0;
                }
            }
        }
        
        
        //third traversal for first row
        if(matrix[0][0]==0) 
            for(int i=0;i<col;i++) matrix[0][i]=0;
        //fourth traversal for first column
        if(col0==0)
            for(int i=0;i<row;i++) matrix[i][0]=0;

        
    }
}