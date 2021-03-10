
package array;

import java.util.Scanner;

public class Array {

    public static int findIndex(int array[], int size, int element) {
        for (int i = 0; i < size; i++) {// travesre the array and look for the wanted element
            if (array[i] == element) {
                return i;// if the element is found return the index of it 
            }
        }
        return -1;// return a "fake" index
    }

    public static void removeElement(int array[], int size, int index) {
        array[index] = Integer.MAX_VALUE; // Set the element to a ridiculously high value, I think a 0.0000000466% chance of scuesss is pretty good.
        // The"Integer.MAX_VALUE" wasn't covered in 202, but its the same as ((2^31) -1), I learnt about it from an online java tutorial
        // I thought about making a string of the remaining variables each time we delete one, but this way is simpler.
        // Another way would be to use shiftting but its more complex than this.
    }

    public static void printArray(int array[], int size) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != Integer.MAX_VALUE) {//print the array as long as its not equal to the highest value
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Basic statements nothing special.
        // NOTE : KEKW is always gonna be used as an input tool
        System.out.print("Enter the size of the array to be created: ");
        Scanner KEKW = new Scanner(System.in);
        int size = KEKW.nextInt();
        System.out.print("Enter array elements: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) { // Input an array of the selected size 
            array[i] = KEKW.nextInt();
        }

        System.out.print("The array has the following elements: ");
        printArray(array, size); // call the print array method

        System.out.print("\nSelect an element to be removed: ");
        int element = KEKW.nextInt(); // selection of an element wanted to be removed
        boolean breaker = false; // A variable to check whether the element is found or not 
        for (int i = 0; i < size; i++) { // call the method a set amount of times. 
            int index = findIndex(array, size, element); // pass by (refrence, value, value) 
            if (index >= 0) {
                removeElement(array, size, index); // pass by (refrence, value, value) 
                breaker = true; // If the variable is found set it to true.
            }
        }

        System.out.println("--------------------------------");
        if (breaker) {// If the variable was found do these statements.
            System.out.print("Your new array is ");
            printArray(array, size); // call the print array method
            System.out.println(""); // put the build successful statement in a new line.

        } else {// If the variable wasn't found do these statements instead.
            System.out.println("Sorry " + element + " is not in the array");
        }
    }
}
