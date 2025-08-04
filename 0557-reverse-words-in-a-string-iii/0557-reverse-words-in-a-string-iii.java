class Solution {
    public  String reverseWords(String s) {
	        //converting a sentence to a word array by spliting by  space.
	        String[] strArr = s.split(" ");
	        // for storing the result.
	        StringBuilder result = new StringBuilder();
	        
	        
	        for( int i=0;i<strArr.length;i++){
	        //passing the each word via strArr[i]; after swaping the result stores in string builder.
	            result.append(swap(strArr[i]));
	            //just for adding a space 
	           if(i!=strArr.length-1){
	            result.append(" ");
               }
	            
	        }
	        return result.toString();
			
	    }
	 static String swap(String str) {
		 // converting the word into char array that had passed by the reverseWord method.
         char[] arr=str.toCharArray()	;	  
		 
		 int start=0;
		 int end=arr.length-1;
		 
		 while(start<end) {
			 
			 char temp=arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 
			 start++;
			 end--;
		 }
		 
	
		 
		 return new String(arr);
		 
	 }
}