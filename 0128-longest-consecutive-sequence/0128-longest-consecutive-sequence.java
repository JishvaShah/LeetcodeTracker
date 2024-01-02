class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        
        int maxLen=Integer.MIN_VALUE;
        for(int x:st){
            if(!st.contains(x-1)){
                int count=1;
                while(st.contains(x+1)){
                    x=x+1;
                    count+=1;
                }
               maxLen=Math.max(maxLen,count); 
            }
        }
        return (maxLen==Integer.MIN_VALUE)?0:maxLen;
    }
}