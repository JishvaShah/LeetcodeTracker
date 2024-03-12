class Solution {
    public int maxDepth(String s) {
        int count=0, depth=Integer.MIN_VALUE;
        boolean flag=false;
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){            
            if ((s.charAt(i)=='(')){
                count++;
                if(count>=1) flag=false;
            }
            else if ((s.charAt(i)==')')){
                count--;
                if(count>=0 && !flag)
                    if(count+1>depth) depth=count+1;
                    flag=true;
            }    
        }
        return depth==Integer.MIN_VALUE?0:depth;
    }
}