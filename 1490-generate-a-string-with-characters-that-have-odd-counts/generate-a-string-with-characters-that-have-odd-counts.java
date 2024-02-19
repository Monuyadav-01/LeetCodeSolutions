class Solution {
    public String generateTheString(int n) {
        
StringBuilder s = new StringBuilder();

    if(n%2==0){
        s.append("t".repeat(n-1));
        s.append("e");
}else{
        s.append("t".repeat(n));
}

return s.toString();


    }
}