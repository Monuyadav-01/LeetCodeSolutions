class Solution {
    public int pivotInteger(int n) {
        int left =1;
        int right = n;
        int totalSum = n*(n+1)/2;
        // binarysearch 
        while(left < right){
            int mid = (left + right)/2;
            if(mid * mid  - totalSum < 0){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        if(left  * left  - totalSum == 0){
            return left;
        }
        else{
            return -1;
        }
    }
}