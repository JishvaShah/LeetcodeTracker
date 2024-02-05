class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int cnt=0,i=0,j=0;
        int index=(nums1.length+nums2.length)/2;
        int sInd=index, fInd=index-1, fVal=-1, sVal=-1;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                if(fInd==cnt) fVal=nums1[i];
                if(sInd==cnt) sVal=nums1[i];
                cnt++;
                i++;
            }
            else{
                if(fInd==cnt) fVal=nums2[j];
                if(sInd==cnt) sVal=nums2[j];
                cnt++;
                j++;
            }
        }
        while(i<nums1.length){
            if(fInd==cnt) fVal=nums1[i];
            if(sInd==cnt) sVal=nums1[i];
            cnt++;
            i++;
        }
        while(j<nums2.length){
            if(fInd==cnt) fVal=nums2[j];
            if(sInd==cnt) sVal=nums2[j];
            cnt++;
            j++;
        }
        
        double median = 0;
        //even length
        if((nums1.length+nums2.length)%2==0) median=(fVal+sVal)/2.0;
        //odd length
        else median = (double) sVal;
        
        return median;
    }
}