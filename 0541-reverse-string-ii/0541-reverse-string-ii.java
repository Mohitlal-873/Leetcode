class Solution {
    public String reverseStr(String s, int k) {
        return helper(s,k);
    }

    public String helper(String s,int k){
        if(s.length()<k){
            return new StringBuilder(s).reverse().toString(); 
        }
        if(s.length()<2*k){
            return new StringBuilder(s.substring(0,k)).reverse().toString() +s.substring(k);
        }
        String part1= new StringBuilder(s.substring(0,k)).reverse().toString();
        String part2= s.substring(k,2*k);
        String part3= helper(s.substring(2*k),k);

        return part1+part2+part3;

    }
}