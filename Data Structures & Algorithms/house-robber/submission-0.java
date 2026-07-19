class Solution {
    public int rob(int[] nums) {
        int[] maxMoney=new int[nums.length];
        for(int i=0;i<nums.length;i++){
             if(i==0){
                maxMoney[i]=nums[i];
             }
             else if(i==1){
                maxMoney[i]=Math.max(nums[i],nums[i-1]);
             }
             else{
                 maxMoney[i]=Math.max(maxMoney[i-1],nums[i]+maxMoney[i-2]);
             }
            
        }
        return maxMoney[nums.length-1];
       
    }
}
