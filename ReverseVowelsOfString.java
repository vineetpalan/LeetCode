/*
------------------------------------------------------------------------------
				345. Reverse Vowels of a String
------------------------------------------------------------------------------
Write a function that takes a string as input and reverse only the vowels of a string.
---------------------------------------
Example:
---------------------------------------

Example 1:
Given s = "hello", return "holle"

Example 2:
Given s = "leetcode", return "leotcede"


Hint : Use two Pointers
------------------------------------------------------------------------------
Problem Page : https://leetcode.com/problems/reverse-vowels-of-a-string/
Discussion/Approach : https://discuss.leetcode.com/category/429/reverse-vowels-of-a-string
Run Online : http://ideone.com/pGiW0D
------------------------------------------------------------------------------
*/

import java.util.*;
import java.lang.*;
import java.io.*;


public class ReverseVowelsOfString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("leetcode = " + reverseVowels("leetcode"));
	}
	
	public static String reverseVowels(String inputString) 
    {
    	StringBuffer result = new StringBuffer(inputString);
    	
    	
    	int p1 = 0;
    	int p2 = inputString.length() - 1;
    	
    	while(p1 < p2)
    	{
    		if(!isVowel(inputString.charAt(p1)))
    		{
    			p1++;
    		}
    		if(isVowel(inputString.charAt(p1)) && isVowel(inputString.charAt(p2)))
    		{
    			char c1 = inputString.charAt(p1);
    			char c2 = inputString.charAt(p2);
    			
    			result.setCharAt(p1++,c2);
    			result.setCharAt(p2--,c1);
    		}
    		if(!isVowel(inputString.charAt(p2)))
    		{
    			p2--;
    		}
    	}
        return result.toString();
    }
    
    private static boolean isVowel(char c)
    {
        String vowels = "aeiouAEIOU";
        return (vowels.contains(""+c));
    }
}
