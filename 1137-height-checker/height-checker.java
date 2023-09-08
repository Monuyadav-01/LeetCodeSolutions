class Solution {
    public int heightChecker(int[] heights) {
        int n =heights.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
          arr.add(heights[i]);
        }
        Collections.sort(arr);
        int cnt=0;
        for(int i=0; i<n ;i++){
          if(arr.get(i) != heights[i]){
            cnt++;
          }
        }
        return cnt;
    }
}