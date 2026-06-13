class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1;
        /*traverse two times from start and end*/
        int []leftMax=new int[height.length];
        int []rightMax=new int[height.length];
        int max=0;
        int trappedWater=0;
        for(int i=0;i<leftMax.length;i++){
           
            max=Math.max(max,height[i]);
           leftMax[i]=max;
        }
          max=0;
        for(int j=rightMax.length-1;j>=0;j--){
          
            max=Math.max(max,height[j]);
            rightMax[j]=max;
                
            }
        /*while(right-left>=2){
            if(height[left]<height[left+1]){
                left++;
            }
            if(height[right]>height[right-1]){
                right--;
            }
            int waterLevel=Math.min(leftMax[left],rightMax[right]);
             trappedWater+=(waterLevel-height[left]);
        }*/
        int waterLevel=0;
        for(int i=0;i<height.length;i++){
            waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-height[i];
        }
         return trappedWater;
    }
   
}
