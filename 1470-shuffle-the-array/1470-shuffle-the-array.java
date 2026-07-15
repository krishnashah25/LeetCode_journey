class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0 ;
        int j = nums.length/2 ;
        int k = 0 ;
        int arr[] = new int[nums.length] ; 
        while ( i <= nums.length/2 && j < nums.length && k < nums.length ) {
            if( k%2==0 ) {
                arr[k] = nums[i] ;
                i++ ;
                k++ ;
            } else if ( k%2==1 ) {
                arr[k] = nums[j] ;
                j++;
                k++;
            }
        }
        return arr ;
    }
}