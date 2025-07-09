class Solution {
    public int missingNumber(int[] arr) {
     int i=0;
		while(i<arr.length) {
			int correctIndex=arr[i];
			if(arr[i]<arr.length && arr[i]!= arr[correctIndex]) {
				swap(arr,i,correctIndex);
			}
			else {
				i++;
			}
			
			
		}
		for( int j=0;j<arr.length;j++) {
			if( arr[j]!=j) {
				return j;
			}
			
		}
		return arr.length;
		
	}
	 
    static void swap(int arr[],int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}  
}
