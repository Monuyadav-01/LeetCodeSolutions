class Solution {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int smallest = nums1[0] + nums2[0];
        int largest = nums1[nums1.length - 1] + nums2[nums2.length - 1];
        while(smallest < largest) {
            int midVal = smallest + (largest - smallest) / 2;
            int smallerOrEqCount = getSmallerOrEqCount(nums1, nums2, k, midVal);
            if(smallerOrEqCount == k) {
                smallest = midVal;
                break;
            } else if(smallerOrEqCount > k){
                largest = midVal;
            } else {
                smallest = midVal + 1;
            }
        }
        return generateResult(nums1, nums2, smallest, k);
    }

    public int getSmallerOrEqCount(int[] nums1, int[] nums2, int k, int val) {
        int smallerOrEqCount = 0;
        for(int i = 0; i < nums1.length && nums1[i] + nums2[0] <= val && smallerOrEqCount <= k; i ++) {
            smallerOrEqCount += firstLargerIndex(nums2, val - nums1[i]);
        }
        return smallerOrEqCount;
    }

    public int firstLargerIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start] <= target ? start + 1 : start;
    }

    public List<List<Integer>> generateResult(int[] nums1, int[] nums2, int max, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> eq = new ArrayList<>();
        // int eqCount = 0;
        for(int i = 0; i < nums1.length && k > 0; i ++) {
            for(int j = 0; j < nums2.length && (nums1[i] + nums2[j] < max) && k > 0; j ++) {
                    result.add(Arrays.asList(nums1[i], nums2[j]));
                    k --;
            }
        }
        
        for(int i = 0; i < nums1.length && k > 0; i ++) {
            for(int j = 0; j < nums2.length && (nums1[i] + nums2[j] <= max) && k > 0; j ++) {
                if(nums1[i] + nums2[j] == max) {
                    result.add(Arrays.asList(nums1[i], nums2[j]));
                    k --;
                }
            }
        }
        return result;
    }
}