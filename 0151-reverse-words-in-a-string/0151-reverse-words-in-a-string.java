class Solution {
    public String reverseWords(String s) {
        int end=s.length()-1,start=0,i=s.length()-1;
        StringBuilder sb=new StringBuilder();
        
        while(i>=0){
            while(i>-1 && s.charAt(i)==' '){
                i--;
            }
            end=i;
            
            while(i>-1 && s.charAt(i)!=' '){
                i--;   
            }
            start=i;
            
            if(start<end)
                sb.append(s.substring(i+1,end+1)+" ");
        }
        
        if(sb.length() > 0) sb.setLength(sb.length() - 1);
        
        return sb.toString();
    }
}