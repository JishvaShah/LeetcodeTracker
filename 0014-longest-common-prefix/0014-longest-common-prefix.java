class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        
        String s1=strs[0], s2=strs[strs.length-1];
        for(int i=0;i<Math.min(s1.length(), s2.length());i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                return sb.toString();
            }
        }   
        return sb.toString();
    }
}