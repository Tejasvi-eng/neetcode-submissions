class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> targetMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        for(char c : t.toCharArray()){
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int required = targetMap.size();
        int formed = 0;

        int i = 0, j = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while(j < s.length()){

            char c = s.charAt(j);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            if(targetMap.containsKey(c) &&
               windowMap.get(c).intValue() == targetMap.get(c).intValue()){
                formed++;
            }

            while(i <= j && formed == required){

                if(j - i + 1 < minLen){
                    minLen = j - i + 1;
                    start = i;
                }

                char leftChar = s.charAt(i);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if(targetMap.containsKey(leftChar) &&
                   windowMap.get(leftChar) < targetMap.get(leftChar)){
                    formed--;
                }

                i++;
            }

            j++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}