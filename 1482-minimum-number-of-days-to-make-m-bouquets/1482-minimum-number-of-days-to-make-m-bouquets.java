class Solution {

    public static boolean isValid(int[] bloomDay, int m, int k, int mid){
        int totalCount=0/*m*/,count=0/*k*/;
        
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid) count++;
            else count=0;
            
            if(count==k) {
                totalCount++;
                count=0;
            }
        }
        return totalCount>=m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int low=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
        }
        
        int high=max; 
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(bloomDay,m,k,mid)) high=mid-1;
            else low=mid+1;
        }
        
        return low==(max+1)?-1:low;   
    }
}