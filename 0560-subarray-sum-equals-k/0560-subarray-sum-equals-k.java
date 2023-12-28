class Solution {
    public int subarraySum(int[] nums, int k) {
       int sum=0,count=0,len=0,maxLen=0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            //calculating prefix sum at each index
            sum+=nums[i];
            //checking if prefixsum is already equals to k
            if(sum==k) count++;
            //calculating remainder sum - k
            int rem = sum - k;
            //checking if remainder is present in map, to check occurence
            //if yes add it to count
            if(prefixSumMap.containsKey(rem)) count+=prefixSumMap.get(rem);
            //finally, check if prefixSum is present in the map or not
            //if present, get its key value and incremenet it by 1(incrementing occurence by 1)
            //if not present, simply add it to map with value 1 as its occurence count
            if(!prefixSumMap.containsKey(sum)) prefixSumMap.put(sum, 1);
            else{
                int temp = prefixSumMap.get(sum);
                prefixSumMap.put(sum, ++temp);
            }            
        }       
        
        return count;
    }
}