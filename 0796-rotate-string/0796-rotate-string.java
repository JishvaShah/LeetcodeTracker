class Solution {
    public static boolean isValid(int index, String s, String goal){
        StringBuilder sb1=new StringBuilder();
        return sb1.append(s.substring(index, s.length())+s.substring(0, index)).toString().equals(goal);
    }
    
    public boolean rotateString(String s, String goal) {
        
        for(int i=0;i<s.length();i++){
            if(isValid(i,s,goal)) return true;
        }
        return false;    
    }
}