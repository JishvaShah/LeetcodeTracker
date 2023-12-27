class Solution {
    public int missingNumber(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++) temp[i]=i+1;
        
        int ans=0;
        for(int j=0;j<nums.length;j++){
            ans=ans^temp[j]^nums[j];
        }
        return ans;
    }
}