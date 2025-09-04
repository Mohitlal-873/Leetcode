class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result =new ArrayList<>();
        int maxCandy=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxCandy){
                maxCandy=candies[i];
            }
            
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxCandy){
              result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}