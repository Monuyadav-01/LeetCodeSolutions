class Solution {
    public void solve(int nums[],List<List<Integer>>ans,List<Integer>list , int index){
        if(index >= nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        // exclude
        solve(nums, ans , list , index+1);
        // include
        int a = nums[index];
        list.add(a);
        solve(nums , ans , list, index+1);
        list.remove(list.size() -1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(nums , ans , list, 0);
        return ans;
    }
}