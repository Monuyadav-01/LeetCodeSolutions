class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<Character>((a,b) -> map.get(b) - map.get(a));

        // we add all the character in a priority queue

        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char c = pq.remove();
            for(int i =0;i<map.get(c) ;i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}