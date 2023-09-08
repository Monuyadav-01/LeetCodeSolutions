class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int x : nums){
          map.put(x, map.getOrDefault(x,0)+1);
        }
        for(int k : map.keySet()){
          if(map.get(k)>1){
            return k;
          }
        }
        return -1;
    }
}