class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start=0, end=n-1, pivot=0, mid=0, prev=0, next=0;

        //finding pivot/minimum element
        while(start<=end){
            mid = end + (start - end)/2;
            next = (mid+1)%n;
            prev = (mid+n-1)%n;
            if(nums[mid]<nums[prev] && nums[mid]<nums[next]){
                pivot = mid;
                break;
            }
            else if(nums[mid]>=nums[0]) start = mid + 1;
            else end = mid - 1;
        }
        return nums[pivot];
    }
}