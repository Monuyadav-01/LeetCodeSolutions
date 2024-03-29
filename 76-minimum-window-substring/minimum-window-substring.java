class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map =new HashMap<>();
        for(char ch: t.toCharArray()){
          map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int cnt = map.size();
        int j = 0;
        int i =0;
        int st= 0;
        int e= 0;
        int min = Integer.MAX_VALUE;

        while(j<s.length()){
          char ch = s.charAt(j);
          if(map.containsKey(ch)){
            map.put(ch ,map.get(ch)-1);
            if(map.get(ch)== 0){
              cnt--;
            }
          }
       if(cnt > 0){
            j++;
          }

          else if(cnt == 0){
            while(cnt == 0){
           if(j-i+1 < min){
             min = j-i+1;

             st = i;
             e = j+1;
           }

           char c = s.charAt(i);
           if(map.containsKey(c)){
             map.put(c, map.get(c)+1);
             if(map.get(c) ==1){
               cnt++;
             }
           }
          i++;
     
          }
          j++;
          }
        }
        return s.substring(st,e);
    }
}

// class Solution {
//     public String minWindow(String s, String t) {
//         Map<Character,Integer> map = new HashMap<>();
//         for(char ch:t.toCharArray()){
//           map.put(ch,map.getOrDefault(ch,0)+1);
//         }
//         int min = Integer.MAX_VALUE;
//         int i=0,j=0,st=0,e=0;
//         int count = map.size();
        
//         while(j<s.length()){
//           char ch = s.charAt(j);
//           if(map.containsKey(ch)){
//             map.put(ch,map.get(ch)-1);
//             if(map.get(ch)==0){
//               count--;
//             }
//           }
//           if(count>0){
//             j++;
//           }
//           else if(count==0){
              
//             while(count==0){
//               if(j-i+1 < min){
//                 min = j-i+1;
                
//                 st = i;
//                 e = j+1;
//               }
//               char c = s.charAt(i);
//               if(map.containsKey(c)){
//                 map.put(c,map.get(c)+1);
//                 if(map.get(c)==1){
//                   count++;
//                 }
//               }
              
//               i++;
//             }
            
//             j++;
//           }
//     }
        
//         return  s.substring(st,e);
//     }
// }