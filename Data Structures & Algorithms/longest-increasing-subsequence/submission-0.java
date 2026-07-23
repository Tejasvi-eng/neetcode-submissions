class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int[] dp = new int[n];
        
        // Base case: every element is an LIS of length 1
        java.util.Arrays.fill(dp, 1);
        
        int maxLIS = 1;

        // Process each element
        for (int i = 1; i < n; i++) {
            // Check all previous elements j < i
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    // State transition: extend LIS ending at j
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            // Track global max as we build the DP table
            maxLIS = Math.max(maxLIS, dp[i]);
        }

        return maxLIS;
    }
}