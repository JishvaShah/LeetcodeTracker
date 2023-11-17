class Solution {
    public int maxArea(int[] height) {
         int i=0,j=height.length-1,area=0, res=Integer.MIN_VALUE;

        while(i<=j){
            if(height[i]<=height[j]) {
                area=height[i]*(j-i);
                i++;
            }
            else{
                area=height[j]*(j-i);
                j--;
            }
            res=Math.max(res,area);
        }
        return res;
    }
}