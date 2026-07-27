class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0 ;
        int max2 = 0 ;
        int a = 0;
        for( int i = 0 ; i < nums.length ; i++) {
            if( nums[i] > max1 ) {
                max1 = nums[i] ;
                a = i ;
            }
        }
        for( int j = 0 ; j < nums.length ; j++ ) {
            if( j !=a && nums[j] > max2 ) {
                max2 = nums[j] ;
            }
        }
        return ((max1-1)*(max2-1)) ;
    }
}