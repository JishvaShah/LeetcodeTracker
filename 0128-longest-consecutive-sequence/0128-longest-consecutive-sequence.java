class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxLen=0,left=0,right=0,len=0;
        
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(!map.containsKey(key)){
                
                left=(map.containsKey(key-1))?map.get(key-1):0;
                right=(map.containsKey(key+1))?map.get(key+1):0;
                
                len=left+right+1;
                map.put(key,len);
                maxLen=Math.max(maxLen,len);
                
                map.put(key-left,len);
                map.put(key+right,len);                
            }
        }
        
        return maxLen;
    }
}