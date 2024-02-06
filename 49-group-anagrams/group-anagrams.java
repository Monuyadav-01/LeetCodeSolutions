class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length ==0 || strs == null) return new ArrayList<>();
        Map<String , List<String>> map = new HashMap<>();
        for(String s  :strs){
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String save = String.valueOf(c);
            if(!map.containsKey(save))
                map.put(save , new ArrayList<>());
            map.get(save).add(s);
            

        }

        return new ArrayList<>(map.values());
    }
}