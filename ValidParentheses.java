/*
------------------------------------------------------------------------------
				20. Valid Parentheses
------------------------------------------------------------------------------
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

---------------------------------------
Example:
---------------------------------------

1:

()[]{ = false

2:

()[]{} = true

------------------------------------------------------------------------------
Problem Page : https://leetcode.com/problems/valid-parentheses/
Discussion/Approach : https://discuss.leetcode.com/category/28/valid-parentheses
Run Online : http://ideone.com/Yac8ZF
------------------------------------------------------------------------------
*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class ValidParentheses
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		System.out.println(s + " = " + isValid(s));
	}
	
	public static boolean isValid(String s) 
    {
        Stack<Character> brackets = new Stack<Character>();
        int length = s.length();
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        
        for(char c :  s.toCharArray())
        {
            if(c == '{' || c == '(' || c == '[')
            {
                brackets.push(c);    
            }
            else
            {
                if(brackets.isEmpty())
                    return false;
                    
                if(map.get(c) != brackets.pop())
                    return false;
            }
        }
        
        return brackets.isEmpty();
    }
}
