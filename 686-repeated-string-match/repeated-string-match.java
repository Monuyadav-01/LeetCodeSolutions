class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder s = new StringBuilder();
        int cnt =0;
        while(s.length() < b.length()){
            s.append(a);
            cnt++;
        }
        if(s.indexOf(b) != -1) return cnt;

        s.append(a);
        cnt++;
 if(s.indexOf(b) != -1) return cnt;

 return -1;

    }
}