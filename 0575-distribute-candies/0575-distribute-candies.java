class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqueTypes = new HashSet<>();
        for (int candy : candyType) {
            uniqueTypes.add(candy);  
        }

        int maxCanEat = candyType.length / 2;  
        int uniqueCount = uniqueTypes.size();  

        return Math.min(maxCanEat, uniqueCount);
    }
}