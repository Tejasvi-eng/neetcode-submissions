class Solution {
    public int rob(int[] nums) {
        //if only 1 house
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(robRange(nums,0,nums.length-2),robRange(nums,1,nums.length-1));
    }
    private int robRange(int[] nums, int start, int end){
        int prev1=0;//initially even if we are at first house last two robbed money was 0
        int prev2=0;
        for(int i=start;i<=end;i++){
            int curr=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
