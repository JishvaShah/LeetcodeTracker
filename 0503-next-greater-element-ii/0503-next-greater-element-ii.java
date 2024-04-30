class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge = new int[nums.length];
        Stack<Integer> st=new Stack<>();
        
        for(int i=nums.length-1;i>=0;i--) 
            st.push(nums[i]);
        
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            
            if(!st.isEmpty()) nge[i]=st.peek();
            else nge[i]=-1;
            
            st.push(nums[i]);
        }    
        return nge;
    }
}