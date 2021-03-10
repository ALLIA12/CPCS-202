
package specialletters;

import java.util.Scanner;

public class SpecialLetters {

    public static void main(String[] args) {
        // Basic statements nothing special.
        // NOTE : KEKW is always gonna be used as an input tool
        Scanner KEKW = new Scanner(System.in);
        System.out.print("Enter a string that has more than one word : ");
        String line = KEKW.nextLine();
        String otherChar = ""; // this will be used to print none "Special Letters".
        char current;
        int sum = 0;
        String spaces = ""; // this will be used for the design of the output.

        for (int i = 0; i < line.length(); i++) {// Traverse the String from beginning to the end 
            current = line.charAt(i); //Hold the current letter

            // If the current character is a space, skip to the next character aka skip current loop iteration .
            if (current == ' ') {
                continue;

                // Check if the current chatacter is a "Special Letter" or not, if it is use these statements.
            } else if (current >= ((int) 'i') && current <= ((int) 's') || current >= 'F' && current <= 'U') {
                System.out.print(spaces);
                System.out.println((int) current);
                sum += (int) current;// add the value of the current "Special Letter" to the sum.

                // Check if the current chatacter is a "Special Letter" or not, if it isn't use these statements instead .
            } else {
                System.out.print(spaces);
                System.out.println(current);
                otherChar += current;// add the current letter to the none "Special Letters"
            }
            // add a space for the design of the output
            spaces += " ";
        }

        //Simple output
        System.out.println("The sum of the Unicode values of the special characters is : " + sum);
        System.out.println("The other characters are : " + otherChar);
    }
}
