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
        //either we can use most optimise way in java 
        // return (int)(Math.log10(num)+1);
        //this line of code can give cont of digits
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