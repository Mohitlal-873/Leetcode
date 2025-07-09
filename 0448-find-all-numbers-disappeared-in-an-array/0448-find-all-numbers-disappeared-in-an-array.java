class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
      int i=0;
	        while(i<arr.length){
	            int correctIndex=arr[i]-1;
	            if(arr[i]!=arr[correctIndex]){
	                swap(arr,i,correctIndex);
	            }
                else{
                    i++;
                }
	        }
	        List<Integer> list =new ArrayList<Integer>();
	        for( int j=0;j<arr.length;j++){
	            if( arr[j] != j+1){
	                list.add(j+1);
	            }
	        }
	        return list;
	    }
	    static void swap(int arr[],int index1,int index2){
	        int temp=arr[index1];
	        arr[index1]=arr[index2];
	        arr[index2]=temp;
	    }
	  
    
}