class Solution {
    public int firstMissingPositive(int[] arr) {
      int i=0;
      while(i<arr.length){
        int correctIndex=arr[i]-1;
        if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correctIndex]){
            swap(arr,i,correctIndex);
        }
        else{
            i++;
        }
      }
      for(int j=0;j<arr.length;j++){
        if( arr[j]!=j+1){
            return j+1;
        }
        
      }
      return arr.length+1;
    }
    static void swap(int arr[],int b ,int a){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}