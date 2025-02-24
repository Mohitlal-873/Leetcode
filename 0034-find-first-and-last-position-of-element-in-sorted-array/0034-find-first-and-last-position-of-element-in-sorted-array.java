class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        boolean wantStart;
        int startIndex=search(nums,target,wantStart=true);
        int endIndex=search(nums,target,wantStart=false);
        ans[0]=startIndex;
        ans[1]=endIndex;
        return ans;
    }
    static int search(int []nums,int target, boolean wantStart){
        int ans=-1;
        
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }
            else if( target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if( wantStart){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}