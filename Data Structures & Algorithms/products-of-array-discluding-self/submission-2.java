class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int pdt=1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           arr[i]=product;
            product*=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
           arr[j]*=pdt;
            pdt*=nums[j];
        }
        return arr;
    }
}