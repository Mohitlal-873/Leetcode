class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for( int num:nums){
            if(even(num) ){
                count++;
            }
        }
        return count;
    }  
     static int digits(int num ){
            int count=0;
            while(num>0){
                num=num/10;
                count++;
            }
            return count;
        }
        static boolean even(int num){
            if( digits(num)%2==0){//it returns the count value
                return true;
            }
            return false;
        }
}