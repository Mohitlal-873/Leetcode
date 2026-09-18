class Solution {
    public int longestSubarray(int[] nums) {
       int left=0;
       int right=0;
       int maxLen=0;
       int zeroes =0;
       while(right<nums.length){
        if(nums[right]==0){
            zeroes++;
        }
        while(zeroes>1){
            if(nums[left]==0){
                zeroes--;
            }
              
                left++;
        } 
         maxLen=Math.max(maxLen,right-left);
        right++;
       }
       return maxLen;
    }
}