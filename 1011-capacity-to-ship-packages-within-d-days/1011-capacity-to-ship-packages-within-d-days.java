class Solution {
    public static boolean isValid(int[] weights, int days, int mid){
        int tempWeight=0,totalDays=0;
        for(int i=0;i<weights.length;i++){
            
            tempWeight+=weights[i];
            if(tempWeight>mid){
                totalDays++;
                tempWeight=weights[i];
                
                if(tempWeight>mid) return false;
            }
        }
        if(tempWeight<=mid) totalDays++;
        return totalDays<=days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low=0,mid=0,high=0;
        for(int i=0;i<weights.length;i++)
            high+=weights[i];
        
        while(low<=high){
            mid=low+(high-low)/2;
            if(isValid(weights,days,mid)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}