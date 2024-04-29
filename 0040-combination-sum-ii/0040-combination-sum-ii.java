class Solution {
    public static void helper(int i, int[] candidates, int target, List<Integer> ls, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ls));
            return;  
        } 
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1]) continue;
            if(candidates[j]>target) break;
            
            ls.add(candidates[j]);
            helper(j+1,candidates,target-candidates[j],ls,ans);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}