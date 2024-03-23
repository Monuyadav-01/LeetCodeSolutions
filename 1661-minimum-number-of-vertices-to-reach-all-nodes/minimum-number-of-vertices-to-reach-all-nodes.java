class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> list = new ArrayList<>();
        boolean[]visited = new boolean[n];
        for(List<Integer> e : edges){
            visited[e.get(1)] = true;
        }

        for(int i =0 ;i<n ; i++){
            if(visited[i] == false) list.add(i);
        }
        return list;
    }
}