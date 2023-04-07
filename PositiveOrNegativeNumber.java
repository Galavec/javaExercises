import java.io.*;

/*
 * @description: Check if an entered number is positive or negative.
 * @createdDate: 07/04/2023 13:46 GMT-5
 * @lastModifiedDate: N/A
 * @version: 1.0
 */

public class PositiveOrNegativeNumber {
    public static void main(String args[]) throws IOException {
        System.out.println("*** Check if a number is positive or negative ***");

        BufferedReader bufferedReader;

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an integer number:");

        int number = Integer.parseInt(bufferedReader.readLine());

        if (number == 0)
            System.out.print("The number is null.");
        else {
            if (number < 0)
                System.out.print("The number is negative.");
            else
                System.out.print("The number is positive.");
        }
    }
}