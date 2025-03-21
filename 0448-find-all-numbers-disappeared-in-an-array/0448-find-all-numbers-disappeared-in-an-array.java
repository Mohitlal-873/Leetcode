class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
              swap(arr,correct,i);
            }
            else{
                i++;
            }
        }
        List<Integer> list =new ArrayList();
      for (int index=0;index<arr.length;index++){
          if(arr[index]!=index+1){
             list.add(index+1);
          }
      }
      return list;
    }

    static void swap(int arr[],int a ,int b){
        int temo=arr[a];
        arr[a]=arr[b];
        arr[b]=temo;
    }
}