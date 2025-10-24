class Solution {
    public boolean halvesAreAlike(String s) {
        String vowel="aeiouAEIOU";
         int counta=0;
         int countb=0;
        for( int i =0;i<s.length()/2;i++){
            if(vowel.indexOf(s.charAt(i))!=-1){
                counta++;
            }
            if(vowel.indexOf(s.charAt((s.length()/2)+i))!=-1){
                countb++;
            }
        }
        
        return counta==countb;

    }
}