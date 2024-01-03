class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int top=0,left=0,bottom=m-1,right=n-1;
        
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++) ans.add(matrix[top][i]);
            top++;
            if(top>bottom) break;
            for(int i=top;i<=bottom;i++) ans.add(matrix[i][right]);
            right--;
            if(left>right) break;
            for(int i=right;i>=left;i--) ans.add(matrix[bottom][i]);
            bottom--;
            for(int i=bottom;i>=top;i--) ans.add(matrix[i][left]);
            left++;
        }
        
        return ans;
    }
}