package com.Day3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import training.Palindrome;

public class PalindromeTest {
@Test
    public void testPalindrome() 
{
    Palindrome palin=new Palindrome(); 
    assertTrue(palin.isPalindrome(121));
    assertFalse(palin.isPalindrome(213));
    
}
}
