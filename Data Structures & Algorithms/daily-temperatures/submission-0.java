class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[temperatures.length];
        int curr=temperatures.length-1;
        while(curr>=0){
            
       
       while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[curr]){
           
           
                stack.pop();
            
           // curr--;
        }
         if(stack.isEmpty()){
            ans[curr]=0;
            
        }
         if(!stack.isEmpty() && temperatures[stack.peek()]>temperatures[curr]){
            ans[curr]=stack.peek()-curr;
            
        }
        stack.push(curr);
            curr--;
        
        }
       
        return ans;
    }
}
