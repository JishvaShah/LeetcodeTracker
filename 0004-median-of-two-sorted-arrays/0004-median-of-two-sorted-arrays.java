class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int index=(nums1.length+nums2.length+1)/2;
        int low=0, high=0,fVal=0,sVal=0;
        
        if(nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        if(nums1.length>nums2.length) high=nums2.length;
        else high=nums1.length;
        
        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=index-mid1;
            
            int lh1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int lh2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            int rh1 = (mid1 < nums1.length) ? nums1[mid1] : Integer.MAX_VALUE;
            int rh2 = (mid2 < nums2.length) ? nums2[mid2] : Integer.MAX_VALUE;

            
            if(lh1>rh2) high=mid1-1;
            else if(lh2>rh1) low=mid1+1;
            else{
                fVal=Math.max(lh1,lh2);
                sVal=Math.min(rh1,rh2);
                break;
            }
        }
        
        if((nums1.length + nums2.length)%2==0) return (fVal+sVal)/2.0;
        return (double) fVal;
    }
}