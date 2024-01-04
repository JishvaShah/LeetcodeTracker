class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxi=Integer.MIN_VALUE, maxSum=0,total=0;
        int mini=Integer.MAX_VALUE, minSum=0;
        
        for(int i=0;i<nums.length;i++){
            total+=nums[i];    
            maxSum+=nums[i];
            minSum+=nums[i];
            
            maxi=Math.max(maxi,maxSum);
            mini=Math.min(mini,minSum);
            
            if(maxSum<0) maxSum=0;
            if(minSum>=0) minSum=0;
        }
        
        if(total==mini) return maxi;
        else return Math.max(maxi,total-mini);

    }
}