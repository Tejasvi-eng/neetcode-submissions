class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String,List<String>> map=new HashMap<>();
         for(String word: strs){
            char []chars=word.toCharArray();//convert a string to character array
            Arrays.sort(chars);//sort that character array that is string 
            String key=new String(chars);//convert character array to key
            //if key isnot in the map create new list as value 
            // Replace your if block with this one line

map.putIfAbsent(key, new ArrayList<>());
map.get(key).add(word);
         }
        
         return new ArrayList<>(map.values());
    }
}
