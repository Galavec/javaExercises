import java.io.*;

/*
 * @description: Prints the number of rows.
 * @createdDate: 08/04/2023 01:18 GMT-5
 * @lastModifiedDate: N/A
 * @version: 1.0
 */

public class PrintRows {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of rows to print: ");

        int number = Integer.parseInt(bufferedReader.readLine());

        rowPrinting(number);
    }

    public static void rowPrinting(int number) {
        for (int a = 1; number >= a; a++) {
            System.out.println("");

            for (int b = 1; a * 2 >= b; b++) {
                if ((b % 2) != 0)
                    System.out.print(b + " ");
            }
        }
    }
}
