class Solution {
    public int majorityElement(int[] nums) {
        int majority=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count!=0) count+=(nums[i]==majority ? 1 : -1);
            else
            {
                majority=nums[i];
                count=1;
            }
        }
        return majority;
    }
}