class Solution {
    public int removeDuplicates(int[] nums) {
        if ( nums.length == 0 ) {
            return 0 ;
        }
        int j = 0 ;
        for (int i = 1; i < nums.length; i++) {
            if ( nums[i-1] != nums[i] ) {
                nums[j] = nums[i-1] ;
                j++ ;
            }
        }
        nums[j] = nums[nums.length-1];
        j++ ;
        return j ;
    }
}