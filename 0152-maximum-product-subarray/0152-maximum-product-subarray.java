class Solution {
    public int maxProduct(int[] nums) {
        int left=1,right=1,ans=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            left*=nums[i];
            right*=nums[(nums.length)-i-1];
            
            ans=Math.max(Math.max(left,right),ans);
            
            if(left==0) left=1;
            if(right==0) right=1;
            
        }
        return ans;
    }
}