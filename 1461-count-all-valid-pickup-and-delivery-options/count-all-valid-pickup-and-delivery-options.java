class Solution {
  int mod=1000000007;
    public int countOrders(int n) {
        if(n==1) return 1;
        long ans=(n*((2*n)-1)) % mod;
        ans=ans*countOrders(n-1)%mod;
        return (int)ans;  
    }
}