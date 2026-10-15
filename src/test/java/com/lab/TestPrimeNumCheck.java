package com.lab;


import junit.framework.TestCase;
// Declare import statement to accept Assertions

public class TestPrimeNumCheck extends TestCase {
    PrimeNumCheck pNC = new PrimeNumCheck();
    public void testReturnsTrueForPrimeNumbers() {
        
        assertEquals(false, pNC.isPrime(2));
        assertEquals(true, pNC.isPrime(13));   
    }

    public void testReturnsFalseForCompositeNumbers() {
        assertEquals(false, pNC.isPrime(4));
        assertEquals(false, pNC.isPrime(21));
    }

    public void testReturnsFalseForNumbersLessThanTwo() {
        assertEquals(false, pNC.isPrime(-7));
        assertEquals(false, pNC.isPrime(0));
        assertEquals(false, pNC.isPrime(1));
    }
}
