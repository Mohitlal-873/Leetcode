class Solution {
    public int missingNumber(int[] nums) {
        //using cyclic sort
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,correct,i);
            }
            else
            i++;
        }
        for(int index=0;index<nums.length;index++){
            if(index!=nums[index]){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int arr[],int a,int b)
{
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}
}