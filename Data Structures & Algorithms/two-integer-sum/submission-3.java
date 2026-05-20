class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int k = 0; k < nums.length; k++) {
            int complement = target - nums[k];
            
            // 1. Check if the complement we need is already in our map
            if (map.containsKey(complement)) {
                // If it is, we return its index and our current index 'k'
                return new int[] { map.get(complement), k };
            }
            
            // 2. If it's not there, store the current number and its index
            map.put(nums[k], k);
        }
        
        return new int[]{-1, -1};
    }
}