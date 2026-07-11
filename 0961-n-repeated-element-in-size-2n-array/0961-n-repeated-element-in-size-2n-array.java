class Solution {
    public int repeatedNTimes(int[] nums) {
        int i = 0 ;
        int n = nums.length ;
        while( i < n ) {
            if(nums[i] == nums[i+1] || nums[i] == nums[i+2] || nums[i] == nums[n-1]) {
                return nums[i] ;
            } else {
                i++ ;
            }
        }
        return -1 ;
    }
}