class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        max=count;
        for(int j=k;j<s.length();j++){
            if(isVowel(s.charAt(j))){
                count++;
            }
            if(isVowel(s.charAt(j-k))){
                count--;
            }
            max = Math.max(max,count);
        }
        return max;

        }

    

    public boolean isVowel(char c){
        if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}