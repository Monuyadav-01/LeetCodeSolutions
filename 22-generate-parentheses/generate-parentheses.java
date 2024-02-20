class Solution{
    public void back(int open , int close ,  int max , String str , List<String> list){
        if(str.length() == max * 2){
            list.add(str);
            return;
        }
        if(open < max){
            back(open + 1 , close , max , str+"(" , list);
        }
        if(close < open){
            back(open , close +1,max  , str+")" , list);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        back(0, 0 , n, "" ,ans);
        return ans;
    }
}