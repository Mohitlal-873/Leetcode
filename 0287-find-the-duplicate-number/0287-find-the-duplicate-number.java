class Solution {
    public int findDuplicate(int[] nums) {
    //    for( int i =0;i<nums.length-1;i++){
    //      for(int j=i+1;j<nums.length;j++){
    //         if( nums[i]==nums[j]){
    //              return nums[i];
    //         }
           
    //      }
    //    }
    //    return 0;
     HashSet<Integer> set = new HashSet<>();
     for( int num:nums){
        if(set.contains(num)){
            return num;
        }
        else{
            set.add(num);
        }
     }
     return -1;
    }
}