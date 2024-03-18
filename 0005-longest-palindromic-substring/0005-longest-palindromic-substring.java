class Solution {
    public String longestPalindrome(String s) {
        int len=0,reslen=0,l=0,r=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            //odd-length i,i
            l=i;r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                len=r-l+1;
                if(len>reslen){
                    sb = new StringBuilder();
                    sb.append(s.substring(l,r+1));
                    reslen=len;
                }
                l--;
                r++;
            }
            
            //even-length i,i+1
            l=i;r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                len=r-l+1;
                if(len>reslen){
                    sb = new StringBuilder();
                    sb.append(s.substring(l,r+1));
                    reslen=len;
                }
                l--;
                r++;
            }
        }
         return sb.toString();
    }
}