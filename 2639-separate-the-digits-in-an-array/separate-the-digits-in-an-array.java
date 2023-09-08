class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
       for(int i=nums.length-1;i>=0 ;i--){
         int e = nums[i];
         while(e>0){
           arr.add(e%10);
           e=e/10;
         }
       }
       int []res=new int[arr.size()];
       for(int i=0;i<res.length;i++){
         res[i]=arr.get(res.length - i -1);
       }
       return res;
    }
}