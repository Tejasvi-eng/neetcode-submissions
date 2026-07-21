class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //int minCost=Integer.MAX_VALUE;
        int prev1=0;// cost to be at index 1 is zero
        int prev2=0;// cost to be a index 0 is 0
        for( int i= 2;i<=cost.length;i++){
            //int curr=prev1+prev2;
            int curr=Math.min(cost[i-1]+prev1,cost[i-2]+prev2);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
