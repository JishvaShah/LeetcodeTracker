class Solution {
    public int maxProfit(int[] prices) {       
        int buy=Integer.MAX_VALUE,sell=0,profit=Integer.MIN_VALUE;
        
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]) profit=Math.max(profit,prices[i]-buy);
            else buy=prices[i];
        }        
        return (profit==Integer.MIN_VALUE)?0:profit;
    }
}