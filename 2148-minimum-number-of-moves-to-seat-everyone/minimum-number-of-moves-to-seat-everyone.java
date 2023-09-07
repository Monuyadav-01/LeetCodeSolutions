class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int cnt=0;
        int n=seats.length;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<n;i++){

          if(seats[i]>students[i]){
            cnt=cnt+(seats[i]-students[i]);
          }
          else{
              cnt=cnt+(students[i]-seats[i]);
          }
          
        }
        return cnt;
    }
}