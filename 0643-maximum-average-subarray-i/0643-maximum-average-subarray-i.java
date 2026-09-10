class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        int sum=0;
       //first window
        for( int i=0;i<k;i++){
        sum+=nums[i];
        }
        double maxSum=sum;
       //next window
       for(int j=k;j<nums.length;j++ ){
        sum=sum+nums[j]-nums[j-k];
        maxSum=Math.max(sum,maxSum);
       }
       return maxSum/k;
       
        
      
    }
}