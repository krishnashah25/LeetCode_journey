class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1 ;
        int right = arr.length - 2 ;
        while( left <= right ) {
            int med = ( left + right ) / 2 ;
            if ( arr[med] > arr[med-1] && arr[med] > arr[med+1] ) return med ; 
            else if ( arr[med] > arr[med-1] && arr[med] < arr[med+1] ) left = med + 1 ; 
            else right = med - 1 ;
        }
        return 0 ;
    }
}