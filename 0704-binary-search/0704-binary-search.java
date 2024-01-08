class Solution {
    
    public int recursiveBinarySearch(int[] nums, int low, int high, int target){
        //terminating condition
        if(low>high) return -1;
        
        int mid = high + (low-high)/2;
        
        //recursive operations
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) return recursiveBinarySearch(nums,mid+1,high,target); 
        return recursiveBinarySearch(nums,low,mid-1,target); 
        
    }
    
    public int search(int[] nums, int target) {
        return recursiveBinarySearch(nums,0,nums.length-1,target);   
    }
}