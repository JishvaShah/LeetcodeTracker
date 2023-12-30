class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int elem1=Integer.MIN_VALUE,elem2=Integer.MIN_VALUE,cnt1=0,cnt2=0, min=(nums.length/3)+1;
        
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=elem2){
                cnt1=1;
                elem1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=elem1){
                cnt2=1;
                elem2=nums[i];
            }
            else if(nums[i]==elem1) cnt1++;
            else if(nums[i]==elem2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1=0;cnt2=0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]==elem1) cnt1++;
            else if(nums[j]==elem2) cnt2++;
        }
        
        if (cnt1>=min) ans.add(elem1);
        if (cnt2>=min) ans.add(elem2);
        
        return ans;
    }
}