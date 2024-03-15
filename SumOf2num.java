package Problems;
// Program to add 2 numbers.

/**Importing scanner module from java.util library. */
import java.util.Scanner;

/**Making class */
public class SumOf2num {
    public static void main(String[] args) {

        /**Making an Scanner object named scan which scans the input data*/
        Scanner scan = new Scanner(System.in);

        /**Making an variable number1 to store first input */
        System.out.println("Enter First Number:");
        int number1 = scan.nextInt();

        /**Making second variable number2 to store second input */
        System.out.println("Enter Second Number:");
        int number2 = scan.nextInt();

        /**Making a new variable to store the result */
        int total = number1 + number2;
        
        // System.out.println("The sum of " +number1 +" and " +number2 +" is " +total);  
        // OR
        String output = String.format("The sum of %d and %d is %d.", number1, number2, total);
        System.out.println(output);
    }
}


