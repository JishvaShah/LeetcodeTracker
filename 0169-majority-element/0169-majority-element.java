class Solution {
    public int majorityElement(int[] nums) {
        int count=1, majority=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            
            count += (nums[i]==majority)?+1:-1;
            
            if(count==0) {
                majority=nums[i];
                count++;
            }
        }
        return majority;
    }
}