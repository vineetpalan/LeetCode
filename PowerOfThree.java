/*

------------------------------------------------------------------------------
				326. Power of Three
------------------------------------------------------------------------------

Given an integer, write a function to determine if it is a power of three. 

---------------------------------------
Example:
---------------------------------------

n = 729
true

n = 36
false

------------------------------------------------------------------------------
Problem Page : https://leetcode.com/problems/power-of-three/
Discussion/Approach : https://leetcode.com/articles/power-of-three/
Run Online : http://ideone.com/EziIgW
------------------------------------------------------------------------------

*/
import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Method 1 = " + isPowerOfThreeUsingIteration(729));
		
		System.out.println("Method 2 = " + isPowerOfThreeUsingString(729));
		
		System.out.println("Method 3 = " + isPowerOfThreeUsingMathematics(729));
		
		System.out.println("Method 4 = " + isPowerOfThreeUsingIntegerLimitations(729));
	}
    
    public static boolean isPowerOfThreeUsingIteration(int n) 
    {
        if (n < 1) 
        {
            return false;
        }

        while (n % 3 == 0) 
        {
            n = n / 3;
        }

        return (1 == n);
    }
    
    public static boolean isPowerOfThreeUsingString(int n) 
    {
        // https://leetcode.com/articles/power-of-three/#approach-2-base-conversion-accepted
        return Integer.toString(n, 3).matches("^10*$");
    }
    
    public static boolean isPowerOfThreeUsingMathematics(int n) 
    {
        // https://leetcode.com/articles/power-of-three/#approach-3-mathematics-accepted
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
    
    public static boolean isPowerOfThreeUsingIntegerLimitations(int n) 
    {
        // https://leetcode.com/articles/power-of-three/#approach-4-integer-limitations-accepted
        return n > 0 && 1162261467 % n == 0;
    }
}
