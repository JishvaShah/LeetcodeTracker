class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1,count=1;
        if(nums.length==1) return count;
        while(j<nums.length){
            if(nums[j]==nums[j-1]) j++;
            else{
                nums[i]=nums[j];
                i++;
                j++;
                count++;
            }
        }
        return count;
    }
}