class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int s=0;
        int e=n-1;
        Arrays.sort(citations);
        while(s<=e){
          int mid=(s+e)/2;
          if(citations[mid] == n-mid) return citations[mid];
          else if(citations[mid]>n-mid) e=mid-1;
          else s=mid+1;
        }
        return n-s;
    }
}