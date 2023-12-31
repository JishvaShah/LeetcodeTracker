class Solution {
    public void reverse(int[] nums, int i, int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }    
    }
    
    public void nextPermutation(int[] nums) {
        int n=nums.length, index=-1;
        
        //To find an anomaly or a dip point from backwards where a[i]<a[i+1]
        //from backwards becuase we are trying to have the longest refix sum from start to find next permutation
        //eg. raj rax rbx
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }            
        }
        
        //two case where index=-1, no o permuattion after this, hence reverse.
        if(index==-1){
            reverse(nums, 0, n-1);
            return;
        }
       
        //now we just have to find the element which is slight or just greater than index element.
        for(int i=n-1;i>index;i--){
            if(nums[index]<nums[i]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }            
        }
        reverse(nums,index+1,n-1);
        return;
    }
}