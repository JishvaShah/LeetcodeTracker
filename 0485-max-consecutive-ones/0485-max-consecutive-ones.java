class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,count=0,max_count=Integer.MIN_VALUE;
        for(i=0;i<nums.length;i++){
            if(nums[i]==1) count++;
            else count=0;
            max_count=Math.max(count,max_count);
        }
        return max_count;
    }
}