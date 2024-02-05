class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        int k=0,i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                nums3[k]=nums1[i];
                k++;
                i++;
            }
            else{
                nums3[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            nums3[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            nums3[k]=nums2[j];
            k++;
            j++;
        }
        double median = 0;
        int index=(nums1.length+nums2.length)/2;
        
        if((nums1.length+nums2.length)%2==0) median=(nums3[index-1]+nums3[index])/2.0;
        else median = (double) nums3[index];
        
        return median;
    }
}