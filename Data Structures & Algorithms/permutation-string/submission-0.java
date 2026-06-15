class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i=0,j=s1.length()-1;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        
        for(char c : s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        while(j<s2.length()){
            map2.clear();
            for(int k=i;k<=j;k++){
                char c=s2.charAt(k);
                map2.put(c,map2.getOrDefault(c,0)+1);
            }
            if(map1.equals(map2)){
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
