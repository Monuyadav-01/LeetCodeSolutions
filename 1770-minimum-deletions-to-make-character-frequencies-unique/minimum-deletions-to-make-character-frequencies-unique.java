class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        char ch[] =s.toCharArray();
        for(int i=0; i<ch.length;i++){
          map.put(ch[i], map.getOrDefault(ch[i],0)+1);
        }
        Set<Integer> set=new HashSet<>();
        int cnt=0;
        for(char c : map.keySet()){
          int freq=map.get(c);
          if(!set.contains(freq)) set.add(freq);
          else{
            while(freq>0 && set.contains(freq)){
              freq--;
              cnt++;
            }
            if(freq>0) set.add(freq);
          }
        }
        return cnt;
    }
}