class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i))!=t.charAt(i)){
                hm.put(s.charAt(i),t.charAt(i));
            }
            else if(!hm.containsValue(t.charAt(i))){
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(hm.get(s.charAt(i)));
        }
       
        return sb.toString().equals(t);
    }
}