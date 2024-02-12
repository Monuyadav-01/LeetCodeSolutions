class Solution {
    public String truncateSentence(String s, int k) {
        
        int cnt = 0;
        String ans = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                cnt++;
            }
            if (cnt == k) {
                ans = s.substring(0, i);
                break;
            }
            if (cnt < k) {
                ans = s;
            }

        }

        return ans;
    }
}