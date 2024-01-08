class Solution {
    public int searchInsert(int[] nums, int target) {
        //edge cases
        if(target<nums[0]) return 0;
        if(target>nums[nums.length-1]) return nums.length;
        
        int low=0,mid=0,high=nums.length-1,ans=0;
        
        while(low<=high){
            
            mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}