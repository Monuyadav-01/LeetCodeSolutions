class Solution {

    public boolean pal(String str){
        if(str.length() == 0 || str.length() == 1) return true;

        int s = 0;
        int e = str.length()-1;

        while(s<=e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<words.length;i++){
            if(pal(words[i])){
                sb.append(words[i]);
                break;
            }
        }
        return sb.toString();
    }
}