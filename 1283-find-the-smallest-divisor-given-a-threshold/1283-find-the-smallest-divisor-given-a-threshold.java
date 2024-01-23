class Solution {
    public static boolean isValid(int mid, int[] nums, int h){
       int count=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]<=mid) count++;
           else{
               count+=nums[i]/mid;
               if(nums[i]%mid!=0) count++;
           }
       }
       return count<=h;
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
         
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(mid,nums,threshold)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}