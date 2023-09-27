class Solution {
    public String decodeAtIndex(String s, int k) {
        long decodeLen =0;
        for(char ch : s.toCharArray()){
          if(Character.isDigit(ch)){
            decodeLen*=(ch-'0');
          }
          else{
            decodeLen++;
          }
        }
        for(int i =s.length()-1;i>=0;i--){
          char ch = s.charAt(i);
          if(Character.isDigit(ch)){
            decodeLen/=(ch-'0');
            k%=decodeLen;
          }
          else{
            if(k==0 || decodeLen == k){
              return String.valueOf(ch);
            }
            decodeLen--;
          }
        }
return "";
    }
}