/*
------------------------------------------------------------------------------
				66. Plus One
------------------------------------------------------------------------------
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

---------------------------------------
Example:
---------------------------------------
Example 1:
[1,9,9] = [2,0,0]

Example 2:
[1,2,3,4] = [1,2,3,5]

------------------------------------------------------------------------------
Problem Page : https://leetcode.com/problems/plus-one/
Run Online : http://ideone.com/rc9SUp
------------------------------------------------------------------------------
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class PlusOne
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] numbers = new int[]{1,9,9};
		System.out.println(Arrays.toString(new PlusOne().plusOne(numbers)));
	}
	
	public int[] plusOne(int[] digits) 
  {
	    int n = digits.length;
	    
        for(int i=n-1; i>=0; i--) 
        {
            if(digits[i] < 9) 
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
    
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        
        return newNumber;
    }
}
