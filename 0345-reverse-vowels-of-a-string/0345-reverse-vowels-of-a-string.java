class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        char arr[]={'a','e','i','o','u','A','E','I','O','U'};
        for( int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        char ch[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !set.contains(ch[left])){
                left++;
            }
            while(left<right && !set.contains(ch[right])){
                right--;
            }
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right]=temp;
            
            left++;
            right--;
        }
        return new String(ch);
        
    }

}