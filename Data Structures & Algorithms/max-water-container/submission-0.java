class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1;
        // the min height pointer decides the limit and can cmove 
        int maxArea=0;
        while(left<right){

            maxArea=Math.max(Math.min(heights[left],heights[right])*(right-left),maxArea);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
