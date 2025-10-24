class Solution {
    public String toLowerCase(String s) {
       StringBuilder newStr=new StringBuilder();
       for(char ch : s.toCharArray()){
         if(ch>='A' && ch<='Z'){
            newStr.append((char)(ch+32));
         }
         else{
            newStr.append(ch);
         }

       }
       return newStr.toString();
    }
}