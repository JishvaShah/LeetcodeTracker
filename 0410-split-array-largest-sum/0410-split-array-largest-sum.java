class Solution {
    public static boolean isValid(int[] nums, int k, int mid){
        int splits=0, sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                splits++;
                sum=nums[i];
            }
        }
        if(sum<=mid) splits++;
        return splits<=k;
    }
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE, high=0, mid=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>low) low=nums[i];
            high+=nums[i];
        }
        
        while(low<=high){
            mid=low+(high-low)/2;
            if(isValid(nums,k,mid)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}