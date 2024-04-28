class Solution {
    public void allSubsets(int i, List<Integer> ls, List<List<Integer>> ans, int[] nums){
        if(i==nums.length){
            ans.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[i]);
        allSubsets(i+1, ls, ans, nums);
        ls.remove(ls.size()-1);
        allSubsets(i+1, ls, ans, nums);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ansList = new ArrayList<>();
        allSubsets(0,list, ansList, nums);
        return ansList;
    }
}