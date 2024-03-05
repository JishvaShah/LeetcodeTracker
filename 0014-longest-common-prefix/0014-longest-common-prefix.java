class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String str1=strs[0];
        
        for(int i=1;i<strs.length;i++){
            
            int p=0,q=0;
            String str2=strs[i];
            
            while(p<str1.length() && q<str2.length()){
                if(str1.charAt(p)==str2.charAt(q)){
                    p++;q++;
                }
                else{
                    break;
                }
            }
            str1=(p==0)?"":str1.substring(0,p);
        }
        
        return str1;
    }
}