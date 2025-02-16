class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for( int i=0;i<accounts.length;i++){
            int maxSum=0;
            for(int j=0;j<accounts[i].length;j++){
                 maxSum += accounts[i][j];
            }
            if (maxSum>ans){
                 ans=maxSum;
            }
        }
         return ans;
}
    }
   
//     public int maximumWealth(int[][] accounts) {
//         int max=countWealth(accounts[0]);
//         for( int i=1;i<accounts.length;i++){
//             if( max<=countWealth(accounts[i]))
//             {
//                 max=countWealth(accounts[i]);
//                 return max;
//             }
//         }
//         return max;
//     }

//     static int countWealth(int []arr){
//         int sum =0;
//         for( int i =0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//         return sum;
//     }
// }