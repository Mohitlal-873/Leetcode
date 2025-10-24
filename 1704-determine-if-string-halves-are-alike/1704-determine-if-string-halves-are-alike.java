class Solution {
    public boolean halvesAreAlike(String s) {
        String str = s.toLowerCase();
        char vowel[]={'a','e','i','o','u'};
        HashSet <Character> set = new HashSet<>();
        for(char ch : vowel){
            set.add(ch);
        }

        String substr1=str.substring(0,(str.length()/2)-1);
        String substr2=str.substring(str.length()/2,str.length()-1);
        int count1=0;
        int count2=0;

        for(char ch1 :substr1.toCharArray()){
            if(set.contains(ch1)){
                count1++;
            }
        }
        
        for(char ch2 : substr2.toCharArray()){
            if(set.contains(ch2)){
                count2++;
            }
        }
        return count1==count2;


    }
}