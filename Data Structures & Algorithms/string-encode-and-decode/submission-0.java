class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
            List<String> result=new ArrayList<>();
            int i=0;
            while(i<str.length()){
                int j=str.indexOf('#',i);//index of next appearence of #
                int len=Integer.parseInt(str.substring(i,j));//extract the length of substring from i to j 
                result.add(str.substring(j+1,j+1+len));//extract word
                i=j+1+len;//jump to next word
            }
            return result;
    }
}
