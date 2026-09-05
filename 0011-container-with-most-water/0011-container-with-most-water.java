class Solution {
    public int maxArea(int[] height) {
    
    int left = 0;
    int right = height.length-1;
    int ans =0;
    while(left<right){
        int w = right-left;
        int ht = Math.min(height[left],height[right]);
        int area = ht*w;
         ans=Math.max(ans,area);
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }

    }
    return ans;
     
    }
}