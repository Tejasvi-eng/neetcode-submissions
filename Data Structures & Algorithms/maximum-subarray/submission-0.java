class Solution {
    public int maxSubArray(int[] nums) {
         int i=0;
        int j=i+1;
         int max_sum=Integer.MIN_VALUE;
        
        while(i<nums.length && j<=nums.length){
           int sum=0;
            for(int k=i;k<j;k++){
                
               sum+=nums[k];
            }
            max_sum=Math.max(max_sum, sum);
            
            if(j==nums.length){
                i++;
                j=i+1;
                //sum=0;
            }
            else{
                j++;
            }
        }
        return max_sum;
    }
}
