class Solution {
    public String reverseOnlyLetters(String s) {
        
      StringBuilder reversed_string=new StringBuilder();
      int j=s.length()-1;
        
      for(int i=0;i<s.length();i++)
      {
          if(Character.isLetter(s.charAt(i)))
          {
              while(!Character.isLetter(s.charAt(j)))
              {
                  j--;
              }
              reversed_string.append(s.charAt(j));
              j--;
              
          }
          else
          {
              reversed_string.append(s.charAt(i));
          }
      }
        
      return reversed_string.toString();
        
    }
}