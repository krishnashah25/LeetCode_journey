class Solution {
    public int maxProduct(int n) {
        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        while(n != 0){
        int num = n % 10;
        if(num > large){
            secondlarge = large;
            large = num;
        }
        else if(num > secondlarge){
            secondlarge = num;
        }

        n /= 10;
        }
        return large * secondlarge;
    }
}