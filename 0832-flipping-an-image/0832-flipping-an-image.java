class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
			for( int j=0;j<(arr.length +1)/2;j++) {
				int temp=arr[i][j]^1;
				arr[i][j]=arr[i][arr.length-j-1]^1;
				arr[i][arr.length-j-1]=temp;
			}
		}
		return arr;
    }
}