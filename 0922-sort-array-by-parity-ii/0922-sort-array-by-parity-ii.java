class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0 ;
        int j = 1 ;
        while ( j < nums.length && i < nums.length ) {
            if ( nums[i]%2==0 ) {
                i = i + 2 ;
            } else if ( nums[j]%2==1 ) {
                j = j + 2 ;
            } else {
                int swap = nums[i] ;
                nums[i] = nums[j] ;
                nums[j] = swap ;
                i = i + 2 ;
                j = j + 2 ;
            }
        }
        return  nums ;
    }
}