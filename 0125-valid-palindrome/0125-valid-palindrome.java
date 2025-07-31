class Solution {
    public boolean isPalindrome(String s) {
        
      String str=s.replaceAll("[,.:;!?@#$%^&*()\\[\\]{}<>\"'`~_|+=\\-/\\\\ ]","").toLowerCase();
        int start=0;
        int end=str.length()-1;

        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
     

    }
}