class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,count=0,max_count=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max_count=Math.max(count,max_count);
            }
            else count=0;
            
        }
        return max_count;
    }
}