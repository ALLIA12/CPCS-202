/*NAME : ALI HABIB
EMAIL: ALLIA1999@HOTMAIL.COM
SECTION : XA
FINAL LAB EXAM
*/




package lab_xa_1945958_ali;

import java.util.Scanner;

public class LAB_XA_1945958_ALI {

    // call this method to start playing 
    public static void playGame() {
        Scanner KEKW = new Scanner(System.in);
        int number = (int) (100 + Math.random() * (1000 - 100));  // from 100  999
        // System.out.println("Number is " + number); if you want to know the number before hand 
        System.out.print("Enter the guess number : ");
        int digitOne = (number % 10);
        boolean DigitOne = true;
        int digitTwo = ((number / 10) % 10);
        boolean DigitTwo = true;
        int digitThree = (number / 100);
        boolean DigitThree = true;
        int numberForBreaking = 0;
        int correctCounter = 0;
        int counter = 0;
        // run until the user guesses the number 
        while (true) {
            int guess = KEKW.nextInt();
            // if the users guess the 1st number correctly 
            if (guess == digitOne) {
                System.out.println("- - " + digitOne);
                if (DigitOne) {
                    numberForBreaking += digitOne;
                    correctCounter++;
                }
                DigitOne = false;
            }
            // if the user guess the 2nd number correctly 
            if (guess == digitTwo) {
                System.out.println("- " + digitTwo + " -");
                if (DigitTwo) {
                    numberForBreaking += digitTwo * 10;
                    correctCounter++;
                }
                DigitTwo = false;
            }
            // if the user guesses the 3rd numbe correctly 
            if (guess == digitThree) {
                System.out.println(digitThree + " - -");
                if (DigitThree) {
                    numberForBreaking += digitThree * 100;
                    correctCounter++;
                }
                DigitThree = false;
            }
            // if he doesn't guess anything correctly 
            if (guess != digitOne && guess != digitTwo && guess != digitThree) {
                System.out.println(guess + " is wrong!...try again");
                counter++;
            }
            // if the number is guessed 
            if (numberForBreaking == number && correctCounter == 3) {
                break;
            }
        }
        System.out.println("*** GREAT !!! YOU GUESSED THE NUMBER CORRECTLY. ");
        System.out.println("THE NUMBER WAS " + number);
        System.out.println("YOU MISSED " + counter + " TIMES");
    }

    // Call this method if you want to print the sequence 
    public static void printSequence(Scanner in) {
        while (true) {
            System.out.print("Enter a number between 1 and 6 : ");
            int number = in.nextInt();
            if (number >= 1 && number <= 6) {
                double numeratorOne = 4;
                double numeratorTwo = 6;
                double numeratorThree = numeratorTwo + numeratorOne;
                double numeratorFour = numeratorThree + numeratorTwo;
                double numeratorFive = numeratorFour + numeratorThree;
                double numeratorSix = numeratorFive + numeratorFour;
                int denominatorOne = 2;
                int denominatorTwo = 3;
                int denominatorThree = denominatorOne + denominatorTwo;
                int denominatorFour = denominatorThree + denominatorTwo;
                int denominatorFive = denominatorFour + denominatorThree;
                int denominatorSix = denominatorFive + denominatorFour;
                switch (number) {
                    case 1:
                        System.out.print("4/2! = ");
                        double case1 = (numeratorOne / factNumber(denominatorOne));
                        System.out.printf("%.3f%n", case1);
                        break;
                    case 2:
                        System.out.print("4/2! - 6/3! = ");
                        double case2 = ((numeratorOne / factNumber(denominatorOne)) - numeratorTwo / factNumber(denominatorTwo));
                        System.out.printf("%.3f%n", case2);
                        break;
                    case 3:
                        System.out.print("4/2! - 6/3! + 10/5! = ");
                        double case3 = ((numeratorOne / factNumber(denominatorOne)) - numeratorTwo / factNumber(denominatorTwo) + numeratorThree / factNumber(denominatorThree));
                        System.out.printf("%.3f%n", case3);
                        break;
                    case 4:
                        System.out.print("4/2! - 6/3! + 10/5! - 16/8! = ");
                        double case4 = ((numeratorOne / factNumber(denominatorOne)) - numeratorTwo / factNumber(denominatorTwo) + numeratorThree / factNumber(denominatorThree)
                                - numeratorFour / factNumber(denominatorFour));
                        System.out.printf("%.3f%n", case4);
                        break;
                    case 5:
                        System.out.print("4/2! - 6/3! + 10/5! - 16/8! + 26/13! = ");
                        double case5 = ((numeratorOne / factNumber(denominatorOne)) - numeratorTwo / factNumber(denominatorTwo) + numeratorThree / factNumber(denominatorThree)
                                - numeratorFour / factNumber(denominatorFour) + -numeratorFive / factNumber(denominatorFive));
                        System.out.printf("%.3f%n", case5);
                        break;
                    case 6:
                        System.out.print("4/2! - 6/3! + 10/5! - 16/8! + 26/13! - 42/21! = ");
                        double case6 = ((numeratorOne / factNumber(denominatorOne)) - (numeratorTwo / factNumber(denominatorTwo)) + (numeratorThree / factNumber(denominatorThree))
                                - (numeratorFour / factNumber(denominatorFour)) + (numeratorFive / factNumber(denominatorFive)) - (numeratorSix / factNumber(denominatorSix)));
                        System.out.printf("%.3f%n", case6);
                        break;
                }
                break;
                // if the user guesses out of the range
            } else {
                System.out.println("THE NUMBER YOU ENTERED NOT IN RANGE FROM 1 TO 6");
            }
        }
    }

    // get the factorial "!"
    public static long factNumber(int num) {
        int sum = 1;
        for (int i = num; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner KEKW = new Scanner(System.in);
        // run untill the user break out of the loop
        while (true) {
            System.out.println("1) Play game\n"
                    + "2) Print the Sequence\n"
                    + "3) Exit");
            System.out.println("");
            System.out.print("Enter your choice : ");
            int input = KEKW.nextInt();
            if (input == 1) {
                playGame();
                System.out.println("");
            } else if (input == 2) {
                printSequence(KEKW);
                System.out.println("");
            } else if (input == 3) {
                System.out.println("");
                break;
                // if he inputs out of the range 
            } else {
                System.out.println("Wrong choice! Please enter your choice again");
                System.out.println("");
            }
        }
        System.out.println("***** BYE BYE CS202 *****\n"
                + "<<< STAY AT HOME PLEASE >>>");
    }
}
