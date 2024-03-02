class Solution {
    public String getHint(String secret, String guess) {
        int count =0;
        int mount = 0;
         StringBuilder ans = new StringBuilder();
        int hash[] = new int[256];

        for(int i =0;i<secret.length() ; i++){
            if(secret.charAt(i) == guess.charAt(i)){
                count++;
            }
        }

        for(int i =0;i<secret.length();i++){
            hash[secret.charAt(i)]++;
        }
        for(int i=0;i<guess.length() ; i++){
            if(hash[guess.charAt(i)] > 0){
                mount++;
                hash[guess.charAt(i)]--;
            }
        }
        mount = mount - count;
         ans.append(count).append('A').append(mount).append('B');
        
        return ans.toString();
    }
}