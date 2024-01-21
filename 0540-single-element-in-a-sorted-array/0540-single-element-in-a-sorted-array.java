class Solution {
    public int singleNonDuplicate(int[] nums) {
       int start=0,end=nums.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(mid%2==0){
                if(mid==0 || nums[mid]!=nums[mid-1]) start=mid+1;
                else end=mid-1;
            }
            else{
                if(nums[mid]==nums[mid-1]) start=mid+1;
                else end=mid-1;
            }
        }
        return nums[end];
    }
}