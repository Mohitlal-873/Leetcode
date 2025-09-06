class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> alpha = new HashSet<>();
        for( int i=0;i<sentence.length();i++){
            alpha.add(sentence.charAt(i));
        }
        if(alpha.size()==26){
            return true;
        }
        return false;
    }
}