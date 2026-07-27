class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr=Math.max(nums[i],nums[i]+curr);
            maxSum=Math.max(maxSum,curr);
        }
        return maxSum;
    }
}
