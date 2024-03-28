class Solution {
    public void sortColors(int[] nums) {
        int cntone = 0;
        int cnttwo = 0;
        int cntzero = 0;

        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0) cntzero++;
            else if(nums[i] == 1) cntone++;
            else if(nums[i] == 2) cnttwo++;
        }

        int i =0;
        while(cntzero != 0){
            nums[i] = 0;
            cntzero--;
            i++;
        }
        while(cntone != 0){
            nums[i]  = 1;
            cntone--;
            i++;
        }
        while(cnttwo != 0){
            nums[i] = 2;
            cnttwo--;
            i++;
        }
    }
}