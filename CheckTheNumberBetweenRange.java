import java.io.*;

/*
 * @description: Check if a number is between a range.
 * @createdDate: 08/04/2023 01:18 GMT-5
 * @lastModifiedDate: N/A
 * @version: 1.0
 */

public class CheckTheNumberBetweenRange {
    public static void main(String[] args) throws IOException {
        System.out.println("*** Check if the number is between a range ***");

        BufferedReader bufferedReader;

        int number;

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number to verify: ");

        number = Integer.parseInt(bufferedReader.readLine());

        if (number >= 51 && number <= 100)
            System.out.println("The number is in the closed interval [51-100].");
        else
            System.out.println("The number is not in the closed interval [51-100].");
    }
}