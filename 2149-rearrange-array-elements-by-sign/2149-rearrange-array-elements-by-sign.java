class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0, neg=1, i=0;
        int[] ans = new int[nums.length];
        
        for(i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }
            else{
                ans[neg]=nums[i];
                neg+=2; 
            }
        }
        return ans;
    }
}