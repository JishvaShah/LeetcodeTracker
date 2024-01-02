class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        
        int maxLen=1;
        for(int x:st){
            if(!st.contains(x-1)){
                int y=x, count=1;
                
                while(st.contains(y+1)){
                    y=y+1;
                    count+=1;
                }
               maxLen=Math.max(maxLen,count); 
            }
        }
        return maxLen;
    }
}