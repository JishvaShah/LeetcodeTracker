class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums1.length];
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(!st.isEmpty()) hs.put(nums2[i],st.peek());
            else hs.put(nums2[i],-1);
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nge[i]=hs.get(nums1[i]);
        }
        return nge;
    }
}