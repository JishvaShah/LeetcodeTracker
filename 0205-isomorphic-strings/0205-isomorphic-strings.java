class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        for(int i=0;i<s.length();i++){            
            if(!hm.containsKey(s.charAt(i))){
                if(!hm.containsValue(t.charAt(i))){
                     hm.put(s.charAt(i),t.charAt(i));      
                }
                else return false;
            } 
            else {
                if(hm.get(s.charAt(i))!=t.charAt(i)) return false;   
            }
        }
               
        return true;
    }
}
