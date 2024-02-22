class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // int [] arr = new int [arr1.length];
        Map<Integer,Integer> map = new TreeMap<>();
        for(Integer i : arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count =0;
        for(Integer i : arr2){
            for(int j=0;j<map.get(i);j++){
                arr1[count++]=i;
            }
            map.remove(i);
        }
        // System.out.println(map);
        // System.out.println(Arrays.toString(arr1));
        
        for(Integer i : map.keySet()){
            for(int j=0;j<map.get(i);j++){
                arr1[count++]=i;
            }
        }
        return arr1;
           
    }
}