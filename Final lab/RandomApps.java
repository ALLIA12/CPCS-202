package random_apps;

import java.util.Arrays;
import java.util.Scanner;

public class RandomApps {

    public static void main(String[] args) {
        Scanner KEKW = new Scanner(System.in);
        while(true)
        printSequence(KEKW);
    }

    public static long factNumber(int num) {
        int sum = 1;
        for (int i = num; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }

    public static void printSequence(Scanner in) {
        while (true) {
            System.out.print("Enter a number between 1 and 6 : ");
            int number = in.nextInt();
            if (number >= 1 && number <= 6) {
                double[] arrayuper = new double[6];
                arrayuper[0] = 4;
                arrayuper[1] = 6;
                for (int i = 2; i < arrayuper.length; i++) {
                    arrayuper[i] = arrayuper[i - 1] + arrayuper[i - 2];
                }
                int[] arraylower = new int[6];
                arraylower[0] = 2;
                arraylower[1] = 3;
                for (int i = 2; i < arrayuper.length; i++) {
                    arraylower[i] = arraylower[i - 1] + arraylower[i - 2];
                }
                double i = 1;
                double[] actual_array = new double[6];
                for (int j = 0; j < actual_array.length; j++) {
                    actual_array[j] = i * (arrayuper[j] / factNumber(arraylower[j]));
                    i *= -1;
                }
                switch (number) {
                    case 1:
                        System.out.print("4/2! = ");
                        System.out.printf("%.3f%n", actual_array[0]);
                        break;
                    case 2:
                        System.out.print("4/2! - 6/3! = ");
                        System.out.printf("%.3f%n", actual_array[0] + actual_array[1]);
                        break;
                    case 3:
                        System.out.print("4/2! - 6/3! + 10/5! = ");
                        System.out.printf("%.3f%n", actual_array[0] + actual_array[1] + actual_array[2]);
                        break;
                    case 4:
                        System.out.print("4/2! - 6/3! + 10/5! - 16/8! = ");
                        System.out.printf("%.3f%n", actual_array[0] + actual_array[1] + actual_array[2] + actual_array[3]);
                        break;
                    case 5:
                        System.out.print("4/2! - 6/3! + 10/5! - 16/8! + 26/13! = ");
                        System.out.printf("%.3f%n", actual_array[0] + actual_array[1] + actual_array[2] + actual_array[3] + actual_array[4]);
                        break;
                    case 6:
                        System.out.print("4/2! - 6/3! + 10/5! - 16/8! + 26/13! - 42/21! = ");
                        System.out.printf("%.3f%n", actual_array[0] + actual_array[1] + actual_array[2] + actual_array[3] + actual_array[4] + actual_array[5]);
                        break;
                }
                break;
                // if the user guesses out of the range
            } else {
                System.out.println("THE NUMBER YOU ENTERED NOT IN RANGE FROM 1 TO 6");
            }
        }
    }
}
