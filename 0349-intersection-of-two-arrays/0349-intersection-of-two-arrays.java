class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] ans = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0,count=0;
        while(i<nums1.length && j<nums2.length){
            if((k==0 || nums1[i]!=ans[k-1]) && nums1[i]==nums2[j]){
                    count++;
                    ans[k]=nums1[i];
                    i++;
                    j++;
                    k++;
                
            }
            else if(nums1[i]>nums2[j]) j++;
            else i++;
        }  
        System.out.println(count);
        int[] arr = new int[count];
        for(int pos=0;pos<count;pos++){
            arr[pos]=ans[pos];
        }
        return arr;
    }
}