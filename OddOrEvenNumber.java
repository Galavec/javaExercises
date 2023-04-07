import java.io.*;

/*
 * @description: Check if a number is even or odd.
 * @createdDate: 07/04/2023 13:31 GMT-5
 * @lastModifiedDate: N/A
 * @version: 1.0
 */

public class OddOrEvenNumber {
    public static void main(String args[]) throws IOException {
        System.out.println("*** Check if a number is even or odd ***");

        BufferedReader bufferedReader;

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer and positive number:");

        int number = Integer.parseInt(bufferedReader.readLine());

        if (number % 2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");
    }
}