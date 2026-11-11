class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length ;
        int i = 0 ;
        if( n == 1 ) return nums[0];
        while ( i < n ){
            if ( i != n-1 && nums[i] == nums[i+1] ) {
                i += 2 ;
            } else {
                return nums[i] ;
            }
        }
        return -1 ;
    }
}