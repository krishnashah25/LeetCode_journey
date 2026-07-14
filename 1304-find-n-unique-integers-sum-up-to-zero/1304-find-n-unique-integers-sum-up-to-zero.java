class Solution {
    public int[] sumZero(int n) {
        int i = 0 ;
        int j = n - 1 ;
        int x = 1 ;
        int y = -1 ;
        int arr[] = new int[n] ;
        while ( i < j ) {
            if ( n%2==0 ) {
                arr[i] = y ;
                arr[j] = x ;
                x++ ;
                y-- ;
                i++ ;
                j-- ;
            } else if ( n%2==1 && i!=n/2 && j!=n/2 ) {
                arr[n/2] = 0 ;
                arr[i] = y ;
                arr[j] = x ;
                x++ ;
                y-- ;
                i++ ;
                j-- ;
            }
        }
        return arr ;
    }
}