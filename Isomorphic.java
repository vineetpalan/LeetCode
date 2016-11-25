/*
https://leetcode.com/problems/isomorphic-strings/

Using HashMap store the mapping relations

For example :

egg -> add
charAt(1): g->d
charAt(2): g->d
True

ab -> aa
False

Time Complexity: O(n);
Space Complexity: O(n);
*/


public class Isomorphic 
{
    public boolean isIsomorphic(String s, String t) 
    {
        int length = s.length();
        
        if (length!=t.length())
            return false;
            
        Map<Character,Character> map = new HashMap<Character,Character>();   
        
        char c1,c2;
        
        for(int i=0;i<length;i++)
        {
            c1 = s.charAt(i);
            c2 = t.charAt(i);
            
            if(map.containsKey(c1) )
            {
                if(map.get(c1) != c2)
                    return false;
            }
            else
            {
                if(map.containsValue(c2))
                    return false;
                    
                map.put(c1,c2);
            }
        }
        
        return true;
    }
}