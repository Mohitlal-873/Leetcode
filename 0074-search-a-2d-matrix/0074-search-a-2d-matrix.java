class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int startRow=0;
        int endRow=matrix.length-1;
        
        while(startRow<=endRow){
            int midRow=startRow+(endRow-startRow)/2;
            if(target>=matrix[midRow][0] && target<=matrix[midRow][matrix[0].length-1]){
                return finalSearch( matrix,target,midRow);
            }
            else if(target<matrix[midRow][0]){
                endRow=midRow-1;
            }
            else{
                startRow=midRow+1;
            }
        }
        return false;
    }
    static boolean finalSearch(int matrix[][],int target,int midRow){
       int start=0;
       int end=matrix[0].length-1;
       while(start<=end){
        int mid=start+(end-start)/2;
         if( target==matrix[midRow][mid]){
            return true;
         }
         else if(target<matrix[midRow][mid]){
            end=mid-1;
         }
         else{
            start=mid+1;
         }
       }
       return false;
    }
}