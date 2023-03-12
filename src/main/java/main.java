import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {

//        Exercise number 3
        int number = 7;
        int result = 105;
        int power = 1;
        while (true) {
            result = result - number;
            System.out.println("Число " + power + " = " + result);
            power++;
            if (power > 14)
                break;
        }


        //        Exercise number 4
        int[] arithmeticAverage = new int[20];
        Random rd = new Random();
        int sum = 0;

        for (int i = 1; i < arithmeticAverage.length; i++) {
            arithmeticAverage[i] = rd.nextInt();
            sum = sum + arithmeticAverage[i];
            int average = sum / arithmeticAverage.length;
            System.out.println("Massive average = " + average);
        }

        //        Exercise number 5
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rd.nextInt();
            System.out.println(myArray[i]);
        }

        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
                System.out.println("Max volume of massive = " + max);
            }
        }
        int min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > min) {
                min = myArray[i];
                System.out.println("Min volume of massive = " + min);
            }
        }

    }



}

