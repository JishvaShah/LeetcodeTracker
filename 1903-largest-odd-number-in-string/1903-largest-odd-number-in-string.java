class Solution {
    public String largestOddNumber(String num) {
        
           if (num.charAt(num.length() - 1) % 2 != 0)
                return num;

            int end=-1;
            for (int i = num.length()-1; i>=0; i--) {
                if (num.charAt(i) % 2 != 0) {
                    end=i;
                    break;
                }
            }
            return end == -1 ? "" : num.substring(0, end + 1);
    }
}