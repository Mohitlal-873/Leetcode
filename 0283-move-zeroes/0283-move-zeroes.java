class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1 && nums[0]==0){
            nums[0]=0;
        }
        for(int i=0;i<nums.length-1;i++){
          for(int j=i+1;j<nums.length;j++){
             if(nums[i]==0){
                swap(i,j,nums);
             }
             else{
                break;
             }
          }
        }
    }
    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}