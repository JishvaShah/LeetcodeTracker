class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int val=0, prev=hm.get(s.charAt(0));
        for(int i=0;i<s.length();i++){
            int curr = hm.get(s.charAt(i));
            if(curr<=prev) val+=curr;
            else val+=curr-2*prev;
            prev = curr; 
        }
        
        return val;
    }
}