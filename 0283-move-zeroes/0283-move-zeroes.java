class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1 && nums[0]==0){
            nums[0]=0;
        }
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                swap(left,right,nums);
                left++;
            }

        }
       
        }
    
    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}