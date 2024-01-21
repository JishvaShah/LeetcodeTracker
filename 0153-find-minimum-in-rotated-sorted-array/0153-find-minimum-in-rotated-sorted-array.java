class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start=0, end=n-1, pivot=0, mid=0, prev=0, next=0;

        //finding pivot/minimum element
        while(start<=end){
            mid = end + (start - end)/2;
            if(nums[mid]>=nums[0]) start=mid+1;
            else if(nums[mid]>nums[mid-1]) end=mid-1;
            else{
                pivot=mid;
                break;
            }
        }
        return nums[pivot];
    }
}