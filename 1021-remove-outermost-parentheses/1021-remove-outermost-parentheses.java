class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
            else count--;
            
            if((count==1 && s.charAt(i)=='(') || (count==0 && s.charAt(i)==')')) continue;
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}