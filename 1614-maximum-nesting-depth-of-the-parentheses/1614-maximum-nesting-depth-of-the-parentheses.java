class Solution {
    public int maxDepth(String s) {
        int count=0, depth=Integer.MIN_VALUE;
        boolean flag=false;
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){            
            if ((s.charAt(i)=='(')){
                count++;
            }
            else if ((s.charAt(i)==')')){
                count--;
                if(count+1>depth)
                    depth=count+1;
            }    
        }
        return depth==Integer.MIN_VALUE?0:depth;
    }
}