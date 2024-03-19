class Solution {
    public int beautySum(String s) {
         int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int min = Integer.MAX_VALUE;
            int max = 0;
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int j = i; j < s.length(); j++){
                if(!hm.containsKey(s.charAt(j))){
                    hm.put(s.charAt(j), 1);
                    max = Math.max(max, 1);
                    min = Math.min(min, 1);
                }
                else{
                    hm.put(s.charAt(j), hm.get(s.charAt(j))+1);
                    max = Math.max(max, hm.get(s.charAt(j)));
                    min = Collections.min(hm.values());
                }
                ans = ans + (max-min);
            }
        }
        return ans;
    }
}