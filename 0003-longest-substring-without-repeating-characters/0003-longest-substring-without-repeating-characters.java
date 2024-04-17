class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int i=0, maxLen=0;
        for(int j=0;j<s.length();j++){
            while(hs.contains(s.charAt(j))){
                hs.remove(s.charAt(i));
                i++;
            }
            hs.add(s.charAt(j));
            maxLen=Math.max(maxLen, hs.size());
        }
        return maxLen;
    }
}