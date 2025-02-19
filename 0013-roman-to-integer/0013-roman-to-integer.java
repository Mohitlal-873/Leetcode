class Solution {
    public int getRoman(char ch)
    {
      switch(ch)
      {
        case 'I':return 1;
        case 'V':return 5;
        case 'X':return 10;
        case 'L':return 50;
        case 'C':return 100;
        case 'D':return 500;
        case 'M':return 1000;
        default :return 0;

      }
    }
    public int romanToInt(String s) {
        int n = s.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
          char x=s.charAt(i); 
        if(i+1<n && getRoman(x)<getRoman(s.charAt(i+1) ))
        {
            sum=sum-getRoman(x);
        }
        else
            sum=sum+getRoman(x);
        }
        return sum;
    }
}