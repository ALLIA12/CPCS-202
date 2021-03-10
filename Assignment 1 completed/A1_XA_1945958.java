/* Name : Ali Habibullah Meraj Mohammed
   Student ID : 1945958
   Course number : CPCS 202
   Section number : XA
   Assignment number : 1 
   EMAIL : ALLLIA1999@HOTMAIL.COM
 */
package a1_xa_1945958;

import java.util.Scanner;

/**
 *
 * @author ALLLI
 */
public class A1_XA_1945958 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Balance, Withdraw, rate, service_fee, new_balance, Original_withdraw;
        int five_hundreds, one_hundreds, fifties, tens, fives, ones, notes;
        Scanner input = new Scanner(System.in);
        System.out.println("--------- Welcome to Bank Al-Badr ---------");
        System.out.println("");
        System.out.print("Please enter your currect balance (in SAR) : ");
        Balance = input.nextDouble();
        System.out.print("Please enter the amount to withdraw (in SAR): ");
        Withdraw = input.nextDouble();
        Original_withdraw = Withdraw;
        Withdraw = (int) Withdraw;
        if (Withdraw > 5000) {
            System.out.println("Sorry, amount exceeds maximum daily limit! ");
            System.exit(0);
        } else {
            if (Withdraw > 2500) {
                rate = 3.05 / 100;// 3.05%
            } else {
                rate = 2.45 / 100; // 2.45%
            }
            service_fee = rate * Withdraw;
            new_balance = ((Balance - Withdraw - service_fee));
            if (service_fee + Withdraw >= Balance) {
                System.out.println("Sorry, insufficient funds! ");
                System.exit(0);
            } else {
                five_hundreds = (int) (Withdraw / 500);
                Withdraw = Withdraw % 500;
                one_hundreds = (int) (Withdraw / 100);
                Withdraw = Withdraw % 100;
                fifties = (int) (Withdraw / 50);
                Withdraw = Withdraw % 50;
                tens = (int) (Withdraw / 10);
                Withdraw = Withdraw % 10;
                fives = (int) (Withdraw / 5);
                Withdraw = Withdraw % 5;
                ones = (int) Withdraw;
                notes = ones + fives + tens + fifties + one_hundreds + five_hundreds;
                if (notes > 20.0) {
                    System.out.println("Sorry, cannot dispense amount!");
                    System.exit(0);
                } else {

                    System.out.print("Transaction successful. Your new balance is SAR  ");
                    System.out.printf("%.2f%n", new_balance);
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Details of notes dispensed");
                    System.out.print("                  500 X " + five_hundreds + "=");
                    System.out.printf("%5d%n", 500 * five_hundreds);
                    System.out.print("                  100 X " + one_hundreds + "=");
                    System.out.printf("%5d%n", 100 * one_hundreds);
                    System.out.print("                   50 X " + fifties + "=");
                    System.out.printf("%5d%n", 50 * fifties);
                    System.out.print("                   10 X " + tens + "=");
                    System.out.printf("%5d%n", 10 * tens);
                    System.out.print("                    5 X " + fives + "=");
                    System.out.printf("%5d%n", 5 * fives);
                    System.out.print("                    1 X " + ones + "=");
                    System.out.printf("%5d%n", 1 * ones);
                    System.out.println("                           ____");
                    System.out.printf("Total amount (in SAR)      %4d%n", (int) Original_withdraw);
                }
            }
        }
    }
}
