class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i  :arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int ele = 0;
        for(int i =0;i<list.size() ; i++){
            ele+=list.get(i);

            if(ele > k){
                return list.size() - i;
            }
        }
        return  0;
     }
}