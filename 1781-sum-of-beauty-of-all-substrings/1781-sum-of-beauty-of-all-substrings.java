class Solution {
    public int beautySum(String s) {
        int mf=0,lf=0,count=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm=new HashMap<>();
            for(int j=i;j<s.length();j++){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j), 0)+1);
                if(hm.size()==1){
                    mf=hm.get(s.charAt(j));
                    lf=mf;
                }
                else{                 
                    mf=(hm.get(s.charAt(j))>mf)?hm.get(s.charAt(j)):mf;
                    lf=Collections.min(hm.values());  
                }
                count+=mf-lf;   
            }
        }
        return count;
    }
}