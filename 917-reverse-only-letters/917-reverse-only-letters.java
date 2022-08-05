class Solution {
    public String reverseOnlyLetters(String s) {
        
     //-> Bad Approach
    
     Stack<Character> stk=new Stack<>();
        
    StringBuilder stng=new StringBuilder();
        
     for(int i=0;i<s.length();i++)
     {
         if(Character.isLetter(s.charAt(i)))
         {
         stk.push(s.charAt(i));
         }
     }
        
      for(int i=0;i<s.length();i++)
     {
         if(!Character.isLetter(s.charAt(i)))
         {
            stng.append(s.charAt(i));
         }
         else
         {
            stng.append(stk.pop());
         }
     }
    
     
    
     
        
    return stng.toString();
        
     
        
    }
}