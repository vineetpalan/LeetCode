

/*
------------------------------------------------------------------------------
				246.	Strobogrammatic Number
------------------------------------------------------------------------------
A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
Write a function to determine if a number is strobogrammatic. The number is represented as a string.
For example, the numbers "69", "88", and "818" are all strobogrammatic.

---------------------------------------
Example:
---------------------------------------
6 0 0 9, return True
66 000 99, return True;
6969 return true; 
6996, return true;

The key of the problem is to understand what is called "strobogrammatic number".
As defined, the number 0, 1 and 8 are strobogrammatic. However, 6 and 9 are kind of special.

------------------------------------------------------------------------------
Problem Page : https://leetcode.com/problems/strobogrammatic-number/
Discussion/Approach : https://discuss.leetcode.com/category/307/strobogrammatic-number
Run Online : http://ideone.com/ceNSfV
------------------------------------------------------------------------------
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class StrobogrammaticNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String intputString = in.next();
		System.out.println(isStrobogrammatic(intputString));
	}
	
	public static boolean isStrobogrammatic(String num) 
	{
        if(num == null || num.length() == 0) 
        {
            return true;
        }
         
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
         
        int lo = 0;
        int hi = num.length() - 1;
         
        while (lo <= hi) 
        {
            char c1 = num.charAt(lo);
            char c2 = num.charAt(hi);
             
            if (!map.containsKey(c1) || map.get(c1) != c2) {
                return false;
            }
             
            lo++;
            hi--;
        }
         
        return true;
    }
}
