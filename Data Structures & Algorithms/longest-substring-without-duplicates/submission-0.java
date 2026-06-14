class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int maxLength=0,len=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(i<=j && j<s.length()){
            if(map.get(s.charAt(j))!=null){
                if(map.get(s.charAt(j))>=i){
                    i=map.get(s.charAt(j))+1;
                }
            }
            len=j-i+1;
            maxLength=Math.max(maxLength,len);
            map.put(s.charAt(j),j);
            j++;
        }
        
        return maxLength;
    }
    
}
