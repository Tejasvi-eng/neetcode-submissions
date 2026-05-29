class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int x=1,y=1;
           if(i!=0){
            x=prefixProduct(0,i-1,nums);
           }
           if(i!=nums.length-1){
            y=suffixProduct(i+1,nums.length-1,nums);
           }
          arr[i]=x*y;
        }
      
      return arr;
    }
    
    public int prefixProduct(int x, int y, int[] nums){
      int product=1;
        for(int i=x;i<=y;i++){
              product*=nums[i];
        }
        return product;
    }
    public int suffixProduct(int x, int y, int[] nums){
      int product=1;
        for(int i=x;i<=y;i++){
              product*=nums[i];
        }
        return product;
    }
}  
