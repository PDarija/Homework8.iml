package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   Calculator calculator;
//2.3
   @Before
    public void setupEachTest(){
       //run before each test
       System.out.println("Before every test");
       System.out.println("___________________");
       calculator = new Calculator();
   }
//2.2
   @Test
   public void checkCalculatorDivisionTwoPositiveNumbers() {

       double result = calculator.numberDivision( 9.33, 3.0);
       assertEquals(3.11, result, 0.001);
       assertTrue( true );
   }

   @Test
   public void checkCalculatorDivisionWithTwoNegativeNumbers() {

       double result = calculator.numberDivision(-4.5, -1.0);
       assertEquals(4.5, result, 0.001);
       assertTrue(true);
   }

    @Test
    public void checkCalculatorDivisionWithFirstNegativeNumber() {

        double result = calculator.numberDivision(-4.5, 1.0);
        assertEquals(-4.5, result, 0.001);
        assertTrue(true);
    }
    @Test
    public void checkCalculatorDivisionWithSecondNegativeNumber() {

        double result = calculator.numberDivision(4.5, -1.0);
        assertEquals(-4.5, result, 0.001);
        assertTrue(true);
    }
// 2.1
    @Test
    public void checkCalculateMultiplicationWithTwoPositiveNumbers(){

       double result = calculator.numberMultiplication(2.34, 5.65);
       assertEquals(13.221, result, 0.001);
        assertTrue(true);
    }
    @Test
    public void checkCalculateMultiplicationWithTwoNegativeNumbers(){

        double result = calculator.numberMultiplication(-2.34, -5.65);
        assertEquals(13.221, result, 0.001);
        assertTrue(true);
    }
    @Test
    public void checkCalculateMultiplicationWithFirstNegativeNumber() {

        double result = calculator.numberMultiplication(-2.34, 5.65);
        assertEquals(-13.221, result, 0.001);
        assertTrue(true);
    }

    @Test
    public void checkCalculateMultiplicationWithSecondNegativeNumber() {

        double result = calculator.numberMultiplication(2.34, -5.65);
        assertEquals(-13.221, result, 0.001);
        assertTrue(true);
    }




}

