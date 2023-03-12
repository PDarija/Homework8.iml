package org.example;

public class Solver {
    int a;
    int b;
    int c;
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
