class Solution {
    public static String getS(char c, int i){
        StringBuilder sb = new StringBuilder();
        while(i>0){
            sb.append(c);
            i--;
        }
        return sb.toString();
    }
    
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){            
            if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            else
                hm.put(s.charAt(i),1);
        }
        
        List<Character>[] buckets = new ArrayList[s.length()+1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>(); 
        }
        
        for (char key : hm.keySet()) {
            int frequency = hm.get(key);
            buckets[frequency].add(key);
        }
       
        StringBuilder sb = new StringBuilder();
        for(int i=s.length();i>=0;i--){
             for (char ch : buckets[i]) {
                sb.append(getS(ch, i));
            }   
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}