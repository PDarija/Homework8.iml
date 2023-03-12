package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolverTest {
    Solver solver;

    @Before
    public void eachTest() {
        //run before each test
        System.out.println("Before every test");
        System.out.println("___________________");
        solver = new Solver();
    }

    //2.2
    @Test
    public void checkCalculatorOfDiscriminantPositive() {

        double result = solver.resultOfDiscriminant(5, 6, 1);
        assertEquals(2.0, result, 0.001);

    }
    @Test
    public void checkCalculatorOfDiscriminantNegative() {

        double result = solver.resultOfDiscriminant(5, 6, 7);
        assertEquals(0, result, 0.001);

    }
    @Test
    public void checkCalculatorOfDiscriminantZero() {

        double result = solver.resultOfDiscriminant(9, 6, 1);
        assertEquals(1, result, 0.001);

    }

}

