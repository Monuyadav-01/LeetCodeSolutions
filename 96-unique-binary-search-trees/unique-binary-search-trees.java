class Solution {
    public int numTrees(int n) {
        int sum=0;
        if(n==0 || n==1) return 1;

        for(int i=1; i<=n ;i++){
          sum+=numTrees(i-1) * numTrees(n-i);
        }
        return sum;
    }
}