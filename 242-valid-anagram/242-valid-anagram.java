class Solution {
    public boolean isAnagram(String s, String t) {
        
        //-> Better Solution is to use 3 for loops rather than sorting so time complexity O(n)
        
        if(s.length()!=t.length())
        {
            return false;
        }
        
        char[] alpha= new char[26];
        
        for(char a: s.toCharArray())
        {
            alpha[a-'a']++;
            
        }
        for(char a: t.toCharArray())
        {
            alpha[a-'a']--;
            
        }
        for(int count: alpha)
        {
            if(count!=0)
            {
                return false;
            }
        }
        
        return true;
        
        
           
        
    }
}