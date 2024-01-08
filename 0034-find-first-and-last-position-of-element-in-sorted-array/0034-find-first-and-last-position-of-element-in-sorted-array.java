class Solution {
    
    public static int firstOcc(int[] nums, int target){
        int low=0,high=nums.length-1,mid=0;        
        
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]>=target) high=mid-1;
            else low=mid+1;
        }        
        return (low<0 || low>nums.length-1 || nums[low]!=target)?-1:low;
    }
    
    public static int lastOcc(int[] nums, int target){
        int low=0,high=nums.length-1,mid=0,ans=-1;        
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return ans;
    }
    
    public int[] searchRange(int[] nums, int target) {        
        int first = firstOcc(nums,target);
        int last = lastOcc(nums,target);
        return new int[]{first,last};
    }
}