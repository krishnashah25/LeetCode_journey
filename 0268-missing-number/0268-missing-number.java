class Solution {
    public int missingNumber(int[] nums) {
        int nunu = nums.length ;
        int sum = 0;
        int main = 0;  
        for(int i = 1; i <= nunu ; i++){
            sum = sum + i ;
        }
        for(int i = 0 ; i < nums.length ; i++) {
            main = main + nums[i] ;
        }
        return sum - main ;
    }
}