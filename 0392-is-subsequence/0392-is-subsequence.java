class Solution {
    public boolean isSubsequence(String s, String t) {
         if (s.length() == 0) {
            return true;
        }
        char sm[]=s.toCharArray();
        char to[]=t.toCharArray();
        int pointer = 0;
        int i=0;
        while(i<=to.length-1){
            if(sm[pointer]==to[i])
            {
                pointer++;
                if( pointer == sm.length){
                    return true;
                }
                
            }
            i++;

        }
        return false;
        
    }
}