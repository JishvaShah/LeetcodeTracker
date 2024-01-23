class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s=0, e=arr.length-1,mid=0;
        while(s<=e){
            mid=s+(e-s)/2;
            if(arr[mid]-mid-1<k) s=mid+1;
            else e=mid-1;
        }
        return (k+e+1);
    }
}