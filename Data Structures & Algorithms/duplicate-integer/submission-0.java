class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        while(j<nums.length && i<j){
            if(nums[i]==nums[j]){
                return true;
            }
            else{
                i++;
                j++;
            }
        }
        return false;
    }
}