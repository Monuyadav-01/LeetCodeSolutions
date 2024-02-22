class Solution {
    public int maximumBags(int[] cap, int[] r, int ar) {
        int arr[] = new int [r.length];
        for(int i =0;i<r.length;i++){
            arr[i] = cap[i] - r[i];
        }
        Arrays.sort(arr);
        int ans =0;
        for(int i =0;i<arr.length;i++){
                if(ar >=arr[i]){
                    ar  = ar-arr[i];
                    ans++;
                }
                else {
                    break;
                }
        }
        return ans;
    }
}