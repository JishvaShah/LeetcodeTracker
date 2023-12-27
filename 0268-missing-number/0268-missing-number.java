class Solution {
    public int missingNumber(int[] nums) {
        // int[] temp = new int[nums.length];
        // for(int i=0;i<nums.length;i++) temp[i]=i+1;
        
        int ans=0;
        for(int j=1;j<=nums.length;j++){
            ans=ans^j^nums[j-1];
        }
        return ans;
    }
}