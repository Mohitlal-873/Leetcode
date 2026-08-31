class Solution {
    public int compress(char[] chars) {
     int i = 0;
     int write =0;
     while(i<chars.length){
        int j=i;
        while(j<chars.length && chars[j]==chars[i]  ){
            j++;
        }
        int count = j-i;
        chars[write]=chars[i];
        write++;
        if(count>1){
            String countStr = String.valueOf(count);
            for(char c : countStr.toCharArray()){
                chars[write] = c;
                write++;
            }
        }
       i=j;

     }
     return write;
    }
}