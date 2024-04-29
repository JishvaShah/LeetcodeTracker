class Solution {
    
    static void helper(int i, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ls){
        if(i==candidates.length){
            if(target==0) ans.add(new ArrayList<>(ls));
            return;
        }
        if(candidates[i]<=target){
            ls.add(candidates[i]);
            helper(i, candidates, target-candidates[i], ans, ls);    
            ls.remove(ls.size()-1);   
        }
        helper(i+1, candidates, target, ans, ls);    
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}