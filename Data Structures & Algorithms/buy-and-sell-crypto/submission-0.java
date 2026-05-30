class Solution {
    public int maxProfit(int[] prices) {
        
        
        int profit=0;
        int max_profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int buy=Integer.MAX_VALUE;
            // cannot buy on last day
                buy=Math.min(prices[i],buy);
            
            int sell=Integer.MIN_VALUE;
            for(int j=i+1;j<prices.length;j++){
                //cannot sell on day 1
                    sell=Math.max(prices[j],sell);
                
                
                profit=sell-buy;
                 max_profit=Math.max(max_profit,profit);
            }
           
        }
        if(max_profit<=0)
        {
            return 0;
        }
        return max_profit;
        }
}
