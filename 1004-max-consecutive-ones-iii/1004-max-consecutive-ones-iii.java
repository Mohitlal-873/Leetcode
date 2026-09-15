class Solution { 
    public int longestOnes(int[] nums, int k) { 
        
        int maxLen = 0; 
        int left = 0; 
        int right = 0; 
        int zeros = 0; 
 
        while(right < nums.length) { 
            
            if(nums[right] == 0) { 
                zeros++; 
            } 
            
            while(zeros > k) { 
                
                if(nums[left] == 0) { 
                    zeros--; 
                }
                
                left++;   // move left every time
            }
            
            int len = right - left + 1; 
            maxLen = Math.max(len, maxLen);
            
            right++; 
        } 
        
        return maxLen; 
    } 
}