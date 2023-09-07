class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int n=nums.length;
        int b=nums[n-1];

        return gcd(a,b);
    }
    public int gcd(int a, int b){
      if(a>b){
        int temp=a;
        a=b;
        b=temp;
      }
      if(b%a==0) return a;
      return gcd(a,b%a);
    }
}