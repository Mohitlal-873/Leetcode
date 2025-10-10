class Solution {
    public String interpret(String command) {
       String goalParser=command.replace("()","o").replace("(al)","al");
       return goalParser;
    }
}