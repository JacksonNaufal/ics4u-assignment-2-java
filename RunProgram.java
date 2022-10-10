/*
*
* This is a standared rock, paper, scissors program
* regular game, regular rules with a try and catch.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-01-01
*
* This is a rock paper scissors program.
*/

import java.util.Scanner;
/**
 * This is a rock, paper, scissors program.
 */

final class RunProgram {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private RunProgram() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param userInput the users userInput
    * @return count Returns the run
    */

    public static int runCalculation(final String userInput) {
        // Variables.
        int total = 0;
        int count = 0;
        char previous = ' ';

        // counts how many occrances of a charactor are in
        // a string that the userInputtedArray.
        for (char userSingleInput: userInput.toCharArray()) {

            if (userSingleInput == previous) {
                total++;
            } else {
                total = 1;
                previous = userSingleInput;
            }

            if (total > count) {
                count = total;
            }
        }
        return count;

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // identifying the strings.

        // rock, paper and scissors
        // max number in the Math.Random generator.
        final Scanner userWord = new Scanner(System.in);
        System.out.print("Enter your run: ");
        final String userInput = userWord.nextLine();

        final int maxRun = runCalculation(userInput);

        System.out.println(maxRun);

    }
}

