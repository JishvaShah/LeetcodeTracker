class Solution {       
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int start=0, end=n-1, mid=0;

        while(start<=end){
            mid = start + (end-start)/2;

            if(nums[mid]==target) return true;

            else if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                start++;end--;
                continue;
            }
            
            else if(nums[mid]>=nums[start]){
                if(nums[start]<=target && target<=nums[mid]) end=mid-1;
                else start=mid+1;
            }

            else{
                if(nums[mid]<=target && target<=nums[end]) start=mid+1;
                else end=mid-1;
            }
        }
        return false;
    }
}