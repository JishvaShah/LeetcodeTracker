class Solution {
    public int findPeakElement(int[] nums) {
        int start=0,end=nums.length-1,mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid==nums.length-1 || nums[mid]<nums[mid+1]) start=mid+1;
            else if(mid == 0 || nums[mid]<nums[mid-1]) end=mid-1;
            else break;
        }
        return mid;
    }
}