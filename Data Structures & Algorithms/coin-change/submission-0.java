class Solution {
    public int coinChange(int[] coins, int amount) {
        //initialize array for each coin as index i
        int [] dp=new int[amount+1];
        //fill with infinity
        java.util.Arrays.fill(dp,amount+1);// fill dp array with the max value 7
        dp[0]=0;
        for(int i =0;i<=amount;i++){
            for(int coin: coins){
                if(i-coin>=0){
                dp[i]=Math.min(dp[i],dp[i-coin]+1);//either the earlier one was fine or the curr is

                }
                
            }

        }
        return dp[amount]>amount ? -1 : dp[amount];
    }
}
