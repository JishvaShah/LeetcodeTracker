class Solution {
    public int majorityElement(int[] nums) {
        int count=0, majority=0;
        for(int i=0;i<nums.length;i++){
            
            if(count!=0) count += (nums[i]==majority)?+1:-1;
            else{
                majority=nums[i];
                count++;//count=1;
            }
        }
        return majority;
    }
}