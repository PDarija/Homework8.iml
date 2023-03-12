package org.example;

public class Solver {

    double d;

    public double resultOfDiscriminant(int a, int b, int c) {
        int result;
        d = b * b - 4 * a * c;
        if (d < 0) {
            result = 0;
        }
        else if (d == 0) {
            result = 1;
        }
        else  {
            result = 2;
        }
        return result;
    }



}
