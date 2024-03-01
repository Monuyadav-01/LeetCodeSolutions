class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt =0;
        int n = s.length();
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '1'){
                cnt++;
            }
        }
        if(cnt == 0) return s;

        StringBuilder sb = new StringBuilder();

        for(int i = 1;i<cnt ; i++){
            sb.append('1');
        }
        for(int  i = cnt; i<n;i++){
            sb.append('0');
        }
        sb.append('1');

        return sb.toString();
    }
}