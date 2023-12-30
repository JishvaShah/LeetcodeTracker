class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        
        int buy=prices[0],sell=prices[1],profit=Integer.MIN_VALUE;
        
        for(int i=1;i<prices.length;i++){
            if(buy<prices[i]) profit=Math.max(profit,prices[i]-buy);
            else buy=prices[i];
        }        
        return (profit==Integer.MIN_VALUE)?0:profit;
    }
}