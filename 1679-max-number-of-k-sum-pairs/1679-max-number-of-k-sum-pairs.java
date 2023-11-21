class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,count=0;
        while(i<j){
            int temp = nums[i]+nums[j];
            if(temp==k){
                count++;
                i++;
                j--;
            }
            else if(temp<k) i++;
            else j--;
        }
        return count;
    }
}
        

        // int i=0,j=1,count=0,n=nums.length;
        // while(i<n-1){
        //     int sum = nums[i]+nums[j];            
        //     if(sum==k && j<n){
                
        //     System.out.println(sum+" "+count+" i="+i+" j="+j);
        //         count++;
        //         nums[i]=Integer.MIN_VALUE;
        //         nums[j]=Integer.MIN_VALUE;
        //         i++;
        //         j=i+1;
                
        //     }
        //     else if(j==n-1){
        //         i++;
        //         j=i+1;
        //     }
        //     else j++;
            
        // }
        // return count;