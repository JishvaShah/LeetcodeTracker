class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1,count=1;
        for(j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1]) count++;
            else count=1;
            if(count<=2){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}