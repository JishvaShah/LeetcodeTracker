class Solution {
    public boolean isPalindrome(String s) {
        
        //use stringbuilder when inserting new things, since its mutable.
        StringBuilder sbr = new StringBuilder();

        //convert to char array to check all the alphanumeric characters and append them.
        char[] inputString = s.toLowerCase().toCharArray();

        for(int i=0;i<inputString.length;i++){
            if ( ( inputString[i] >= 'A' && inputString[i] <= 'Z' )
                    || ( inputString[i] >= 'a' && inputString[i] <= 'z' )
                    || ( inputString[i] >= '0' && inputString[i] <= '9' ) ){
                sbr.append(inputString[i]);
            }
        }

        //two pointers to check if palindrome.
        int i=0,j=sbr.length()-1;

        while(i<=j){
            if(sbr.charAt(i)==sbr.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}